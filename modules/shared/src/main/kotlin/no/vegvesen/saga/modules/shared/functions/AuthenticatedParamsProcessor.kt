package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either

interface AuthenticatedParamsProcessor<T> {
    suspend fun process(params: T, userInfo: UserInfo): Either<Throwable, Unit>
}