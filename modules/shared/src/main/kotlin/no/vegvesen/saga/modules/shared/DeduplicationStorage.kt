package no.vegvesen.saga.modules.shared

import arrow.core.Either

interface DeduplicationStorage<T> {
    fun clear(): Either<Throwable, Unit>
    fun hasId(id: T): Either<Throwable, Boolean>
    suspend fun fetchDuplicateIds(ids: Collection<T>): Either<Throwable, Set<T>>
    fun saveIds(newIds: Collection<T>): Either<Throwable, Unit>

    suspend fun checkDuplicateIds(ids: Collection<T>): Either<Throwable, DuplicateCheckResult<T>> =
        fetchDuplicateIds(ids)
            .map { duplicates -> DuplicateCheckResult(duplicates, ids.minus(duplicates).toSet()) }
}

data class DuplicateCheckResult<T>(val duplicates: Set<T>, val nonDuplicates: Set<T>)

interface TransactionalDeduplicationStorage<T> : DeduplicationStorage<T> {
    suspend fun checkAndUpdateIdsInTransaction(
        ids: Collection<T>,
        handleResult: (result: DuplicateCheckResult<T>) -> Either<Throwable, Unit>
    ): Either<Throwable, Unit>
}