package no.vegvesen.saga.modules.shared.caching

import io.github.reactivecircus.cache4k.Cache
import kotlin.time.Duration

/**
 * Create a memoized function that caches the result for the given duration.
 */
fun <T : Any> memoizeWithDuration(
    duration: Duration,
    loader: suspend () -> T
): suspend () -> T {
    val cache: Cache<Unit, T> = Cache.Builder()
        .expireAfterWrite(duration)
        .build()
    return {
        cache.get(Unit) { loader() }
    }
}
