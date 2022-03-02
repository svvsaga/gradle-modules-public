
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvolvementRolesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvolvementRolesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cyclist"/&gt;
 *     &lt;enumeration value="motorcyclist"/&gt;
 *     &lt;enumeration value="pedestrian"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="vehicleDriver"/&gt;
 *     &lt;enumeration value="vehicleOccupant"/&gt;
 *     &lt;enumeration value="vehiclePassenger"/&gt;
 *     &lt;enumeration value="witness"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvolvementRolesEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum InvolvementRolesEnum2 {


    /**
     * Cyclist.
     * 
     */
    @XmlEnumValue("cyclist")
    CYCLIST("cyclist"),

    /**
     * Motorcyclist
     * 
     */
    @XmlEnumValue("motorcyclist")
    MOTORCYCLIST("motorcyclist"),

    /**
     * Pedestrian.
     * 
     */
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),

    /**
     * Involvement role is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Vehicle driver.
     * 
     */
    @XmlEnumValue("vehicleDriver")
    VEHICLE_DRIVER("vehicleDriver"),

    /**
     * Vehicle occupant (driver or passenger not specified).
     * 
     */
    @XmlEnumValue("vehicleOccupant")
    VEHICLE_OCCUPANT("vehicleOccupant"),

    /**
     * Vehicle passenger.
     * 
     */
    @XmlEnumValue("vehiclePassenger")
    VEHICLE_PASSENGER("vehiclePassenger"),

    /**
     * Witness.
     * 
     */
    @XmlEnumValue("witness")
    WITNESS("witness"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InvolvementRolesEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvolvementRolesEnum2 fromValue(String v) {
        for (InvolvementRolesEnum2 c: InvolvementRolesEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
