package no.vegvesen.saga.modules.gcp.bigquery

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import arrow.fx.coroutines.parTraverse
import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.CopyJobConfiguration
import com.google.cloud.bigquery.FieldValue
import com.google.cloud.bigquery.FieldValueList
import com.google.cloud.bigquery.FormatOptions
import com.google.cloud.bigquery.InsertAllRequest
import com.google.cloud.bigquery.JobId
import com.google.cloud.bigquery.JobInfo
import com.google.cloud.bigquery.QueryJobConfiguration
import com.google.cloud.bigquery.QueryParameterValue
import com.google.cloud.bigquery.TableDataWriteChannel
import com.google.cloud.bigquery.TableId
import com.google.cloud.bigquery.TableResult
import com.google.cloud.bigquery.WriteChannelConfiguration
import com.google.common.cache.Cache
import com.google.common.cache.CacheBuilder
import java.nio.ByteBuffer
import java.time.Duration
import java.time.Instant
import java.util.Objects
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.Dispatchers
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toKotlinInstant
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import no.vegvesen.saga.modules.shared.allLefts
import no.vegvesen.saga.modules.shared.serializers.replacePrimitives
import no.vegvesen.saga.modules.shared.serializers.withoutNulls

/**
 * Write a list of JSON as ndjson to BigQuery
 */
fun BigQuery.writeData(
    jsons: List<String>,
    datasetName: String,
    tableName: String,
    location: BigQueryLocation
) =
    this.writeNdJson(jsons.joinToString("\n"), datasetName, tableName, location)

/**
 * Write new-line delimited JSON to BigQuery
 */
fun BigQuery.writeNdJson(
    ndjson: String,
    datasetName: String,
    tableName: String,
    location: BigQueryLocation
) {
    if (ndjson.isEmpty()) {
        return
    }

    val tableId = TableId.of(datasetName, tableName)
    val writeChannelConfiguration =
        WriteChannelConfiguration.newBuilder(tableId).setFormatOptions(FormatOptions.json()).build()
    val jobId = JobId.newBuilder().setLocation(location.name).build()
    val writer: TableDataWriteChannel = this.writer(jobId, writeChannelConfiguration)

    writer.use {
        it.write(ByteBuffer.wrap(ndjson.toByteArray(Charsets.UTF_8)))
    }

    val job = writer.job.waitFor()

    if (job.status.error != null) {
        throw Exception("Unable to write data to BigQuery: ${job.status.executionErrors.last().message}")
    }
}

fun BigQuery.truncateTable(datasetName: String, tableName: String): TableResult =
    this.query(QueryJobConfiguration.of("TRUNCATE TABLE $datasetName.$tableName"))

fun BigQuery.copyTable(source: TableId, destination: TableId) {
    val jobConfiguration = CopyJobConfiguration.of(destination, source)
    val jobInfo = JobInfo.of(jobConfiguration)
    val job = this.create(jobInfo)
    val completedJob = job.waitFor()
    if (completedJob == null) {
        throw Exception("BigQuery was unable to copy table `$source` to `$destination` because job no longer exists")
    } else if (completedJob.status.error != null) {
        throw Exception(
            "BigQuery was unable to copy table `$source` to `$destination` because of an error: \n" +
                completedJob.status.error
        )
    }
}

fun BigQuery.copyTableSchema(source: TableId, destination: TableId) {
    queryOf(
        """
        CREATE TABLE `${destination.dataset}.${destination.table}`
        AS SELECT * FROM `${source.dataset}.${source.table}` LIMIT 0
        """.trimIndent()
    )
}

fun BigQuery.fetchRowCount(dataset: String, table: String) =
    this.query(
        QueryJobConfiguration.of(
            "SELECT COUNT(*) FROM $dataset.$table"
        )
    )
        .values.first()[0].longValue

fun BigQuery.fetchRowCount(tableId: TableId) =
    this.query(
        QueryJobConfiguration.of(
            "SELECT COUNT(*) FROM `${if (tableId.project == null) "" else "${tableId.project}."}${tableId.dataset}.${tableId.table}`"
        )
    )
        .values.first()[0].longValue

fun BigQuery.fetchScalar(query: String) = query(QueryJobConfiguration.of(query)).values.first()[0].longValue

