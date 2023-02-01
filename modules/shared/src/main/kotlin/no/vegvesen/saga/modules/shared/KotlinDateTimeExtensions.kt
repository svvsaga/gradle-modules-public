package no.vegvesen.saga.modules.shared

import java.time.ZonedDateTime
import kotlinx.datetime.Instant

fun ZonedDateTime.toKotlinInstant() = Instant.fromEpochSeconds(this.toEpochSecond(), this.nano)
