
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
public enum HeightTypeEnum2 {


    /**
     * Value measured vertically above the reference ellipsoid
     * 
     */
    @XmlEnumValue("ellipsoidalHeight")
    ELLIPSOIDAL_HEIGHT("ellipsoidalHeight"),

    /**
     * Height type corresponding a value measured along direction of gravity above the
     *             reference geoid i.e. equipotential surface of the Earth's gravity field which globally
     *             approximates mean sea level.
     *           
     * 
     */
    @XmlEnumValue("gravityRelatedHeight")
    GRAVITY_RELATED_HEIGHT("gravityRelatedHeight"),

    /**
     * Height type corresponding to value masured vertically above the ground level at
     *             this point.
     *           
     * 
     */
    @XmlEnumValue("relativeHeight")
    RELATIVE_HEIGHT("relativeHeight"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    HeightTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightTypeEnum2 fromValue(String v) {
        for (HeightTypeEnum2 c: HeightTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
