
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
public enum VehicleUsageEnum2 {

    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),
    @XmlEnumValue("carSharing")
    CAR_SHARING("carSharing"),
    @XmlEnumValue("cityLogistics")
    CITY_LOGISTICS("cityLogistics"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("military")
    MILITARY("military"),
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VehicleUsageEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum2 fromValue(String v) {
        for (VehicleUsageEnum2 c: VehicleUsageEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
