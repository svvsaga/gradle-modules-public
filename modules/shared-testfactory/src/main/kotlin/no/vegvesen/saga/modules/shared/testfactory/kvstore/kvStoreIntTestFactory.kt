package no.vegvesen.saga.modules.shared.testfactory.kvstore

import arrow.core.flatMap
import io.kotest.assertions.arrow.either.shouldBeLeft
import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.core.spec.style.funSpec
import io.kotest.property.Arb
import io.kotest.property.arbitrary.default
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll
import no.vegvesen.saga.modules.shared.kvstore.KVStore
import no.vegvesen.saga.modules.shared.kvstore.KVStoreError

val aKVStoreKey = Arb.string(1)

fun kvStoreIntTests(kvStore: KVStore) = funSpec {
    test("can save value to KVStore and load same value") {
        checkAll<String, String>(aKVStoreKey, Arb.default()) { testKey, testValue ->
            kvStore.putString(testKey, testValue).flatMap {
                kvStore.getString(testKey)
            } shouldBeRight testValue
        }
    }

    test("Not set key should return key not found") {
        val unsavedKey = "testunsavedkey"
        kvStore.getString(unsavedKey) shouldBeLeft KVStoreError.ValueNotFound(unsavedKey)
    }

    test("Should be possible to change value") {
        checkAll<String, String, String>(
            aKVStoreKey,
            Arb.default(),
            Arb.default()
        ) { testKey, testValue, testNewValue ->
            kvStore.putString(testKey, testValue).flatMap {
                kvStore.getString(testKey)
            } shouldBeRight testValue

            kvStore.putString(testKey, testNewValue).flatMap {
                kvStore.getString(testKey)
            } shouldBeRight testNewValue
        }
    }

    test("Should fail for empty key string") {
        kvStore.putString("", "testValue") shouldBeLeft KVStoreError.EmptyKey
    }
}
