package no.vegvesen.saga.modules.datex

import arrow.core.Either
import eu.datex.v220.D2LogicalModel
import no.vegvesen.saga.datex.DatexSerializer

fun DatexSerializer.deserializeBytes(bytes: ByteArray): Either<Throwable, D2LogicalModel> = Either.catch {
    this.deserialize(bytes.inputStream())
}
