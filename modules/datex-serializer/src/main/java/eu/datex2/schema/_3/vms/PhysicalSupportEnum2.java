
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalSupportEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhysicalSupportEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="centralReservationMounted"/&gt;
 *     &lt;enumeration value="gantryMounted"/&gt;
 *     &lt;enumeration value="overheadBridgeMounted"/&gt;
 *     &lt;enumeration value="roadsideCantileverMounted"/&gt;
 *     &lt;enumeration value="roadsideMounted"/&gt;
 *     &lt;enumeration value="trailerMounted"/&gt;
 *     &lt;enumeration value="tunnelEntranceMounted"/&gt;
 *     &lt;enumeration value="vehicleMounted"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalSupportEnum")
@XmlEnum
public enum PhysicalSupportEnum2 {


    /**
     * Equipment mounted in the central reservation.
     * 
     */
    @XmlEnumValue("centralReservationMounted")
    CENTRAL_RESERVATION_MOUNTED("centralReservationMounted"),

    /**
     * Equipment mounted on an overhead gantry across the carriageway.
     * 
     */
    @XmlEnumValue("gantryMounted")
    GANTRY_MOUNTED("gantryMounted"),

    /**
     * Equipment mounted overhead on a bridge structure.
     * 
     */
    @XmlEnumValue("overheadBridgeMounted")
    OVERHEAD_BRIDGE_MOUNTED("overheadBridgeMounted"),

    /**
     * Equipment mounted on a cantilever from the roadside.
     * 
     */
    @XmlEnumValue("roadsideCantileverMounted")
    ROADSIDE_CANTILEVER_MOUNTED("roadsideCantileverMounted"),

    /**
     * Equipment mounted at the roadside.
     * 
     */
    @XmlEnumValue("roadsideMounted")
    ROADSIDE_MOUNTED("roadsideMounted"),

    /**
     * Equipment mounted on a movable trailer.
     * 
     */
    @XmlEnumValue("trailerMounted")
    TRAILER_MOUNTED("trailerMounted"),

    /**
     * Equipment mounted on the entrance to a tunnel.
     * 
     */
    @XmlEnumValue("tunnelEntranceMounted")
    TUNNEL_ENTRANCE_MOUNTED("tunnelEntranceMounted"),

    /**
     * Equipment mounted on a vehicle.
     * 
     */
    @XmlEnumValue("vehicleMounted")
    VEHICLE_MOUNTED("vehicleMounted"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PhysicalSupportEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalSupportEnum2 fromValue(String v) {
        for (PhysicalSupportEnum2 c: PhysicalSupportEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
