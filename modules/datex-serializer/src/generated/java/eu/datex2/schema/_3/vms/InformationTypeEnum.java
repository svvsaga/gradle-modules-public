
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
@XmlType(name = "InformationTypeEnum")
@XmlEnum
public enum InformationTypeEnum {

    @XmlEnumValue("situationInformation")
    SITUATION_INFORMATION("situationInformation"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("prohibition")
    PROHIBITION("prohibition"),
    @XmlEnumValue("obligation")
    OBLIGATION("obligation"),
    @XmlEnumValue("destination")
    DESTINATION("destination"),
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),
    @XmlEnumValue("delay")
    DELAY("delay"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("vehicleType")
    VEHICLE_TYPE("vehicleType"),
    @XmlEnumValue("generalInformation")
    GENERAL_INFORMATION("generalInformation"),
    @XmlEnumValue("blank")
    BLANK("blank"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    InformationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationTypeEnum fromValue(String v) {
        for (InformationTypeEnum c: InformationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
