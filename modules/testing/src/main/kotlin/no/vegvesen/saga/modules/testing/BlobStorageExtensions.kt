package no.vegvesen.saga.modules.testing

import arrow.core.left
import arrow.core.right
import arrow.core.rightIfNotNull
import io.mockk.coEvery
import io.mockk.mockk
import io.mockk.slot
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageBrowser
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath

fun BlobStorage.loadFileReturnsResource(path: String) {
    val fileSlot = slot<StoragePath>()
    coEvery { loadFile(capture(fileSlot)) } returns javaClass.getResourceAsStream(path)
        .rightIfNotNull { BlobStorageError.BlobNotFound(fileSlot.captured, Exception("Did not find $path")) }
        .map { it.readBytes() }
}

fun BlobStorage.loadFileReturnsResource(path: StoragePath, resource: String) {
    coEvery { loadFile(path) } returns javaClass.getResourceAsStream(resource)
        .rightIfNotNull { BlobStorageError.BlobNotFound(path, Exception("Did not find $path")) }
        .map { it.readBytes() }
}

fun createResourceStorage(): BlobStorage {
    val fileSlot = slot<StoragePath>()
    return mockk {
        coEvery { loadFile(capture(fileSlot)) } answers {
            javaClass.getResourceAsStream("/" + fileSlot.captured.fileName.split('/').last())
                .rightIfNotNull { BlobStorageError.BlobNotFound(fileSlot.captured) }
                .map { it.readAllBytes() }
        }
    }
}

fun BlobStorage.withSuccessfulCopyFile(
    bucket: String = "some-bucket",
    path: String = "some-processed-file",
) {
    coEvery { copyFile(any(), any()) } returns StoragePath(bucket, path).right()
}

fun BlobStorage.withSuccessfulDeleteFile() {
    coEvery { deleteFile(any()) } returns true.right()
}

fun BlobStorageBrowser.withFailingGetFileMetadata() {
    coEvery { getFileMetadata(any()) } answers {
        BlobStorageError.BlobException(
            "Fetching metadata failed",
            Throwable(),
        ).left()
    }
}

interface BlobStorageBrowserWriter : BlobStorage, BlobStorageBrowser
