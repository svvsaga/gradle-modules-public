package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import com.google.cloud.functions.HttpRequest
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.functions.parseJsonParameters
import no.vegvesen.saga.modules.shared.functions.parseQueryParameters
import no.vegvesen.saga.modules.shared.kv
import org.slf4j.Logger

@ExperimentalSerializationApi
fun <T : Any> parseParameters(
    request: HttpRequest,
    deserializer: DeserializationStrategy<T>
): Either<ValidationException, T> =
    if (request.contentType.isPresent && request.contentType.get() == ContentType.Json.value) {
        parseJsonParameters(deserializer, request.reader.readText())
    } else {
        parseQueryParameters(deserializer, request.queryParameters)
    }.mapLeft {
        ValidationException(cause = it)
    }

fun Logger.httpRequest(request: HttpRequest) {
    info(
        "Incoming request:",
        kv("method", request.method),
        kv("uri", request.uri),
        kv("path", request.path),
        kv("query", request.query)
    )
}
