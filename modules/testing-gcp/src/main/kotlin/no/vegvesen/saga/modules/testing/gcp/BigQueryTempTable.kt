package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.TableId
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import java.util.UUID
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery

abstract class BigQueryTempTable(
    bigQuery: BigQuery,
    isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
    datasetPrefix: String = "temp",
    protected val tablePrefix: String = "temp",
    location: BigQueryLocation = BigQueryLocation.EU,
    overrideDatasetName: String? = null,
    protected val overrideTableName: String? = null
) : BigQueryTempDataset(bigQuery, isolationMode, datasetPrefix, location, overrideDatasetName) {
    constructor(
        projectId: String,
        isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU,
        overrideDatasetName: String? = null,
        overrideTableName: String? = null
    ) : this(
        createBigQuery(projectId, location),
        isolationMode,
        datasetPrefix,
        tablePrefix,
        location,
        overrideDatasetName,
        overrideTableName
    )

    lateinit var tempTable: String

    val tableId: TableId get() = TableId.of(bigQuery.options.projectId, tempDataset, tempTable)

    abstract fun createTempTableImplementation()

    private fun createTempTable() {
        tempTable = overrideTableName ?: "${tablePrefix}_${UUID.randomUUID().toString().replace('-', '_')}"
        if (bigQuery.getTable(tableId) == null) {
            createTempTableImplementation()
        }
    }

    override suspend fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        if (isolationMode == ResourceIsolationMode.PerSpec) {
            createTempTable()
        }
    }

    override suspend fun beforeContainer(testCase: TestCase) {
        super.beforeContainer(testCase)
        if (isolationMode == ResourceIsolationMode.PerContainer) {
            createTempTable()
        }
    }

    override suspend fun beforeEach(testCase: TestCase) {
        super.beforeEach(testCase)
        if (isolationMode == ResourceIsolationMode.PerTest) {
            createTempTable()
        }
    }
}
