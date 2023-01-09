package no.vegvesen.saga.modules.gcp.redis

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.redis.v1.CloudRedis
import com.google.auth.http.HttpCredentialsAdapter
import com.google.auth.oauth2.GoogleCredentials
import redis.clients.jedis.Jedis

sealed class RedisError
object NoTokenReturned : RedisError()
data class FetchingTokenFailed(val exception: Throwable) : RedisError()

private fun fetchAuthString(redisIdentifier: String, applicationName: String): Either<RedisError, String> =
    Either.catch {
        CloudRedis.Builder(
            GoogleNetHttpTransport.newTrustedTransport(),
            GsonFactory(),
            HttpCredentialsAdapter(GoogleCredentials.getApplicationDefault()),
        )
            .setApplicationName(applicationName)
            .build()
            .projects()
            .locations()
            .instances()
            .getAuthString(redisIdentifier)
            .execute()
            .authString
    }
        .mapLeft { FetchingTokenFailed(it) }
        .flatMap { authToken -> authToken?.right() ?: NoTokenReturned.left() }

fun Jedis.authenticateInstance(redisIdentifier: String, applicationName: String): Either<Throwable, Unit> =
    fetchAuthString(redisIdentifier, applicationName)
        .mapLeft {
            when (it) {
                is NoTokenReturned -> Exception("Redis: No auth token returned.")
                is FetchingTokenFailed -> Exception(
                    "Redis: Fetching auth token failed.",
                    it.exception,
                )
            }
        }
        .flatMap {
            when (val response = auth(it)) {
                "OK" -> Unit.right()
                else -> Exception("Redis: Authentication failed: $response.").left()
            }
        }
