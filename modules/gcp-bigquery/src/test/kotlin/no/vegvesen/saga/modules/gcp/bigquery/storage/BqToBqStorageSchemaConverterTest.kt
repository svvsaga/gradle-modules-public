package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.StandardSQLTypeName
import com.google.cloud.bigquery.storage.v1.TableFieldSchema
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BqToBqStorageSchemaConverterTest : FunSpec({
    test("can convert schema with JSON") {
        val result = BqToBqStorageSchemaConverter.convertFieldSchema(Field.of("json", StandardSQLTypeName.JSON))

        result.type shouldBe TableFieldSchema.Type.JSON
    }
})
