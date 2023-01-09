package no.vegvesen.saga.modules.shared.functions

data class StorageEvent(
    val bucket: String,
    val name: String,
) {
    fun isFolder() = name.trim().endsWith("/")
}
