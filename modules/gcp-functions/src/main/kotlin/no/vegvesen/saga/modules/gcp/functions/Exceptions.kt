package no.vegvesen.saga.modules.gcp.functions

class AuthenticationException(override val message: String? = null, override val cause: Throwable? = null) :
    Exception(message, cause)

class AuthorizationException(override val message: String? = null, override val cause: Throwable? = null) :
    Exception(message, cause)

class ValidationException(
    override val message: String? = "Input validation failed",
    override val cause: Throwable? = null
) : Exception(message, cause)
