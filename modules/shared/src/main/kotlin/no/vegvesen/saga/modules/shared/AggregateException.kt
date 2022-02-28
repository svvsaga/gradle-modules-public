package no.vegvesen.saga.modules.shared

import arrow.core.NonEmptyList

data class AggregateException(override val message: String, val exceptions: NonEmptyList<Throwable>) :
    Exception(message)
