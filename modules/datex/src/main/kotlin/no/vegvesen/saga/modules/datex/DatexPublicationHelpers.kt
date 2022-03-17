package no.vegvesen.saga.modules.datex

import arrow.core.Either
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toLocalDateTime
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.blobstorage.BlobStorage
import no.vegvesen.saga.modules.shared.blobstorage.SaveFileOptions
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath

fun createProcessedPublicationPath(
    processedBucket: String,
    dataSource: String,
    publicationTime: Instant
): StoragePath = publicationTime.toLocalDateTime(TimeZone.UTC).let { utcTime ->
    StoragePath(
        processedBucket,
        "$dataSource/${utcTime.year}_${utcTime.month.toString().padStart(2, '0')}/${
        utcTime.toString().replace(':', '-')
        }.xml"
    )
}

suspend fun BlobStorage.saveProcessedPublication(
    bytes: ByteArray,
    processedBucket: String,
    dataSource: String,
    publicationTime: Instant
): Either<Throwable, Unit> = saveFile(
    createProcessedPublicationPath(processedBucket, dataSource, publicationTime),
    bytes,
    ContentType.Xml,
    SaveFileOptions(true, customTime = publicationTime.toJavaInstant())
)
