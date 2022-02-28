import com.google.auth.oauth2.GoogleCredentials
import com.google.auth.oauth2.IdTokenProvider
import com.google.cloud.functions.HttpRequest
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldNotBeBlank
import io.mockk.every
import io.mockk.mockk
import no.vegvesen.saga.modules.gcp.functions.GoogleUserAuthenticator
import no.vegvesen.saga.modules.testing.ExternalTest
import no.vegvesen.saga.modules.testing.IntegrationTest
import no.vegvesen.saga.modules.testing.shouldBeRightAnd
import java.util.Optional

/*
 NOTE: Requires having logged in with a user as GOOGLE_APPLICATION_CREDENTIALS (or `gcloud auth application-default login`)
 Set as ExternalTest to ignore automatic integration testing, auth not working from GihHub (not implementing IdTokenProvider)
 */
@Tags(IntegrationTest, ExternalTest)
class GoogleUserAuthenticatorIntegrationTest : FunSpec({
    val testSubject = GoogleUserAuthenticator()

    val credentials = GoogleCredentials.getApplicationDefault()

    if (credentials !is IdTokenProvider) {
        throw Exception("Must be IdTokenProvider, application default credentials is: ${credentials.javaClass.name}")
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