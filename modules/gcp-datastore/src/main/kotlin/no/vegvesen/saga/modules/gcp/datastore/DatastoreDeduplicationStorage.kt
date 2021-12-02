package no.vegvesen.saga.modules.gcp.datastore

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import arrow.fx.coroutines.parTraverseN
import com.google.cloud.datastore.Datastore
import com.google.cloud.datastore.DatastoreException
import com.google.cloud.datastore.FullEntity
import com.google.cloud.datastore.Key
import com.google.cloud.datastore.Query
import com.google.cloud.datastore.StructuredQuery
import no.vegvesen.saga.modules.shared.DuplicateCheckResult
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.TransactionalDeduplicationStorage
import no.vegvesen.saga.modules.shared.log

data class DatastoreDeduplicationStorageOptions(
    val kind: String = "deduplication",
)

class DatastoreDeduplicationStorage(
    private val datastore: Datastore,
    private val options: DatastoreDeduplicationStorageOptions = DatastoreDeduplicationStorageOptions()
) : TransactionalDeduplicationStorage<String>, Logging {
    private val keyFactory = datastore.newKeyFactory().setKind(options.kind)

    private val concurrentDatastoreRequests = 20

    override suspend fun fetchDuplicateIds(ids: Collection<String>): Either<Throwable, Set<String>> =
        Either.catch {
            ids
                .map(keyFactory::newKey)
                .map(this::toKeyFilter)
                .map(this::toFilteredQuery)
                .parTraverseN(concurrentDatastoreRequests) {
                    datastore.run(it)
                }
                .filter { it.hasNext() }
                .map { it.next().name }
                .toSet()
        }

    private fun toKeyFilter(it: Key) = StructuredQuery.PropertyFilter.eq("__key__", it)

    private fun toFilteredQuery(it: StructuredQuery.PropertyFilter?) =
        Query.newKeyQueryBuilder()
            .setKind(options.kind)
            .setFilter(it)
            .build()

    override fun saveIds(newIds: Collection<String>): Either<Throwable, Unit> = Either.catch {
        val entitiesArray = mapToKeyedEntities(newIds)
        datastore.add(*entitiesArray)
        Unit
    }.handleErrorWith {
        if (it is DatastoreException && it.reason == "ALREADY_EXISTS") {
            log().warn("One or more IDs already exists in deduplication storage. This indicates concurrent inserts, which might be expected.")
            Unit.right()
        } else {
            it.left()
        }
    }

    private fun mapToKeyedEntities(ids: Collection<String>): Array<FullEntity<Key>> =
        ids
            .map(keyFactory::newKey)
            .map { FullEntity.newBuilder(it).build() }
            .toTypedArray()

    override fun clear(): Either<Throwable, Unit> = Either.catch {
        datastore.deleteAllEntitiesOfKind(options.kind)
    }

    override fun hasId(id: String): Either<Throwable, Boolean> = Either.catch {
        datastore.get(keyFactory.newKey(id)).hasKey()
    }

    override suspend fun checkAndUpdateIdsInTransaction(
        ids: Collection<String>,
        handleResult: (result: DuplicateCheckResult<String>) -> Either<Throwable, Unit>
    ): Either<Throwable, Unit> = Either.catch {
        datastore.newTransaction().let { transaction ->
            try {
                checkDuplicateIds(ids)
                    .flatMap { result ->
                        handleResult(result)
                            .flatMap { saveIds(result.nonDuplicates) }
                    }
                    .map {
                        transaction.commit()
                        Unit
                    }
            } finally {
                if (transaction.isActive) {
                    transaction.rollback()
                    Exception("Transaction failed").left()
                } else {
                    Unit.right()
                }
            }
        }
    }
}
