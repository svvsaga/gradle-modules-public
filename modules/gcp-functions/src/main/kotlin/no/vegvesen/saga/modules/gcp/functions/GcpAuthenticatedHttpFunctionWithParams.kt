package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.continuations.either
import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.UserInfo
import no.vegvesen.saga.modules.shared.log
import no.vegvesen.saga.modules.shared.v
import java.net.HttpURLConnection.HTTP_BAD_REQUEST
import java.net.HttpURLConnection.HTTP_FORBIDDEN
import java.net.HttpURLConnection.HTTP_INTERNAL_ERROR
import java.net.HttpURLConnection.HTTP_UNAUTHORIZED

@ExperimentalSerializationApi
abstract class GcpAuthenticatedHttpFunctionWithParams<T : Any>(
    private val deserializer: DeserializationStrategy<T>,
    private val authenticator: GoogleUserAuthenticator = GoogleUserAuthenticator(),
    private val process: suspend (params: T, userInfo: UserInfo) -> Either<Throwable, Unit>
) : HttpFunction, Logging {
    private val functionName = javaClass.simpleName

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }

    override fun service(request: HttpRequest, response: HttpResponse) = runBlocking {
        log().httpRequest(request)

        either {
            val params = parseParameters(request, deserializer).bind()
            log().info("Parameters parsed", v("params", params))
            val userInfo = authenticator.getAuthenticatedUserInfo(request).bind()
            Either.catchAndFlatten {
                process(params, userInfo)
            }.bind()
        }.fold(
            ifLeft = { err ->
                val statusCode = when (err) {
                    is ValidationException -> {
                        log().warn("Failed with invalid input during run of HTTP function $functionName", err)
                        HTTP_BAD_REQUEST
                    }
                    is AuthenticationException -> {
                        log().warn("Authentication failed during run of HTTP function $functionName", err)
                        HTTP_UNAUTHORIZED
                    }
                    is AuthorizationException -> {
                        log().warn("Authorization failed during run of HTTP function $functionName", err)
                        HTTP_FORBIDDEN
                    }
                    else -> {
                        log().error("Failed with exception during run of HTTP function $functionName", err)
                        HTTP_INTERNAL_ERROR
                    }
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
