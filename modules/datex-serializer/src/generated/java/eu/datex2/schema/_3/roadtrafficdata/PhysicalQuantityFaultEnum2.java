
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalQuantityFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhysicalQuantityFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intermittentDataValues"/&gt;
 *     &lt;enumeration value="noDataValuesAvailable"/&gt;
 *     &lt;enumeration value="spuriousUnreliableDataValues"/&gt;
 *     &lt;enumeration value="unspecifiedOrUnknownFault"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalQuantityFaultEnum")
@XmlEnum
public enum PhysicalQuantityFaultEnum2 {

    @XmlEnumValue("intermittentDataValues")
    INTERMITTENT_DATA_VALUES("intermittentDataValues"),
    @XmlEnumValue("noDataValuesAvailable")
    NO_DATA_VALUES_AVAILABLE("noDataValuesAvailable"),
    @XmlEnumValue("spuriousUnreliableDataValues")
    SPURIOUS_UNRELIABLE_DATA_VALUES("spuriousUnreliableDataValues"),
    @XmlEnumValue("unspecifiedOrUnknownFault")
    UNSPECIFIED_OR_UNKNOWN_FAULT("unspecifiedOrUnknownFault"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PhysicalQuantityFaultEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalQuantityFaultEnum2 fromValue(String v) {
        for (PhysicalQuantityFaultEnum2 c: PhysicalQuantityFaultEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
