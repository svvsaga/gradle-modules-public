
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
public enum PhysicalSupportEnum {

    @XmlEnumValue("centralReservationMounted")
    CENTRAL_RESERVATION_MOUNTED("centralReservationMounted"),
    @XmlEnumValue("gantryMounted")
    GANTRY_MOUNTED("gantryMounted"),
    @XmlEnumValue("overheadBridgeMounted")
    OVERHEAD_BRIDGE_MOUNTED("overheadBridgeMounted"),
    @XmlEnumValue("roadsideCantileverMounted")
    ROADSIDE_CANTILEVER_MOUNTED("roadsideCantileverMounted"),
    @XmlEnumValue("roadsideMounted")
    ROADSIDE_MOUNTED("roadsideMounted"),
    @XmlEnumValue("trailerMounted")
    TRAILER_MOUNTED("trailerMounted"),
    @XmlEnumValue("tunnelEntranceMounted")
    TUNNEL_ENTRANCE_MOUNTED("tunnelEntranceMounted"),
    @XmlEnumValue("vehicleMounted")
    VEHICLE_MOUNTED("vehicleMounted"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PhysicalSupportEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalSupportEnum fromValue(String v) {
        for (PhysicalSupportEnum c: PhysicalSupportEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
