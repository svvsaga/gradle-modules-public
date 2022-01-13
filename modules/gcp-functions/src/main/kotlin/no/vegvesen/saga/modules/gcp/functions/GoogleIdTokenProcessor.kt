package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import com.google.api.client.auth.openidconnect.IdToken
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory

/**
 * Wrapper around GoogleIdTokenVerifier to avoid direct dependency, and to specify issuer
 */
class GoogleIdTokenProcessor {
    private val internalVerifier =
        GoogleIdTokenVerifier.Builder(GoogleNetHttpTransport.newTrustedTransport(), GsonFactory())
            .setIssuer("https://accounts.google.com")
            .build()

    fun parseAndVerify(token: String): Either<AuthenticationException, IdToken> = Either.catch {
        IdToken.parse(internalVerifier.jsonFactory, token)
    }
        .mapLeft { AuthenticationException("Failed to parse ID token", it) }
        .flatMap { idToken ->
            Either.catch { internalVerifier.verify(idToken) }
                .mapLeft { AuthenticationException("Failure during token verification", it) }
                .flatMap { isValid ->
                    if (isValid) idToken.right() else
                        AuthenticationException("Could not verify ID token").left()
                }
        }
}
