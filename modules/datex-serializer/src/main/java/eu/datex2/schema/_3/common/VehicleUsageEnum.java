
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleUsageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agricultural"/&gt;
 *     &lt;enumeration value="carSharing"/&gt;
 *     &lt;enumeration value="cityLogistics"/&gt;
 *     &lt;enumeration value="commercial"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="military"/&gt;
 *     &lt;enumeration value="nonCommercial"/&gt;
 *     &lt;enumeration value="patrol"/&gt;
 *     &lt;enumeration value="recoveryServices"/&gt;
 *     &lt;enumeration value="roadMaintenanceOrConstruction"/&gt;
 *     &lt;enumeration value="roadOperator"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsageEnum")
@XmlEnum
public enum VehicleUsageEnum {


    /**
     * Vehicle used for agricultural purposes.
     * 
     */
    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),

    /**
     * Vehicles operated by a car-sharing company.
     * 
     */
    @XmlEnumValue("carSharing")
    CAR_SHARING("carSharing"),

    /**
     * Vehicles that are used to deliver goods in a city area.
     * 
     */
    @XmlEnumValue("cityLogistics")
    CITY_LOGISTICS("cityLogistics"),

    /**
     * Vehicle which is limited to non-private usage or public transport usage.
     *           
     * 
     */
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),

    /**
     * Vehicle used by the emergency services.
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * Vehicle used by the military.
     * 
     */
    @XmlEnumValue("military")
    MILITARY("military"),

    /**
     * Vehicle used for non-commercial or private purposes.
     * 
     */
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),

    /**
     * Vehicle used as part of a patrol service, e.g. road operator or automobile
     *             association patrol vehicle.
     *           
     * 
     */
    @XmlEnumValue("patrol")
    PATROL("patrol"),

    /**
     * Vehicle used to provide a recovery service.
     * 
     */
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),

    /**
     * Vehicle used for road maintenance or construction work purposes.
     *           
     * 
     */
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),

    /**
     * Vehicle used by the road operator.
     * 
     */
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),

    /**
     * Vehicle used to provide an authorised taxi service.
     * 
     */
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    VehicleUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum fromValue(String v) {
        for (VehicleUsageEnum c: VehicleUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
