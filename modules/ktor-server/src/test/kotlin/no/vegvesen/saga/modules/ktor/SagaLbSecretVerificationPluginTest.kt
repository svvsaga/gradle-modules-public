package no.vegvesen.saga.modules.ktor

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.testing.ApplicationTestBuilder
import io.ktor.server.testing.testApplication

fun withTestApp(test: suspend ApplicationTestBuilder.() -> Unit) {
    testApplication {
        application {
            configureLoadBalancerSecret("secret")
        }
        routing {
            get("/") {
                call.respond("OK")
            }
        }
        test()
    }
}

fun FunSpec.webTest(name: String, test: suspend ApplicationTestBuilder.() -> Unit) {
    test(name) {
        withTestApp {
            test()
        }
    }
}

class SagaLbSecretVerificationPluginTest : FunSpec({
    webTest("if header is missing then 401 is returned") {
        val response = client.get("/")
        response.status shouldBe HttpStatusCode.Unauthorized
    }
    webTest("if header is present but invalid then 403 is returned") {
        val response = client.get("/") {
            header(SagaLbSecretHeader, "wrong")
        }
        response.status shouldBe HttpStatusCode.Forbidden
    }
    webTest("if header is present and valid then 200 is returned") {
        val response = client.get("/") {
            header(SagaLbSecretHeader, "secret")
        }
        response.status shouldBe HttpStatusCode.OK
        response.bodyAsText() shouldBe "OK"
    }
})
