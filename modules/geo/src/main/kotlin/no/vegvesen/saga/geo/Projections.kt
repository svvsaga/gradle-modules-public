package no.vegvesen.saga.geo

import org.locationtech.proj4j.CRSFactory
import org.locationtech.proj4j.CoordinateTransform
import org.locationtech.proj4j.CoordinateTransformFactory
import org.locationtech.proj4j.ProjCoordinate

object Projections {

    private val factory = CRSFactory()
    private val coordinateTransformFactory = CoordinateTransformFactory()

    val Epsg32633toEpsg4326: CoordinateTransform =
        coordinateTransformFactory.createTransform(
            factory.createFromName("EPSG:32633"),
            factory.createFromName("EPSG:4326")
        )

    val Epsg25833toEpsg4326: CoordinateTransform =
        coordinateTransformFactory.createTransform(
            factory.createFromName("EPSG:25833"),
            factory.createFromName("EPSG:4326")
        )
}

fun CoordinateTransform.convert(x: Double, y: Double) =
    ProjCoordinate()
        .also { this.transform(ProjCoordinate(x, y), it) }
        .let { doubleArrayOf(it.x, it.y) }