val FieldValue.instantValue: Instant
    get() = Instant.ofEpochSecond(
        TimeUnit.MICROSECONDS.toSeconds(timestampValue),
        TimeUnit.MICROSECONDS.toNanos(Math.floorMod(timestampValue, TimeUnit.SECONDS.toMicros(1)))
    )

suspend fun <T> BigQuery.streamDocuments(
    documents: Collection<T>,
    serializer: SerializationStrategy<T>,
    tableId: TableId,
    chunkSize: Int = 500, // Set to 500 as a good starting point. 2000 segment time results is too much for 10MB payload limit.
    getInsertId: (t: T) -> String? = { null }
) = Either.catchAndFlatten {
    if (documents.any()) {
        val errors = documents.map { document ->
            getInsertId(document) to Json.encodeToJsonElement(serializer, document) as JsonObject
        }
            .map { (insertId, json) -> insertId to json.withoutNulls().replacePrimitives() }
            .map { (insertId, json) ->
                when (insertId) {
                    null -> InsertAllRequest.RowToInsert.of(json)
                    else -> InsertAllRequest.RowToInsert.of(insertId, json)
                }
            }
            .chunked(chunkSize)
            .parTraverse(Dispatchers.IO) { rows ->
                val request = InsertAllRequest.newBuilder(tableId, rows).build()
                val response = insertAll(request)
                if (response.hasErrors()) {
                    response.insertErrors
                        .flatMap { (index, errors) -> errors.map { error -> "$index: $error" } }
                        .left()
                } else {
                    Unit.right()
                }
            }.allLefts()

        if (errors.any()) {
            BigQueryStreamException("Some rows were not inserted", errors.flatten()).left()
        } else {
            Unit.right()
        }
    } else {
        Unit.right()
    }
}

private val bigQueryRegex =
    Regex("//bigquery\\.googleapis\\.com/projects/(?<project>.+)/datasets/(?<dataset>.+)/tables/(?<table>.+)")

fun tryParseTableIdFromResource(resourceId: String): TableId? = bigQueryRegex.matchEntire(resourceId)?.let {
    val project = it.groups["project"]!!.value
    val dataset = it.groups["dataset"]!!.value
    val table = it.groups["table"]!!.value
    TableId.of(project, dataset, table)
}

private val defaultCache: Cache<Int, TableResult> by lazy {
    CacheBuilder.newBuilder()
        .expireAfterAccess(Duration.ofMinutes(15))
        .maximumWeight(10_000)
        .weigher<Int, TableResult> { _, result -> result.totalRows.toInt() }
        .build()
}

/** Do a query that is cached based on query and params; default shared cache will hold maximum of 10 000 rows for up to 15 minutes after access. */
fun BigQuery.cachedQuery(
    query: String,
    params: Map<String, Any> = emptyMap(),
    cache: Cache<Int, TableResult> = defaultCache
): TableResult =
    cache.get(Objects.hash(query, params)) {
        queryOf(query, params)
    }

fun BigQuery.queryOf(query: String, params: Map<String, Any> = emptyMap()): TableResult {
    val builder = QueryJobConfiguration.newBuilder(query)
    for ((key, value) in params) {
        builder.addNamedParameter(key, value.toQueryParameterValue())
    }
    return query(builder.build())
}

fun FieldValueList.getString(name: String): String = get(name).stringValue
fun FieldValueList.getLong(name: String): Long = get(name).longValue
fun FieldValueList.getDate(name: String): LocalDate = LocalDate.parse(get(name).stringValue)
fun FieldValueList.getInstant(name: String): kotlinx.datetime.Instant = get(name).instantValue.toKotlinInstant()

fun FieldValueList.getStringOrNull(name: String): String? = get(name).let { if (it.isNull) null else it.stringValue }
fun FieldValueList.getLongOrNull(name: String): Long? = get(name).let { if (it.isNull) null else it.longValue }
fun FieldValueList.getDateOrNull(name: String): LocalDate? =
    get(name).let { if (it.isNull) null else LocalDate.parse(it.stringValue) }

fun FieldValueList.getInstantOrNull(name: String): kotlinx.datetime.Instant? =
    get(name).let { if (it.isNull) null else it.instantValue.toKotlinInstant() }

private fun Any.toQueryParameterValue(): QueryParameterValue = when (this) {
    is String -> QueryParameterValue.string(this)
    else -> throw IllegalArgumentException("Unsupported parameter type ${this.javaClass.name}")
}
