package inttest

import com.google.cloud.datastore.DatastoreOptions
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.property.Arb
import io.kotest.property.PropertyTesting
import io.kotest.property.arbitrary.default
import io.kotest.property.arbitrary.map
import io.kotest.property.arbitrary.next
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll
import no.vegvesen.saga.modules.gcp.datastore.GcpDatastoreKVStore
import no.vegvesen.saga.modules.shared.kvstore.KVStoreError
import no.vegvesen.saga.modules.shared.testfactory.kvstore.aKVStoreKey
import no.vegvesen.saga.modules.shared.testfactory.kvstore.kvStoreIntTests
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.SagaIntTestProject
import kotlin.random.Random
import kotlin.random.nextUInt

@Tags(IntegrationTest)
@ExperimentalUnsignedTypes
class GcpDatastoreKVStoreIntTest : FunSpec({
    val testKindPrefix = "GcpDatastoreKVStoreIntTest_"
    val aKVKind = Arb.string(1).map {
        "$testKindPrefix$it"
    }

    val datastore = DatastoreOptions.newBuilder().setProjectId(SagaIntTestProject).build().service

    val testKVKind = aKVKind.next()
    val gcpDatastoreKVStore = GcpDatastoreKVStore(testKVKind, datastore)
    PropertyTesting.defaultIterationCount =
        10 // API calls are slow, so reduce time spent running the property-based tests

    include(kvStoreIntTests(gcpDatastoreKVStore))

    test("Should persist data between instances") {
        checkAll<String, String>(aKVStoreKey, Arb.default()) { testKey, testValue ->
            gcpDatastoreKVStore.putString(testKey, testValue)

            val newGcpDatastoreKVStore = GcpDatastoreKVStore(testKVKind, datastore)
            newGcpDatastoreKVStore.getString(testKey) shouldBeRight testValue
        }
    }

    test("Different 'kind' should not mix data") {
        checkAll<String, String, String>(aKVStoreKey, Arb.default(), Arb.default()) { testKey, testValue1, testValue2 ->
            gcpDatastoreKVStore.putString(testKey, testValue1)
            val randomKind = "$testKindPrefix${Random.nextUInt()}"
            val newKindGcpDatastoreKVStore = GcpDatastoreKVStore(randomKind, datastore)

            newKindGcpDatastoreKVStore.getString(testKey) shouldBeLeft KVStoreError.ValueNotFound(testKey)

            newKindGcpDatastoreKVStore.putString(testKey, testValue2) shouldBeRight Unit
            gcpDatastoreKVStore.getString(testKey) shouldBeRight testValue1
            newKindGcpDatastoreKVStore.getString(testKey) shouldBeRight testValue2
        }
    }
})
