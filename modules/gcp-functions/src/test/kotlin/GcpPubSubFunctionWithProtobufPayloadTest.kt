import arrow.core.Either
import arrow.core.left
import arrow.core.right
import ch.qos.logback.classic.Level
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSingleElement
import io.kotest.matchers.shouldBe
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoBuf
import net.logstash.logback.marker.ObjectAppendingMarker
import no.vegvesen.saga.modules.gcp.functions.GcpPubSubFunctionWithProtobufPayload
import no.vegvesen.saga.modules.gcp.functions.GcpPubSubMessage
import no.vegvesen.saga.modules.shared.functions.PubSubError
import no.vegvesen.saga.modules.testing.TestLogger
import java.util.Base64.getEncoder

@ExperimentalSerializationApi
class GcpPubSubFunctionWithProtobufPayloadTest : FunSpec({
    val base64encoder = getEncoder()

    fun createFunctionWithProcess(process: suspend (params: MyParams) -> Either<PubSubError, Unit>) =
        object : GcpPubSubFunctionWithProtobufPayload<MyParams>(MyParams.serializer(), process) {}

    val input = MyParams(3)
    val validData = base64encoder.encodeToString(ProtoBuf.encodeToByteArray(MyParams.serializer(), input))
    val validBase64Data = base64encoder.encodeToString("Invalid payload content".encodeToByteArray())

    test("can deserialize valid protobuf payload") {
        val processMock = mockk<suspend (MyParams) -> Either<PubSubError, Unit>>()
        coEvery { processMock(any()) } returns Unit.right()

        createFunctionWithProcess(processMock)
            .accept(GcpPubSubMessage(data = validData), mockk())

        coVerify { processMock(input) }
    }

    test("invalid base 64 data throws exception") {
        val function = createFunctionWithProcess { Unit.right() }

        shouldThrowExactly<IllegalArgumentException> {
            function.accept(
                GcpPubSubMessage(data = "invalid base64 data"),
                mockk()
            )
        }
    }

    test("invalid payload throws exception") {
        val function = createFunctionWithProcess { Unit.right() }

        // Don't require the exact exception ProtobufDecodingException for test to be more robust
        shouldThrow<Exception> { function.accept(GcpPubSubMessage(data = validBase64Data), mockk()) }
    }

    test("returned exception is thrown") {
        val function = createFunctionWithProcess { PubSubError.Exception("oops", Exception("oops")).left() }

        shouldThrowExactly<Exception> { function.accept(GcpPubSubMessage(data = validData), mockk()) }
            .message shouldBe "oops"
    }

    test("thrown exception is thrown") {
        val function = createFunctionWithProcess { throw Exception("oops") }

        shouldThrowExactly<Exception> { function.accept(GcpPubSubMessage(data = validData), mockk()) }
            .message shouldBe "oops"
    }

    test("handled error is logged") {
        val testLogger = TestLogger()
        val function = createFunctionWithProcess { PubSubError.HandledError("gotcha").left() }

        shouldNotThrowAny {
            function.accept(GcpPubSubMessage(data = validData), mockk())
        }

        testLogger.events.shouldHaveSingleElement {
            it.level == Level.WARN && it.message == "Handled error when processing PubSub message" && it.argumentArray.single()
                .equals(
                    ObjectAppendingMarker(
                        "errorMessage",
                        "gotcha"
                    )
                )
        }
    }
}) {
    @Serializable
    data class MyParams(val anInt: Int)
}