package no.vegvesen.saga.modules.shared

import arrow.core.Either
import arrow.fx.coroutines.Schedule
import arrow.fx.coroutines.retry
import kotlin.time.Duration
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.DurationUnit.NANOSECONDS

object Retry : Logging {

    data class ExponentialBackoffSettings(val duration: Duration, val maxAttempts: Int)

    /** Retry with exponential backoff. */
    suspend fun <T> retry(
        description: String,
        backoff: ExponentialBackoffSettings,
        retryable: suspend () -> T,
    ): Either<Throwable, T> = retry(description, backoff, { _, _, _ -> }, retryable)

    /** Retry with exponential backoff. */
    suspend fun <T> retry(
        description: String,
        backoff: ExponentialBackoffSettings,
        onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = { _, _, _ -> },
        retryable: suspend () -> T,
    ): Either<Throwable, T> {
        var attempts = 1
        return Either.catch {
            Schedule.exponential<Throwable>(backoff.duration.toDouble(NANOSECONDS))
                .check { exception: Throwable, output ->
                    log().warn(
                        "$description failed, retry attempt $attempts/${backoff.maxAttempts}. Error: {}",
                        v("error", exception.localizedMessage)
                    )
                    onRetry(exception, output.nanoseconds, attempts)
                    attempts++
                    attempts <= backoff.maxAttempts
                }
                .retry {
                    retryable()
                }
        }
    }

    /** Retry with exponential backoff. Will retry on failed Eithers. */
    suspend fun <T> retryEither(
        description: String,
        backoff: ExponentialBackoffSettings,
        retryable: suspend () -> Either<Throwable, T>
    ): Either<Throwable, T> = retryEither(description, backoff, { _, _, _ -> }, retryable)

    /** Retry with exponential backoff. Will retry on failed Eithers. */
    suspend fun <T> retryEither(
        description: String,
        backoff: ExponentialBackoffSettings,
        onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = { _, _, _ -> },
        retryable: suspend () -> Either<Throwable, T>
    ) = retry(description, backoff, onRetry) {
        retryable().getOrThrow()
    }
}
