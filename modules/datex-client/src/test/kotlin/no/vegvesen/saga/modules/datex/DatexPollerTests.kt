package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import io.kotest.assertions.arrow.core.shouldBeLeft
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.AnnotationSpec
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import java.time.Instant
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.XmlString

class DatexPollerTests : AnnotationSpec(), Logging {
    override fun isolationMode() = IsolationMode.InstancePerLeaf // Same as JUnit

    private val testDatexDocument = XmlString("Datex document")
    private val testPublicationTime = Instant.now()
    private val testFilePath = "filepath"
    private val testLastModifiedTime = Instant.now()
    private val testOldLastModifiedDate = Instant.now().minusSeconds(100)

    private val datexMock = mockk<DatexClient>()
    private val datexStorageRepositoryMock = mockk<DatexStorageRepository>()

    private val poller = DatexPoller(datexMock, datexStorageRepositoryMock)

    private fun addStdSuccessMock() {
        coEvery { datexMock.read() } returns Either.Right(
            DatexResponse(
                testDatexDocument,
                testPublicationTime,
                testLastModifiedTime
            )
        )
        every { datexStorageRepositoryMock.filePath(testPublicationTime) } returns testFilePath
        coEvery {
            datexStorageRepositoryMock.saveObject(
                testDatexDocument,
                any(),
                any(),
                ContentType.Xml
            )
        } returns true.right()
        coEvery { datexStorageRepositoryMock.saveLastModifiedTime(testLastModifiedTime) } returns Unit.right()
    }

    @Test
    suspend fun `should poll using DatexRepository and save to StorageRepository`() {
        addStdSuccessMock()
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(Either.Right(null))

        poller.pollDatex()

        coVerify {
            datexMock.read()
            datexStorageRepositoryMock.saveObject(testDatexDocument, testPublicationTime, false, ContentType.Xml)
        }
    }

    @Test
    suspend fun `should store last modified time if we get it`() {
        addStdSuccessMock()
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(Either.Right(null))

        poller.pollDatex()

        coVerify {
            datexMock.read()
            datexStorageRepositoryMock.saveObject(testDatexDocument, testPublicationTime, false, ContentType.Xml)
            datexStorageRepositoryMock.saveLastModifiedTime(testLastModifiedTime)
        }
    }

    @Test
    suspend fun `should not save to StorageRepository if no new document available`() {
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(testOldLastModifiedDate.right())
        coEvery { datexMock.read(testOldLastModifiedDate) } returns Either.Left(DatexError.NoNewDataAvailable)

        poller.pollDatex()

        coVerify(inverse = true) {
            datexStorageRepositoryMock.saveObject(testDatexDocument, any(), any(), ContentType.Xml)
            datexStorageRepositoryMock.saveLastModifiedTime(any())
        }
    }

    @Test
    suspend fun `should send last modified date to DatexRepository if found from StorageRepository`() {
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(testOldLastModifiedDate.right())
        addStdSuccessMock()
        coEvery { datexMock.read(testOldLastModifiedDate) } returns Either.Right(
            DatexResponse(
                testDatexDocument,
                testPublicationTime,
                testLastModifiedTime
            )
        )

        poller.pollDatex()

        coVerify {
            datexMock.read(testOldLastModifiedDate)
        }
    }

    @Test
    suspend fun `should not send last modified date if not found from StorageRepository`() {
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(Either.Right(null))
        addStdSuccessMock()

        poller.pollDatex()

        coVerify {
            datexMock.read(null)
        }
    }

    @Test
    suspend fun `should fail if failed reading of last modified time`() {
        val testException = DatexStorageError.Exception("some exception", Exception())

        addStdSuccessMock()
        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(testException.left())

        val res = poller.pollDatex()

        res.shouldBeLeft(testException)
    }

    @Test
    suspend fun `should fail if saving of last modified time fails`() {
        val testException = DatexStorageError.Exception("some exception", Exception())

        coEvery { datexMock.read() } returns Either.Right(
            DatexResponse(
                testDatexDocument,
                testPublicationTime,
                testLastModifiedTime
            )
        )
        every { datexStorageRepositoryMock.filePath(testPublicationTime) } returns testFilePath
        coEvery {
            datexStorageRepositoryMock.saveObject(
                testDatexDocument,
                any(),
                any(),
                ContentType.Xml
            )
        } returns true.right()

        coEvery { datexStorageRepositoryMock.getLastModifiedTime() }.returns(Either.Right(null))
        coEvery { datexStorageRepositoryMock.saveLastModifiedTime(any()) } returns testException.left()

        val res = poller.pollDatex()

        res.shouldBeLeft(testException)
    }
}
