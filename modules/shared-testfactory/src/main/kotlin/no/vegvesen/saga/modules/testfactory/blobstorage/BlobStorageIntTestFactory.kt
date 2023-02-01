package no.vegvesen.saga.modules.testfactory.blobstorage

import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.funSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import java.time.Instant
import kotlin.random.Random
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageBrowser
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.FileMetadata
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.testing.SagaIntTestProject
import no.vegvesen.saga.modules.testing.shouldBeRightAnd

private val aNonExistingBucket = "${SagaIntTestProject}_this_bucket_does_not_exist"
private const val testFolder = "GcpBlobStorage"

private fun createStoragePath(bucket: String): StoragePath =
    StoragePath(bucket, "$testFolder/blobTest_${Random.nextInt()}.txt")

fun <T> blobStorageBrowserIntegrationTests(
    testSubject: T,
    testBucket: String
) where T : BlobStorage, T : BlobStorageBrowser = funSpec {
    val storagePath = createStoragePath(testBucket)

    test("listFiles for non existing bucket") {
        testSubject.listFiles(aNonExistingBucket).shouldBeLeft()
    }

    test("listFiles includes a known file") {
        val blobTestContent = "Testcontent"

        testSubject.saveFile(storagePath, blobTestContent, ContentType.Txt).shouldBeRight()
        testSubject.listFiles(testBucket).shouldBeRight()
            .shouldContain(FileMetadata(storagePath.fileName, ContentType.Txt))
    }

    test("getFileMetadata returns correct data") {
        val blobTestContent = "Testcontent"

        testSubject.saveFile(storagePath, blobTestContent, ContentType.Txt).shouldBeRight()
        testSubject.getFileMetadata(storagePath).shouldBeRight(FileMetadata(storagePath.fileName, ContentType.Txt))
    }

    test("Saving blob with content type sets content type") {
        testSubject.saveFile(
            storagePath,
            "Testcontent",
            ContentType.Txt
        )

        testSubject.getFileMetadata(storagePath).shouldBeRight().contentType.shouldBe(ContentType.Txt)
    }

    test("Saving blob with custom time sets custom time") {
        val testCustomTime = Instant.now()

        testSubject.saveFile(
            storagePath,
            "Testcontent",
            ContentType.Txt,
            SaveFileOptions(customTime = testCustomTime)
        )

        testSubject.getFileMetadata(storagePath)
            .shouldBeRight().customTime
            .shouldNotBeNull()
            .toEpochMilli() shouldBe testCustomTime.toEpochMilli()
    }

    test("Saving blob gzipped will set encoding and original content type") {
        testSubject.saveFile(storagePath, "Testcontent", ContentType.Txt, SaveFileOptions(gzipContent = true))

        testSubject.getFileMetadata(storagePath).shouldBeRightAnd {
            it.contentType shouldBe ContentType.Txt
            it.contentEncoding shouldBe "gzip"
        }
        testSubject.loadFileAsString(storagePath) shouldBeRight "Testcontent"
    }

    context("Non existing bucket gives correct error") {
        val invalidStoragePath = StoragePath(aNonExistingBucket, "someBlob")

        test("for loadFile") {
            testSubject.loadFile(invalidStoragePath) shouldBeLeft BlobStorageError.BlobNotFound(invalidStoragePath)
        }

        test("for getFileMetadata") {
            testSubject.getFileMetadata(invalidStoragePath) shouldBeLeft BlobStorageError.BlobNotFound(
                invalidStoragePath
            )
        }
    }

    context("Non existing object gives correct error") {
        val invalidStoragePath = StoragePath(testBucket, "someNonExistingBucketObject")

        test("for loadFile") {
            testSubject.loadFile(invalidStoragePath) shouldBeLeft BlobStorageError.BlobNotFound(invalidStoragePath)
        }

        test("for getFileMetadata") {
            testSubject.getFileMetadata(invalidStoragePath) shouldBeLeft BlobStorageError.BlobNotFound(
                invalidStoragePath
            )
        }
    }
}

