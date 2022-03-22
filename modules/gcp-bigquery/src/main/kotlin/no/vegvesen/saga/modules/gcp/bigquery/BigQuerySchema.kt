package no.vegvesen.saga.modules.gcp.bigquery

import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.bigquery.model.TableFieldSchema
import com.google.api.services.bigquery.model.TableSchema
import com.google.cloud.bigquery.Schema
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.util.*
import kotlin.collections.ArrayList

// This functionality has been requested to the Google team: https://github.com/googleapis/google-cloud-java/issues/2753
// which is also where this solution is taken from: https://github.com/googleapis/google-cloud-java/issues/2753#issuecomment-506387352
object BigQuerySchema {
    private val JsonFactory by lazy { GsonFactory.getDefaultInstance() }

    /**
     * This is used to fetch the non-public static method "fromPb" of the Schema class,
     * which parses a TableSchema to a Schema (which is exactly what we need).
     */
    private val SCHEMA_FROM_PB: Method = Arrays.stream(Schema::class.java.declaredMethods)
        .filter { method -> "fromPb" == method.name }.findFirst().get()

    fun fromJsonSchema(jsonText: String): Schema {
        val tableSchema: TableSchema = TableSchema().setFields(
            JsonFactory
                .createJsonParser(jsonText)
                .parseArray(
                    ArrayList::class.java,
                    TableFieldSchema::class.java
                ).toMutableList()
        )
        return try {
            SCHEMA_FROM_PB.invoke(null, tableSchema) as Schema
        } catch (e: IllegalAccessException) {
            throw RuntimeException(e)
        } catch (e: InvocationTargetException) {
            throw e.targetException
        }
    }

    init {
        SCHEMA_FROM_PB.isAccessible = true
    }
}
