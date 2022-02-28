package no.vegvesen.saga.modules.gcp.redis

import arrow.core.Either
import no.vegvesen.saga.modules.shared.services.BackfillProgressChecker
import redis.clients.jedis.Jedis

class RedisBackfillProgressChecker(private val jedis: Jedis) : BackfillProgressChecker {
    suspend fun <T> tryRunningSynchronized(block: () -> T) = Either.catch { synchronized(jedis) { block() } }

    override suspend fun saveIds(jobId: String, ids: Collection<String>): Either<Throwable, Unit> =
        tryRunningSynchronized {
            jedis.sadd(jobId, *ids.toTypedArray())
        }

    override suspend fun completeIdAndGetRemainingCount(jobId: String, id: String): Either<Throwable, Long> =
        tryRunningSynchronized {
            jedis.multi().use {
                it.srem(jobId, id)
                val cardResult = it.scard(jobId)
                it.exec()
                cardResult.get()
            }
        }

    override suspend fun clear(jobId: String): Either<Throwable, Unit> = tryRunningSynchronized {
        jedis.del(jobId)
    }

    override suspend fun isIdPending(jobId: String, fileName: String): Either<Throwable, Boolean> =
        tryRunningSynchronized {
            jedis.sismember(jobId, fileName)
        }

    override suspend fun getRemainingCount(jobId: String): Either<Throwable, Long> = tryRunningSynchronized {
        jedis.scard(jobId)
    }

    companion object {
        fun createOrThrow(redisHost: String, redisIdentifier: String?): RedisBackfillProgressChecker {
            val jedis = Jedis(redisHost)
            if (redisIdentifier != null)
                jedis.authenticateInstance(redisIdentifier, "RedisBackfillProgressChecker")
            return RedisBackfillProgressChecker(jedis)
        }
    }
}