
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessEquipmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccessEquipmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="trafficSignal"/&gt;
 *     &lt;enumeration value="ticketButtonMachine"/&gt;
 *     &lt;enumeration value="ticketCardMachine"/&gt;
 *     &lt;enumeration value="payAndExitMachine"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessEquipmentEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum AccessEquipmentEnum {

    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("trafficSignal")
    TRAFFIC_SIGNAL("trafficSignal"),
    @XmlEnumValue("ticketButtonMachine")
    TICKET_BUTTON_MACHINE("ticketButtonMachine"),
    @XmlEnumValue("ticketCardMachine")
    TICKET_CARD_MACHINE("ticketCardMachine"),
    @XmlEnumValue("payAndExitMachine")
    PAY_AND_EXIT_MACHINE("payAndExitMachine"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessEquipmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessEquipmentEnum fromValue(String v) {
        for (AccessEquipmentEnum c: AccessEquipmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
