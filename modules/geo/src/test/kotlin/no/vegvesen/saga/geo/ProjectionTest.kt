package no.vegvesen.saga.geo

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class ProjectionTest : StringSpec({
    "it converts from utm 33 to wgs84 with precision of at least 0.11m" {
        Projections.Epsg32633toEpsg4326.convert(180418.0, 6548885.0)
            .let { (x: Double, y: Double) ->
                // https://www.usna.edu/Users/oceano/pguth/md_help/html/approx_equivalents.htm
                x.shouldBe(9.43981027974966.plusOrMinus(0.000001))
                y.shouldBe(58.9598628928298.plusOrMinus(0.000001))
            }
    }

    "it converts using the provided coordinate transform" {
        Projections.Epsg25833toEpsg4326.convert(180418.0, 6548885.0)
            .let { (x: Double, y: Double) ->
                x.shouldBe(9.439810276565302)
                y.shouldBe(58.95986289647446)
            }
    }
})