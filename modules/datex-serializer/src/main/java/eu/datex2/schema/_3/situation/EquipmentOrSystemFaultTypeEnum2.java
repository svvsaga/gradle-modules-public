
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentOrSystemFaultTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EquipmentOrSystemFaultTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notWorking"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="workingIncorrectly"/&gt;
 *     &lt;enumeration value="workingIntermittently"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentOrSystemFaultTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum EquipmentOrSystemFaultTypeEnum2 {


    /**
     * Not working or functioning.
     * 
     */
    @XmlEnumValue("notWorking")
    NOT_WORKING("notWorking"),

    /**
     * Out of service (usually for operational reasons).
     * 
     */
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),

    /**
     * Working incorrectly.
     * 
     */
    @XmlEnumValue("workingIncorrectly")
    WORKING_INCORRECTLY("workingIncorrectly"),

    /**
     * Working intermittently.
     * 
     */
    @XmlEnumValue("workingIntermittently")
    WORKING_INTERMITTENTLY("workingIntermittently"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    EquipmentOrSystemFaultTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemFaultTypeEnum2 fromValue(String v) {
        for (EquipmentOrSystemFaultTypeEnum2 c: EquipmentOrSystemFaultTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}