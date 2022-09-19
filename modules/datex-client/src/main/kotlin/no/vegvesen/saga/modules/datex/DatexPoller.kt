package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.continuations.either
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.Timing.measureTime
import no.vegvesen.saga.modules.shared.log

class DatexPoller(
    private val datexClient: DatexClient,
    private val datexStorage: DatexStorageRepository
) : Logging {
    val logger = log()
    suspend fun pollDatex(gzipped: Boolean = false): Either<DatexPollerError, Unit> =
        either {
            val lastModified = logger.measureTime("Fetching last modified") {
                datexStorage.getLastModifiedTime()
            }.bind()

            logger.info("Polling Datex with lastModified: $lastModified")
            val datexResponse = logger.measureTime("Fetching xml file from Datex") {
                datexClient.read(lastModified)
            }.bind()

            val publicationTime = datexResponse.publicationTime
            logger.info("Current Datex is published $publicationTime.")

            logger.info("Saving publication from $publicationTime.")
            logger.measureTime("Saving Datex xml file") {
                datexStorage.saveObject(datexResponse.document, publicationTime, gzipped, ContentType.Xml)
            }.bind()

            if (datexResponse.lastModified != null) {
                logger.measureTime("Saving last modified time") {
                    datexStorage.saveLastModifiedTime(datexResponse.lastModified)
                }.bind()
            } else {
                logger.error("No last modified time given.")
            }
        }.handleErrorWith { err ->
            when (err) {
                is DatexError.NoNewDataAvailable -> {
                    logger.info("No new document available")
                    Unit.right()
                }
                else -> err.left()
            }
        }
}
