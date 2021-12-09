package no.vegvesen.saga.modules.gcp

import java.time.Instant

fun com.google.cloud.Timestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())
fun com.google.protobuf.Timestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())
