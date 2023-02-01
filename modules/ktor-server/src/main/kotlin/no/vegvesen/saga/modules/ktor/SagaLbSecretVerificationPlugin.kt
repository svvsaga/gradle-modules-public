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
    var sagaLbSecrets: List<String> = emptyList()
    var ignorePaths = listOf("/_ah/")
}

val SagaLbSecretVerificationPlugin =
    createApplicationPlugin("SagaLbSecretVerificationPlugin", ::SagaLbSecretVerificationPluginConfiguration) {
        val sagaLbSecrets = pluginConfig.sagaLbSecrets
        if (sagaLbSecrets.isEmpty()) {
            throw Exception("SagaLbSecretVerificationPlugin: sagaLbSecrets must be non-empty")
        }
        val ignorePaths = pluginConfig.ignorePaths
        onCall { call ->
            if (ignorePaths.any { path -> call.request.path().startsWith(path) }) {
                return@onCall
            }

            call.request.header(SagaLbSecretHeader).let { value ->
                if (value == null) {
                    logger.warn(
                        "No Shared Saga Secret found in headers",
                        v("headers", call.request.headers.toMap())
                    )
                    call.respond(HttpStatusCode.Unauthorized)
                } else if (!sagaLbSecrets.contains(value)) {
                    logger.warn("Shared Saga Secret does not match!")
                    call.respond(HttpStatusCode.Forbidden)
                }
            }
        }
    }

fun Application.configureLoadBalancerSecret(vararg sagaLbSecrets: String) {
    install(SagaLbSecretVerificationPlugin) {
        this.sagaLbSecrets = sagaLbSecrets.toList()
    }
}
