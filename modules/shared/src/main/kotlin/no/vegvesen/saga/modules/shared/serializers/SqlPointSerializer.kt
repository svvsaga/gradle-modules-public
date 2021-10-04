package no.vegvesen.saga.modules.shared.serializers

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import no.vegvesen.saga.modules.shared.SqlPoint

@ExperimentalSerializationApi
@Serializer(forClass = SqlPoint::class)
object SqlPointSerializer : KSerializer<SqlPoint> {
    override fun serialize(encoder: Encoder, value: SqlPoint) {
        encoder.encodeString(value.toString())
    }

    private val regex = Regex("POINT\\s*\\(([0-9.]+)\\s+([0-9.]+)\\)")

    override fun deserialize(decoder: Decoder): SqlPoint {
        val match = regex.matchEntire(decoder.decodeString()) ?: throw SqlPointParseException("Invalid POINT format")
        val lon = match.groups[1]?.value?.toFloat() ?: throw SqlPointParseException("Failed to parse longitude")
        val lat = match.groups[2]?.value?.toFloat() ?: throw SqlPointParseException("Failed to parse latitude")
        return SqlPoint(lat, lon)
    }
}
