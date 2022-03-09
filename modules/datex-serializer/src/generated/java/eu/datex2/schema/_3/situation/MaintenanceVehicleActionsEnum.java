
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
@XmlType(name = "MaintenanceVehicleActionsEnum")
@XmlEnum
public enum MaintenanceVehicleActionsEnum {

    @XmlEnumValue("maintenanceAction")
    MAINTENANCE_ACTION("maintenanceAction"),
    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    MaintenanceVehicleActionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum fromValue(String v) {
        for (MaintenanceVehicleActionsEnum c: MaintenanceVehicleActionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
