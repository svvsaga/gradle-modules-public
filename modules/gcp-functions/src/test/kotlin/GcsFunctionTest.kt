import arrow.core.left
import arrow.core.right
import ch.qos.logback.classic.Level
import com.google.cloud.functions.Context
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSingleElement
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.shouldBe
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import no.vegvesen.saga.modules.gcp.functions.GcsEvent
import no.vegvesen.saga.modules.gcp.functions.GcsFunction
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.functions.StorageEvent
import no.vegvesen.saga.modules.shared.functions.StorageFunction
import no.vegvesen.saga.modules.testing.TestLogger
import java.util.Date

class GcsFunctionTest : FunSpec({
    isolationMode = IsolationMode.InstancePerLeaf // Same as JUnit

    val storageFuncMock = mockk<StorageFunction>()

    val gcsFunction = object : GcsFunction(storageFuncMock) {}

    val testBucket = "testBucket"
    val testFilename = "testFilename"
    val testMetaGen = "testMetaGen"
    val testTimeCreated = Date()

    val testException = Exception("Process failed in test")

    val testGcsEvent = GcsEvent(testBucket, testFilename, testMetaGen, testTimeCreated, testTimeCreated)
    val testStorageEvent = StorageEvent(testBucket, testFilename)

    test("Should not throw exception when process not failing") {
        coEvery { storageFuncMock(any()) } returns Unit.right()

        gcsFunction.accept(testGcsEvent, null)

        coVerify { storageFuncMock(testStorageEvent) }
    }

    test("Should throw exception when process fails") {
        coEvery { storageFuncMock(any()) } returns testException.left()

        shouldThrow<Exception> {
            gcsFunction.accept(testGcsEvent, null)
        }

        coVerify { storageFuncMock(testStorageEvent) }
    }

    test("Should log eventId as \"Not found\" when context is null") {
        val testLogger = TestLogger()
        coEvery { storageFuncMock(any()) } returns testException.left()

        shouldThrow<Exception> {
            gcsFunction.accept(testGcsEvent, null)
        }

        coVerify { storageFuncMock(testStorageEvent) }

        val ourLogMessages = testLogger.events
            .filter { it.loggerName.startsWith("no.vegvesen") }

        ourLogMessages.shouldNotBeEmpty()
        ourLogMessages
            .forEach {
                it.mdcPropertyMap["eventId"] shouldBe "Not found"
            }
    }

    test("Should log eventId for all log messages from our code") {
        val testLogger = TestLogger()
        coEvery { storageFuncMock(any()) } returns testException.left()

        val eventId = "123"
        val contextWithEventId = mockk<Context> {
            coEvery { eventId() } returns eventId
        }

        shouldThrow<Exception> {
            gcsFunction.accept(testGcsEvent, contextWithEventId)
        }

        coVerify { storageFuncMock(testStorageEvent) }

        val ourLogMessages = testLogger.events
            .filter { it.loggerName.startsWith("no.vegvesen") }

        ourLogMessages.shouldNotBeEmpty()
        ourLogMessages
            .forEach {
                it.mdcPropertyMap["eventId"] shouldBe eventId
            }
    }

    test("should not retry function if file not found") {
        coEvery { storageFuncMock(any()) } returns BlobStorageError.BlobNotFound(
            StoragePath(testBucket, testFilename),
        ).left()
        val testLogger = TestLogger()

        shouldNotThrowAny {
            gcsFunction.accept(testGcsEvent, null)
        }

        testLogger.events.shouldHaveSingleElement { it.level == Level.WARN }
    }

    context("Handling folder notifications") {
        val testFolderFilename = "testFolderName/"
        val testFolderGcsEvent = testGcsEvent.copy(name = testFolderFilename)
        val testFolderStorageEvent = testStorageEvent.copy(name = testFolderFilename)

        test("Should process folders if enabled") {
            coEvery { storageFuncMock(any()) } returns Unit.right()

            val processFoldersGcsFunction = object : GcsFunction(storageFuncMock, true) {}
            processFoldersGcsFunction.accept(testFolderGcsEvent, null)

            coVerify { storageFuncMock(testFolderStorageEvent) }
        }

        test("Should not process folders if disabled") {
            gcsFunction.accept(testFolderGcsEvent, null)

            coVerify(exactly = 0) { storageFuncMock(any()) }
        }
    }
})
