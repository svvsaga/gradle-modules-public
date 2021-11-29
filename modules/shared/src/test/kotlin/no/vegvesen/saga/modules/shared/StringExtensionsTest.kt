package no.vegvesen.saga.modules.shared

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs

class StringExtensionsTest : FunSpec({
    test("capitalized on already capitalized string") {
        val testString = "String"
        testString.capitalized() shouldBe testString
    }

    test("capitalized on already capitalized string should return same object") {
        val testString = "String"
        testString.capitalized() shouldBeSameInstanceAs testString
    }

    test("capitalized should not touch empty string") {
        val testString = ""
        testString.capitalized() shouldBeSameInstanceAs testString
    }

    test("capitalized should capitalize") {
        val testString = "string"
        testString.capitalized() shouldBe "String"
    }
})
