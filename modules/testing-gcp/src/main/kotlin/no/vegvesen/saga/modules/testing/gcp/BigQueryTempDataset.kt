package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.DatasetInfo
import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import java.util.UUID
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery

open class BigQueryTempDataset(
    val bigQuery: BigQuery,
    protected val isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
    protected val datasetPrefix: String = "temp",
    protected val location: BigQueryLocation = BigQueryLocation.EU,
    protected val overrideDatasetName: String? = null
) : TestListener {
    constructor(
        projectId: String,
        isolationMode: ResourceIsolationMode = ResourceIsolationMode.PerSpec,
        datasetPrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU,
        overrideDatasetName: String? = null
    ) : this(createBigQuery(projectId, location), isolationMode, datasetPrefix, location, overrideDatasetName)

    lateinit var tempDataset: String

    private fun createTempDataset() {
        tempDataset = overrideDatasetName ?: "${datasetPrefix}_${UUID.randomUUID().toString().replace('-', '_')}"
        if (bigQuery.getDataset(tempDataset) == null) {
            bigQuery.create(
                DatasetInfo.newBuilder(tempDataset).setLocation(location.name)
                    .setLabels(mapOf("temporary" to "true")).build()
            )
        }
    }

    override suspend fun beforeEach(testCase: TestCase) {
        if (isolationMode == ResourceIsolationMode.PerTest) {
            createTempDataset()
        }
    }

    override suspend fun beforeContainer(testCase: TestCase) {
        if (isolationMode == ResourceIsolationMode.PerContainer) {
            createTempDataset()
        }
    }

    override suspend fun beforeSpec(spec: Spec) {
        if (isolationMode == ResourceIsolationMode.PerSpec) {
            createTempDataset()
        }
    }

    override suspend fun afterEach(testCase: TestCase, result: TestResult) {
        if (isolationMode == ResourceIsolationMode.PerTest) {
            deleteTempDatasets()
        }
    }

    override suspend fun afterContainer(testCase: TestCase, result: TestResult) {
        if (isolationMode == ResourceIsolationMode.PerContainer) {
            deleteTempDatasets()
        }
    }

    override suspend fun afterSpec(spec: Spec) {
        if (isolationMode == ResourceIsolationMode.PerSpec) {
            deleteTempDatasets()
        }
    }

    private fun deleteTempDatasets() {
        bigQuery.listDatasets(BigQuery.DatasetListOption.labelFilter("labels.temporary:true")).iterateAll()
            .forEach {
                it.delete(
                    BigQuery.DatasetDeleteOption.deleteContents()
                )
            }
    }
}
