package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.flatMap
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.XmlString
import org.slf4j.Logger

class WrongDatexVersionException(message: String) : Exception(message)

fun validDatex2OrThrowable(bytes: ByteArray, datexValidator: DatexValidator): Either<Exception, ByteArray> =
    datexValidator.validateDatexDoc(XmlString(bytes.toString(Charsets.UTF_8)))
        .mapLeft { Exception("Document did not pass Datex Validation: ${it.message}") }
        .flatMap {
            if (it == DatexVersion.DATEX_2_3) bytes.right()
            else WrongDatexVersionException("Only DatexII 2.3 is supported, but got: $it").left()
        }

fun swallowWrongDatexVersionExceptionAfterLogging(throwable: Throwable, logger: Logger): Either<Throwable, Unit> =
    when (throwable) {
        is WrongDatexVersionException -> {
            logger.error(throwable.message)
            Unit.right()
        }
        else -> throwable.left()
    }
