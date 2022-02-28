
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ElaboratedDataFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intermittentDataValues"/&gt;
 *     &lt;enumeration value="noDataValuesAvailable"/&gt;
 *     &lt;enumeration value="spuriousUnreliableDataValues"/&gt;
 *     &lt;enumeration value="unspecifiedOrUnknownFault"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ElaboratedDataFaultEnum")
@XmlEnum
public enum ElaboratedDataFaultEnum {

    @XmlEnumValue("intermittentDataValues")
    INTERMITTENT_DATA_VALUES("intermittentDataValues"),
    @XmlEnumValue("noDataValuesAvailable")
    NO_DATA_VALUES_AVAILABLE("noDataValuesAvailable"),
    @XmlEnumValue("spuriousUnreliableDataValues")
    SPURIOUS_UNRELIABLE_DATA_VALUES("spuriousUnreliableDataValues"),
    @XmlEnumValue("unspecifiedOrUnknownFault")
    UNSPECIFIED_OR_UNKNOWN_FAULT("unspecifiedOrUnknownFault"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ElaboratedDataFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElaboratedDataFaultEnum fromValue(String v) {
        for (ElaboratedDataFaultEnum c: ElaboratedDataFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
