package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.DatasetInfo
import com.google.cloud.bigquery.TableId
import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.copyTableSchema
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery
import java.util.UUID

class BigQueryTempDatasetClone(
    val bigQuery: BigQuery,
    private val copyFromTableId: TableId,
    private val datasetPrefix: String = "temp",
    private val tablePrefix: String = "temp",
    private val location: BigQueryLocation = BigQueryLocation.EU
) : TestListener {

    constructor(
        projectId: String,
        copyTableId: TableId,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU
    ) : this(
        createBigQuery(projectId, location),
        copyTableId,
        datasetPrefix,
        tablePrefix,
        location
    )

    lateinit var tempDataset: String

    override suspend fun beforeSpec(spec: Spec) {
        tempDataset = "${datasetPrefix}_${UUID.randomUUID().toString().replace('-', '_')}"
        if (bigQuery.getDataset(tempDataset).let { it == null || !it.exists() }) {
            bigQuery.create(
                DatasetInfo.newBuilder(tempDataset).setLocation(location.name)
                    .setLabels(mapOf("temporary" to "true")).build()
            )
        }
    }

    override suspend fun afterSpec(spec: Spec) {
        bigQuery.listDatasets(BigQuery.DatasetListOption.labelFilter("labels.temporary:true")).iterateAll()
            .forEach {
                it.delete(
                    BigQuery.DatasetDeleteOption.deleteContents()
                )
            }
    }

    val tableId: TableId get() = TableId.of(tempDataset, tempTable)

    lateinit var tempTable: String

    override suspend fun beforeTest(testCase: TestCase) {
        tempTable = "${tablePrefix}_${UUID.randomUUID().toString().replace('-', '_')}"
        bigQuery.copyTableSchema(copyFromTableId, TableId.of(tempDataset, tempTable))
    }
}