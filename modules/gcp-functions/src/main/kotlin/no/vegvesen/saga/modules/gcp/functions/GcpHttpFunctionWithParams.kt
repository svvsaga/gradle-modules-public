package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.parseJsonParameters
import no.vegvesen.saga.modules.shared.functions.parseQueryParameters
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log
import java.net.HttpURLConnection

@ExperimentalSerializationApi
abstract class GcpHttpFunctionWithParams<T>(
    private val deserializer: DeserializationStrategy<T>,
    private val process: suspend (params: T) -> Either<Throwable, Unit>
) : HttpFunction, Logging {
    private val functionName = javaClass.simpleName

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }

    class ValidationException(override val cause: Throwable?) : Exception("Input validation failed", cause)

    override fun service(request: HttpRequest, response: HttpResponse) = runBlocking {
        log().info(
            "Incoming request:",
            kv("method", request.method),
            kv("uri", request.uri),
            kv("path", request.path),
            kv("params", request.queryParameters)
        )

        if (request.contentType.isPresent && request.contentType.get() == ContentType.Json.value) {
            parseJsonParameters(deserializer, request.reader.readText())
        } else {
            parseQueryParameters(deserializer, request.queryParameters)
        }.mapLeft {
            ValidationException(it)
        }.flatMap { params ->
            Either.catchAndFlatten {
                process(params)
            }
        }.fold(
            ifLeft = { err ->
                val statusCode = if (err is ValidationException) {
                    log().warn("Failed with invalid input during run of HTTP function $functionName", err)
                    HttpURLConnection.HTTP_BAD_REQUEST
                } else {
                    log().error("Failed with exception during run of HTTP function $functionName", err)
                    HttpURLConnection.HTTP_INTERNAL_ERROR
                }
                response.setStatusCode(statusCode)
                response.writer.write("$functionName: Failed with $statusCode.")
                response.writer.flush()
            },
            ifRight = {
                response.writer.write("Ok.")
                response.writer.flush()
            }
        )
    }
}
