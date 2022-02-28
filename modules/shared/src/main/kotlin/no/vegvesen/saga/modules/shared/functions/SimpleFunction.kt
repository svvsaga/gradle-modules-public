package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either

/**
 * Note: This is a general type independant of how it is executed, e.g. GCP Function, AWS Lambdo
 * or locally. It should NOT introduce any dependencies on GCP.
 */
sealed class SimpleFunctionError {
    data class Exception(val msg: String, val exception: Throwable) : SimpleFunctionError()
    data class UnexpectedError(val msg: String, val obj: Any) : SimpleFunctionError()
}
typealias SimpleFunction = suspend () -> Either<SimpleFunctionError, Unit>

interface SimpleProcessor {
    suspend fun process(): Either<SimpleFunctionError, Unit>
}