package no.vegvesen.saga.modules.shared.caching

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.time.Duration.Companion.seconds
import kotlinx.coroutines.delay

class CacheUtilsTest : FunSpec({
    test("memoizeWithDuration") {
        var counter = 0
        val memoized = memoizeWithDuration(1.seconds) {
            counter += 1
            counter
        }
        memoized() shouldBe 1
        memoized() shouldBe 1
        delay(1.1.seconds)
        memoized() shouldBe 2
    }
})
