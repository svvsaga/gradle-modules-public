package no.vegvesen.saga.modules.gcp

import java.time.Instant
import kotlinx.datetime.Instant as KotlinInstant

fun com.google.cloud.Timestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())
fun com.google.protobuf.Timestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())

fun com.google.cloud.Timestamp.toKotlinInstant(): KotlinInstant = KotlinInstant.fromEpochSeconds(seconds, nanos)
fun com.google.protobuf.Timestamp.toKotlinInstant(): KotlinInstant = KotlinInstant.fromEpochSeconds(seconds, nanos)
