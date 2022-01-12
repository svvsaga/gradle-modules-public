package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import com.google.api.client.auth.openidconnect.IdToken
import com.google.api.client.auth.openidconnect.IdTokenVerifier
import com.google.cloud.functions.HttpRequest

class RequestVerifier(
    private val tokenParser: TokenParser,
    private val tokenVerifier: IdTokenVerifier
) {
    private fun verifyIdToken(request: HttpRequest): Either<AuthenticationException, IdToken> {
        val maybeAuthHeader = request.getFirstHeader("Authorization")

        return if (maybeAuthHeader.isPresent) {
            val header = maybeAuthHeader.get()
            if (header.startsWith("bearer ", true)) {
                tokenParser.parse(header.substring(7))
                    .mapLeft { AuthenticationException("Failed to parse ID token") }
                    .flatMap { token ->
                        if (tokenVerifier.verify(token)) {
                            token.right()
                        } else {
                            AuthenticationException("Could not verify ID token").left()
                        }
                    }
            } else {
                AuthenticationException("Unexpected Authorization header format").left()
            }
        } else {
            AuthenticationException("No Authorization header present").left()
        }
    }

    fun verifyUserInfo(request: HttpRequest) = verifyIdToken(request).flatMap {
        val userId = it.payload.subject

        when (val email = it.payload["email"]) {
            is String -> UserInfo(userId, email).right()
            else -> Exception("ID Token does not have 'email' field").left()
        }
    }
}
