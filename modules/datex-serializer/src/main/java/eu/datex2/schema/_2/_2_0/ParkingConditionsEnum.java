
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingConditionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingConditionsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normalParkingConditionsSuspended"/&gt;
 *     &lt;enumeration value="specialParkingConditionsInForce"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingConditionsEnum")
@XmlEnum
public enum ParkingConditionsEnum {

    @XmlEnumValue("normalParkingConditionsSuspended")
    NORMAL_PARKING_CONDITIONS_SUSPENDED("normalParkingConditionsSuspended"),
    @XmlEnumValue("specialParkingConditionsInForce")
    SPECIAL_PARKING_CONDITIONS_IN_FORCE("specialParkingConditionsInForce"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingConditionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingConditionsEnum fromValue(String v) {
        for (ParkingConditionsEnum c: ParkingConditionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
