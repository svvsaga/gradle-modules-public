package no.vegvesen.saga.modules.testing

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant

class FixedClockTest : FunSpec({

    test("Fixed clock keeps clock at instant") {
        val instant = Instant.parse("2021-11-03T12:00:00Z")
        val fixedClock = instant.fixedClock()
        fixedClock.now() shouldBe instant
        fixedClock.now() shouldBe fixedClock.now()
    }
})