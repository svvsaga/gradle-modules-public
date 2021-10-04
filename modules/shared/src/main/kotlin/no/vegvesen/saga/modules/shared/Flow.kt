package no.vegvesen.saga.modules.shared

import arrow.core.Either
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.fold

suspend fun <T> Flow<Either<Exception, T>>.keepLeft(initial: T) =
    this.fold(Either.Right(initial) as Either<Exception, T>) { acc, value -> if (acc.isRight()) value else acc }
