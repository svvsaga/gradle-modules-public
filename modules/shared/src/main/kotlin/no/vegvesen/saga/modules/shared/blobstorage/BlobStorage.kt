package no.vegvesen.saga.modules.shared.blobstorage

import arrow.core.Either
import no.vegvesen.saga.modules.shared.ContentType
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.time.Instant

/**
 *
 * Note: this file must NOT reference any GCP/GCS types, as the interface should be possible to implement
 * without GCP dependency, e.g. for testing and also shield the clients for changes to GCS types/APIs
 *
 */
data class StoragePath(val bucketName: String, val fileName: String) {
    override fun toString(): String = "$bucketName/$fileName"
}

data class SaveFileOptions(
    val gzipContent: Boolean = false,
    val noOverwrite: Boolean = false,
    val customTime: Instant? = null,
    val customMetadata: Map<String, String>? = null
)

enum class GzipDecompressionBehaviour {
    AUTO, YES, NO
}

data class LoadFileOptions(val gzipDecompressionBehaviour: GzipDecompressionBehaviour = GzipDecompressionBehaviour.AUTO)

sealed class BlobStorageError(override val message: String? = null) : Exception() {
    data class BlobException(override val message: String, override val cause: Throwable) : BlobStorageError()
    data class BlobNotFound(val storagePath: StoragePath, override val cause: Throwable? = null) :
        BlobStorageError("Blob not found: $storagePath")
}

data class FileMetadata(
    val fileName: String,
    val contentType: ContentType,
    val customTime: Instant? = null,
    val contentEncoding: String? = null,
    val customMetadata: Map<String, String>? = null
)

interface BlobStorageBrowser {
    suspend fun listFiles(bucket: String): Either<Throwable, List<FileMetadata>>
    suspend fun getFileMetadata(storagePath: StoragePath): Either<BlobStorageError, FileMetadata>
}

/**
 * @TODO: extend GcpBlobstorage+BlobStorage to support streaming+crc check
 * We can perhaps use Bucket.BlobWriteOption.crc32cMatch to simplify this:
 * https://googleapis.dev/java/google-cloud-storage/latest/com/google/cloud/storage/Bucket.BlobWriteOption.html#crc32cMatch-java.lang.String-
 */
interface BlobStorage {
    suspend fun saveFile(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions = SaveFileOptions()
    ): Either<Throwable, Unit>

    /**
     * Returns false if file existed
     */
    suspend fun saveFileIfNotExisting(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions = SaveFileOptions()
    ): Either<Throwable, Boolean>

    /**
     * Returns false if file existed
     */
    suspend fun saveFileIfNotExisting(
        storagePath: StoragePath,
        fileContent: String,
        contentType: ContentType,
        options: SaveFileOptions = SaveFileOptions(),
        charset: Charset = Charsets.UTF_8
    ): Either<Throwable, Boolean> =
        this.saveFileIfNotExisting(storagePath, fileContent.toByteArray(charset), contentType, options)

    suspend fun saveFile(
        storagePath: StoragePath,
        fileContent: String,
        contentType: ContentType,
        options: SaveFileOptions = SaveFileOptions(),
        charset: Charset = StandardCharsets.UTF_8
    ): Either<Throwable, Unit> = this.saveFile(storagePath, fileContent.toByteArray(charset), contentType, options)

    suspend fun loadFile(
        storagePath: StoragePath,
        options: LoadFileOptions = LoadFileOptions()
    ): Either<BlobStorageError, ByteArray>

    suspend fun loadFileAsString(
        storagePath: StoragePath,
        options: LoadFileOptions = LoadFileOptions(),
        charset: Charset = StandardCharsets.UTF_8
    ): Either<BlobStorageError, String> = this.loadFile(storagePath, options).map { it.toString(charset) }

    suspend fun rewriteFile(storagePath: StoragePath): Either<BlobStorageError, Unit>

    suspend fun checkIfFileExists(storagePath: StoragePath): Either<Throwable, Boolean>
    suspend fun copyFile(from: StoragePath, to: StoragePath): Either<BlobStorageError, StoragePath>
    suspend fun deleteFile(storagePath: StoragePath): Either<Throwable, Boolean>
}

fun Either<BlobStorageError, ByteArray>.mapBlobStorageErrorToThrowable(path: StoragePath) = this.mapLeft {
    when (it) {
        is BlobStorageError.BlobException -> it.cause
        is BlobStorageError.BlobNotFound -> Exception(
            "Did not find blob named ${path.fileName} in bucket ${path.bucketName}",
            it.cause
        )
    }
}
