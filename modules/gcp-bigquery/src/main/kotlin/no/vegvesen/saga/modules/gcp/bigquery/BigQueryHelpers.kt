package no.vegvesen.saga.modules.gcp.bigquery

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.BigQueryOptions

fun createBigQuery(projectId: String, location: BigQueryLocation): BigQuery =
    BigQueryOptions.newBuilder().setProjectId(projectId).setLocation(location.name).build().service