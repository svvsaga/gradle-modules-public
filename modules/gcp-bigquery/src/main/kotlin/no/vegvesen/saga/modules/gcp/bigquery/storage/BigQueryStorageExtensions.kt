package no.vegvesen.saga.modules.gcp.bigquery.storage

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import arrow.fx.coroutines.parTraverse
import arrow.fx.coroutines.parTraverseN
import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableDefinition
import com.google.cloud.bigquery.TableId
import com.google.cloud.bigquery.storage.v1.BQTableSchemaToProtoDescriptor
import com.google.cloud.bigquery.storage.v1.JsonStreamWriter
import com.google.cloud.bigquery.storage.v1.ProtoRows
import com.google.cloud.bigquery.storage.v1.ProtoSchema
import com.google.cloud.bigquery.storage.v1.ProtoSchemaConverter
import com.google.cloud.bigquery.storage.v1.StreamWriter
import com.google.protobuf.ByteString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.protobuf.ProtoBuf
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryStreamException
import no.vegvesen.saga.modules.shared.Retry.ExponentialBackoffSettings
import no.vegvesen.saga.modules.shared.Retry.retry
import no.vegvesen.saga.modules.shared.allLefts
import no.vegvesen.saga.modules.shared.serializers.replacePrimitives
import no.vegvesen.saga.modules.shared.serializers.withoutNulls
import org.json.JSONArray
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

/**
 * Use BigQuery Storage Write API to write documents to the default stream.
 */
@ExperimentalTime
@ExperimentalSerializationApi
suspend fun <T> BigQuery.writeDocumentsToDefaultStream(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int = 500,
    parallelization: Int = Runtime.getRuntime().availableProcessors(),
) = Either.catchAndFlatten {
    val fullTableId =
        if (tableId.project == null) TableId.of(options.projectId, tableId.dataset, tableId.table) else tableId
    if (fullTableId.project == null) {
        Exception("TableId must include project!").left()
    } else if (documents.any()) {
        val errors = writeJson(documents, serializer, fullTableId, chunkSize, parallelization)

        if (errors.any()) {
            BigQueryStreamException("Some rows were not inserted", errors.map { it.localizedMessage }, errors.first()).left()
        } else {
            Unit.right()
        }
    } else {
        Unit.right()
    }
}

/**
 * Use BigQuery Storage Write API to write documents to the default stream.
 */
@ExperimentalTime
@ExperimentalSerializationApi
suspend fun BigQuery.writeDocumentsToDefaultStream(
    documents: Collection<JsonObject>,
    tableId: TableId,
    chunkSize: Int = 500,
    parallelization: Int = Runtime.getRuntime().availableProcessors(),
) = Either.catchAndFlatten {
    val fullTableId =
        if (tableId.project == null) TableId.of(options.projectId, tableId.dataset, tableId.table) else tableId
    if (fullTableId.project == null) {
        Exception("TableId must include project!").left()
    } else if (documents.any()) {
        val errors = writeJson(documents, fullTableId, chunkSize, parallelization)

        if (errors.any()) {
            BigQueryStreamException("Some rows were not inserted", errors.map { it.localizedMessage }, errors.first()).left()
        } else {
            Unit.right()
        }
    } else {
        Unit.right()
    }
}

@ExperimentalSerializationApi
private suspend fun <T> BigQuery.writeProtoBuf(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int,
) = createStreamWriter(tableId)
    .use { writer ->
        documents.chunked(chunkSize)
            .parTraverse(Dispatchers.IO) { chunk ->
                Either.catch {
                    val rows = createProtoRows(chunk, serializer)
                    writer.append(rows).get()
                }
            }
    }.allLefts()

@ExperimentalTime
suspend fun <T> BigQuery.writeJson(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int,
    parallelization: Int,
): List<Throwable> = createJsonStreamWriter(tableId)
    .use { writer ->
        writer.writeJson(documents, serializer, chunkSize, parallelization)
    }

