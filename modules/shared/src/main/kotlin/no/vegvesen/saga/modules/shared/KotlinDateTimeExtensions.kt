package no.vegvesen.saga.modules.shared

import kotlinx.datetime.Instant
import java.time.ZonedDateTime

fun ZonedDateTime.toKotlinInstant() = Instant.fromEpochSeconds(this.toEpochSecond(), this.nano)