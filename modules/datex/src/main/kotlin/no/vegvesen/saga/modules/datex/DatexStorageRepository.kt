package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.handleErrorWith
import arrow.core.left
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.XmlString
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath
import no.vegvesen.saga.modules.shared.kvstore.KVStore
import no.vegvesen.saga.modules.shared.kvstore.KVStoreError
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
 * @param dataSourceName Name to use for bucket folder and last modified key
 */
class DatexStorageRepository(
    private val datexDataBucketName: String,
    private val dataSourceName: String,
    private val kvStore: KVStore,
    private val storage: BlobStorage
) : Logging {

    private val lastModifiedKey = "${dataSourceName}_last_modified"

    fun filePath(publicationTime: Instant) =
        publicationTime.atZone(ZoneId.of("UTC")).let { utcTime ->
            val directory = DateTimeFormatter.ofPattern("yyyy_MM").format(utcTime)
            val filename = "${publicationTime.toString().replace(':', '-')}.xml"
            "$dataSourceName/$directory/$filename"
        }

    /**
     * Returns false if object existed
     */
    suspend fun saveObject(
        data: XmlString,
        publicationTime: Instant,
        gzipped: Boolean,
        contentType: ContentType
    ): Either<DatexStorageError, Boolean> =
        storage.saveFileIfNotExisting(
            StoragePath(datexDataBucketName, filePath(publicationTime)),
            data.value,
            contentType,
            SaveFileOptions(gzipContent = gzipped, customTime = publicationTime)
        )
            .mapLeft { ex -> DatexStorageError.Exception(ex.toString(), ex) }

    suspend fun saveLastModifiedTime(lastModifiedTime: Instant): Either<DatexStorageError, Unit> =
        lastModifiedTime.let(::lastModifiedTimeToString).let {
            kvStore.putString(lastModifiedKey, it)
                .mapLeft { error ->
                    when (error) {
                        is KVStoreError.KVStoreException -> DatexStorageError.Exception(error.message, error.exception)
                        else -> DatexStorageError.UnknownError("KVStore failed with unknown error", error)
                    }
                }
        }

    suspend fun getLastModifiedTime(): Either<DatexPollerError, Instant?> =
        kvStore.getString(lastModifiedKey)
            .map(::stringToLastModifiedTime)
            .handleErrorWith {
                when (it) {
                    is KVStoreError.ValueNotFound -> Either.Right(null) // expected first time
                    else -> it.left()
                }
            }.mapLeft {
                when (it) {
                    is KVStoreError.KVStoreException -> DatexStorageError.Exception(
                        "Error getting last modified time" + it.message,
                        it.exception
                    )
                    else -> DatexStorageError.UnknownError("KVStore failed with unknown error", it)
                }
            }

    companion object {
        fun lastModifiedTimeToString(date: Instant): String = date.toString()

        fun stringToLastModifiedTime(data: String): Instant? = runCatching {
            Instant.parse(data)
        }.getOrNull()
    }
}