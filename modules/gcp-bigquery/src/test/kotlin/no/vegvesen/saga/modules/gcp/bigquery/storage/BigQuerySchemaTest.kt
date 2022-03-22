package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.LegacySQLTypeName
import com.google.cloud.bigquery.StandardSQLTypeName
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.inspectors.shouldForAny
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.gcp.bigquery.BigQuerySchema
import java.lang.IllegalArgumentException

val jsonSchemaForStructsAndArrays = """
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
        .filter { it.first != StandardSQLTypeName.ARRAY || it.first != StandardSQLTypeName.STRUCT }
        .map { (type, mode) -> fieldJson(type, mode) }
        .joinToString()
        .let { "[ $it ]" }

private fun combineTypes(types: Array<StandardSQLTypeName>, modes: Array<SimpleMode>) = types // TODO: Filter
    .flatMap { type ->
        modes.map { mode ->
            Pair(type, mode)
        }
    }

class BqQuerySchemaTest : FunSpec({
    test("list of simple field types works as expected") {
        val jsonSchema = generateJsonSchemaForSimpleTypes()

        val schema = BigQuerySchema.fromJsonSchema(jsonSchema)

        schema.fields.size shouldBe 32
        schema.fields.shouldForAny { it.mode == Field.Mode.REQUIRED && it.type == LegacySQLTypeName.STRING }
        schema.fields.shouldForAny { it.mode == Field.Mode.NULLABLE && it.type == LegacySQLTypeName.BOOLEAN }
    }

    test("schema for nested structs and arrays is correctly parsed") {
        val jsonSchema = jsonSchemaForStructsAndArrays

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
})
