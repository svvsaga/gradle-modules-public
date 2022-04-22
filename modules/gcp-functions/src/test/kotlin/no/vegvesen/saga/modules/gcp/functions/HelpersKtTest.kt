package no.vegvesen.saga.modules.gcp.functions

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.Serializable
import no.vegvesen.saga.modules.shared.functions.parseJsonParameters

@Serializable
data class Foo(val bar: String? = null)

class ParseParametersTest : FunSpec({
    test("can parse empty parameter") {
        parseJsonParameters(Foo.serializer(), "") shouldBeRight Foo()
    }
})
