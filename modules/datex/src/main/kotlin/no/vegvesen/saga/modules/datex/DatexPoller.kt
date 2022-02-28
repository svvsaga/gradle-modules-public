package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.computations.either
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Timing.withLoggingTimer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

data class DatexPollerDeps(
    val datex: DatexClient,
    val datexStorage: DatexStorageRepository,
)

val logger: Logger = LoggerFactory.getLogger("DatexPoller")

suspend fun pollDatex(deps: DatexPollerDeps, gzipped: Boolean = false): Either<DatexPollerError, Unit> =
    either<DatexPollerError, Unit> {
        val lastModified =
            withLoggingTimer(logger, "Fetching last modified") { deps.datexStorage.getLastModifiedTime() }.bind()

        logger.info("Polling Datex with lastModified: $lastModified")
        val datexResponse =
            withLoggingTimer(logger, "Fetching xml file from Datex") { deps.datex.read(lastModified) }.bind()

        val publicationTime = datexResponse.publicationTime
        logger.info("Current Datex is published $publicationTime.")

        logger.info("Saving publication from $publicationTime.")
        withLoggingTimer(logger, "Saving Datex xml file") {
            deps.datexStorage.saveObject(
                datexResponse.document,
                publicationTime,
                gzipped,
                ContentType.Xml
            )
        }.bind()

        if (datexResponse.lastModified != null) {
            withLoggingTimer(
                logger,
                "Saving last modified time"
            ) { deps.datexStorage.saveLastModifiedTime(datexResponse.lastModified) }.bind()
        } else {
            logger.error("No last modified time given.")
            Unit.right().bind()
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