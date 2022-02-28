package no.vegvesen.saga.modules.testing

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

class FixedClock(private val instant: Instant) : Clock {
    override fun now() = instant
}

fun Instant.fixedClock() = FixedClock(this)