package no.vegvesen.saga.modules.shared.kvstore

import arrow.core.Either
import arrow.core.left
import arrow.core.right

sealed class KVStoreError {
    data class KVStoreException(val message: String, val exception: Throwable) : KVStoreError()
    object EmptyKey : KVStoreError()
    data class ValueNotFound(val key: String) : KVStoreError()
}

interface KVStore {
    suspend fun putString(key: String, value: String): Either<KVStoreError, Unit>
    suspend fun getString(key: String): Either<KVStoreError, String>

    fun validateKey(key: String): Either<KVStoreError, String> =
        if (key.isEmpty()) KVStoreError.EmptyKey.left() else key.right()
}