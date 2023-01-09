package no.vegvesen.saga.modules.shared.functions

import arrow.core.Either
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log
import org.slf4j.event.Level
import java.time.Instant

data class PubSubEvent(
    val utf8Payload: String,
    val messageId: String,
    val publishTime: Instant,
    val attributes: Map<String, String?> = emptyMap(),
)

sealed class PubSubError {
    data class Exception(val message: String, val throwable: Throwable) : PubSubError()
    data class HandledError(val message: String, val level: Level = Level.WARN) : PubSubError()
}

typealias PubSubFunction = suspend (payload: PubSubEvent) -> Either<PubSubError, Unit>

interface PubSubProcessor {
    suspend fun process(payload: PubSubEvent): Either<PubSubError, Unit>
}

inline fun <reified T : Logging> T.logOrThrow(it: PubSubError) {
    when (it) {
        // To trigger function retry
        is PubSubError.Exception -> {
            log().error("Unhandled error when processing PubSub message: ${it.message}", it.throwable)
            throw it.throwable
        }
        is PubSubError.HandledError -> with(log()) {
            val description = "Handled error when processing PubSub message"
            val errorMessage = kv("errorMessage", it.message)
            when (it.level) {
                Level.ERROR -> error(description, errorMessage)
                Level.WARN -> warn(description, errorMessage)
                Level.INFO -> info(description, errorMessage)
                Level.DEBUG -> debug(description, errorMessage)
                Level.TRACE -> trace(description, errorMessage)
            }
        }
    }
}
