package no.vegvesen.saga.modules.gcp

import java.time.Instant
import com.google.cloud.Timestamp as CloudTimestamp
import com.google.protobuf.Timestamp as ProtobufTimestamp
import kotlinx.datetime.Instant as KotlinInstant

fun CloudTimestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())
fun ProtobufTimestamp.toInstant(): Instant = Instant.ofEpochSecond(seconds, nanos.toLong())

fun CloudTimestamp.toKotlinInstant(): KotlinInstant = KotlinInstant.fromEpochSeconds(seconds, nanos)
fun ProtobufTimestamp.toKotlinInstant(): KotlinInstant = KotlinInstant.fromEpochSeconds(seconds, nanos)

fun KotlinInstant.toProtobufTimestamp(): ProtobufTimestamp =
    ProtobufTimestamp.newBuilder().setSeconds(epochSeconds).setNanos(nanosecondsOfSecond).build()

fun Instant.toProtobufTimestamp(): ProtobufTimestamp =
    ProtobufTimestamp.newBuilder().setSeconds(epochSecond).setNanos(nano).build()

fun KotlinInstant.toCloudTimestamp(): CloudTimestamp =
    CloudTimestamp.ofTimeSecondsAndNanos(epochSeconds, nanosecondsOfSecond)

fun Instant.toCloudTimestamp(): CloudTimestamp = CloudTimestamp.ofTimeSecondsAndNanos(epochSecond, nano)
