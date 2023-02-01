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
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import no.vegvesen.saga.modules.gcp.functions.AuthenticationException
import no.vegvesen.saga.modules.gcp.functions.AuthorizationException
import no.vegvesen.saga.modules.gcp.functions.GcpAuthenticatedHttpFunctionWithParams
import no.vegvesen.saga.modules.gcp.functions.GoogleUserAuthenticator
import no.vegvesen.saga.modules.shared.functions.UserInfo
import no.vegvesen.saga.modules.testing.TestLogger

@ExperimentalSerializationApi
class GcpAuthenticatedHttpFunctionWithParamsTest : FunSpec({
    isolationMode = IsolationMode.InstancePerLeaf

    val testParameterValue = 3

    val statusCode = CapturingSlot<Int>()
    val request = mockk<HttpRequest>(relaxed = true) {
        every { queryParameters } returns mapOf("anInt" to listOf(testParameterValue.toString()))
    }
    val response = mockk<HttpResponse>(relaxed = true) {
        every { setStatusCode(capture(statusCode)) } just runs
    }

    val testLogger = TestLogger()

    fun createFunction(
        requestVerifier: GoogleUserAuthenticator,
        process: suspend (params: MyParams, userInfo: UserInfo) -> Either<Throwable, Unit>
    ) = object : GcpAuthenticatedHttpFunctionWithParams<MyParams>(MyParams.serializer(), requestVerifier, process) {}

    fun createSuccessFunction(requestVerifier: GoogleUserAuthenticator) =
        createFunction(requestVerifier) { _, _ -> Unit.right() }

    fun createAuthenticator(result: Either<AuthenticationException, UserInfo>) = mockk<GoogleUserAuthenticator> {
        every { getAuthenticatedUserInfo(any()) } returns result
    }

    val userInfo = UserInfo("userId", "user@example.com")

    test("returns HTTP 200 on valid token") {
        val requestVerifier = createAuthenticator(userInfo.right())
        val function = createSuccessFunction(requestVerifier)

        function.service(request, response)

        testLogger.events shouldNot exist { event -> event.level == Level.ERROR }
    }

    test("logs warning and returns HTTP 401 on invalid token") {
        val requestVerifier = createAuthenticator(AuthenticationException("oops").left())
        val function = createSuccessFunction(requestVerifier)

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.WARN }
        statusCode.captured shouldBe 401
    }

    test("logs warning and returns HTTP 403 on AuthorizationException") {
        val requestVerifier = createAuthenticator(userInfo.right())
        val function = createFunction(requestVerifier) { _, _ -> AuthorizationException("nope").left() }

        function.service(request, response)

        testLogger.events.shouldHaveSingleElement { event -> event.level == Level.WARN }
        statusCode.captured shouldBe 403
    }
}) {
    @Serializable
    data class MyParams(val anInt: Int)
}
