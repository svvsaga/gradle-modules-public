
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceVehicleActionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MaintenanceVehicleActionsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="maintenanceAction"/&gt;
 *     &lt;enumeration value="maintenanceVehiclesMergingIntoTrafficFlow"/&gt;
 *     &lt;enumeration value="slowMoving"/&gt;
 *     &lt;enumeration value="stoppingToServiceEquipments"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceVehicleActionsEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum MaintenanceVehicleActionsEnum2 {


    /**
     * Maintenance vehicles are performing maintenance action
     * 
     */
    @XmlEnumValue("maintenanceAction")
    MAINTENANCE_ACTION("maintenanceAction"),

    /**
     * Maintenance vehicles are merging into the traffic flow creating a potential hazard
     *             for road users.
     *           
     * 
     */
    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),

    /**
     * Maintenance vehicles are slow moving.
     * 
     */
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),

    /**
     * Maintenance vehicles are stopping to service equipments on or next to the
     *             roadway.
     *           
     * 
     */
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    MaintenanceVehicleActionsEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum2 fromValue(String v) {
        for (MaintenanceVehicleActionsEnum2 c: MaintenanceVehicleActionsEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
