package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either

interface PubSubParamsProcessor<T> {
    suspend fun process(params: T): Either<PubSubError, Unit>
}