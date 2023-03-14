package no.vegvesen.saga.modules.shared

import arrow.core.Either
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.shared.Timing.withLoggingTimer
import no.vegvesen.saga.modules.testing.TestLogger
import org.slf4j.LoggerFactory

class TimingTest : FunSpec({

    test("Logs timing duration even when exceptions are thrown") {
        val testLogger = TestLogger()

        Either.catch {
            withLoggingTimer(LoggerFactory.getLogger("some-logger"), "logging") {
                throw Exception("intentional")
            }
        }

        testLogger.events.size shouldBe 2
    }
})
