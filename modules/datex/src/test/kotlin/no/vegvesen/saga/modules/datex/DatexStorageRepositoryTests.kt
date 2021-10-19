package no.vegvesen.saga.modules.datex

import arrow.core.right
import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import no.vegvesen.saga.modules.datex.DatexStorageRepository.Companion.lastModifiedTimeToString
import no.vegvesen.saga.modules.datex.DatexStorageRepository.Companion.stringToLastModifiedTime
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.kvstore.KVStore
import java.time.Instant
import java.time.ZonedDateTime

class DatexStorageRepositoryTests : AnnotationSpec() {
    override fun isolationMode() = IsolationMode.InstancePerLeaf // Same as JUnit

    private val testDataSourceName = "test-datasource"
    private val testBlobStorage = mockk<BlobStorage>()
    private val testKvStore = mockk<KVStore>()
    private val repository = DatexStorageRepository("foo", testDataSourceName, testKvStore, testBlobStorage)
    private val testData = XmlString("testdata")

    @Test
    fun `correct file path`() {
        val xmlTime = ZonedDateTime.parse("2020-05-03T14:21:41+02:00").toInstant()
        repository.filePath(
            xmlTime
        ) shouldBe "$testDataSourceName/2020_05/2020-05-03T12-21-41Z.xml"
    }

    @Test
    fun `serializing last modified date to and from text is preserved`() {
        val testDate = Instant.now()

        stringToLastModifiedTime(
            lastModifiedTimeToString(testDate)
        ) shouldBe testDate
    }

    @Test
    fun `byteArrayToLastModifiedTime should give null for invalid date in text`() {
        stringToLastModifiedTime("invalid date").shouldBeNull()
    }

    @Test
    suspend fun `not saving as gzip if not instructed`() {
        val pubTime = ZonedDateTime.parse("2020-05-03T14:21:41+02:00").toInstant()

        coEvery {
            testBlobStorage.saveFileIfNotExisting(
                any(),
                any(),
                ContentType.Xml,
                any(),
                any()
            )
        } returns true.right()

        repository.saveObject(testData, pubTime, false, ContentType.Xml)

        coVerify {
            testBlobStorage.saveFileIfNotExisting(
                any(),
                testData.value,
                ContentType.Xml,
                withArg { it.gzipContent shouldBe false }
            )
        }
    }

    @Test
    suspend fun `saving as gzip does not change content type`() {
        val pubTime = ZonedDateTime.parse("2020-05-03T14:21:41+02:00").toInstant()

        coEvery {
            testBlobStorage.saveFileIfNotExisting(
                any(),
                any(),
                ContentType.Xml,
                any(),
                any()
            )
        } returns true.right()

        repository.saveObject(testData, pubTime, true, ContentType.Xml)

        coVerify {
            testBlobStorage.saveFileIfNotExisting(
                any(),
                testData.value,
                ContentType.Xml,
                withArg { it.gzipContent shouldBe true }
            )
        }
    }

    @Test
    suspend fun `should not overwrite files`() {
        val pubTime = ZonedDateTime.parse("2020-05-03T14:21:41+02:00").toInstant()
        coEvery {
            testBlobStorage.saveFileIfNotExisting(
                any(),
                any(),
                ContentType(any()),
                any(),
                any()
            )
        } returns true.right()

        repository.saveObject(testData, pubTime, true, ContentType.Xml).shouldBeRight()

        coVerify {
            testBlobStorage.saveFileIfNotExisting(any(), any(), ContentType(any()), any(), any())
        }
    }
}
