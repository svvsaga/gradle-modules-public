package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.properties.Properties

val lenientJson = Json { isLenient = true }

@ExperimentalSerializationApi
fun <T> parseQueryParameters(
    deserializer: DeserializationStrategy<T>,
    queryParameters: Map<String, List<String>>
): Either<Throwable, T> =
    Either.catch {
        queryParameters.mapValues { (key, value) ->
            value.singleOrNull() ?: throw Exception("More than one query parameter '$key'")
        }
            .let { Properties.decodeFromStringMap(deserializer, it) }
    }

fun <T> parseJsonParameters(deserializer: DeserializationStrategy<T>, json: String): Either<Throwable, T> =
    Either.catch {
        lenientJson.decodeFromString(deserializer, json.let { it.ifBlank { "{}" } })
    }
