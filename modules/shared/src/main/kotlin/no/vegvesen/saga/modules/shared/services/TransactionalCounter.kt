package no.vegvesen.saga.modules.shared.services

import arrow.core.Either

interface TransactionalCounter {
    fun saveTotalCount(key: String, totalCount: Long): Either<Throwable, Unit>
    fun fetchTotalCount(key: String): Either<Throwable, Long>
    fun incrementProcessedCount(key: String): Either<Throwable, Long>
    fun clear(key: String): Either<Throwable, Unit>
}
