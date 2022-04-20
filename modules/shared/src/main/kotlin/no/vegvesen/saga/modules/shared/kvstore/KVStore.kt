package no.vegvesen.saga.modules.shared.kvstore

import arrow.core.Either
import arrow.core.handleErrorWith
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

    suspend fun getStringOrNull(key: String): Either<Throwable, String?> =
        getString(key).handleErrorWith {
            when (it) {
                is KVStoreError.ValueNotFound -> null.right()
                is KVStoreError.KVStoreException -> it.exception.left()
                is KVStoreError.EmptyKey -> Exception("Invalid key").left()
            }
        }

    suspend fun getStringOrDefault(key: String, default: String): Either<Throwable, String> =
        getStringOrNull(key).map { it ?: default }

    fun validateKey(key: String): Either<KVStoreError, String> =
        if (key.isEmpty()) KVStoreError.EmptyKey.left() else key.right()
}