@ExperimentalTime
suspend fun BigQuery.writeJson(
    documents: Collection<JsonObject>,
    tableId: TableId,
    chunkSize: Int,
    parallelization: Int,
): List<Throwable> = createJsonStreamWriter(tableId)
    .use { writer ->
        writer.writeJson(documents, chunkSize, parallelization)
    }

@ExperimentalTime
suspend fun <T> JsonStreamWriter.writeJson(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    chunkSize: Int = 200,
    parallelization: Int = Runtime.getRuntime().availableProcessors(),
    backoffSettings: ExponentialBackoffSettings = ExponentialBackoffSettings(1.seconds, 5),
    onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = { _, _, _ -> },
) = documents.chunked(chunkSize)
    .parTraverseN(Dispatchers.IO, parallelization) { chunk ->
        val rows = chunk.toJSONArray(serializer)
        writeJsonChunk(rows, backoffSettings, onRetry)
    }.allLefts()

@ExperimentalTime
suspend fun JsonStreamWriter.writeJson(
    documents: Collection<JsonObject>,
    chunkSize: Int = 200,
    parallelization: Int = Runtime.getRuntime().availableProcessors(),
    backoffSettings: ExponentialBackoffSettings = ExponentialBackoffSettings(1.seconds, 5),
    onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = { _, _, _ -> },
) = documents.chunked(chunkSize)
    .parTraverseN(Dispatchers.IO, parallelization) { chunk ->
        val rows = chunk.toJSONArray()
        writeJsonChunk(rows, backoffSettings, onRetry)
    }.allLefts()

@ExperimentalTime
private suspend fun JsonStreamWriter.writeJsonChunk(
    rows: JSONArray,
    backoffSettings: ExponentialBackoffSettings = ExponentialBackoffSettings(1.seconds, 5),
    onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = { _, _, _ -> },
) = retry("JsonStreamWriter: Write json chunk", backoffSettings, onRetry) {
    withContext(Dispatchers.IO) {
        append(rows).get()
    }
}

private fun BigQuery.createJsonStreamWriter(tableId: TableId): JsonStreamWriter {
    val schema = getTable(tableId).getDefinition<TableDefinition>().schema
        ?: throw Exception("Could not find schema for '${tableId.iamResourceName}'")
    val tableSchema = BqToBqStorageSchemaConverter.convertTableSchema(schema)
    return JsonStreamWriter.newBuilder(tableId.iamResourceName, tableSchema).build()
}

private fun List<JsonObject>.toJSONArray() =
    map { it.withoutNulls().replacePrimitives() }
        .let(::JSONArray)

private fun <T> Collection<T>.toJSONArray(serializer: SerializationStrategy<T>): JSONArray =
    toJsonObjects(serializer)
        .toJSONArray()

private fun <T> Collection<T>.toJsonObjects(serializer: SerializationStrategy<T>) =
    map { Json.encodeToJsonElement(serializer, it) as JsonObject }

@ExperimentalSerializationApi
private fun <T> createProtoRows(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
): ProtoRows = documents
    .map { ProtoBuf.encodeToByteArray(serializer, it) }
    .map { ByteString.copyFrom(it) }
    .let { ProtoRows.newBuilder().addAllSerializedRows(it).build() }

private fun BigQuery.createStreamWriter(tableId: TableId): StreamWriter {
    val protoSchema = getProtoSchema(tableId)
    return StreamWriter.newBuilder("${tableId.iamResourceName}/_default")
        .setWriterSchema(protoSchema).build()
}

private fun BigQuery.getProtoSchema(tableId: TableId): ProtoSchema {
    val schema = getTable(tableId).getDefinition<TableDefinition>().schema
        ?: throw Exception("Could not find schema for '${tableId.iamResourceName}'")
    val tableSchema = BqToBqStorageSchemaConverter.convertTableSchema(schema)
    val descriptor = BQTableSchemaToProtoDescriptor.convertBQTableSchemaToProtoDescriptor(tableSchema)
    return ProtoSchemaConverter.convert(descriptor)
}
