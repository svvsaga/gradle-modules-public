package no.vegvesen.saga.modules.gcp.functions

import java.util.Date

// Cloud Functions uses GSON to populate this object.
// Field types/names are specified by Cloud Functions
// Changing them may break your code!
data class GcsEvent(
    val bucket: String,
    val name: String,
    val metageneration: String,
    val timeCreated: Date,
    val updated: Date
) {
    fun isFolder() = name.trim().endsWith("/")
}