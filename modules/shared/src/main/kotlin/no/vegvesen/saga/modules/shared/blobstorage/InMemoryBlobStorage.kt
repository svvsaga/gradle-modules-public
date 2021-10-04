package no.vegvesen.saga.modules.shared.blobstorage

import arrow.core.Either
import arrow.core.right
import arrow.core.rightIfNotNull
import no.vegvesen.saga.modules.shared.ContentType

class InMemoryBlobStorage : BlobStorage, BlobStorageBrowser {

    class File(val bytes: ByteArray, val metadata: FileMetadata)

    val files = mutableMapOf<StoragePath, File>()

    override suspend fun saveFile(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions
    ): Either<Throwable, Unit> {
        files[storagePath] = File(
            fileContent,
            fileMetadata(storagePath, contentType, options)
        )
        return Unit.right()
    }

    private fun fileMetadata(
        storagePath: StoragePath,
        contentType: ContentType,
        options: SaveFileOptions
    ) = FileMetadata(
        storagePath.fileName,
        contentType,
        options.customTime,
        if (options.gzipContent) "gzip" else null
    )

    override suspend fun saveFileIfNotExisting(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions
    ): Either<Throwable, Boolean> {
        val shouldAdd = !files.containsKey(storagePath)
        if (shouldAdd)
            files[storagePath] = File(
                fileContent,
                fileMetadata(storagePath, contentType, options)
            )
        return shouldAdd.right()
    }

    override suspend fun loadFile(
        storagePath: StoragePath,
        options: LoadFileOptions
    ): Either<BlobStorageError, ByteArray> {
        return files[storagePath]?.bytes.rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }
    }

    override suspend fun rewriteFile(storagePath: StoragePath): Either<BlobStorageError, Unit> =
        files[storagePath].rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }.map { }

    override suspend fun checkIfFileExists(storagePath: StoragePath): Either<Throwable, Boolean> =
        files.containsKey(storagePath).right()

    override suspend fun listFiles(bucket: String): Either<Throwable, List<FileMetadata>> =
        files.values.map { it.metadata }.right()

    override suspend fun getFileMetadata(storagePath: StoragePath): Either<BlobStorageError, FileMetadata> =
        files[storagePath]?.metadata.rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }
}
