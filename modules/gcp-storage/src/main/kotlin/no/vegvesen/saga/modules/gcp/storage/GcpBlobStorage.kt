
package no.vegvesen.saga.modules.gcp.storage

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import arrow.core.rightIfNotNull
import com.google.cloud.http.HttpTransportOptions
import com.google.cloud.storage.Blob
import com.google.cloud.storage.BlobId
import com.google.cloud.storage.BlobInfo
import com.google.cloud.storage.Storage
import com.google.cloud.storage.StorageException
import com.google.cloud.storage.StorageOptions
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Retry.ExponentialBackoffSettings
import no.vegvesen.saga.modules.shared.Retry.retry
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageBrowser
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorageError
import no.vegvesen.saga.modules.shared.blobstorage.FileMetadata
import no.vegvesen.saga.modules.shared.blobstorage.GzipDecompressionBehaviour
import no.vegvesen.saga.modules.shared.blobstorage.LoadFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.gzipCompress
import no.vegvesen.saga.modules.shared.gzipDecompress
import java.nio.ByteBuffer
import java.time.Instant
import kotlin.time.Duration.Companion.seconds

/**
TODO: Consider adding stream-oriented methods,
such that one does not have to keep entire ByteArrays in memory.
NOTE: Tests for this class is in no/vegvesen/saga/modules/gcp/integrationtests/GcpBlobStorageIntegrationTests.kt
 */
class GcpBlobStorage(private val storage: Storage) : BlobStorage, BlobStorageBrowser {
    companion object {
        fun create(
            connectTimeout: Int = 1000,
            readTimeout: Int = 4000
        ): GcpBlobStorage = StorageOptions.newBuilder()
            .setTransportOptions(
                HttpTransportOptions.newBuilder()
                    .setConnectTimeout(connectTimeout)
                    .setReadTimeout(readTimeout).build()
            ).build().service.let(::GcpBlobStorage)

        private const val PRECONDITION_FAILED = 412
    }

    private val backoffSettings = ExponentialBackoffSettings(1.seconds, 5)

    override suspend fun saveFile(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions
    ): Either<Throwable, Unit> {
        val createOptions = arrayOf(
            if (options.noOverwrite) Storage.BlobTargetOption.doesNotExist() else null,
        ).filterNotNull().toTypedArray()

        val blobInfoBuilder = BlobInfo.newBuilder(storagePath.bucketName, storagePath.fileName)
            .setContentType(contentType.value)

        if (options.gzipContent) {
            blobInfoBuilder.setContentEncoding("gzip")
        }

        options.customTime?.also {
            blobInfoBuilder.setCustomTime(it.toEpochMilli())
        }

        options.customMetadata?.also {
            blobInfoBuilder.setMetadata(it)
        }

        return retry("Saving blob '$storagePath' to GCS", backoffSettings) {
            storage.create(
                blobInfoBuilder.build(),
                if (options.gzipContent) gzipCompress(fileContent) else fileContent,
                *createOptions
            )
        }
    }

    override suspend fun saveFileIfNotExisting(
        storagePath: StoragePath,
        fileContent: ByteArray,
        contentType: ContentType,
        options: SaveFileOptions
    ): Either<Throwable, Boolean> {
        return saveFile(storagePath, fileContent, contentType, options.copy(noOverwrite = true))
            .map { true }
            .handleErrorWith { ex ->
                when (ex) {
                    is StorageException -> {
                        if (ex.code == PRECONDITION_FAILED && ex.location == "If-Match")
                            return false.right()
                        else ex.left()
                    }
                    else -> ex.left()
                }
            }
    }

