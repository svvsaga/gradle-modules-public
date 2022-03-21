@file:Suppress("EXPERIMENTAL_API_USAGE") // Impossible to mark file annotations with annotations, so we ignore
@file:UseSerializers(TimestampInstantSerializer::class)

package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.Schema
import com.google.cloud.bigquery.StandardSQLTypeName
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import kotlinx.datetime.toJavaInstant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import no.vegvesen.saga.modules.gcp.bigquery.BigQueryLocation
import no.vegvesen.saga.modules.gcp.bigquery.createBigQuery
import no.vegvesen.saga.modules.gcp.bigquery.fetchRowCount
import no.vegvesen.saga.modules.gcp.bigquery.instantValue
import no.vegvesen.saga.modules.gcp.bigquery.queryOf
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.serializers.TimestampInstantSerializer
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.gcp.BigQueryTempTableWithSchema

enum class Version {
    V1, V2
}

@Serializable
data class Row(val id: String, val timestamp: Instant, val version: Version)

@ExperimentalSerializationApi
@Tags(IntegrationTest)
class BigQueryStorageExtensionsTest : FunSpec({

    val projectId = envOrThrow("SAGA_INT_TEST_PROJECT_ID")

    val bigQuery = createBigQuery(projectId, BigQueryLocation.EU)

    val schema = Schema.of(
        createRequiredField("id", StandardSQLTypeName.STRING),
        createRequiredField("timestamp", StandardSQLTypeName.TIMESTAMP),
        createRequiredField("version", StandardSQLTypeName.STRING)
    )

    val tempTable = listener(BigQueryTempTableWithSchema(bigQuery, schema))

    val timestamp = Instant.parse("2022-01-01T00:00:00Z")

    test("can write documents to default stream") {
        val documents = List(2000) {
            Row(it.toString(), timestamp, Version.V1)
        }
        bigQuery.writeDocumentsToDefaultStream(documents, Row.serializer(), tempTable.tableId).shouldBeRight()

        bigQuery.fetchRowCount(tempTable.tableId) shouldBe 2000
        val first =
            bigQuery.queryOf("SELECT * FROM `${tempTable.tableId.dataset}`.`${tempTable.tableId.table}` ORDER BY id LIMIT 1")
                .iterateAll().toList().first()
        first["id"].stringValue shouldBe "0"
        first["timestamp"].instantValue shouldBe timestamp.toJavaInstant()
        first["version"].stringValue shouldBe Version.V1.toString()
    }
})

private fun createRequiredField(name: String, type: StandardSQLTypeName) =
    Field.newBuilder(name, type).setMode(Field.Mode.REQUIRED).build()
