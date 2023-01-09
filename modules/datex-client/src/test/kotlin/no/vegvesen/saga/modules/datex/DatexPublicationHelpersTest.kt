package no.vegvesen.saga.modules.datex

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlinx.datetime.Instant
import no.vegvesen.saga.modules.shared.blobstorage.StoragePath

class DatexPublicationHelpersTest : FunSpec({
    test("processed publication path is created correctly from publication time") {
        val publicationTime = Instant.parse("2020-01-02T12:13:14.456Z")
        val processedBucket = "my-project_processed-publications"

        createProcessedPublicationPath(
            processedBucket,
            "maaledata",
            publicationTime,
        ) shouldBe StoragePath(processedBucket, "maaledata/2020_01/2020-01-02T12-13-14.456.xml")
    }
})
