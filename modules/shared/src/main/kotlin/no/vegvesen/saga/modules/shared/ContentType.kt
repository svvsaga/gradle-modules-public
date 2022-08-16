package no.vegvesen.saga.modules.shared

@JvmInline
value class ContentType(val value: String) {
    companion object {
        val OctetStream = ContentType("application/octet-stream")
        val Txt = ContentType("application/txt")
        val Xml = ContentType("application/xml")
        val Gzip = ContentType("application/gzip")
        val NdJson = ContentType("application/x-ndjson")
        val Json = ContentType("application/json")
        fun custom(value: String) = ContentType(value)
    }
}
