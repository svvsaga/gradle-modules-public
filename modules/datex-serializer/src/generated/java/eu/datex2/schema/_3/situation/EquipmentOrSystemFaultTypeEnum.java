
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
@XmlType(name = "EquipmentOrSystemFaultTypeEnum")
@XmlEnum
public enum EquipmentOrSystemFaultTypeEnum {

    @XmlEnumValue("notWorking")
    NOT_WORKING("notWorking"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("workingIncorrectly")
    WORKING_INCORRECTLY("workingIncorrectly"),
    @XmlEnumValue("workingIntermittently")
    WORKING_INTERMITTENTLY("workingIntermittently"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    EquipmentOrSystemFaultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentOrSystemFaultTypeEnum fromValue(String v) {
        for (EquipmentOrSystemFaultTypeEnum c: EquipmentOrSystemFaultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
