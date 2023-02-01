package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import kotlin.time.ExperimentalTime
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.json.JsonObject

/**
 * Wrapper to make testing easier / possible
 */
@ExperimentalTime
@ExperimentalSerializationApi
class BigQueryStreamingWriter(
    private val bigQuery: BigQuery
) {
    suspend fun <T> streamDocuments(
        documents: Collection<T>,
        serializer: SerializationStrategy<T>,
        tableId: TableId,
        chunkSize: Int = 250,
        parallelization: Int = 2
    ) = bigQuery.writeDocumentsToDefaultStream(documents, serializer, tableId, chunkSize, parallelization)

    suspend fun streamDocuments(
        documents: Collection<JsonObject>,
        tableId: TableId,
        chunkSize: Int = 250,
        parallelization: Int = 2
    ) = bigQuery.writeDocumentsToDefaultStream(documents, tableId, chunkSize, parallelization)
}
