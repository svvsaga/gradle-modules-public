package no.vegvesen.saga.modules.testing

fun Any.loadStringResourceOrThrow(file: String): String = readResourceAsBytes(file).toString(Charsets.UTF_8)

fun Any.readResourceAsBytes(file: String): ByteArray = readResourceAsStream(file).readBytes()

fun Any.readResourceAsStream(file: String) =
    javaClass.getResourceAsStream(if (file.startsWith('/')) file else "/$file")
        ?: throw Exception("Missing resource: $file")
