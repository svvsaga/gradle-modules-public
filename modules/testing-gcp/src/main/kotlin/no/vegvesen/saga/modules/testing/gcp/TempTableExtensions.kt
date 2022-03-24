package no.vegvesen.saga.modules.testing.gcp

import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.gcp.bigquery.fetchRowCount

infix fun BigQueryTempTable.shouldHaveRowCount(count: Long) {
    bigQuery.fetchRowCount(tempDataset, tempTable) shouldBe count
}
