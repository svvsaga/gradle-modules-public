package no.vegvesen.saga.modules.shared.serializers

data class SqlPointParseException(override val message: String? = "Failed to parse SqlPoint") : Exception(message)
