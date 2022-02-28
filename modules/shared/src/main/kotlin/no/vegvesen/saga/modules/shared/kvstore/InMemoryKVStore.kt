package no.vegvesen.saga.modules.shared.kvstore

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.rightIfNotNull
import java.util.concurrent.ConcurrentHashMap

class InMemoryKVStore : KVStore {
    val store = ConcurrentHashMap<String, String>()

    override suspend fun putString(key: String, value: String): Either<KVStoreError, Unit> =
        validateKey(key).map { validKey ->
            store[validKey] = value
        }

    override suspend fun getString(key: String): Either<KVStoreError, String> =
        validateKey(key).flatMap { validKey ->
            store[validKey].rightIfNotNull { KVStoreError.ValueNotFound(key) }
        }
}