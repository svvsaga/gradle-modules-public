package no.vegvesen.saga.modules.gcp.bigquery.storage

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import arrow.fx.coroutines.parTraverse
import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableDefinition
import com.google.cloud.bigquery.TableId
import com.google.cloud.bigquery.storage.v1.BQTableSchemaToProtoDescriptor
import com.google.cloud.bigquery.storage.v1.ProtoRows
import com.google.cloud.bigquery.storage.v1.ProtoSchema
import com.google.cloud.bigquery.storage.v1.ProtoSchemaConverter
import com.google.cloud.bigquery.storage.v1.StreamWriter
import com.google.protobuf.ByteString
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.protobuf.ProtoBuf
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryStreamException
import no.vegvesen.saga.modules.shared.allLefts

/**
 * Use BigQuery Storage Write API to write documents to the default stream.
 */
@ExperimentalSerializationApi
suspend fun <T> BigQuery.writeDocumentsToDefaultStream(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int = 500,
) = Either.catchAndFlatten {
    if (tableId.project == null) {
        Exception("TableId must include project!").left()
    } else if (documents.any()) {
        val errors = createStreamWriter(tableId)
            .use { writer ->
                documents.chunked(chunkSize)
                    .parTraverse(Dispatchers.IO) { chunk ->
                        Either.catch {
                            val rows = createProtoRows(chunk, serializer)
                            writer.append(rows).get()
                        }
                    }
            }.allLefts()

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
