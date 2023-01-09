package no.vegvesen.saga.modules.gcp.functions

// Cloud Functions uses GSON to populate this object.
// Field types/names are specified by Cloud Functions
// Changing them may break your code!
data class GcpPubSubMessage(
    // Base64 encoded
    val data: String? = null,
    val attributes: Map<String, String?>? = null,
)
