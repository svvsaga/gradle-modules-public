package no.vegvesen.saga.modules.datex

import arrow.core.left
import ch.qos.logback.classic.Level
import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldHaveSingleElement
import io.mockk.coEvery
import io.mockk.mockk
import no.vegvesen.saga.modules.shared.services.DeadLetterStorage
import no.vegvesen.saga.modules.testing.TestLogger

class DatexIngestProcessorTests : FunSpec({
    test("DeliveryBreak is logged as warning but not failed") {
        val testLogger = TestLogger()
        val deadLetterStorage = mockk<DeadLetterStorage>()
        val poller = mockk<DatexPoller> { coEvery { pollDatex(any()) } returns DatexError.DeliveryBreak.left() }
        val testSubject = DatexIngestProcessor(poller, deadLetterStorage)

        val result = testSubject.process()

        result.shouldBeRight()
        testLogger.events shouldHaveSingleElement {
            it.level == Level.WARN && it.formattedMessage.contains(
                "deliverybreak",
                true
            )
        }
    }
})
