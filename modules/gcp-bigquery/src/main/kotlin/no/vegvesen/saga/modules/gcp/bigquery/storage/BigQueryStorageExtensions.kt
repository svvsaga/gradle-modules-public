package no.vegvesen.saga.modules.gcp.bigquery.storage

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import arrow.fx.coroutines.Schedule
import arrow.fx.coroutines.parTraverse
import arrow.fx.coroutines.parTraverseN
import arrow.fx.coroutines.retry
import com.google.api.gax.rpc.ApiException
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
    parallelization: Int = Runtime.getRuntime().availableProcessors()
) = Either.catchAndFlatten {
    val fullTableId =
        if (tableId.project == null) TableId.of(options.projectId, tableId.dataset, tableId.table) else tableId
    if (fullTableId.project == null) {
        Exception("TableId must include project!").left()
    } else if (documents.any()) {
        val errors = writeJson(documents, serializer, fullTableId, chunkSize, parallelization)

        if (errors.any()) {
            BigQueryStreamException("Some rows were not inserted", errors.map { it.localizedMessage }).left()
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
    chunkSize: Int
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

// TODO: Related bug: https://github.com/googleapis/java-bigquerystorage/issues/1579 (and https://github.com/googleapis/java-bigquerystorage/issues/1580)
@ExperimentalTime
private suspend fun <T> BigQuery.writeJson(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int,
    parallelization: Int
): List<Throwable> = createJsonStreamWriter(tableId)
    .use { writer ->
        writer.writeJson(documents, serializer, chunkSize, parallelization)
    }

data class ExponentialBackoffSettings(val duration: Duration, val limit: Duration)

@ExperimentalTime
suspend fun <T> JsonStreamWriter.writeJson(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    chunkSize: Int = 200,
    parallelization: Int = Runtime.getRuntime().availableProcessors(),
    backoffSettings: ExponentialBackoffSettings = ExponentialBackoffSettings(1.seconds, 10.seconds),
    onRetry: (exception: ApiException, delay: Duration) -> Unit = { _, _ -> }
) = documents.chunked(chunkSize)
    .parTraverseN(Dispatchers.IO, parallelization) { chunk ->
        Either.catch {
            Schedule.exponential<Throwable>(backoffSettings.duration)
                .check { input: Throwable, output ->
                    if (input is ApiException && input.isRetryable && output < backoffSettings.limit) {
                        onRetry(input, output)
                        true
                    } else {
                        false
                    }
                }
                .retry {
                    val rows = createJsonRows(chunk, serializer)
                    withContext(Dispatchers.IO) {
                        append(rows).get()
                    }
                }
        }
    }.allLefts()

private fun BigQuery.createJsonStreamWriter(tableId: TableId): JsonStreamWriter {
    val schema = getTable(tableId).getDefinition<TableDefinition>().schema
        ?: throw Exception("Could not find schema for '${tableId.iamResourceName}'")
    val tableSchema = BqToBqStorageSchemaConverter.convertTableSchema(schema)
    return JsonStreamWriter.newBuilder(tableId.iamResourceName, tableSchema).build()
}

private fun <T> createJsonRows(documents: Collection<T>, serializer: SerializationStrategy<T>): JSONArray = documents
    .map { Json.encodeToJsonElement(serializer, it) as JsonObject }
    .map { it.withoutNulls().replacePrimitives() }
    .let { JSONArray(it) }

@ExperimentalSerializationApi
private fun <T> createProtoRows(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>
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
