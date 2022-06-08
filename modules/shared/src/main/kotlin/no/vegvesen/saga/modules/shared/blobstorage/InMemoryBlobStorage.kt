package no.vegvesen.saga.modules.shared.blobstorage

import arrow.core.Either
import arrow.core.right
import arrow.core.rightIfNotNull
import no.vegvesen.saga.modules.shared.ContentType
import java.util.concurrent.ConcurrentHashMap

open class InMemoryBlobStorage : BlobStorage, BlobStorageBrowser {
    class File(val bytes: ByteArray, val metadata: FileMetadata)

    protected val files = ConcurrentHashMap<StoragePath, File>()

    fun clearFiles() = files.clear()

    override suspend fun deleteFile(storagePath: StoragePath): Either<Throwable, Boolean> =
        (files.remove(storagePath) != null).right()

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
        if (options.gzipContent) "gzip" else null,
        options.customMetadata
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
    ): Either<BlobStorageError, ByteArray> =
        files[storagePath]?.bytes.rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }

    override suspend fun rewriteFile(storagePath: StoragePath): Either<BlobStorageError, Unit> =
        files[storagePath].rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }.map { }

    override suspend fun checkIfFileExists(storagePath: StoragePath): Either<Throwable, Boolean> =
        files.containsKey(storagePath).right()

    override suspend fun copyFile(from: StoragePath, to: StoragePath): Either<BlobStorageError, StoragePath> =
        files[from].rightIfNotNull { BlobStorageError.BlobNotFound(from) }
            .map { files[to] = File(it.bytes.clone(), it.metadata); to }

    override suspend fun listFiles(bucket: String): Either<Throwable, List<FileMetadata>> =
        files.filter { it.key.bucketName == bucket }.values.map { it.metadata }.right()

    override suspend fun getFileMetadata(storagePath: StoragePath): Either<BlobStorageError, FileMetadata> =
        files[storagePath]?.metadata.rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }
}
