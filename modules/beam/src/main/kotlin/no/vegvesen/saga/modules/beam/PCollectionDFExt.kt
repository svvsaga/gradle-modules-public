package no.vegvesen.saga.modules.beam

import com.google.api.services.bigquery.model.TableRow
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO
import org.apache.beam.sdk.io.gcp.bigquery.WriteResult
import org.apache.beam.sdk.options.ValueProvider
import org.apache.beam.sdk.values.PCollection

private fun createDefaultBQwriteTableRows(outputTable: ValueProvider<String>) = BigQueryIO.writeTableRows()
    .to(outputTable)
    .withCreateDisposition(BigQueryIO.Write.CreateDisposition.CREATE_NEVER)
    .withWriteDisposition(BigQueryIO.Write.WriteDisposition.WRITE_APPEND)
    .optimizedWrites()

fun PCollection<TableRow>.writeToBQTableBatch(
    outputTable: ValueProvider<String>,
    name: String? = null
): WriteResult =
    this.apply(
        name ?: "Batch write to BigQuery table $outputTable",
        createDefaultBQwriteTableRows(outputTable)
            .withMethod(BigQueryIO.Write.Method.FILE_LOADS)
    )

fun PCollection<TableRow>.writeToBQTableStreaming(
    outputTable: ValueProvider<String>,
    name: String? = null
): WriteResult =
    this.apply(
        name ?: "Streaming write to BigQuery table $outputTable",
        createDefaultBQwriteTableRows(outputTable)
            .withMethod(BigQueryIO.Write.Method.STREAMING_INSERTS)
            .withoutValidation()
    )
