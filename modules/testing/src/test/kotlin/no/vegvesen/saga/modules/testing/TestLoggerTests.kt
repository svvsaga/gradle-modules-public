package no.vegvesen.saga.modules.testing

import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.shared.Logging
import no.vegvesen.saga.modules.shared.log
import org.junit.jupiter.api.Test

class TestLoggerTests : Logging {
    private val testLogger = TestLogger()

    @Test
    fun `TestLogger records logging`() {
        log().info("Hello")

        testLogger.events shouldHaveSize 1
        testLogger.events[0].message shouldBe "Hello"
    }

    // Run whole class to make sure this tests that testlogger is cleared
    @Test
    fun `TestLogger is cleared between tests`() {
        log().info("Something")
        log().info("Something else")

        testLogger.events shouldHaveSize 2
    }
}
