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

/**
 * Serializes kotlinx.datetime.Instant to int64 of microseconds. Useful for BigQuery Storage Write API.
 */
@ExperimentalSerializationApi
@Serializer(forClass = Instant::class)
object TimestampInstantSerializer : KSerializer<Instant> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Instant", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, value: Instant) {
        val epochMicroSeconds = value.epochSeconds * 1_000_000 + value.nanosecondsOfSecond / 1000
        encoder.encodeLong(epochMicroSeconds)
    }

    override fun deserialize(decoder: Decoder): Instant {
        val epochMicroSeconds = decoder.decodeLong()
        val seconds = epochMicroSeconds / 1_000_000
        val nanoSeconds = (epochMicroSeconds % 1_000_000) * 1000
        return Instant.fromEpochSeconds(seconds, nanoSeconds)
    }
}
