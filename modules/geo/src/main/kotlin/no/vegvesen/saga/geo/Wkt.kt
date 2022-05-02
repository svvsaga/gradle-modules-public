package no.vegvesen.saga.geo

import arrow.core.Either
import org.locationtech.jts.geom.CoordinateFilter
import org.locationtech.jts.io.WKTReader

class Wkt {
    companion object {
        private val wktReader = WKTReader()

        private val flipXyCoordinatesFilter = CoordinateFilter { coordinate ->
            val x = coordinate.x
            coordinate.x = coordinate.y
            coordinate.y = x
        }

        /**
         * Converts 3D coordinates to 2D coordinates, collapses invalid geometry to POINT, and optionally flips X and Y.
         */
        fun prepareForBigQuery(wkt: String, flipXy: Boolean) = Either.catch {
            wktReader.read(wkt)
                .let { if (it.isValid) it else it.centroid }
                .also {
                    if (flipXy) {
                        it.apply(flipXyCoordinatesFilter)
                        it.geometryChanged()
                    }
                }
                .toText()
        }
    }
}
