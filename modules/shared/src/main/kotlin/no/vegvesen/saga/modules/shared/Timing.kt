package no.vegvesen.saga.modules.shared

import org.slf4j.Logger

object Timing {

    inline fun <T> withLoggingTimer(logger: Logger, description: String, fn: () -> T): T {
        val start = System.currentTimeMillis()
        logger.info("Timer: '$description', starting.")
        val result = fn()
        val end = System.currentTimeMillis()
        val timeSpent = end - start
        logger.info(
            "Timer: '$description', took $timeSpent ms.",
            kv("unit", "ms"),
            kv("timer", description),
            kv("timeSpent", timeSpent)
        )
        return result
    }
}
