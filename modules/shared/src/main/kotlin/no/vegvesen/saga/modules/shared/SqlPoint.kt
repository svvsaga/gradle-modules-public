package no.vegvesen.saga.modules.shared

import kotlinx.serialization.Serializable

@Serializable
data class SqlPoint(val lat: Float, val lon: Float) {
    // https://cloud.google.com/bigquery/docs/reference/standard-sql/geography_functions#st_geogpoint
    override fun toString(): String = "POINT ($lon $lat)"
}
