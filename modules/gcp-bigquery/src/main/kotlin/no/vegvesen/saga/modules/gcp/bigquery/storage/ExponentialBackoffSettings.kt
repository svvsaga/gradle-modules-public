package no.vegvesen.saga.modules.gcp.bigquery.storage

import kotlin.time.Duration

data class ExponentialBackoffSettings(val duration: Duration, val limit: Duration)
