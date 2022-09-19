package no.vegvesen.saga.modules.ktor

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.call
import io.ktor.server.auth.AuthenticationConfig
import io.ktor.server.auth.AuthenticationContext
import io.ktor.server.auth.AuthenticationProvider
import io.ktor.server.auth.Principal
import io.ktor.server.auth.principal
import io.ktor.server.request.header
import io.ktor.server.response.respond
import io.ktor.util.pipeline.PipelineContext
import no.vegvesen.saga.modules.shared.Logging

const val AuthenticatedUserEmailHeader = "X-Goog-Authenticated-User-Email"

fun AuthenticationConfig.iap(
    name: String? = null,
    overrideEmail: String? = null,
    configure: IapAuthenticationProvider.Config.() -> Unit = {}
) {
    val provider =
        IapAuthenticationProvider(IapAuthenticationProvider.Config(name, overrideEmail).apply(configure))
    register(provider)
}

data class UserEmailPrincipal(val email: String) : Principal

/**
 * Get user email from IAP-authenticated user, based on 'X-Goog-Authenticated-User-Email' header.
 */
fun PipelineContext<Unit, ApplicationCall>.getUserEmail(): String =
    call.principal<UserEmailPrincipal>()?.email ?: throw Exception("UserInfo principal missing!")

class IapAuthenticationProvider(private val config: Config) :
    AuthenticationProvider(config), Logging {

    class Config internal constructor(name: String?, var overrideEmail: String? = null) :
        AuthenticationProvider.Config(name)

    override suspend fun onAuthenticate(context: AuthenticationContext) {
        val call = context.call
        val userEmail: String? =
            call.request.header(AuthenticatedUserEmailHeader)?.replace("accounts.google.com:", "")
                ?: config.overrideEmail

        if (userEmail.isNullOrBlank()) {
            call.respond(HttpStatusCode.Unauthorized, "$AuthenticatedUserEmailHeader not set")
        } else {
            context.principal = UserEmailPrincipal(userEmail)
        }
    }
}
