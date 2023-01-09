package no.vegvesen.saga.modules.shared.test

import io.kotest.assertions.arrow.core.shouldBeRight
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldStartWith
import kotlinx.datetime.LocalDate
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import no.vegvesen.saga.modules.shared.functions.parseJsonParameters
import no.vegvesen.saga.modules.shared.functions.parseQueryParameters
import no.vegvesen.saga.modules.testing.shouldBeLeftAnd

@ExperimentalSerializationApi
class ParameterHelpersTests : FunSpec({
    test("can parse query parameters for serializable type") {
        val result = parseQueryParameters(
            MyParams.serializer(),
            mapOf(
                "anInt" to listOf("3"),
                "aString" to listOf("abc"),
                "aDate" to listOf("2020-01-01"),
                "aBool" to listOf("true"),
            ),
        )

        result shouldBeRight MyParams(3, "abc", LocalDate(2020, 1, 1), true)
    }

    test("parsing query parameters fails if any parameters are missing") {
        val result = parseQueryParameters(MyParams.serializer(), mapOf("anInt" to listOf("3")))

        result shouldBeLeftAnd { it.message shouldStartWith "Fields [aString, aDate, aBool] are required" }
    }

    test("parsing query parameters fails if any parameters are duplicate") {
        val result = parseQueryParameters(
            MyParams.serializer(),
            mapOf(
                "anInt" to listOf("3", "5"),
                "aString" to listOf("abc"),
                "aDate" to listOf("2020-01-01"),
                "aBool" to listOf("true"),
            ),
        )

        result shouldBeLeftAnd { it.message shouldStartWith "More than one query parameter" }
    }

    test("nullable params are optional") {
        val result = parseQueryParameters(MyNullableParams.serializer(), mapOf("aRequiredInt" to listOf("1")))

        result shouldBeRight MyNullableParams(1, null)
    }

    test("can parse json parameters") {
        val result =
            parseJsonParameters(
                MyParams.serializer(),
                """{"anInt":1,"aString":"a","aDate":"2021-01-01","aBool":true}""",
            )

        result shouldBeRight MyParams(1, "a", LocalDate(2021, 1, 1), true)
    }

    test("can parse nullable json parameters") {
        val result = parseJsonParameters(MyNullableParams.serializer(), """{"aRequiredInt":1}""")

        result shouldBeRight MyNullableParams(1)
    }
}) {
    @Serializable
    data class MyParams(val anInt: Int, val aString: String, val aDate: LocalDate, val aBool: Boolean)

    @Serializable
    data class MyNullableParams(val aRequiredInt: Int, val aNullableInt: Int? = null)
}
