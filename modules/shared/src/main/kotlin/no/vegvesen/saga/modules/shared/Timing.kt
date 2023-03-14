package no.vegvesen.saga.modules.shared

import org.slf4j.Logger

object Timing {
    inline fun <T> withLoggingTimer(logger: Logger, description: String, fn: () -> T): T {
        val start = System.currentTimeMillis()
        logger.info("Timer: '$description', starting.")
        return try {
            fn()
        } finally {
            val end = System.currentTimeMillis()
            val timeSpent = end - start
            logger.info(
                "Timer: '$description', took $timeSpent ms.",
                kv("unit", "ms"),
                kv("timer", description),
                kv("timeSpent", timeSpent)
            )
        }
    }

    inline fun <T> Logger.measureTime(description: String, fn: () -> T) = withLoggingTimer(this, description, fn)
}
