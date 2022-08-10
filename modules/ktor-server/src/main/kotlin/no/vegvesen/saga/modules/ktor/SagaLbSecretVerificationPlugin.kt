package no.vegvesen.saga.modules.ktor

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.createApplicationPlugin
import io.ktor.server.application.install
import io.ktor.server.request.header
import io.ktor.server.request.path
import io.ktor.server.response.respond
import io.ktor.util.toMap
import no.vegvesen.saga.modules.shared.v
import org.slf4j.LoggerFactory

const val SagaLbSecretHeader = "X-Saga-LB-Secret"

private val logger = LoggerFactory.getLogger("SagaLbSecretVerificationPlugin")

class SagaLbSecretVerificationPluginConfiguration {
    var sagaLbSecret: String? = null
    var ignorePaths = listOf("/_ah/")
}

val SagaLbSecretVerificationPlugin =
    createApplicationPlugin("SagaLbSecretVerificationPlugin", ::SagaLbSecretVerificationPluginConfiguration) {
        val sagaLbSecret = pluginConfig.sagaLbSecret ?: throw Exception("Missing sagaLbSecret")
        val ignorePaths = pluginConfig.ignorePaths
        onCall { call ->
            if (ignorePaths.any { path -> call.request.path().startsWith(path) })
                return@onCall

            call.request.header(SagaLbSecretHeader).let { value ->
                if (value == null) {
                    logger.warn(
                        "No Shared Saga Secret found in headers",
                        v("headers", call.request.headers.toMap())
                    )
                    call.respond(HttpStatusCode.Unauthorized)
                } else if (value != sagaLbSecret) {
                    logger.warn("Shared Saga Secret does not match!")
                    call.respond(HttpStatusCode.Forbidden)
                }
            }
        }
    }

fun Application.configureLoadBalancerSecret(sagaLbSecret: String) {
    install(SagaLbSecretVerificationPlugin) {
        this.sagaLbSecret = sagaLbSecret
    }
}
