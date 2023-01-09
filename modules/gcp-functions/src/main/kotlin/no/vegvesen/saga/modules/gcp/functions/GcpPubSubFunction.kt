package no.vegvesen.saga.modules.gcp.functions

import com.google.cloud.functions.BackgroundFunction
import com.google.cloud.functions.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.PubSubEvent
import no.vegvesen.saga.modules.shared.functions.PubSubFunction
import no.vegvesen.saga.modules.shared.functions.logOrThrow
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log
import java.time.Instant
import java.time.format.DateTimeParseException
import java.util.Base64

abstract class GcpPubSubFunction(private val process: PubSubFunction) : BackgroundFunction<GcpPubSubMessage>, Logging {
    private val decoder = Base64.getDecoder()

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }

    override fun accept(message: GcpPubSubMessage, context: Context) {
        val messageId = context.eventId()
        log().info("Got pubsub message", kv("eventId", messageId), kv("timestamp", context.timestamp()))

        if (message.data == null) {
            log().error("Received message with no data", kv("payload", message), kv("context", context))
            return
        }

        val publishTime = context.timestamp().let {
            try {
                Instant.parse(it)
            } catch (exception: DateTimeParseException) {
                log().error(
                    "Received message with publishTime that could not be parsed",
                    kv("timestamp", it),
                    kv("exception", exception),
                    kv("context", context),
                )
                return
            }
        }

        val utf8Payload = try {
            decoder.decode(message.data).decodeToString()
        } catch (exception: Exception) {
            log().error("Error when decoding PubSub message payload", exception)
            return
        }

        val attributes = message.attributes ?: emptyMap()

        runBlocking(Dispatchers.IO) {
            process(PubSubEvent(utf8Payload, messageId, publishTime, attributes))
                .tapLeft { logOrThrow(it) }
        }
    }
}
