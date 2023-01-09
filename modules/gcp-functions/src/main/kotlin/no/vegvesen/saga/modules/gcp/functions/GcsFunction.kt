package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import com.google.cloud.functions.BackgroundFunction
import com.google.cloud.functions.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.blobstorage.handleBlobNotFound
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.StorageEvent
import no.vegvesen.saga.modules.shared.functions.StorageFunction
import no.vegvesen.saga.modules.shared.getOrThrow
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log
import no.vegvesen.saga.modules.shared.withMappedDiagnosticContext

interface GcsProcessor {
    suspend fun process(payload: StorageEvent): Either<Throwable, Unit>
}

abstract class GcsFunction(private val process: StorageFunction, private val processFolders: Boolean = false) :
    BackgroundFunction<GcsEvent>, Logging {
    override fun accept(payload: GcsEvent, context: Context?) =
        runBlocking(Dispatchers.IO) {
            // The eventId, unlike the execution_id, will be the same when a given event is retried.
            // It can therefore be used to check how many times a given event has been retried.
            withMappedDiagnosticContext("eventId" to (context?.eventId() ?: "Not found")) {
                log().info(
                    "Incoming GCS event",
                    kv("payload", payload),
                )

                if (payload.isFolder() && !processFolders) {
                    log().info("File is folder and processing of folders is disabled")
                } else {
                    try {
                        process(StorageEvent(payload.bucket, payload.name)).handleBlobNotFound().getOrThrow()
                        log().info(
                            "Processing of GCS event was successful",
                            kv("payload", payload),
                        )
                    } catch (throwable: Throwable) {
                        log().error(
                            "Error when processing GCS event",
                            kv("payload", payload),
                            kv("exception", throwable),
                        )
                        throw throwable
                    }
                }
            }
        }

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }
}
