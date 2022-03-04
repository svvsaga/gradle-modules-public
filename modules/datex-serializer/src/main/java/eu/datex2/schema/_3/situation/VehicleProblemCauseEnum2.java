
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleProblemCauseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleProblemCauseEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="airSystem"/&gt;
 *     &lt;enumeration value="battery"/&gt;
 *     &lt;enumeration value="brakingSystem"/&gt;
 *     &lt;enumeration value="coolingSystem"/&gt;
 *     &lt;enumeration value="decoupledTrailer"/&gt;
 *     &lt;enumeration value="diverProblem"/&gt;
 *     &lt;enumeration value="electricalSystem"/&gt;
 *     &lt;enumeration value="flatTyre"/&gt;
 *     &lt;enumeration value="fuelSystem"/&gt;
 *     &lt;enumeration value="gear"/&gt;
 *     &lt;enumeration value="loadProblem"/&gt;
 *     &lt;enumeration value="lostWheel"/&gt;
 *     &lt;enumeration value="motorMechanics"/&gt;
 *     &lt;enumeration value="oilLeakage"/&gt;
 *     &lt;enumeration value="suspension"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleProblemCauseEnum")
@XmlEnum
public enum VehicleProblemCauseEnum2 {

    @XmlEnumValue("airSystem")
    AIR_SYSTEM("airSystem"),
    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("brakingSystem")
    BRAKING_SYSTEM("brakingSystem"),
    @XmlEnumValue("coolingSystem")
    COOLING_SYSTEM("coolingSystem"),
    @XmlEnumValue("decoupledTrailer")
    DECOUPLED_TRAILER("decoupledTrailer"),
    @XmlEnumValue("diverProblem")
    DIVER_PROBLEM("diverProblem"),
    @XmlEnumValue("electricalSystem")
    ELECTRICAL_SYSTEM("electricalSystem"),
    @XmlEnumValue("flatTyre")
    FLAT_TYRE("flatTyre"),
    @XmlEnumValue("fuelSystem")
    FUEL_SYSTEM("fuelSystem"),
    @XmlEnumValue("gear")
    GEAR("gear"),
    @XmlEnumValue("loadProblem")
    LOAD_PROBLEM("loadProblem"),
    @XmlEnumValue("lostWheel")
    LOST_WHEEL("lostWheel"),
    @XmlEnumValue("motorMechanics")
    MOTOR_MECHANICS("motorMechanics"),
    @XmlEnumValue("oilLeakage")
    OIL_LEAKAGE("oilLeakage"),
    @XmlEnumValue("suspension")
    SUSPENSION("suspension"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VehicleProblemCauseEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleProblemCauseEnum2 fromValue(String v) {
        for (VehicleProblemCauseEnum2 c: VehicleProblemCauseEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
