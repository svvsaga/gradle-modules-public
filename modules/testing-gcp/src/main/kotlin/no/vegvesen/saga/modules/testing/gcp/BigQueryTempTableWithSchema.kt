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
    isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
    datasetPrefix: String = "temp",
    tablePrefix: String = "temp",
    location: BigQueryLocation = BigQueryLocation.EU,
    overrideDatasetName: String? = null,
    overrideTableName: String? = null
) : BigQueryTempTable(
    bigQuery,
    isolationMode,
    datasetPrefix,
    tablePrefix,
    location,
    overrideDatasetName,
    overrideTableName
) {
    constructor(
        projectId: String,
        schema: Schema,
        isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU,
        overrideDatasetName: String? = null,
        overrideTableName: String? = null
    ) : this(
        createBigQuery(projectId, location),
        schema,
        isolationMode,
        datasetPrefix,
        tablePrefix,
        location,
        overrideDatasetName,
        overrideTableName
    )

    override fun createTempTableImplementation() {
        bigQuery.create(TableInfo.of(tableId, StandardTableDefinition.of(schema)))
    }
}
