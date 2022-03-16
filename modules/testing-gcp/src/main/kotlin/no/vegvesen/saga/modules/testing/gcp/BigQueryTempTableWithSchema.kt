package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.Schema
import com.google.cloud.bigquery.StandardTableDefinition
import com.google.cloud.bigquery.TableInfo
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery

class BigQueryTempTableWithSchema(
    bigQuery: BigQuery,
    private val schema: Schema,
    datasetPrefix: String = "temp",
    tablePrefix: String = "temp",
    location: BigQueryLocation = BigQueryLocation.EU
) : BigQueryTempTable(bigQuery, datasetPrefix, tablePrefix, location) {

    constructor(
        projectId: String,
        schema: Schema,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU
    ) : this(
        createBigQuery(projectId, location),
        schema,
        datasetPrefix,
        tablePrefix,
        location
    )

    override fun beforeTest() {
        bigQuery.create(TableInfo.of(tableId, StandardTableDefinition.of(schema)))
    }
}
