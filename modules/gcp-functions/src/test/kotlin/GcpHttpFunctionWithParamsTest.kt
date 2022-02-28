import arrow.core.Either
import arrow.core.left
import arrow.core.right
import ch.qos.logback.classic.Level
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.exist
import io.kotest.matchers.collections.shouldHaveSingleElement
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNot
import io.mockk.CapturingSlot
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import no.vegvesen.saga.modules.gcp.functions.GcpHttpFunctionWithParams
import no.vegvesen.saga.modules.shared.ContentType
import no.vegvesen.saga.modules.testing.TestLogger
import java.io.BufferedReader
import java.io.StringReader
import java.util.Optional

@ExperimentalSerializationApi
class GcpHttpFunctionWithParamsTest : FunSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    val testBody = MyParams(5)
    val testParameterValue = 3

    val statusCode = CapturingSlot<Int>()
    val request = mockk<HttpRequest>(relaxed = true) {
        every { queryParameters } returns mapOf("anInt" to listOf(testParameterValue.toString()))
    }
    val response = mockk<HttpResponse>(relaxed = true) {
        every { setStatusCode(capture(statusCode)) } just runs
    }
    val processSuccessfulMock = mockk<suspend (MyParams) -> Either<Throwable, Unit>>()
    coEvery { processSuccessfulMock(any()) } returns Unit.right()

    val testLogger = TestLogger()

    fun createFunctionWithProcess(process: suspend (params: MyParams) -> Either<Throwable, Unit>) =
        object : GcpHttpFunctionWithParams<MyParams>(MyParams.serializer(), process) {}

    test("logs error and returns HTTP 500 on returned exception") {
        val function = createFunctionWithProcess { Exception("oops").left() }

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.ERROR }
        statusCode.captured shouldBe 500
    }

    test("logs error and returns HTTP 500 on thrown exception") {
        val function = createFunctionWithProcess { throw Exception("oops") }

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.ERROR }
        statusCode.captured shouldBe 500
    }

    test("Returns HTTP 200 on success") {
        val function = createFunctionWithProcess { Unit.right() }

        function.service(request, response)

        testLogger.events shouldNot exist { event -> event.level == Level.ERROR }
    }

    test("parses JSON body before query if available and content type is JSON") {
        every { request.reader } returns BufferedReader(StringReader(Json.encodeToString(testBody)))
        every { request.contentType } returns Optional.of(ContentType.Json.value)

        createFunctionWithProcess(processSuccessfulMock)
            .service(request, response)

        coVerify { processSuccessfulMock(testBody) }
    }

    test("ignores JSON body if content type is not JSON") {
        every { request.reader } returns BufferedReader(StringReader(Json.encodeToString(testBody)))
        every { request.contentType } returns Optional.empty()

        createFunctionWithProcess(processSuccessfulMock)
            .service(request, response)

        coVerify { processSuccessfulMock(MyParams(testParameterValue)) }
    }
}) {
    @Serializable
    data class MyParams(val anInt: Int)
}