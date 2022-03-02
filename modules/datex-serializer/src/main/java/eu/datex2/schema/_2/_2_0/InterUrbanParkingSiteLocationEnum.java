
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterUrbanParkingSiteLocationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InterUrbanParkingSiteLocationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="motorway"/&gt;
 *     &lt;enumeration value="nearbyMotorway"/&gt;
 *     &lt;enumeration value="layBy"/&gt;
 *     &lt;enumeration value="onStreet"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterUrbanParkingSiteLocationEnum")
@XmlEnum
public enum InterUrbanParkingSiteLocationEnum {

    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("nearbyMotorway")
    NEARBY_MOTORWAY("nearbyMotorway"),
    @XmlEnumValue("layBy")
    LAY_BY("layBy"),
    @XmlEnumValue("onStreet")
    ON_STREET("onStreet"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    InterUrbanParkingSiteLocationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterUrbanParkingSiteLocationEnum fromValue(String v) {
        for (InterUrbanParkingSiteLocationEnum c: InterUrbanParkingSiteLocationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
