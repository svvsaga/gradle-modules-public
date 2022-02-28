package no.vegvesen.saga.modules.shared

fun readResourceAsBytes(file: String): ByteArray = {}.javaClass.getResourceAsStream(file)?.readBytes() ?: throw Exception("Missing resource: $file")