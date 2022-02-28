package no.vegvesen.saga.modules.gcp.datastore

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.rightIfNotNull
import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreException
import com.google.cloud.datastore.DatastoreOptions
import com.google.cloud.datastore.Entity
import no.vegvesen.saga.modules.shared.kvstore.KVStore
import no.vegvesen.saga.modules.shared.kvstore.KVStoreError

private const val ValueKey = "value"

/**
 * KVStore backed by GCP Datastore
 *
 * Authentication is done by setting the environment variable GOOGLE_APPLICATION_CREDENTIALS
 *
 * @param kindName Datastore "kind" to store under. Cannot be empty ("").
 */
class GcpDatastoreKVStore(
    private val kindName: String,
    private val datastore: Datastore = DatastoreOptions.getDefaultInstance().service
) : KVStore {

    init {
        require(kindName.isNotBlank())
    }

    override suspend fun putString(key: String, value: String): Either<KVStoreError, Unit> =
        validateKey(key).map { validKey ->
            Entity.newBuilder(createDsKey(validKey))
                .set(ValueKey, value)
                .build()
        }.flatMap { entity ->
            Either.catch {
                datastore.put(entity)
                Unit
            }.mapLeft {
                when (it) {
                    is DatastoreException -> KVStoreError.KVStoreException(it.reason, it)
                    else -> KVStoreError.KVStoreException("Unexpected error", it)
                }
            }
        }

    override suspend fun getString(key: String): Either<KVStoreError, String> =
        validateKey(key).flatMap { validKey ->
            Either.catch {
                datastore.get(createDsKey(validKey))
            }.mapLeft {
                KVStoreError.KVStoreException("Unexpected error in datastore.get()", it)
            }
        }.flatMap { entity ->
            entity.rightIfNotNull { KVStoreError.ValueNotFound(key) }
        }.flatMap { entity ->
            Either.catch {
                entity.getString(ValueKey)
            }.mapLeft {
                when (it) {
                    is ClassCastException -> KVStoreError.KVStoreException("Cast to string failed.", it)
                    else -> KVStoreError.KVStoreException("Unexpected error", it)
                }
            }
        }

    private fun createDsKey(key: String) =
        datastore.newKeyFactory().setKind(kindName).newKey(key)
}