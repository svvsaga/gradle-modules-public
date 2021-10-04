package no.vegvesen.saga.modules.shared

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
