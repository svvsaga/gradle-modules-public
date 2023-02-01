package no.vegvesen.saga.modules.shared

import kotlin.reflect.full.companionObject
import net.logstash.logback.argument.StructuredArgument
import net.logstash.logback.argument.StructuredArguments
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.MDC

fun getLogger(forClass: Class<*>): Logger =
    LoggerFactory.getLogger(forClass)

fun <T : Any> getClassForLogging(javaClass: Class<T>): Class<*> =
    javaClass.enclosingClass?.takeIf { it.kotlin.companionObject?.java == javaClass } ?: javaClass

@Suppress("unused")
inline fun <reified T : Logging> T.log(): Logger =
    getLogger(getClassForLogging(T::class.java))

/** Marker interface allowing `log()` extension method */
interface Logging

/**
 * Wrapping Logback's StructuredArgument.kv to avoid direct transitive coupling.
 *
 * NOTE: If you use "message" as key, the value you provide will be concatenated
 * with the log statement itself, which the call to kv("message", ..) is part of.
 * This happens as the log message itself is part of the `jsonPayload` under the
 * field `jsonPayload.message` when structured logging is used on gcp. Hence,
 * logback will concatenate the kv("message", ..) value with it, as `jsonPayload`
 * cannot have multiple keys with the name "message".
 */
fun kv(key: String, value: Any): StructuredArgument {
    return StructuredArguments.kv(key, value)
}

fun v(key: String, value: Any): StructuredArgument {
    return StructuredArguments.v(key, value)
}

inline fun <T> withMappedDiagnosticContext(
    vararg loggedProperties: Pair<String, String>,
    func: () -> T
): T =
    try {
        loggedProperties.forEach {
            MDC.put(it.first, it.second)
        }
        func()
    } finally {
        loggedProperties.forEach {
            MDC.remove(it.first)
        }
    }
