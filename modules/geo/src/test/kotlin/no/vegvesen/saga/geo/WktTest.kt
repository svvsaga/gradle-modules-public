package no.vegvesen.saga.geo

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.StringSpec

class WktTest : StringSpec({

    "removes z coordinate from wkt string so BQ understands it" {
        val wkt = "LINESTRING Z (62.621656 9.765524 558.769, 62.62173 9.765708 558.934)"
        Wkt.removeZCoordinates(wkt)
            .shouldBeRight("LINESTRING (62.621656 9.765524, 62.62173 9.765708)")
    }
})
