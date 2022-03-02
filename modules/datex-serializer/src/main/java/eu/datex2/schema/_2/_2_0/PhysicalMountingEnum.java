
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalMountingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PhysicalMountingEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="centralReservationMounted"/&gt;
 *     &lt;enumeration value="gantryMounted"/&gt;
 *     &lt;enumeration value="overheadBridgeMounted"/&gt;
 *     &lt;enumeration value="roadsideCantileverMounted"/&gt;
 *     &lt;enumeration value="roadsideMounted"/&gt;
 *     &lt;enumeration value="trailerMounted"/&gt;
 *     &lt;enumeration value="tunnelEntranceMounted"/&gt;
 *     &lt;enumeration value="vehicleMounted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalMountingEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PhysicalMountingEnum {

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
    VEHICLE_MOUNTED("vehicleMounted");
    private final String value;

    PhysicalMountingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalMountingEnum fromValue(String v) {
        for (PhysicalMountingEnum c: PhysicalMountingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
