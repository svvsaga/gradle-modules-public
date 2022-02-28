package no.vegvesen.saga.modules.shared.serializers.test

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import no.vegvesen.saga.modules.shared.serializers.replacePrimitive
import no.vegvesen.saga.modules.shared.serializers.withoutNulls

/**
Note: these must be top level for now to workaround:
https://youtrack.jetbrains.com/issue/KT-45119
 */
@Serializable
private data class Address(val street: String, val streetNumber: Int?)

@Serializable
private data class Person(
    val firstName: String,
    val lastName: String,
    val middleName: String?,
    val addresses: List<Address>
)

@Serializable
private data class Product(val id: String)

class JsonExtensionsTests : StringSpec({
    val person = Person("Ola", "Normann", middleName = null, addresses = listOf(Address("Norgesvegen", null)))
    val encoded = Json.encodeToJsonElement(Person.serializer(), person)

    "can remove nulls" {
        encoded.withoutNulls()
            .toString() shouldBe """{"firstName":"Ola","lastName":"Normann","addresses":[{"street":"Norgesvegen"}]}"""
    }

    "can replace primitives" {
        encoded.withoutNulls().replacePrimitive() shouldBe mapOf(
            "firstName" to "Ola",
            "lastName" to "Normann",
            "addresses" to listOf(mapOf("street" to "Norgesvegen"))
        )
    }

    "will not coerce string numbers to number" {
        val encodedProduct = Json.encodeToJsonElement(Product.serializer(), Product("01234"))

        encodedProduct.replacePrimitive() shouldBe mapOf(
            "id" to "01234"
        )
    }
})
