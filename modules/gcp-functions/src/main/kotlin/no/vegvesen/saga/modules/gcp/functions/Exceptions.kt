package no.vegvesen.saga.modules.gcp.functions

class AuthenticationException(override val message: String?) : Exception(message)

class AuthorizationException(override val message: String?) : Exception(message)

class ValidationException(override val cause: Throwable?) : Exception("Input validation failed", cause)
