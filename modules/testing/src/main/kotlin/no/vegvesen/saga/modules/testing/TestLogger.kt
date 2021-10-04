package no.vegvesen.saga.modules.testing

import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase

class TestLogger : AppenderBase<ILoggingEvent>() {
    companion object {
        private val events = mutableListOf<ILoggingEvent>()
    }

    val events: List<ILoggingEvent> get() = TestLogger.events

    init {
        TestLogger.events.clear()
    }

    override fun append(eventObject: ILoggingEvent) {
        TestLogger.events.add(eventObject)
    }
}
