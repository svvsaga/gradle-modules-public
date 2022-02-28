
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


    /**
     * Campaign type information which is non time specific that may request certain
     *             actions (e.g. "do not drink and drive") or which is intended to influence drivers' behaviour.
     *           
     * 
     */
    @XmlEnumValue("campaignMessage")
    CAMPAIGN_MESSAGE("campaignMessage"),

    /**
     * Current date and/or time information.
     * 
     */
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),

    /**
     * Information which informs road users about future situations which can potentially
     *             cause congestion or influence future travel plans (e.g. future roadworks, closures, sporting
     *             events, public concerts, suspension of train or ferry services).
     *           
     * 
     */
    @XmlEnumValue("futureInformation")
    FUTURE_INFORMATION("futureInformation"),

    /**
     * Instructions or messages to road users which are relevant at the current time,
     *             (e.g. "do not throw out any burning objects" or an Amber alert message).
     *           
     * 
     */
    @XmlEnumValue("instructionOrMessage")
    INSTRUCTION_OR_MESSAGE("instructionOrMessage"),

    /**
     * Information warning of a current situation likely to affect traffic on the road
     *             ahead.
     *           
     * 
     */
    @XmlEnumValue("situationWarning")
    SITUATION_WARNING("situationWarning"),

    /**
     * Temperature information.
     * 
     */
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),

    /**
     * Information comprising traffic management instructions.
     * 
     */
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),

    /**
     * Travel time information.
     * 
     */
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