fun blobStorageIntegrationTests(testSubject: BlobStorage, testBucket: String, testBucket2: String) = funSpec {
    val storagePath = createStoragePath(testBucket)

    test("can save file to storage and load it") {
        val file = javaClass.getResourceAsStream("/blobTest.txt")?.readBytes() ?: throw Exception("Missing resource")
        val storageFilename = StoragePath(
            testBucket,
            "$testFolder/blobTest.txt"
        )

        testSubject.saveFile(
            storageFilename,
            file,
            ContentType.Txt
        )

        testSubject.loadFileAsString(storageFilename).shouldBeRight("Hello Blob!")
    }

    test("saveFileIfNotExisting gives correct return value") {
        val blobTestContent = "Testing saveFileIfNotExisting"

        testSubject.saveFileIfNotExisting(storagePath, blobTestContent, ContentType.Txt) shouldBeRight true
        testSubject.saveFileIfNotExisting(storagePath, blobTestContent, ContentType.Txt) shouldBeRight false
    }

    test("saveFileIfNotExisting does not overwrite with new data") {
        val blobTestContent = "Testing saveFileIfNotExisting"

        testSubject.saveFileIfNotExisting(storagePath, blobTestContent, ContentType.Txt)

        val blobNewContent = "Testing saveFileIfNotExisting with new content: ${Random.nextInt()}"
        testSubject.saveFileIfNotExisting(storagePath, blobNewContent, ContentType.Txt)

        testSubject.loadFileAsString(storagePath) shouldBeRight blobTestContent
    }

    test("Loading GCS folder with content fails") {
        testSubject.saveFile(storagePath, "content", ContentType.Txt)
        val justPathStoragePath = storagePath.copy(fileName = "testFolder/")
        testSubject.loadFile(justPathStoragePath) shouldBeLeft BlobStorageError.BlobNotFound(justPathStoragePath)
    }

    test("Loading empty folder gives 0 byte object") {
        // See https://cloud.google.com/storage/docs/gsutil/addlhelp/HowSubdirectoriesWork
        val emptyFolderStoragePath = StoragePath(testBucket, "testEmptyFolder/")

        testSubject.saveFile(emptyFolderStoragePath, "", ContentType.Txt)
        testSubject.loadFileAsString(emptyFolderStoragePath) shouldBeRight ""
    }

    test("checkIfFileExists returns true if file exists, false otherwise") {
        testSubject.saveFile(StoragePath(testBucket, "existing_file"), "Hello", ContentType.Txt).shouldBeRight()

        testSubject.checkIfFileExists(StoragePath(testBucket, "existing_file")) shouldBeRight true
        testSubject.checkIfFileExists(StoragePath(testBucket, "non_existing_file")) shouldBeRight false
    }

    test("can copy file with contents") {
        val fromPath = StoragePath(testBucket, "hello.txt")
        val toPath = StoragePath(testBucket2, "hello.txt")
        testSubject.saveFile(fromPath, "Hello", ContentType.Txt).shouldBeRight()

        testSubject.copyFile(fromPath, toPath) shouldBeRight toPath

        testSubject.loadFileAsString(toPath) shouldBeRight "Hello"
    }

    test("copying file will overwrite") {
        val fromPath = StoragePath(testBucket, "hello.txt")
        val toPath = StoragePath(testBucket2, "hello.txt")
        testSubject.saveFile(fromPath, "Hello", ContentType.Txt).shouldBeRight()
        testSubject.saveFile(toPath, "Existing", ContentType.Txt).shouldBeRight()

        testSubject.copyFile(fromPath, toPath) shouldBeRight toPath

        testSubject.loadFileAsString(toPath) shouldBeRight "Hello"
    }

    test("deleting file returns true if it existed and was deleted") {
        val path = StoragePath(testBucket, "hello.txt")
        testSubject.saveFile(path, "Hello", ContentType.Txt).shouldBeRight()

        testSubject.deleteFile(path) shouldBeRight true
    }

    test("deleting file returns false if it did not exist") {
        val path = StoragePath(testBucket, "hello.txt")

        testSubject.deleteFile(path) shouldBeRight false
    }
}
