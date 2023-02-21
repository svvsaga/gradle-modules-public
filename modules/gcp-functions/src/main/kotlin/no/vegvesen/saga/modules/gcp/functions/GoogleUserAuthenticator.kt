package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import com.google.api.client.auth.openidconnect.IdToken
import com.google.cloud.functions.HttpRequest
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.functions.UserInfo
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log

class GoogleUserAuthenticator(
    private val tokenProcessor: GoogleIdTokenProcessor = GoogleIdTokenProcessor()
) : Logging {
    private fun verifyIdToken(request: HttpRequest): Either<AuthenticationException, IdToken> {
        val maybeAuthHeader = request.getFirstHeader("Authorization")

        return if (maybeAuthHeader.isPresent) {
            val header = maybeAuthHeader.get()
            if (header.startsWith("bearer ", true)) {
                val token = header.substring(7)
                log().info(
                    "Masked bearer token",
                    kv("masked", "${token.substring(0, 4)}***${token.substring(token.length - 4, token.length)}"),
                    kv("length", token.length)
                )
                tokenProcessor.parseAndVerify(token)
            } else {
                AuthenticationException("Unexpected Authorization header format").left()
            }
        } else {
            AuthenticationException("No Authorization header present").left()
        }
    }

    fun getAuthenticatedUserInfo(request: HttpRequest) = verifyIdToken(request).flatMap {
        val userId = it.payload.subject

        when (val email = it.payload["email"]) {
            is String -> UserInfo(userId, email).right()
            else -> Exception("ID Token does not have 'email' field").left()
        }
    }
}
