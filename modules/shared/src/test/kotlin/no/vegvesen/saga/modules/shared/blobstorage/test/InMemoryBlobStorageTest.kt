package no.vegvesen.saga.modules.shared.blobstorage.test

import arrow.fx.coroutines.parTraverseEither
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSize
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.InMemoryBlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.testfactory.blobstorage.blobStorageIntegrationTests
import no.vegvesen.saga.modules.testing.IntegrationTest
import java.util.Random

/**
 * Technically an integration test, but only depending on other than Kotlin/Java APIs
 */

@Tags(IntegrationTest)
class InMemoryBlobStorageTest : FunSpec({
    val testSubject = InMemoryBlobStorage()

    include(blobStorageIntegrationTests(testSubject, "testbucket", "testbucket2"))

    test("is thread-safe") {
        val random = Random()
        List(1000) {
            random.nextInt()
        }.parTraverseEither {
            testSubject.saveFile(StoragePath("bucket", "$it"), "content", ContentType.Txt)
        }.shouldBeRight()

        testSubject.listFiles("bucket").shouldBeRight().shouldHaveSize(1000)
    }
})
