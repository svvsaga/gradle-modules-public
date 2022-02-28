package no.vegvesen.saga.modules.shared.kvstore.test

import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.core.spec.style.FunSpec
import no.vegvesen.saga.modules.shared.kvstore.InMemoryKVStore
import no.vegvesen.saga.modules.shared.kvstore.KVStoreError
import no.vegvesen.saga.modules.shared.testfactory.kvstore.kvStoreIntTests

/**
 * Not tagged as integration test because it is fast and only depends on JDK
 */
class InMemoryKVStoreIntTest : FunSpec({
    val inMemKvStore = InMemoryKVStore()

    include(kvStoreIntTests(inMemKvStore))

    test("Should not persist data between instances") {
        val testKey = "testKey"
        val testValue = "testValue"
        inMemKvStore.putString(testKey, testValue)

        val newInMemKvStore = InMemoryKVStore()
        newInMemKvStore.getString(testKey) shouldBeLeft KVStoreError.ValueNotFound(testKey)
    }
})
