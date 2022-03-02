
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermitTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PermitTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blueZonePermit"/&gt;
 *     &lt;enumeration value="careTakingPermit"/&gt;
 *     &lt;enumeration value="carpoolingPermit"/&gt;
 *     &lt;enumeration value="carSharingPermit"/&gt;
 *     &lt;enumeration value="disabledPermit"/&gt;
 *     &lt;enumeration value="emergencyVehiclePermit"/&gt;
 *     &lt;enumeration value="employeePermit"/&gt;
 *     &lt;enumeration value="fairPermit"/&gt;
 *     &lt;enumeration value="governmentPermit"/&gt;
 *     &lt;enumeration value="maintenanceVehiclePermit"/&gt;
 *     &lt;enumeration value="residentPermit"/&gt;
 *     &lt;enumeration value="roadWorksPermit"/&gt;
 *     &lt;enumeration value="specificIdentifiedVehiclePermit"/&gt;
 *     &lt;enumeration value="taxiPermit"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PermitTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PermitTypeEnum {

    @XmlEnumValue("blueZonePermit")
    BLUE_ZONE_PERMIT("blueZonePermit"),
    @XmlEnumValue("careTakingPermit")
    CARE_TAKING_PERMIT("careTakingPermit"),
    @XmlEnumValue("carpoolingPermit")
    CARPOOLING_PERMIT("carpoolingPermit"),
    @XmlEnumValue("carSharingPermit")
    CAR_SHARING_PERMIT("carSharingPermit"),
    @XmlEnumValue("disabledPermit")
    DISABLED_PERMIT("disabledPermit"),
    @XmlEnumValue("emergencyVehiclePermit")
    EMERGENCY_VEHICLE_PERMIT("emergencyVehiclePermit"),
    @XmlEnumValue("employeePermit")
    EMPLOYEE_PERMIT("employeePermit"),
    @XmlEnumValue("fairPermit")
    FAIR_PERMIT("fairPermit"),
    @XmlEnumValue("governmentPermit")
    GOVERNMENT_PERMIT("governmentPermit"),
    @XmlEnumValue("maintenanceVehiclePermit")
    MAINTENANCE_VEHICLE_PERMIT("maintenanceVehiclePermit"),
    @XmlEnumValue("residentPermit")
    RESIDENT_PERMIT("residentPermit"),
    @XmlEnumValue("roadWorksPermit")
    ROAD_WORKS_PERMIT("roadWorksPermit"),
    @XmlEnumValue("specificIdentifiedVehiclePermit")
    SPECIFIC_IDENTIFIED_VEHICLE_PERMIT("specificIdentifiedVehiclePermit"),
    @XmlEnumValue("taxiPermit")
    TAXI_PERMIT("taxiPermit"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PermitTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermitTypeEnum fromValue(String v) {
        for (PermitTypeEnum c: PermitTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
