
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


    /**
     * Problem with the air system of a vehicle
     * 
     */
    @XmlEnumValue("airSystem")
    AIR_SYSTEM("airSystem"),

    /**
     * Problem with the battery of a vehicle
     * 
     */
    @XmlEnumValue("battery")
    BATTERY("battery"),

    /**
     * Problem with the braking system of a vehicle
     * 
     */
    @XmlEnumValue("brakingSystem")
    BRAKING_SYSTEM("brakingSystem"),

    /**
     * Problem with the cooling system of a vehicle
     * 
     */
    @XmlEnumValue("coolingSystem")
    COOLING_SYSTEM("coolingSystem"),

    /**
     * Problem with the coupling of a trailer
     * 
     */
    @XmlEnumValue("decoupledTrailer")
    DECOUPLED_TRAILER("decoupledTrailer"),

    /**
     * Problem with a vehicle driver
     * 
     */
    @XmlEnumValue("diverProblem")
    DIVER_PROBLEM("diverProblem"),

    /**
     * Problem with the electrical system of a vehicle
     * 
     */
    @XmlEnumValue("electricalSystem")
    ELECTRICAL_SYSTEM("electricalSystem"),

    /**
     * Vehicle has one or more flat tyres
     * 
     */
    @XmlEnumValue("flatTyre")
    FLAT_TYRE("flatTyre"),

    /**
     * Problem with the fuel system of a vehicle
     * 
     */
    @XmlEnumValue("fuelSystem")
    FUEL_SYSTEM("fuelSystem"),

    /**
     * Problem with the gears of a vehicle
     * 
     */
    @XmlEnumValue("gear")
    GEAR("gear"),

    /**
     * Problem with the load of a vehicle
     * 
     */
    @XmlEnumValue("loadProblem")
    LOAD_PROBLEM("loadProblem"),

    /**
     * Vehicle has lost a wheel
     * 
     */
    @XmlEnumValue("lostWheel")
    LOST_WHEEL("lostWheel"),

    /**
     * Problem with the motor mechanics of a vehicle
     * 
     */
    @XmlEnumValue("motorMechanics")
    MOTOR_MECHANICS("motorMechanics"),

    /**
     * Vehicle has an oil leak
     * 
     */
    @XmlEnumValue("oilLeakage")
    OIL_LEAKAGE("oilLeakage"),

    /**
     * Problem with the suspension of a vehicle
     * 
     */
    @XmlEnumValue("suspension")
    SUSPENSION("suspension"),

    /**
     * Other vehicle problem source
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Unknown vehicle problem source
     * 
     */
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
