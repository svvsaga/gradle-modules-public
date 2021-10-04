import arrow.core.Either
import arrow.core.left
import ch.qos.logback.classic.Level
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import io.kotest.matchers.collections.shouldHaveSingleElement
import io.kotest.matchers.shouldBe
import io.mockk.CapturingSlot
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import kotlinx.coroutines.runBlocking
import no.vegvesen.saga.modules.gcp.functions.GcpHttpFunction
import no.vegvesen.saga.modules.shared.functions.SimpleFunctionError
import no.vegvesen.saga.modules.testing.TestLogger
import org.junit.jupiter.api.Test

class GcpHttpFunctionTest {

    private val statusCode = CapturingSlot<Int>()
    private val request = mockk<HttpRequest>(relaxed = true)
    private val response = mockk<HttpResponse>(relaxed = true) {
        every { setStatusCode(capture(statusCode)) } just runs
    }

    private val testLogger = TestLogger()

    @Test
    fun `should send http status 500 and error log on exceptions`() = runBlocking {
        val exception = RuntimeException()
        val error = SimpleFunctionError.Exception("an exception", exception)
        val function = gcpHttpFunctionReturning(error.left())

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.ERROR }
        statusCode.captured.shouldBe(500)
    }

    @Test
    fun `should send http status 500 and error log on unexpected errors`() = runBlocking {
        val error = SimpleFunctionError.UnexpectedError("an unexpected error", Object())
        val function = gcpHttpFunctionReturning(error.left())

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.ERROR }
        statusCode.captured.shouldBe(500)
    }

    @Test
    fun `should catch all exceptions`() = runBlocking {
        FailingFunction().service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.ERROR }
        statusCode.captured shouldBe 500
    }

    private class FailingFunction : GcpHttpFunction({ throw Exception("oops") })

    private fun gcpHttpFunctionReturning(value: Either<SimpleFunctionError, Unit>) =
        object : GcpHttpFunction({ value }) {}
}
