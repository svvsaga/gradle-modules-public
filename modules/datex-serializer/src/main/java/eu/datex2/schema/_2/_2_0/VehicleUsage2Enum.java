
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleUsage2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleUsage2Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cityLogistics"/&gt;
 *     &lt;enumeration value="carSharing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsage2Enum")
@XmlEnum
public enum VehicleUsage2Enum {

    @XmlEnumValue("cityLogistics")
    CITY_LOGISTICS("cityLogistics"),
    @XmlEnumValue("carSharing")
    CAR_SHARING("carSharing");
    private final String value;

    VehicleUsage2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsage2Enum fromValue(String v) {
        for (VehicleUsage2Enum c: VehicleUsage2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
