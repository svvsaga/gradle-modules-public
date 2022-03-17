package no.vegvesen.saga.modules.shared.blobstorage

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.kv
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("BlobStorage")

/**
 * Log warning when blob is not found, but return Right.
 */
fun <A, B> Either<A, B>.handleBlobNotFound(): Either<A, Unit> = fold({
    if (it is BlobStorageError.BlobNotFound) {
        log.warn(
            "File not found, potentially already processed because of PubSub at-least-once semantics",
            kv("path", it.storagePath)
        )
        Unit.right()
    } else it.left()
}, { Unit.right() })
