package no.vegvesen.saga.modules.shared

import arrow.core.Either
import arrow.core.flatMap
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.withContext

@Deprecated("Use Either.catch.", ReplaceWith("Either.catch(fn)", "arrow.core.Either"))
inline fun <T> tryRunning(fn: () -> T) = Either.catch(fn)

suspend inline fun <T> tryWithContext(
    dispatcher: CoroutineDispatcher,
    crossinline fn: CoroutineScope.() -> T
): Either<Exception, T> =
    withContext(dispatcher) {
        try {
            Either.Right(fn())
        } catch (exception: Exception) {
            Either.Left(exception)
        }
    }

/**
 * Perform a blocking operation that returns an `Either<Exception, T>`, with a specific `CoroutineContext`.
 * See e.g. https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/.
 */
suspend inline fun <T> tryFlatWithContext(
    dispatcher: CoroutineDispatcher,
    crossinline fn: suspend CoroutineScope.() -> Either<Exception, T>
): Either<Exception, T> =
    withContext(dispatcher) {
        fn()
    }

inline fun <A, B> Either<A, B>.tapLeft(tap: (left: A) -> Unit): Either<A, B> {
    return this.mapLeft {
        tap(it)
        it
    }
}

inline fun <A, B> Either<A, B>.tap(tap: (right: B) -> Unit): Either<A, B> {
    return this.map {
        tap(it)
        it
    }
}

inline fun <A, B, F> Either<F, A>.flatTap(f: (A) -> Either<F, B>): Either<F, A> =
    flatMap { a -> f(a).map { a } }

fun <A> Either<Throwable, A>.getOrThrow(): A = this.fold({ throw it }, { it })

fun <A, B> Iterable<Either<A, B>>.allLefts(): List<A> = this.mapNotNull { either -> either.fold({ it }, { null }) }
