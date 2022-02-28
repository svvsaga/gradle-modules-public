package no.vegvesen.saga.modules.testing

import arrow.core.rightIfNotNull
import io.mockk.coEvery
import io.mockk.mockk
import io.mockk.slot
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath

fun BlobStorage.loadFileReturnsResource(path: String) {
    val fileSlot = slot<StoragePath>()
    coEvery { loadFile(capture(fileSlot)) } returns javaClass.getResourceAsStream(path)
        .rightIfNotNull { BlobStorageError.BlobNotFound(fileSlot.captured, Exception("Did not find $path")) }
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