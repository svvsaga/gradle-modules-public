
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanParkingSiteTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UrbanParkingSiteTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onStreetParking"/&gt;
 *     &lt;enumeration value="offStreetParking"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrbanParkingSiteTypeEnum")
@XmlEnum
public enum UrbanParkingSiteTypeEnum {

    @XmlEnumValue("onStreetParking")
    ON_STREET_PARKING("onStreetParking"),
    @XmlEnumValue("offStreetParking")
    OFF_STREET_PARKING("offStreetParking"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UrbanParkingSiteTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrbanParkingSiteTypeEnum fromValue(String v) {
        for (UrbanParkingSiteTypeEnum c: UrbanParkingSiteTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
