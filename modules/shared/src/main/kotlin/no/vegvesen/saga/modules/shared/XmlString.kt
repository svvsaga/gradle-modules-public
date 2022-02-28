package no.vegvesen.saga.modules.shared

@JvmInline
value class XmlString(val value: String) {
    // For easier string interpolation
    override fun toString(): String = value
}

fun String.toXmlString() = XmlString(this)
