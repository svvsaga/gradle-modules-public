package no.vegvesen.saga.modules.ktor

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.ktor.application.call
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.testing.TestApplicationEngine
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication

fun <R : Any> withTestApp(test: TestApplicationEngine.() -> R): R = withTestApplication({
    configureLoadBalancerSecret("secret")
    routing {
        get("/") {
            call.respond("Cool")
        }
    }
}, test)

class SagaLbSecretVerificationTest : FunSpec({
    test("if header is missing then 401 is returned") {
        withTestApp {
            with(handleRequest(HttpMethod.Get, "/")) {
                response.status() shouldBe HttpStatusCode.Unauthorized
            }
        }
    }
    test("if header is present but token is invalid then 403 is returned") {
        withTestApp {
            with(
                handleRequest(HttpMethod.Get, "/") {
                    addHeader(SagaLbSecretHeader, "wrong")
                }
            ) {
                response.status() shouldBe HttpStatusCode.Forbidden
            }
        }
    }
    test("if header is present and matches secret then 200 is returned") {
        withTestApp {
            with(
                handleRequest(HttpMethod.Get, "/") {
                    addHeader(SagaLbSecretHeader, "secret")
                }
            ) {
                response.status() shouldBe HttpStatusCode.OK
            }
        }
    }
})
