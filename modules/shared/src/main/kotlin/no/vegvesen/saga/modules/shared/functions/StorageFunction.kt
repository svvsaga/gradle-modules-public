package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either

typealias StorageFunction = suspend (payload: StorageEvent) -> Either<Throwable, Unit>
