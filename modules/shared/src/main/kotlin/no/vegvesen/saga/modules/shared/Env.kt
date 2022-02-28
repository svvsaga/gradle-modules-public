package no.vegvesen.saga.modules.shared

import arrow.core.Validated
import arrow.core.ValidatedNel

fun envOrThrow(envVar: String): String =
    envToValidated(envVar).mapLeft { Error(it) }.toEither().getOrThrow()

fun envToValidated(envVar: String): Validated<String, String> =
    Validated.fromNullable(System.getenv(envVar)) { "Missing environment variable $envVar" }

fun envToValidatedNel(envVar: String): ValidatedNel<String, String> = envToValidated(envVar).toValidatedNel()
