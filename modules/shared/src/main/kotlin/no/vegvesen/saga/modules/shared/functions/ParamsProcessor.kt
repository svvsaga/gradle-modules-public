package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either

interface ParamsProcessor<T> {
    suspend fun process(params: T): Either<Throwable, Unit>
}