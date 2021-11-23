package no.vegvesen.saga.modules.shared.serializers

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.properties.Properties

object SerializationObjectMapper {
    /**
     * Maps an object using ktolinx.serialization without using reflection
     */
    @OptIn(ExperimentalSerializationApi::class)
    fun <A, B> mapObject(fromSerializer: SerializationStrategy<A>, toDeserializer: DeserializationStrategy<B>, from: A): B =
        Properties.decodeFromMap(toDeserializer,
            Properties.encodeToMap(fromSerializer, from)
        )
}
