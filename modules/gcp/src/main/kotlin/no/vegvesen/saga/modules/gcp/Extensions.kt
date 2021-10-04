package no.vegvesen.saga.modules.gcp

import com.google.cloud.Timestamp
import java.time.Instant

fun Timestamp.toInstant(): Instant = Instant.ofEpochSecond(this.seconds, this.nanos.toLong())
