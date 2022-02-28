package no.vegvesen.saga.modules.gcp.bigquery

import arrow.core.Either
import arrow.core.flatMap
import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import kotlinx.serialization.SerializationStrategy
import java.time.Clock
import java.time.Instant
import java.time.temporal.ChronoUnit

const val FiveYearsInDays: Int = 365 * 5 - 1

suspend fun <T> BigQuery.streamDocuments(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    currentTableId: TableId,
    historicTableId: TableId,
    getPartitionTime: (t: T) -> Instant,
    chunkSize: Int = 500,
    historicDays: Int = FiveYearsInDays,
    clock: Clock = Clock.systemUTC(),
    getInsertId: (t: T) -> String? = { null }
): Either<Throwable, Unit> = Instant.now(clock).minus(historicDays.toLong(), ChronoUnit.DAYS).let { fiveYearsAgo ->
    documents.partition { getPartitionTime(it).isAfter(fiveYearsAgo) }.let { (current, historic) ->
        streamDocuments(current, serializer, currentTableId, chunkSize, getInsertId).flatMap {
            streamDocuments(historic, serializer, historicTableId, chunkSize, getInsertId)
        }
    }
}
