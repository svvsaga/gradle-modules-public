package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import com.google.api.client.auth.openidconnect.IdToken
import com.google.cloud.functions.HttpRequest
import no.vegvesen.saga.modules.shared.functions.UserInfo

class GoogleUserAuthenticator(
    private val tokenProcessor: GoogleIdTokenProcessor = GoogleIdTokenProcessor()
) {
    private fun verifyIdToken(request: HttpRequest): Either<AuthenticationException, IdToken> {
        val maybeAuthHeader = request.getFirstHeader("Authorization")

        return if (maybeAuthHeader.isPresent) {
            val header = maybeAuthHeader.get()
            if (header.startsWith("bearer ", true)) {
                tokenProcessor.parseAndVerify(header.substring(7))
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
