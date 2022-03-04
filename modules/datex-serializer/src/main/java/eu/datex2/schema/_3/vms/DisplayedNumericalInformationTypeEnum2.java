
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayedNumericalInformationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DisplayedNumericalInformationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="distance"/&gt;
 *     &lt;enumeration value="height"/&gt;
 *     &lt;enumeration value="length"/&gt;
 *     &lt;enumeration value="rateOfIncline"/&gt;
 *     &lt;enumeration value="sectionLength"/&gt;
 *     &lt;enumeration value="speed"/&gt;
 *     &lt;enumeration value="weight"/&gt;
 *     &lt;enumeration value="weightPerAxle"/&gt;
 *     &lt;enumeration value="width"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisplayedNumericalInformationTypeEnum")
@XmlEnum
public enum DisplayedNumericalInformationTypeEnum2 {

    @XmlEnumValue("distance")
    DISTANCE("distance"),
    @XmlEnumValue("height")
    HEIGHT("height"),
    @XmlEnumValue("length")
    LENGTH("length"),
    @XmlEnumValue("rateOfIncline")
    RATE_OF_INCLINE("rateOfIncline"),
    @XmlEnumValue("sectionLength")
    SECTION_LENGTH("sectionLength"),
    @XmlEnumValue("speed")
    SPEED("speed"),
    @XmlEnumValue("weight")
    WEIGHT("weight"),
    @XmlEnumValue("weightPerAxle")
    WEIGHT_PER_AXLE("weightPerAxle"),
    @XmlEnumValue("width")
    WIDTH("width"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DisplayedNumericalInformationTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayedNumericalInformationTypeEnum2 fromValue(String v) {
        for (DisplayedNumericalInformationTypeEnum2 c: DisplayedNumericalInformationTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
