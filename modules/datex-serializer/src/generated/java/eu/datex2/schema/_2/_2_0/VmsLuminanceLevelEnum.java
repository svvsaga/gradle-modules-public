
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsLuminanceLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsLuminanceLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="switchedOff"/&gt;
 *     &lt;enumeration value="testing"/&gt;
 *     &lt;enumeration value="night"/&gt;
 *     &lt;enumeration value="overcast"/&gt;
 *     &lt;enumeration value="broadDaylight"/&gt;
 *     &lt;enumeration value="sunInEyes"/&gt;
 *     &lt;enumeration value="sunOnBack"/&gt;
 *     &lt;enumeration value="foggyDay"/&gt;
 *     &lt;enumeration value="foggyNight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsLuminanceLevelEnum")
@XmlEnum
public enum VmsLuminanceLevelEnum {

    @XmlEnumValue("switchedOff")
    SWITCHED_OFF("switchedOff"),
    @XmlEnumValue("testing")
    TESTING("testing"),
    @XmlEnumValue("night")
    NIGHT("night"),
    @XmlEnumValue("overcast")
    OVERCAST("overcast"),
    @XmlEnumValue("broadDaylight")
    BROAD_DAYLIGHT("broadDaylight"),
    @XmlEnumValue("sunInEyes")
    SUN_IN_EYES("sunInEyes"),
    @XmlEnumValue("sunOnBack")
    SUN_ON_BACK("sunOnBack"),
    @XmlEnumValue("foggyDay")
    FOGGY_DAY("foggyDay"),
    @XmlEnumValue("foggyNight")
    FOGGY_NIGHT("foggyNight");
    private final String value;

    VmsLuminanceLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsLuminanceLevelEnum fromValue(String v) {
        for (VmsLuminanceLevelEnum c: VmsLuminanceLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
