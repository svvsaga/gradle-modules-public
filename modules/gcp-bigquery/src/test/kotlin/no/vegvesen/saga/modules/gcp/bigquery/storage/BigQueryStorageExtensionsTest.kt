package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.Schema
import com.google.cloud.bigquery.StandardSQLTypeName
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery
import no.vegvesen.saga.modules.gcp.bigquery.fetchRowCount
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.gcp.BigQueryTempTableWithSchema
import kotlin.time.ExperimentalTime

@Serializable
data class Row(val id: String)

@ExperimentalSerializationApi
@ExperimentalTime
@Tags(IntegrationTest)
class BigQueryStorageExtensionsTest : FunSpec({

    val projectId = envOrThrow("SAGA_INT_TEST_PROJECT_ID")

    val bigQuery = createBigQuery(projectId, BigQueryLocation.EU)

    val schema = Schema.of(Field.of("id", StandardSQLTypeName.STRING))

    val tempTable = listener(BigQueryTempTableWithSchema(bigQuery, schema))

    test("can write documents to default stream") {
        val documents = List(2000) {
            Row(it.toString())
        }
        bigQuery.writeDocumentsToDefaultStream(documents, Row.serializer(), tempTable.tableId).shouldBeRight()

        bigQuery.fetchRowCount(tempTable.tableId) shouldBe 2000
    }
})
