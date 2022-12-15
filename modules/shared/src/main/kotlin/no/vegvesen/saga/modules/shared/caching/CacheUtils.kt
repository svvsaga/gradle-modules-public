package no.vegvesen.saga.modules.shared.caching

import io.github.reactivecircus.cache4k.Cache
import kotlin.time.Duration

/**
 * Create a memoized function that caches the result for the given duration.
 */
inline fun <T : Any> memoizeWithDuration(
    duration: Duration,
    crossinline loader: suspend () -> T
): suspend () -> T {
    val cache: Cache<Unit, T> = Cache.Builder()
        .expireAfterWrite(duration)
        .build()
    return {
        cache.get(Unit) { loader() }
    }
}

fun <T : Any> createCache(duration: Duration): Cache<Unit, T> = Cache.Builder()
    .expireAfterWrite(duration)
    .build()

/**
 * A cache that can hold a single value for a given duration.
 */
class SingleCache<T : Any>(duration: Duration) {
    val cache: Cache<Unit, T> = createCache(duration)

    suspend inline fun get(crossinline loader: suspend () -> T): T {
        return cache.get(Unit) { loader() }
    }

    fun invalidate() {
        cache.invalidateAll()
    }

    fun put(value: T) {
        cache.put(Unit, value)
    }
}