    /**
     * @todo: test for StorageException.isRetryable and retry automatically, or by flag?
     * Note from Peder: Attempted to make this method streaming, but Storage API makes this difficult
     */
    override suspend fun loadFile(
        storagePath: StoragePath,
        options: LoadFileOptions
    ): Either<BlobStorageError, ByteArray> =
        BlobId.of(storagePath.bucketName, storagePath.fileName).let { blobId ->
            Either.catch {
                storage.get(blobId)
            }
                .mapLeft {
                    when (val ex = it) {
                        is StorageException -> when (ex.code) {
                            404 -> BlobStorageError.BlobNotFound(storagePath, ex)
                            else -> BlobStorageError.BlobException(ex.message ?: ex.toString(), ex)
                        }
                        else -> BlobStorageError.BlobException(ex.message ?: ex.toString(), ex)
                    }
                }
                .flatMap { it.rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) } }
        }
            .flatMap { blob ->
                Either.catch {
                    val bytes = ByteBuffer.allocate(blob.size.toInt()).let { buffer ->
                        blob.reader().read(buffer)
                        buffer.array()
                    }
                    when (options.gzipDecompressionBehaviour) {
                        GzipDecompressionBehaviour.NO -> bytes
                        GzipDecompressionBehaviour.YES -> gzipDecompress(bytes)
                        GzipDecompressionBehaviour.AUTO ->
                            if (blob.name.endsWith(".gz") || blob.name.endsWith(".gzip") || blob.contentEncoding == "gzip") {
                                gzipDecompress(bytes)
                            } else {
                                bytes
                            }
                    }
                }.mapLeft { ex ->
                    BlobStorageError.BlobException(ex.message ?: ex.toString(), ex)
                }
            }

    override suspend fun rewriteFile(storagePath: StoragePath): Either<BlobStorageError, Unit> =
        Either.catchAndFlatten {
            val blobId = storagePath.toBlobId()

            val blob = storage.get(blobId) ?: return BlobStorageError.BlobNotFound(storagePath).left()
            val copyWriter = blob.copyTo(blobId)
            while (!copyWriter.isDone) {
                copyWriter.copyChunk()
            }
            Unit.right()
        }.mapLeft { BlobStorageError.BlobException("Error when rewriting file $storagePath", it) }

    override suspend fun checkIfFileExists(storagePath: StoragePath): Either<Throwable, Boolean> = Either.catch {
        storage.get(storagePath.toBlobId()) != null
    }

    fun StoragePath.toBlobId(): BlobId = BlobId.of(bucketName, fileName)

    override suspend fun listFiles(bucket: String): Either<Throwable, List<FileMetadata>> = Either.catch {
        storage.list(bucket).iterateAll().map(::blobToFileMetadata)
    }

    override suspend fun getFileMetadata(storagePath: StoragePath): Either<BlobStorageError, FileMetadata> =
        Either.catch {
            storage[storagePath.bucketName, storagePath.fileName]
        }.mapLeft {
            BlobStorageError.BlobException("Error getting Blob", it)
        }.flatMap {
            it?.let(::blobToFileMetadata).rightIfNotNull { BlobStorageError.BlobNotFound(storagePath) }
        }

    private fun blobToFileMetadata(blob: Blob): FileMetadata =
        FileMetadata(
            fileName = blob.name,
            contentType = ContentType(blob.contentType),
            customTime = blob.customTime?.let(Instant::ofEpochMilli),
            contentEncoding = blob.contentEncoding,
            customMetadata = blob.metadata
        )

    override suspend fun copyFile(from: StoragePath, to: StoragePath): Either<BlobStorageError, StoragePath> =
        storage[from.toBlobId()].rightIfNotNull { BlobStorageError.BlobNotFound(from) }
            .flatMap { fromBlob ->
                Either.catch {
                    fromBlob.copyTo(to.toBlobId()).result.let { toBlob ->
                        StoragePath(
                            toBlob.bucket,
                            toBlob.name
                        )
                    }
                }.mapLeft { BlobStorageError.BlobException("Failed to copy file '$from' to '$to'", it) }
            }

    override suspend fun deleteFile(storagePath: StoragePath): Either<Throwable, Boolean> = Either.catch {
        storage.delete(storagePath.toBlobId())
    }
}
