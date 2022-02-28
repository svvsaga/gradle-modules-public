package no.vegvesen.saga.modules.shared.test

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import no.vegvesen.saga.modules.shared.gzipCompress
import no.vegvesen.saga.modules.shared.gzipDecompress

class ZipTests : StringSpec({
    "can zip and unzip text" {
        String(gzipDecompress(gzipCompress("test".toByteArray()))) shouldBe "test"
    }
})