package no.vegvesen.saga.modules.testing.gcp

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.DatasetInfo
import com.google.cloud.bigquery.TableId
import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery
import org.testcontainers.shaded.org.bouncycastle.asn1.x500.style.RFC4519Style
import java.util.UUID

abstract class BigQueryTempTable(
    val bigQuery: BigQuery,
    private val datasetPrefix: String = "temp",
    private val tablePrefix: String = "temp",
    private val location: BigQueryLocation = BigQueryLocation.EU
) : TestListener {

    constructor(
        projectId: String,
        datasetPrefix: String = "temp",
        tablePrefix: String = "temp",
        location: BigQueryLocation = BigQueryLocation.EU
    ) : this(
        createBigQuery(projectId, location),
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
            RFC4519Style.l
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

    val tableId: TableId get() = TableId.of(bigQuery.options.projectId, tempDataset, tempTable)

    lateinit var tempTable: String

    abstract fun beforeTest()

    override suspend fun beforeTest(testCase: TestCase) {
        tempTable = "${tablePrefix}_${UUID.randomUUID().toString().replace('-', '_')}"
        beforeTest()
    }
}
