package no.vegvesen.saga.modules.shared

fun envOrThrow(envVar: String) =
    System.getenv(envVar) ?: throw Error("Missing environment variable $envVar")
