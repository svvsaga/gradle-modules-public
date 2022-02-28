package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.handleErrorWith
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.shared.functions.SimpleProcessor
import no.vegvesen.saga.modules.shared.log
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage
import java.time.Instant

class DatexIngestProcessor(
    private val datexClient: DatexClient,
    private val datexStorage: DatexStorageRepository,
    private val deadLetterStorage: DeadLetterStorage,
    private val gzipped: Boolean = true
) : SimpleProcessor, Logging {
    override suspend fun process(): Either<SimpleFunctionError, Unit> =
        pollDatex(DatexPollerDeps(datexClient, datexStorage), gzipped).handleErrorWith { error ->
            when (error) {
                is DatexError.DeliveryBreak -> {
                    log().warn("DeliveryBreak encountered")
                    Unit.right()
                }
                is DatexError.ValidationError -> saveToDeadLetter(error)
                is DatexError.Exception -> SimpleFunctionError.Exception("Datex error", error.exception).left()
                is DatexStorageError.Exception -> SimpleFunctionError.Exception("Storage error", error.exception).left()
                is DatexStorageError.UnknownError ->
                    SimpleFunctionError.UnexpectedError(error.message, error.error)
                        .left()
                else -> SimpleFunctionError.UnexpectedError("Unexpected error", error).left()
            }
        }

    private suspend fun saveToDeadLetter(error: DatexError.ValidationError): Either<SimpleFunctionError, Nothing> {
        // Content might not be valid xml. However should it be valid, a ".xml" extension greatly simplifies
        // reprocessing, as we only need to create a data transfer job
        val filename = "${Instant.now()}.xml"
        return deadLetterStorage.saveFile(filename, error.document.value, ContentType.Xml, gzipped)
            .mapLeft { SimpleFunctionError.Exception("Saving to dead letter failed", it) }
            .flatMap {
                SimpleFunctionError.UnexpectedError(
                    "Datex validation error for object ${deadLetterStorage.bucket}/$filename",
                    error.message
                ).left()
            }
    }
}
