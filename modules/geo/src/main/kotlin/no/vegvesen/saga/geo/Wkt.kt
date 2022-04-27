package no.vegvesen.saga.geo

import arrow.core.Either
import org.locationtech.jts.io.WKTReader

class Wkt {
    companion object {
        fun removeZCoordinates(wkt: String) =
            WKTReader().let {
                Either.catch { it.read(wkt).toText() }
            }
    }
}
