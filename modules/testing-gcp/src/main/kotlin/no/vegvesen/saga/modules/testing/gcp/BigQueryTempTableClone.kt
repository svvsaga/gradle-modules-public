package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.copyTableSchema
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery

class BigQueryTempTableClone(
    bigQuery: BigQuery,
    private val copyFromTableId: TableId,
    datasetPrefix: String = "temp",
    tablePrefix: String = "temp",
    location: BigQueryLocation = BigQueryLocation.EU,
    overrideTableName: String? = null
) : BigQueryTempTable(bigQuery, datasetPrefix, tablePrefix, location, overrideTableName) {

    constructor(
        projectId: String,
        copyFromTableId: TableId,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU
    ) : this(
        createBigQuery(projectId, location),
        copyFromTableId,
        datasetPrefix,
        tablePrefix,
        location
    )

    override fun beforeTest() {
        bigQuery.copyTableSchema(copyFromTableId, TableId.of(tempDataset, tempTable))
    }
}
