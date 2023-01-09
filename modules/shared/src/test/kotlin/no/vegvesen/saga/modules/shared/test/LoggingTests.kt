package no.vegvesen.saga.modules.shared.test

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.shared.getLogger
import no.vegvesen.saga.modules.shared.kv
import no.vegvesen.saga.modules.shared.withMappedDiagnosticContext
import no.vegvesen.saga.modules.testing.TestLogger
import org.slf4j.MDC

class LoggingTests : StringSpec({
    val mdcKey = "test"
    val mdcValue = "123"

    "withMappedDiagnosticContext puts properties on MDC" {
        withMappedDiagnosticContext(mdcKey to mdcValue) {
            MDC.get(mdcKey) shouldBe mdcValue
        }
    }

    "withMappedDiagnosticContext can put multiple properties on MDC" {
        val mdcKey2 = "test2"
        val mdcValue2 = "321"
        withMappedDiagnosticContext(
            mdcKey to mdcValue,
            mdcKey2 to mdcValue2,
        ) {
            MDC.get(mdcKey) shouldBe mdcValue
            MDC.get(mdcKey2) shouldBe mdcValue2
        }
    }

    "withMappedDiagnosticContext clears properties from MDC when completed" {
        withMappedDiagnosticContext(mdcKey to mdcValue) {
            // Do nothing
        }
        MDC.get(mdcKey) shouldBe null
    }

    "withMappedDiagnosticContext clears properties from MDC even when an exception is thrown in func" {
        val exceptionMessage = "Test"
        val exception = shouldThrow<Exception> {
            withMappedDiagnosticContext(mdcKey to mdcValue) {
                throw Exception(exceptionMessage)
            }
        }

        exception.message shouldBe exceptionMessage
        MDC.get(mdcKey) shouldBe null
    }

    "can log value classes" {
        val testLogger = TestLogger()

        val logger = getLogger(LoggingTests::class.java)
        logger.info("Testing {}", kv("complex", ComplexObject(Wrapped("123"))))

        val logEntry = testLogger.events.single()
        logEntry.formattedMessage shouldBe "Testing complex=ComplexObject(wrapped=Wrapped(value=123))"
    }
}) {
    @JvmInline
    value class Wrapped(val value: String)

    data class ComplexObject(val wrapped: Wrapped)
}
