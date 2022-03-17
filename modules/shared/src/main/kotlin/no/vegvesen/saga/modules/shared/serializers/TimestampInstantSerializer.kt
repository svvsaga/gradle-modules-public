package no.vegvesen.saga.modules.shared.serializers

import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.time.Duration.Companion.microseconds
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.Duration.Companion.seconds

/**
 * Serializes kotlinx.datetime.Instant to int64 of microseconds. Useful for BigQuery Storage Write API.
 */
@ExperimentalSerializationApi
@Serializer(forClass = Instant::class)
object TimestampInstantSerializer : KSerializer<Instant> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Instant", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, value: Instant) {
        val duration = value.epochSeconds.seconds + value.nanosecondsOfSecond.nanoseconds
        encoder.encodeLong(duration.inWholeMicroseconds)
    }

    override fun deserialize(decoder: Decoder): Instant {
        val duration = decoder.decodeLong().microseconds
        val seconds = duration.inWholeSeconds
        val nanoSeconds = (duration - seconds.seconds).inWholeNanoseconds
        return Instant.fromEpochSeconds(seconds, nanoSeconds)
    }
}
