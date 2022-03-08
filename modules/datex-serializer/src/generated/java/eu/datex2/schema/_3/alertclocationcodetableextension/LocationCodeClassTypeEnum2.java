
package eu.datex2.schema._3.alertclocationcodetableextension;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeClassTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LocationCodeClassTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="area"/&gt;
 *     &lt;enumeration value="line"/&gt;
 *     &lt;enumeration value="point"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeClassTypeEnum")
@XmlEnum
public enum LocationCodeClassTypeEnum2 {

    @XmlEnumValue("area")
    AREA("area"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("point")
    POINT("point"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    LocationCodeClassTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeClassTypeEnum2 fromValue(String v) {
        for (LocationCodeClassTypeEnum2 c: LocationCodeClassTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
