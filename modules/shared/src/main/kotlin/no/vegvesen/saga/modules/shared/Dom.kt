package no.vegvesen.saga.modules.shared

import java.util.HashMap
import org.w3c.dom.CharacterData
import org.w3c.dom.Node

fun extractChildElements(parent: Node?): HashMap<String, String> {
    var node = parent?.firstChild
    val elements = HashMap<String, String>()
    while (node != null && node.nodeName != "#text") {
        val nodeName = node.nodeName
        val valueNode = node.firstChild as CharacterData
        val nodeValue = valueNode.data
        elements[nodeName] = nodeValue
        node = node.nextSibling
    }
    return elements
}
