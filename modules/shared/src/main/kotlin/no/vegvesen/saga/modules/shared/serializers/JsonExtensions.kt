package no.vegvesen.saga.modules.shared.serializers

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.longOrNull

@Suppress("UNCHECKED_CAST")
fun <T : JsonElement> T.withoutNulls(): T = when (this) {
    is JsonObject -> JsonObject(this.filterNot { it.value is JsonNull }.mapValues { it.value.withoutNulls() }) as T
    is JsonArray -> JsonArray(this.filterNot { it is JsonNull }.map { it.withoutNulls() }) as T
    else -> this
}

fun JsonElement.replacePrimitive(): Any = when (this) {
    is JsonObject -> replacePrimitives()
    is JsonArray -> replacePrimitives()
    is JsonPrimitive -> if (isString) contentOrNull
        ?: throw Exception("Unsupported JsonPrimitive: $this")
    else
        booleanOrNull ?: doubleOrNull ?: longOrNull ?: contentOrNull
            ?: throw Exception("Unsupported JsonPrimitive: $this")
}

fun JsonArray.replacePrimitives(): List<Any> = this.map {
    it.replacePrimitive()
}

fun JsonObject.replacePrimitives(): Map<String, Any> = this.mapValues {
    it.value.replacePrimitive()
}