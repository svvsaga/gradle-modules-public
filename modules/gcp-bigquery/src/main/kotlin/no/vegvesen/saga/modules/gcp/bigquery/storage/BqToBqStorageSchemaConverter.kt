/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package no.vegvesen.saga.modules.gcp.bigquery.storage

import com.google.cloud.bigquery.Field
import com.google.cloud.bigquery.Schema
import com.google.cloud.bigquery.StandardSQLTypeName
import com.google.cloud.bigquery.storage.v1.TableFieldSchema
import com.google.cloud.bigquery.storage.v1.TableSchema
import com.google.common.collect.ImmutableMap

/**
 * Converts structure from BigQuery client to BigQueryStorage client
 */
object BqToBqStorageSchemaConverter {
    private val BQTableSchemaModeMap = ImmutableMap.of(
        Field.Mode.NULLABLE, TableFieldSchema.Mode.NULLABLE,
        Field.Mode.REPEATED, TableFieldSchema.Mode.REPEATED,
        Field.Mode.REQUIRED, TableFieldSchema.Mode.REQUIRED
    )
    private val BQTableSchemaTypeMap = ImmutableMap.Builder<StandardSQLTypeName, TableFieldSchema.Type>()
        .put(StandardSQLTypeName.BOOL, TableFieldSchema.Type.BOOL)
        .put(StandardSQLTypeName.BYTES, TableFieldSchema.Type.BYTES)
        .put(StandardSQLTypeName.DATE, TableFieldSchema.Type.DATE)
        .put(StandardSQLTypeName.DATETIME, TableFieldSchema.Type.DATETIME)
        .put(StandardSQLTypeName.FLOAT64, TableFieldSchema.Type.DOUBLE)
        .put(StandardSQLTypeName.GEOGRAPHY, TableFieldSchema.Type.GEOGRAPHY)
        .put(StandardSQLTypeName.INT64, TableFieldSchema.Type.INT64)
        .put(StandardSQLTypeName.NUMERIC, TableFieldSchema.Type.NUMERIC)
        .put(StandardSQLTypeName.STRING, TableFieldSchema.Type.STRING)
        .put(StandardSQLTypeName.STRUCT, TableFieldSchema.Type.STRUCT)
        .put(StandardSQLTypeName.TIME, TableFieldSchema.Type.TIME)
        .put(StandardSQLTypeName.TIMESTAMP, TableFieldSchema.Type.TIMESTAMP)
        .build()

    /**
     * Converts from BigQuery client Table Schema to bigquery storage API Table Schema.
     *
     * @param schema the BigQuery client Table Schema
     * @return the bigquery storage API Table Schema
     */
    fun convertTableSchema(schema: Schema): TableSchema {
        val result = TableSchema.newBuilder()
        for (i in schema.fields.indices) {
            result.addFields(i, convertFieldSchema(schema.fields[i]))
        }
        return result.build()
    }

    /**
     * Converts from bigquery v2 Field Schema to bigquery storage API Field Schema.
     *
     * @param field the BigQuery client Field Schema
     * @return the bigquery storage API Field Schema
     */
    fun convertFieldSchema(field: Field): TableFieldSchema {
        var mutableField = field
        val result = TableFieldSchema.newBuilder()
        if (mutableField.mode == null) {
            mutableField = mutableField.toBuilder().setMode(Field.Mode.NULLABLE).build()
        }
        result.mode = BQTableSchemaModeMap[mutableField.mode]
        result.name = mutableField.name
        result.type = BQTableSchemaTypeMap[mutableField.type.standardType]
        if (mutableField.description != null) {
            result.description = mutableField.description
        }
        if (mutableField.subFields != null) {
            for (i in mutableField.subFields.indices) {
                result.addFields(i, convertFieldSchema(mutableField.subFields[i]))
            }
        }
        return result.build()
    }
}
