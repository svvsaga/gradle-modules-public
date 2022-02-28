
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSecurityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingSecurityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="socialControl"/&gt;
 *     &lt;enumeration value="securityStaff"/&gt;
 *     &lt;enumeration value="externalSecurity"/&gt;
 *     &lt;enumeration value="cctv"/&gt;
 *     &lt;enumeration value="dog"/&gt;
 *     &lt;enumeration value="guard24hours"/&gt;
 *     &lt;enumeration value="lighting"/&gt;
 *     &lt;enumeration value="floodLight"/&gt;
 *     &lt;enumeration value="fences"/&gt;
 *     &lt;enumeration value="areaSeperatedFromSurroundings"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSecurityEnum")
@XmlEnum
public enum ParkingSecurityEnum {

    @XmlEnumValue("socialControl")
    SOCIAL_CONTROL("socialControl"),
    @XmlEnumValue("securityStaff")
    SECURITY_STAFF("securityStaff"),
    @XmlEnumValue("externalSecurity")
    EXTERNAL_SECURITY("externalSecurity"),
    @XmlEnumValue("cctv")
    CCTV("cctv"),
    @XmlEnumValue("dog")
    DOG("dog"),
    @XmlEnumValue("guard24hours")
    GUARD_24_HOURS("guard24hours"),
    @XmlEnumValue("lighting")
    LIGHTING("lighting"),
    @XmlEnumValue("floodLight")
    FLOOD_LIGHT("floodLight"),
    @XmlEnumValue("fences")
    FENCES("fences"),
    @XmlEnumValue("areaSeperatedFromSurroundings")
    AREA_SEPERATED_FROM_SURROUNDINGS("areaSeperatedFromSurroundings"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSecurityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSecurityEnum fromValue(String v) {
        for (ParkingSecurityEnum c: ParkingSecurityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
