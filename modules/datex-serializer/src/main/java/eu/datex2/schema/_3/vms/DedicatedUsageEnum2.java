
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DedicatedUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DedicatedUsageEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="energyInformation"/&gt;
 *     &lt;enumeration value="inspectionArea"/&gt;
 *     &lt;enumeration value="laneControlSystem"/&gt;
 *     &lt;enumeration value="parkingInformation"/&gt;
 *     &lt;enumeration value="rampMetering"/&gt;
 *     &lt;enumeration value="tunnelManagement"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DedicatedUsageEnum")
@XmlEnum
public enum DedicatedUsageEnum2 {

    @XmlEnumValue("energyInformation")
    ENERGY_INFORMATION("energyInformation"),
    @XmlEnumValue("inspectionArea")
    INSPECTION_AREA("inspectionArea"),
    @XmlEnumValue("laneControlSystem")
    LANE_CONTROL_SYSTEM("laneControlSystem"),
    @XmlEnumValue("parkingInformation")
    PARKING_INFORMATION("parkingInformation"),
    @XmlEnumValue("rampMetering")
    RAMP_METERING("rampMetering"),
    @XmlEnumValue("tunnelManagement")
    TUNNEL_MANAGEMENT("tunnelManagement"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DedicatedUsageEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DedicatedUsageEnum2 fromValue(String v) {
        for (DedicatedUsageEnum2 c: DedicatedUsageEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
