package no.vegvesen.saga.modules.gcp.functions

import arrow.core.Either
import arrow.core.flatMap
import com.google.cloud.functions.BackgroundFunction
import com.google.cloud.functions.Context
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.protobuf.ProtoBuf
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.envOrThrow
import no.vegvesen.saga.modules.shared.functions.PubSubError
import no.vegvesen.saga.modules.shared.functions.logOrThrow
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.log
import java.util.Base64

@ExperimentalSerializationApi
private fun <T> decodeProtobufPayload(deserializer: DeserializationStrategy<T>, data: ByteArray): Either<Throwable, T> =
    Either.catch {
        ProtoBuf.decodeFromByteArray(deserializer, data)
    }

@ExperimentalSerializationApi
/**
 * Abstract because each usage should subclass it and give to GCP reference to that
 */
abstract class GcpPubSubFunctionWithProtobufPayload<T>(
    deserializer: DeserializationStrategy<T>,
    process: suspend (params: T) -> Either<PubSubError, Unit>
) : GcpPubSubFunctionWithPayloadDecoding<T>({ decodeProtobufPayload(deserializer, it) }, process)

@ExperimentalSerializationApi
abstract class GcpPubSubFunctionWithPayloadDecoding<T>(
    private val decode: (data: ByteArray) -> Either<Throwable, T>,
    private val process: suspend (params: T) -> Either<PubSubError, Unit>
) : BackgroundFunction<GcpPubSubMessage>, Logging {
    override fun accept(payload: GcpPubSubMessage, context: Context) {
        runBlocking {
            log().info("PubSub message received", kv("context", context))

            Either.catch { Base64.getDecoder().decode(payload.data) }
                .flatMap(decode)
                .mapLeft { PubSubError.Exception("Failed to decode payload data", it) }
                .flatMap { process(it) }
                .tapLeft { logOrThrow(it) }
        }
    }

    companion object {
        val projectId by lazy { envOrThrow("GCP_PROJECT") }
    }
}