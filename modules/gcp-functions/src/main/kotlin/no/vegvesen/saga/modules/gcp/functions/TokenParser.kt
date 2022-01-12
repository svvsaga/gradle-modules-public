package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import com.google.api.client.auth.openidconnect.IdToken
import com.google.api.client.json.gson.GsonFactory

class TokenParser {
    private val gsonFactory = GsonFactory()

    fun parse(token: String): Either<Throwable, IdToken> = Either.catch {
        IdToken.parse(gsonFactory, token)
    }
}
