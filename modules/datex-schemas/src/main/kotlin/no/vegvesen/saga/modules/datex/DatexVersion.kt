package no.vegvesen.saga.modules.datex

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import no.vegvesen.saga.modules.shared.XmlString

enum class DatexVersion {
    DATEX_2,
    DATEX_3
}

fun findDatexVersion(xml: XmlString): Either<Throwable, DatexVersion> =
    if (xml.value.contains("http://datex2.eu/schema/2/")) {
        DatexVersion.DATEX_2.right()
    } else if (xml.value.contains("http://datex2.eu/schema/3/")) {
        DatexVersion.DATEX_3.right()
    } else {
        Exception("Unknown DATEX version: $xml").left()
    }
