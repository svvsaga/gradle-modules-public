package no.vegvesen.saga.modules.datex

import no.vegvesen.saga.modules.shared.XmlString

abstract class DatexPollerError

sealed class DatexError : DatexPollerError() {
    data class MissingPublicationTimeError(val message: String, val document: XmlString) : DatexError()
    data class Exception(val message: String, val exception: Throwable) : DatexError()
    data class AuthError(val message: String, val httpCode: Int, val exception: Throwable? = null) : DatexError()
    data class HttpError(val message: String, val httpCode: Int) : DatexError()
    data class ValidationError(val message: String, val document: XmlString) : DatexError()
    object DeliveryBreak : DatexError()
    object NoNewDataAvailable : DatexError()
}

sealed class DatexStorageError : DatexPollerError() {
    data class Exception(val message: String, val exception: Throwable) : DatexStorageError()
    data class UnknownError(val message: String, val error: Any) : DatexStorageError()
}