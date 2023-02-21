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
        /**
         Why not the Authorization header?

         Because the cloud functions runtime have started removing the signature part of the token sent in the Authorization header, to prevent reuse of the tokens that are provided as a function invoker calls a cloud function.

         > To prevent inappropriate re-use of these tokens, Cloud Functions IAM removes the token signature, preventing a function from invoking another function.
         > https://cloud.google.com/functions/docs/securing/managing-access-iam

         As we actually want the signature part of the token, to verify it was created by google, we send it in another header to prevent the signature from being removed.
         */
        val maybeAuthHeader = request.getFirstHeader("X-Authorization")

        return if (maybeAuthHeader.isPresent) {
            val header = maybeAuthHeader.get()
            if (header.startsWith("bearer ", true)) {
                val token = header.substring(7)
                log().info(
                    "Masked bearer token",
                    kv("masked", "${token.substring(0, 4)}***${token.substring(token.length - 3, token.length)}"),
                    kv("length", token.length)
                )
                tokenProcessor.parseAndVerify(token)
            } else {
                AuthenticationException("Unexpected X-Authorization header format").left()
            }
        } else {
            AuthenticationException("No X-Authorization header present").left()
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
