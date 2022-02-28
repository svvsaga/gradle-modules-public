package inttest

import com.google.cloud.datastore.DatastoreOptions
import com.google.cloud.datastore.Key
import com.google.cloud.datastore.KeyFactory
import com.google.cloud.datastore.Query
import com.google.cloud.datastore.QueryResults
import com.google.cloud.datastore.StructuredQuery.PropertyFilter.eq
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.matchers.collections.shouldContainExactly
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.gcp.datastore.DatastoreDeduplicationStorage
import no.vegvesen.saga.modules.gcp.datastore.DatastoreDeduplicationStorageOptions
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.SagaIntTestProject
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag(IntegrationTest)
class DatastoreDeduplicationStorageIntegrationTests {

    private val datastore = DatastoreOptions.newBuilder().setProjectId(SagaIntTestProject).build().service

    private val options = DatastoreDeduplicationStorageOptions()

    private val testSubject = DatastoreDeduplicationStorage(datastore, options)

    private val ids = listOf("123", "456")

    private val factory: KeyFactory = datastore.newKeyFactory().setKind(options.kind)

    init {
        Query.newKeyQueryBuilder()
            .setKind(options.kind)
            .build()
            .let(datastore::run)
            .forEach { datastore.delete(it) }
    }

    @Test
    fun `can insert ids`() {
        testSubject.saveIds(ids).shouldBeRight()

        val keys = ids.map(factory::newKey)
        fetchKeys(keys)
            .map { it.next() }
            .shouldContainExactly(keys)
    }

    private fun fetchKeys(keys: List<Key>): List<QueryResults<Key>> =
        keys
            .map { eq("__key__", it) }
            .map { Query.newKeyQueryBuilder().setKind(options.kind).setFilter(it).build() }
            .map(datastore::run)

    @Test
    fun `can send in a list of IDs and get which ones are duplicates`() = runBlocking {
        testSubject.saveIds(listOf("1", "2", "3")).shouldBeRight()

        val result = testSubject.fetchDuplicateIds(listOf("3", "4"))

        result.shouldBeRight().shouldContainExactly("3")
    }
}