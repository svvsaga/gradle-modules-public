package no.vegvesen.saga.modules.gcp.functions

import arrow.core.left
import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.SimpleFunction
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.getClassForLogging
import no.vegvesen.saga.modules.shared.getLogger
import no.vegvesen.saga.modules.shared.kv
import java.net.HttpURLConnection

/**
 * Inherit from this class to create a GCP callable Http function
 */
abstract class GcpHttpFunction(private val func: SimpleFunction) : HttpFunction {
    protected val logger = getLogger(getClassForLogging(javaClass))

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }

    val name = this::class.java.simpleName.toString()

    override fun service(request: HttpRequest, response: HttpResponse) = runBlocking {
        logger.info(
            "Incoming request:",
            kv("method", request.method),
            kv("uri", request.uri),
            kv("path", request.path),
            kv("params", request.queryParameters)
        )
        try {
            func()
        } catch (exception: Exception) {
            SimpleFunctionError.Exception("Unexpected error", exception).left()
        }.fold(
            ifLeft = { err ->
                when (err) {
                    is SimpleFunctionError.Exception -> logger.error(
                        "Failed with exception during run of HTTP function $name",
                        err.exception
                    )
                    is SimpleFunctionError.UnexpectedError -> logger.error(
                        "Failed with unexpected error during run of HTTP function $name",
                        kv("msg", err.msg),
                        kv("error", err.obj)
                    )
                }
                response.setStatusCode(HttpURLConnection.HTTP_INTERNAL_ERROR)
                response.writer.write("$name: Failed.")
                response.writer.flush()
            },
            ifRight = {
                response.writer.write("Ok.")
                response.writer.flush()
            }
        )
    }
}
