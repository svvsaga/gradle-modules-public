
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageInformationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessageInformationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="campaignMessage"/&gt;
 *     &lt;enumeration value="dateTime"/&gt;
 *     &lt;enumeration value="futureInformation"/&gt;
 *     &lt;enumeration value="instructionOrMessage"/&gt;
 *     &lt;enumeration value="situationWarning"/&gt;
 *     &lt;enumeration value="temperature"/&gt;
 *     &lt;enumeration value="trafficManagement"/&gt;
 *     &lt;enumeration value="travelTime"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageInformationTypeEnum")
@XmlEnum
public enum MessageInformationTypeEnum {

    @XmlEnumValue("campaignMessage")
    CAMPAIGN_MESSAGE("campaignMessage"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    @XmlEnumValue("futureInformation")
    FUTURE_INFORMATION("futureInformation"),
    @XmlEnumValue("instructionOrMessage")
    INSTRUCTION_OR_MESSAGE("instructionOrMessage"),
    @XmlEnumValue("situationWarning")
    SITUATION_WARNING("situationWarning"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    MessageInformationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageInformationTypeEnum fromValue(String v) {
        for (MessageInformationTypeEnum c: MessageInformationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
