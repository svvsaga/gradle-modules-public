
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationCodeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continent"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="junction"/&gt;
 *     &lt;enumeration value="countryGroup"/&gt;
 *     &lt;enumeration value="ringRoad"/&gt;
 *     &lt;enumeration value="intermediatePoint"/&gt;
 *     &lt;enumeration value="country"/&gt;
 *     &lt;enumeration value="firstOrderSegment"/&gt;
 *     &lt;enumeration value="otherLandmarkPoint"/&gt;
 *     &lt;enumeration value="secondOrderSegment"/&gt;
 *     &lt;enumeration value="waterArea"/&gt;
 *     &lt;enumeration value="urbanStreet"/&gt;
 *     &lt;enumeration value="fuzzyArea"/&gt;
 *     &lt;enumeration value="vehicularLink"/&gt;
 *     &lt;enumeration value="firstOrderArea"/&gt;
 *     &lt;enumeration value="secondOrderArea"/&gt;
 *     &lt;enumeration value="thirdOrderArea"/&gt;
 *     &lt;enumeration value="fourthOrderArea"/&gt;
 *     &lt;enumeration value="fifthOrderArea"/&gt;
 *     &lt;enumeration value="applicationRegion"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeTypeEnum")
@XmlEnum
public enum LocationCodeTypeEnum {

    @XmlEnumValue("continent")
    CONTINENT("continent"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("countryGroup")
    COUNTRY_GROUP("countryGroup"),
    @XmlEnumValue("ringRoad")
    RING_ROAD("ringRoad"),
    @XmlEnumValue("intermediatePoint")
    INTERMEDIATE_POINT("intermediatePoint"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("firstOrderSegment")
    FIRST_ORDER_SEGMENT("firstOrderSegment"),
    @XmlEnumValue("otherLandmarkPoint")
    OTHER_LANDMARK_POINT("otherLandmarkPoint"),
    @XmlEnumValue("secondOrderSegment")
    SECOND_ORDER_SEGMENT("secondOrderSegment"),
    @XmlEnumValue("waterArea")
    WATER_AREA("waterArea"),
    @XmlEnumValue("urbanStreet")
    URBAN_STREET("urbanStreet"),
    @XmlEnumValue("fuzzyArea")
    FUZZY_AREA("fuzzyArea"),
    @XmlEnumValue("vehicularLink")
    VEHICULAR_LINK("vehicularLink"),
    @XmlEnumValue("firstOrderArea")
    FIRST_ORDER_AREA("firstOrderArea"),
    @XmlEnumValue("secondOrderArea")
    SECOND_ORDER_AREA("secondOrderArea"),
    @XmlEnumValue("thirdOrderArea")
    THIRD_ORDER_AREA("thirdOrderArea"),
    @XmlEnumValue("fourthOrderArea")
    FOURTH_ORDER_AREA("fourthOrderArea"),
    @XmlEnumValue("fifthOrderArea")
    FIFTH_ORDER_AREA("fifthOrderArea"),
    @XmlEnumValue("applicationRegion")
    APPLICATION_REGION("applicationRegion"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LocationCodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeTypeEnum fromValue(String v) {
        for (LocationCodeTypeEnum c: LocationCodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
