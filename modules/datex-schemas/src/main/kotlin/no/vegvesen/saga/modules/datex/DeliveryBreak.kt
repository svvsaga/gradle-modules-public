package no.vegvesen.saga.modules.datex

private object DeliveryBreakSubstrings {
    const val Datex2 = "<deliveryBreak>true</deliveryBreak>"
    val Datex3Regex = Regex("""<\w*:?value lang="en-us">Delivery break</\w*:?value>""")
    const val Datex3 = """<value lang="en-us">Delivery break</value>"""
}

fun containsDeliveryBreak(content: String) =
    content.contains(DeliveryBreakSubstrings.Datex2) || DeliveryBreakSubstrings.Datex3Regex.containsMatchIn(content)
