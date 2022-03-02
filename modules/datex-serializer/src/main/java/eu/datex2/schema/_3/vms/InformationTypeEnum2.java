
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InformationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="situationInformation"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *     &lt;enumeration value="prohibition"/&gt;
 *     &lt;enumeration value="obligation"/&gt;
 *     &lt;enumeration value="destination"/&gt;
 *     &lt;enumeration value="travelTime"/&gt;
 *     &lt;enumeration value="delay"/&gt;
 *     &lt;enumeration value="location"/&gt;
 *     &lt;enumeration value="vehicleType"/&gt;
 *     &lt;enumeration value="generalInformation"/&gt;
 *     &lt;enumeration value="blank"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationTypeEnum", namespace = "http://datex2.eu/schema/3/vms")
@XmlEnum
public enum InformationTypeEnum2 {


    /**
     * Information about the situation
     * 
     */
    @XmlEnumValue("situationInformation")
    SITUATION_INFORMATION("situationInformation"),

    /**
     * The information is a warning
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning"),

    /**
     * The information is a prohibition
     * 
     */
    @XmlEnumValue("prohibition")
    PROHIBITION("prohibition"),

    /**
     * The information is an obligation
     * 
     */
    @XmlEnumValue("obligation")
    OBLIGATION("obligation"),

    /**
     * The information is a destination
     * 
     */
    @XmlEnumValue("destination")
    DESTINATION("destination"),

    /**
     * The information is travel time
     * 
     */
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),

    /**
     * Delay information
     * 
     */
    @XmlEnumValue("delay")
    DELAY("delay"),

    /**
     * Location information
     * 
     */
    @XmlEnumValue("location")
    LOCATION("location"),

    /**
     * The information is about vehicle type
     * 
     */
    @XmlEnumValue("vehicleType")
    VEHICLE_TYPE("vehicleType"),

    /**
     * General information
     * 
     */
    @XmlEnumValue("generalInformation")
    GENERAL_INFORMATION("generalInformation"),

    /**
     * There is no information content
     * 
     */
    @XmlEnumValue("blank")
    BLANK("blank"),

    /**
     * Other kind of information
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InformationTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationTypeEnum2 fromValue(String v) {
        for (InformationTypeEnum2 c: InformationTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
