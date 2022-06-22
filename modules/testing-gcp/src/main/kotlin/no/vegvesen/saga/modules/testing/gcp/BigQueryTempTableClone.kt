package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.copyTableSchema
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery

class BigQueryTempTableClone(
    bigQuery: BigQuery,
    private val copyFromTableId: TableId,
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
        copyFromTableId: TableId,
        isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU,
        overrideDatasetName: String? = null,
        overrideTableName: String? = null
    ) : this(
        createBigQuery(projectId, location),
        copyFromTableId, isolationMode, datasetPrefix, tablePrefix, location, overrideDatasetName, overrideTableName
    )

    override fun createTempTableImplementation() {
        bigQuery.copyTableSchema(copyFromTableId, TableId.of(tempDataset, tempTable))
    }
}
