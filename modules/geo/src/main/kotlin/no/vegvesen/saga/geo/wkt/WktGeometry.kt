package no.vegvesen.saga.geo.wkt

import org.locationtech.jts.geom.PrecisionModel
import org.locationtech.jts.io.WKTReader
import org.locationtech.jts.io.WKTWriter
import org.locationtech.jts.precision.GeometryPrecisionReducer

sealed class WktGeometry(val coordinates: String?, val type: String) {

    // A scale of 100000 means that we round to five decimal places, which gives a precision of roughly 1 meters
    private val precisionModel = PrecisionModel(100000.0)
    private val geometryPrecisionReducer = GeometryPrecisionReducer(precisionModel)
    private val wktReader = WKTReader()
    private val wktWriter = WKTWriter()

    fun round(): String? =
        if (coordinates.isNullOrBlank()) {
            null
        } else {
            coordinates.let {
                wktReader.read("${type.uppercase()} ($coordinates)")
                    .let(geometryPrecisionReducer::reduce)
                    .let(wktWriter::write)
            }
        }
}