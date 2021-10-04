package no.vegvesen.saga.modules.shared.blobstorage.test

import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import no.vegvesen.saga.modules.shared.blobstorage.InMemoryBlobStorage
import no.vegvesen.saga.modules.testfactory.blobstorage.blobStorageIntegrationTests
import no.vegvesen.saga.modules.testing.IntegrationTest

/**
 * Technically an integration test, but only depending on other than Kotlin/Java APIs
 * Marking as such anyway because not all tests pass
 *
 * Lacks a bit of implementation for all tests to pass, e.g. passing which buckets should be pre existing
 */

@Tags(IntegrationTest)
class InMemoryBlobStorageTest : FunSpec({
    val testSubject = InMemoryBlobStorage()

    include(blobStorageIntegrationTests(testSubject, "testbucket"))
})
