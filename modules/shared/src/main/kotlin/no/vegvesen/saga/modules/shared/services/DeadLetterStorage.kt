package no.vegvesen.saga.modules.shared.services

import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath

class DeadLetterStorage(private val storage: BlobStorage, val bucket: String) {
    suspend fun saveFile(filename: String, content: String, contentType: ContentType, gzipped: Boolean = true) =
        storage.saveFile(StoragePath(bucket, filename), content, contentType, options = SaveFileOptions(gzipContent = gzipped))
}
