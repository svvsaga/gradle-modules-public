package inttest

import com.google.cloud.storage.StorageOptions
import io.kotest.assertions.arrow.either.shouldBeLeft
import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotStartWith
import io.kotest.matchers.string.shouldStartWith
import io.kotest.matchers.types.shouldBeTypeOf
import no.vegvesen.saga.modules.gcp.storage.GcpBlobStorage
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.FileMetadata
import no.vegvesen.saga.modules.shared.blobstorage.GzipDecompressionBehaviour
import no.vegvesen.saga.modules.shared.blobstorage.LoadFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.readResourceAsBytes
import no.vegvesen.saga.modules.testfactory.blobstorage.blobStorageBrowserIntegrationTests
import no.vegvesen.saga.modules.testfactory.blobstorage.blobStorageIntegrationTests
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.SagaIntTestProject
import no.vegvesen.saga.modules.testing.loadStringResourceOrThrow
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.zip.ZipException

private val testBucket = "${SagaIntTestProject}_gcp_blob-storage"
private val testBucket2 = "${SagaIntTestProject}_gcp_blob-storage-2"

@Tags(IntegrationTest)
class GcpBlobStorageIntegrationTests : FunSpec({
    val testSubject = GcpBlobStorage.create()
    val zippedFile = readResourceAsBytes("/lorem_ipsum.txt.gz")
    val textFile = readResourceAsBytes("/lorem_ipsum.txt")
    val loremIpsumStart = "Lorem ipsum dolor sit amet"

    beforeEach {
        val storage = StorageOptions.getDefaultInstance().service
        storage.deleteAllFilesInBucket(testBucket)
        storage.deleteAllFilesInBucket(testBucket2)
    }

    include(blobStorageIntegrationTests(testSubject, testBucket, testBucket2))
    include(blobStorageBrowserIntegrationTests(testSubject, testBucket))

    test("can rewrite file and preserve metadata") {
        val blob = loadStringResourceOrThrow("blobTest.txt")
        val storagePath = StoragePath(testBucket, "blobTest.txt")
        val customTime = Instant.now().truncatedTo(ChronoUnit.MILLIS)
        testSubject.saveFile(
            storagePath,
            blob,
            ContentType.Txt,
            SaveFileOptions(gzipContent = true, customTime = customTime)
        ).shouldBeRight()

        testSubject.rewriteFile(storagePath).shouldBeRight()

        testSubject.loadFileAsString(storagePath) shouldBeRight blob
        testSubject.getFileMetadata(storagePath) shouldBeRight FileMetadata(
            "blobTest.txt",
            ContentType.Txt,
            customTime,
            "gzip"
        )
    }

    test("saveFileIfNotExisting gives error on invalid bucket") {
        val blobTestContent = "Testing saveFileIfNotExisting"
        val storageFilename = StoragePath("non_existing_bucket", "GcpBlobStorage/blobTest.txt")

        testSubject.saveFileIfNotExisting(storageFilename, blobTestContent, ContentType.Txt).shouldBeLeft()
    }

    test("loadFile, without option argument, returns decompressed file when reading gzipped file from storage") {
        val storageFilename1 = StoragePath(testBucket, "lorem_ipsum.txt.gz")
        val storageFilename2 = StoragePath(testBucket, "lorem_ipsum.txt")

        testSubject.saveFile(storageFilename1, zippedFile, ContentType.Gzip)
        testSubject.saveFile(storageFilename2, textFile, ContentType.Txt, SaveFileOptions(gzipContent = true))

        testSubject.loadFile(storageFilename1) shouldBeRight { String(it) shouldStartWith loremIpsumStart }
        testSubject.loadFile(storageFilename2) shouldBeRight { String(it) shouldStartWith loremIpsumStart }
    }

    test("loadFile, with gzipDecompressionBehaviour set to YES, fails if file is not compressed") {
        val storageFilename = StoragePath(testBucket, "lorem_ipsum.txt")

        testSubject.saveFile(storageFilename, textFile, ContentType.Txt)

        val options = LoadFileOptions(gzipDecompressionBehaviour = GzipDecompressionBehaviour.YES)
        val result = testSubject.loadFile(storageFilename, options)
        result.shouldBeLeft {
            it.shouldBeTypeOf<BlobStorageError.BlobException>()
            it.cause.shouldBeTypeOf<ZipException>()
            it.cause.localizedMessage shouldBe "Not in GZIP format"
        }
    }

    test("loadFile, with gzipDecompressionBehaviour set to NO, does not decompress file when reading gzipped file from storage") {
        val storageFilename1 = StoragePath(testBucket, "lorem_ipsum.txt.gz")
        testSubject.saveFile(storageFilename1, zippedFile, ContentType.Gzip)
        val storageFilename2 = StoragePath(testBucket, "lorem_ipsum.txt")
        testSubject.saveFile(storageFilename2, textFile, ContentType.Txt, SaveFileOptions(gzipContent = true))

        val options = LoadFileOptions(gzipDecompressionBehaviour = GzipDecompressionBehaviour.NO)
        testSubject.loadFile(
            storageFilename1,
            options
        ) shouldBeRight { String(it) shouldNotStartWith loremIpsumStart }
        testSubject.loadFile(
            storageFilename2,
            options
        ) shouldBeRight { String(it) shouldNotStartWith loremIpsumStart }
    }

    test("AUTO decompresses if file ends with .gz or .gzip or has content encoding gzip") {
        val storageFilename1 = StoragePath(testBucket, "lorem_ipsum.txt.gz")
        testSubject.saveFile(storageFilename1, zippedFile, ContentType.Gzip)
        val storageFilename2 = StoragePath(testBucket, "lorem_ipsum.txt")
        testSubject.saveFile(storageFilename2, textFile, ContentType.Txt, SaveFileOptions(gzipContent = true))
        val storageFilename3 = StoragePath(testBucket, "lorem_ipsum.txt.gzip")
        testSubject.saveFile(storageFilename3, zippedFile, ContentType.Gzip)

        listOf(storageFilename1, storageFilename2, storageFilename3).forEach { storagePath ->
            testSubject.loadFile(storagePath) shouldBeRight { String(it) shouldStartWith loremIpsumStart }
            testSubject.loadFileAsString(storagePath) shouldBeRight { it shouldStartWith loremIpsumStart }
        }
    }

    test("with gzipDecompressionBehaviour set to AUTO, does not try to decompress file that does not end with .gz or .gzip") {
        val storageFilename = StoragePath(testBucket, "lorem_ipsum.txt")
        testSubject.saveFile(
            storageFilename,
            textFile,
            ContentType.Txt
        )

        val options = LoadFileOptions(gzipDecompressionBehaviour = GzipDecompressionBehaviour.AUTO)
        val resultBytes = testSubject.loadFile(storageFilename, options)
        val resultString = testSubject.loadFileAsString(storageFilename, options)

        resultBytes.shouldBeRight {
            String(it).shouldStartWith(loremIpsumStart)
        }
        resultString.shouldBeRight {
            it.shouldStartWith(loremIpsumStart)
        }
    }
})
