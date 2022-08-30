package no.vegvesen.saga.modules.shared

import arrow.core.Either
import arrow.fx.coroutines.Schedule
import arrow.fx.coroutines.retry
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
object Retry : Logging {

    data class ExponentialBackoffSettings(val duration: Duration, val maxAttempts: Int)

    /** Retry with exponential backoff. */
    suspend fun <T> retry(
        backoff: ExponentialBackoffSettings,
        onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit,
        retryable: suspend () -> T,
    ): Either<Throwable, T> {
        var attempts = 1
        return Either.catch {
            Schedule.exponential<Throwable>(backoff.duration)
                .check { exception: Throwable, output ->
                    onRetry(exception, output, attempts)
                    attempts++
                    attempts <= backoff.maxAttempts
                }
                .retry {
                    retryable()
                }
        }
    }

    /** Retry with exponential backoff. */
    suspend fun <T> retry(description: String, backoff: ExponentialBackoffSettings, retryable: suspend () -> T) =
        retry(backoff, loggingRetry(description, backoff), retryable)

    /** Retry with exponential backoff. Will retry on failed Eithers. */
    suspend fun <T> retryEither(
        description: String,
        backoff: ExponentialBackoffSettings,
        onRetry: (exception: Throwable, delay: Duration, attempts: Int) -> Unit = loggingRetry(description, backoff),
        retryable: suspend () -> Either<Throwable, T>
    ) = retry(backoff, onRetry) {
        retryable().getOrThrow()
    }

    private fun loggingRetry(description: String, backoff: ExponentialBackoffSettings) =
        { exception: Throwable, _: Duration, attempts: Int ->
            log().warn(
                "$description failed, retry attempt $attempts/${backoff.maxAttempts}. Error: {}",
                v("error", exception.localizedMessage)
            )
        }
}
