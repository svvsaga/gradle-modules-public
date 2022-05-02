package no.vegvesen.saga.geo

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.StringSpec

class WktTest : StringSpec({
    "removes z coordinate from wkt string so BQ understands it" {
        val wkt = "LINESTRING Z (62.621656 9.765524 558.769, 62.62173 9.765708 558.934)"
        Wkt.prepareForBigQuery(wkt, false)
            .shouldBeRight("LINESTRING (62.621656 9.765524, 62.62173 9.765708)")
    }

    "collapses invalid linestrings to point" {
        val wkt = "LINESTRING Z (62.621656 9.765524 558.769, 62.621656 9.765524 558.768)"
        Wkt.prepareForBigQuery(wkt, false)
            .shouldBeRight("POINT (62.621656 9.765524)")
    }

    "flips X and Y if flipXy is true" {
        val wkt = "LINESTRING Z (62.621656 9.765524 558.769, 62.62173 9.765708 558.934)"
        Wkt.prepareForBigQuery(wkt, true)
            .shouldBeRight("LINESTRING (9.765524 62.621656, 9.765708 62.62173)")
    }
})
