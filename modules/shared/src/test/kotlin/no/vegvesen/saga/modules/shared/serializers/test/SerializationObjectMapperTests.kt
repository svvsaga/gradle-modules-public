package no.vegvesen.saga.modules.shared.serializers.test

import io.kotest.assertions.throwables.shouldThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.Serializable
import no.vegvesen.saga.modules.shared.serializers.SerializationObjectMapper.mapObject
import kotlin.test.assertEquals

@Serializable
private data class TypeA(
    val a: String,
    val b: Int,
    val c: Boolean?
)

// Same structure as A
@Serializable
private data class TypeB(
    val a: String,
    val b: Int,
    val c: Boolean? = null
)

// Same properties as A, but different types
@Serializable
private data class TypeC(
    val a: Int,
    val b: String,
    val c: Boolean?
)

// Same as A with extra field
@Serializable
private data class TypeD(
    val a: String,
    val d: Short = 1,
    val b: Int,
    val c: Boolean?,
)

class SerializationObjectMapperTests : FunSpec({
    val testA = "testA"
    val testB = 12
    val testC = false

    test("Can map to itself") {
        val a = TypeA(testA, testB, testC)
        val res = mapObject(TypeA.serializer(), TypeA.serializer(), a)

        assertEquals(a, res)
    }

    test("Can map to structurally equal type") {
        val a = TypeA(testA, testB, testC)
        val res: TypeB = mapObject(TypeA.serializer(), TypeB.serializer(), a)

        assertEquals(TypeB(testA, testB, testC), res)
    }

    test("Should handle null values with default values") {
        val a = TypeA(testA, testB, null)
        val res: TypeB = mapObject(TypeA.serializer(), TypeB.serializer(), a)

        assertEquals(TypeB(testA, testB, null), res)
    }

    test("Fail to map to structurally different type") {
        val a = TypeA(testA, testB, true)
        shouldThrowAny {
            mapObject(TypeA.serializer(), TypeC.serializer(), a)
        }
    }

    test("Should be able to map to object with extra fields with default values") {
        val a = TypeA(testA, testB, testC)
        val res: TypeD = mapObject(TypeA.serializer(), TypeD.serializer(), a)

        assertEquals(TypeD(testA, 1, testB, testC), res)
    }
})