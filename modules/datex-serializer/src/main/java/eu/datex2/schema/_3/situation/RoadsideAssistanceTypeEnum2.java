
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideAssistanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadsideAssistanceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airAmbulance"/&gt;
 *     &lt;enumeration value="busPassengerAssistance"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="firstAid"/&gt;
 *     &lt;enumeration value="foodDelivery"/&gt;
 *     &lt;enumeration value="helicopterRescue"/&gt;
 *     &lt;enumeration value="vehicleRepair"/&gt;
 *     &lt;enumeration value="vehicleRecovery"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadsideAssistanceTypeEnum")
@XmlEnum
public enum RoadsideAssistanceTypeEnum2 {

    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    RoadsideAssistanceTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideAssistanceTypeEnum2 fromValue(String v) {
        for (RoadsideAssistanceTypeEnum2 c: RoadsideAssistanceTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
