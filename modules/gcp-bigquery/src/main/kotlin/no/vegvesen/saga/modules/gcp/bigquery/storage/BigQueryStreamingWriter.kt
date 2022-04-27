package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlin.time.ExperimentalTime

/**
 * Wrapper to make testing easier / possible
 */
@ExperimentalTime
@ExperimentalSerializationApi
class BigQueryStreamingWriter(
    private val bigQuery: BigQuery,
    private val chunkSize: Int = 250,
    private val parallelization: Int = 2
) {
    suspend fun <T> streamDocuments(
        documents: Collection<T>,
        serializer: SerializationStrategy<T>,
        tableId: TableId
    ) = bigQuery.writeDocumentsToDefaultStream(documents, serializer, tableId, chunkSize, parallelization)
}
