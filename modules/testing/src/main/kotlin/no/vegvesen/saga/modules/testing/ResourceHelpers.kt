package no.vegvesen.saga.modules.testing

fun Any.loadStringResourceOrThrow(file: String): String =
    javaClass.getResourceAsStream(if (file.startsWith('/')) file else "/$file")?.readBytes()?.toString(Charsets.UTF_8)
        ?: throw Exception("No resource '$file' exists on classpath")