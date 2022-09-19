package no.vegvesen.saga.modules.shared

import java.util.Locale
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/**
 * Throws an [IllegalArgumentException] if the [value] is null or empty. Otherwise returns the not null value.
 */
@ExperimentalContracts
fun requireNotEmpty(value: String?): String {
    contract {
        returns() implies (value != null)
    }
    if (value.isNullOrEmpty()) {
        throw IllegalArgumentException("Required value was null or empty.")
    }
    return value
}

fun String.capitalized(): String = if (firstOrNull()?.isLowerCase() == true) {
    this.replaceFirstChar {
        it.titlecase(Locale.getDefault())
    }
} else {
    this
}
