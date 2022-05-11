package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.LegacySQLTypeName
import com.google.cloud.bigquery.StandardSQLTypeName
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.inspectors.shouldForAny
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.gcp.bigquery.BigQuerySchema

val jsonSchemaForRecordsAndArrays = """
[{
    "name": "structField",
    "type": "RECORD",
    "description": "Description of field",
    "mode": "REQUIRED",
    "fields": [
        {
            "mode": "NULLABLE",
            "type": "STRING",
            "name": "stringField",
            "description": "Description of field"
        },
        {
            "name": "structField2",
            "type": "RECORD",
            "description": "Description of field",
            "mode": "REPEATED",
            "fields": [
                {
                    "mode": "NULLABLE",
                    "type": "STRING",
                    "name": "stringField2",
                    "description": "Description of field"
                }
            ]
        }
    ]
}]
""".trimIndent()

val jsonSchemaForStructsAndArrays = """
[{
    "name": "structField",
    "type": "STRUCT",
    "description": "Description of field",
    "mode": "REQUIRED",
    "fields": [
        {
            "mode": "NULLABLE",
            "type": "INT64",
            "name": "int64Field",
            "description": "Description of int64field"
        },
        {
            "name": "structField2",
            "type": "STRUCT",
            "description": "Description of field",
            "mode": "REPEATED",
            "fields": [
                {
                    "mode": "NULLABLE",
                    "type": "GEOGRAPHY",
                    "name": "geoField",
                    "description": "Description of field"
                }
            ]
        }
    ]
}]
""".trimIndent()

// Missing fields definition
val invalidJsonSchemaForStruct = """
[{
    "name": "structField",
    "type": "RECORD",
    "description": "Description of field",
    "mode": "REQUIRED"
}]
""".trimIndent()

enum class SimpleMode {
    REQUIRED,
    NULLABLE
}

fun fieldJson(type: StandardSQLTypeName, mode: SimpleMode) = """
{
   "description": "Test description for field",
   "name": "${type}_${mode}_name",
   "type": "$type",
   "mode": "$mode"
}
""".trimIndent()

fun generateJsonSchemaForSimpleTypes() =
    combineTypes(StandardSQLTypeName.values(), SimpleMode.values())
        .filter { it.first != StandardSQLTypeName.ARRAY && it.first != StandardSQLTypeName.STRUCT }
        .joinToString { (type, mode) -> fieldJson(type, mode) }
        .let { "[ $it ]" }

private fun combineTypes(types: Array<StandardSQLTypeName>, modes: Array<SimpleMode>) = types
    .flatMap { type ->
        modes.map { mode ->
            Pair(type, mode)
        }
    }

class BqQuerySchemaTest : FunSpec({
    test("list of simple field types works as expected") {
        val jsonSchema = generateJsonSchemaForSimpleTypes()

        val schema = BigQuerySchema.fromJsonSchema(jsonSchema)

        schema.fields.size shouldBe 28
        schema.fields.shouldForAny { it.mode == Field.Mode.REQUIRED && it.type == LegacySQLTypeName.STRING }
        schema.fields.shouldForAny { it.mode == Field.Mode.NULLABLE && it.type == LegacySQLTypeName.BOOLEAN }
    }

    test("schema for nested records and arrays is correctly parsed") {
        val jsonSchema = jsonSchemaForRecordsAndArrays

        val schema = BigQuerySchema.fromJsonSchema(jsonSchema)

        schema.fields.size shouldBe 1
        schema.fields["structField"].mode shouldBe Field.Mode.REQUIRED

        schema.fields["structField"].subFields.size shouldBe 2
        schema.fields["structField"].subFields["structField2"].mode shouldBe Field.Mode.REPEATED

        schema.fields["structField"].subFields["structField2"].subFields["stringField2"].mode shouldBe Field.Mode.NULLABLE
        schema.fields["structField"].subFields["structField2"].subFields["stringField2"].description shouldBe "Description of field"
    }

    test("invalid struct schema throws exception") {
        val jsonSchema = invalidJsonSchemaForStruct

        shouldThrow<IllegalArgumentException> {
            BigQuerySchema.fromJsonSchema(jsonSchema)
        }
    }

    test("schema with Standard SQL is correctly parsed") {
        val schema = BigQuerySchema.fromJsonSchema(jsonSchemaForStructsAndArrays)

        schema.fields.size shouldBe 1
        schema.fields["structField"].subFields["int64Field"].description shouldBe "Description of int64field"
    }
})
