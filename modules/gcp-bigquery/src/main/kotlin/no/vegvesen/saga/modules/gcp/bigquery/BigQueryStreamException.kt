package no.vegvesen.saga.modules.gcp.bigquery

data class BigQueryStreamException(
    override val message: String,
    val errors: List<String>,
    override val cause: Throwable? = null,
) : Exception(message, cause)
