
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
public enum DisplayedNumericalInformationTypeEnum {


    /**
     * A distance
     * 
     */
    @XmlEnumValue("distance")
    DISTANCE("distance"),

    /**
     * A height e.g. for a vehicle height restriction
     * 
     */
    @XmlEnumValue("height")
    HEIGHT("height"),

    /**
     * A length e.g. for a vehicle length restriction
     * 
     */
    @XmlEnumValue("length")
    LENGTH("length"),

    /**
     * A rate of incline
     * 
     */
    @XmlEnumValue("rateOfIncline")
    RATE_OF_INCLINE("rateOfIncline"),

    /**
     * A road section length
     * 
     */
    @XmlEnumValue("sectionLength")
    SECTION_LENGTH("sectionLength"),

    /**
     * A speed e.g. for a vehicle speed limit
     * 
     */
    @XmlEnumValue("speed")
    SPEED("speed"),

    /**
     * A weight e.g. for a vehicle weight restriction
     * 
     */
    @XmlEnumValue("weight")
    WEIGHT("weight"),

    /**
     * An axle weight e.g. for an axle weight restriction
     * 
     */
    @XmlEnumValue("weightPerAxle")
    WEIGHT_PER_AXLE("weightPerAxle"),

    /**
     * A width e.g. for a vehicle width restriction
     * 
     */
    @XmlEnumValue("width")
    WIDTH("width"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DisplayedNumericalInformationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayedNumericalInformationTypeEnum fromValue(String v) {
        for (DisplayedNumericalInformationTypeEnum c: DisplayedNumericalInformationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
