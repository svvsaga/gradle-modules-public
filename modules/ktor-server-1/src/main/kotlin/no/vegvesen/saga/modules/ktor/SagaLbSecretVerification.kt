@file:Suppress("KotlinPlaceholderCountMatchesArgumentCount")

package no.vegvesen.saga.modules.ktor

import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.ApplicationCallPipeline
import io.ktor.application.ApplicationFeature
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.http.HttpStatusCode
import io.ktor.request.header
import io.ktor.request.path
import io.ktor.response.respond
import io.ktor.util.AttributeKey
import io.ktor.util.pipeline.PipelineContext
import io.ktor.util.toMap
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.log
import no.vegvesen.saga.modules.shared.v

const val SagaLbSecretHeader = "X-Saga-LB-Secret"

class SagaLbSecretVerification(configuration: Configuration) : Logging {
    private val ignorePaths = configuration.ignorePaths
    private val sagaLbSecret = configuration.sagaLbSecret ?: throw Exception("Saga LB Secret must not be null")

    class Configuration {
        var sagaLbSecret: String? = null
        var ignorePaths = listOf("/_ah/")
    }

    private suspend fun intercept(context: PipelineContext<Unit, ApplicationCall>) {
        if (shouldIgnorePath(context)) return

        context.call.request.header(SagaLbSecretHeader).let { value ->
            if (value == null) {
                log().warn("No Shared Saga Secret found in headers", v("headers", context.call.request.headers.toMap()))
                context.call.respond(HttpStatusCode.Unauthorized)
                context.finish()
            } else if (value != sagaLbSecret) {
                log().warn("Shared Saga Secret does not match!")
                context.call.respond(HttpStatusCode.Forbidden)
                context.finish()
            }
        }
    }

    private fun shouldIgnorePath(context: PipelineContext<Unit, ApplicationCall>) =
        ignorePaths.any { path ->
            context.call.request.path().startsWith(path)
        }

    companion object Feature : ApplicationFeature<ApplicationCallPipeline, Configuration, SagaLbSecretVerification> {
        override val key = AttributeKey<SagaLbSecretVerification>(::SagaLbSecretVerification.name)

        override fun install(
            pipeline: ApplicationCallPipeline,
            configure: Configuration.() -> Unit,
        ): SagaLbSecretVerification {
            val config = Configuration().apply(configure)
            if (config.sagaLbSecret == null) {
                throw Exception("Saga LB Secret must be set!")
            }
            val feature = SagaLbSecretVerification(config)
            pipeline.intercept(ApplicationCallPipeline.Call) {
                feature.intercept(this)
            }
            return feature
        }
    }
}

fun Application.configureLoadBalancerSecret(sagaLbSecret: String) {
    install(SagaLbSecretVerification) {
        this.sagaLbSecret = sagaLbSecret
    }
}
