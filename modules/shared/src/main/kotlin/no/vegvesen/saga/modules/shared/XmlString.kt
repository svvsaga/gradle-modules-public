
package no.vegvesen.saga.modules.shared

@JvmInline
value class XmlString(val value: String)

fun String.toXmlString() = XmlString(this)
