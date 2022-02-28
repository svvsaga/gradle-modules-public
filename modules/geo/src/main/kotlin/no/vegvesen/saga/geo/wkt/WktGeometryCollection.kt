package no.vegvesen.saga.geo.wkt

class WktGeometryCollection(collection: List<WktGeometry>) :
    WktGeometry(
        collection.mapNotNull { it.round() }
            .joinToString(","),
        "geometrycollection"
    )