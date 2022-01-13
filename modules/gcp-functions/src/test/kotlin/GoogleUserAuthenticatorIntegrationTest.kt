import com.google.auth.oauth2.GoogleCredentials
import com.google.auth.oauth2.IdTokenProvider
import com.google.cloud.functions.HttpRequest
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldNotBeBlank
import io.mockk.every
import io.mockk.mockk
import no.vegvesen.saga.modules.gcp.functions.GoogleIdTokenProcessor
import no.vegvesen.saga.modules.gcp.functions.GoogleUserAuthenticator
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.shouldBeRightAnd
import java.util.Optional

// NOTE: Requires having logged in with a user as GOOGLE_APPLICATION_CREDENTIALS (or `gcloud auth application-default login`)
@Tags(IntegrationTest)
class GoogleUserAuthenticatorIntegrationTest : FunSpec({
    val testSubject = GoogleUserAuthenticator(GoogleIdTokenProcessor())

    val credentials = GoogleCredentials.getApplicationDefault()

    if (credentials !is IdTokenProvider) {
        throw Exception("Must be IdTokenProvider")
    }

    credentials.refreshIfExpired()
    val idToken = credentials.idTokenWithAudience("https://example.com", emptyList())

    test("can verify valid Google ID token") {
        val request = mockk<HttpRequest>(relaxed = true) {
            every { getFirstHeader("Authorization") } returns Optional.of("Bearer ${idToken.tokenValue}")
        }

        testSubject.getAuthenticatedUserInfo(request) shouldBeRightAnd {
            it.email.shouldNotBeBlank()
            it.userId.shouldNotBeBlank()
        }
    }
})
