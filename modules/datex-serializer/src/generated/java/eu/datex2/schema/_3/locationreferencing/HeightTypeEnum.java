
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeightTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HeightTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ellipsoidalHeight"/&gt;
 *     &lt;enumeration value="gravityRelatedHeight"/&gt;
 *     &lt;enumeration value="relativeHeight"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightTypeEnum")
@XmlEnum
public enum HeightTypeEnum {

    @XmlEnumValue("ellipsoidalHeight")
    ELLIPSOIDAL_HEIGHT("ellipsoidalHeight"),
    @XmlEnumValue("gravityRelatedHeight")
    GRAVITY_RELATED_HEIGHT("gravityRelatedHeight"),
    @XmlEnumValue("relativeHeight")
    RELATIVE_HEIGHT("relativeHeight"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightTypeEnum fromValue(String v) {
        for (HeightTypeEnum c: HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
