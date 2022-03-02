
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
@XmlType(name = "RoadsideAssistanceTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum RoadsideAssistanceTypeEnum2 {


    /**
     * Air ambulance assistance.
     * 
     */
    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),

    /**
     * Bus passenger assistance.
     * 
     */
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),

    /**
     * Emergency services assistance.
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * First aid assistance.
     * 
     */
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),

    /**
     * Food delivery.
     * 
     */
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),

    /**
     * Helicopter rescue.
     * 
     */
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),

    /**
     * Vehicle repair assistance.
     * 
     */
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),

    /**
     * Vehicle recovery.
     * 
     */
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
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
