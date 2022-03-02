
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abandoned"/&gt;
 *     &lt;enumeration value="brokenDown"/&gt;
 *     &lt;enumeration value="burntOut"/&gt;
 *     &lt;enumeration value="damaged"/&gt;
 *     &lt;enumeration value="damagedAndImmobilized"/&gt;
 *     &lt;enumeration value="inDitch"/&gt;
 *     &lt;enumeration value="jacknifed"/&gt;
 *     &lt;enumeration value="offRoad"/&gt;
 *     &lt;enumeration value="onFire"/&gt;
 *     &lt;enumeration value="onTopOfCrashBarrier"/&gt;
 *     &lt;enumeration value="onWheels"/&gt;
 *     &lt;enumeration value="overturned"/&gt;
 *     &lt;enumeration value="rollable"/&gt;
 *     &lt;enumeration value="spunAround"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum VehicleStatusEnum2 {


    /**
     * Abandoned vehicle.
     * 
     */
    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),

    /**
     * Broken down vehicle (i.e. it is immobile due to mechanical breakdown).
     *           
     * 
     */
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),

    /**
     * Burnt out vehicle, but fire is extinguished.
     * 
     */
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),

    /**
     * Vehicle is damaged following an incident or collision. It may be able or not to
     *             move by itself.
     *           
     * 
     */
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),

    /**
     * Vehicle is damaged following an incident or collision. It is immobilized and
     *             therefore needs assistance to be moved.
     *           
     * 
     */
    @XmlEnumValue("damagedAndImmobilized")
    DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),

    /**
     * Vehicle has left roadway and ended in a ditch next to the roadway
     *           
     * 
     */
    @XmlEnumValue("inDitch")
    IN_DITCH("inDitch"),

    /**
     * The pulling vehicle is in a jackknifed position with its trailer
     *           
     * 
     */
    @XmlEnumValue("jacknifed")
    JACKNIFED("jacknifed"),

    /**
     * Vehicle has left the carriageway
     * 
     */
    @XmlEnumValue("offRoad")
    OFF_ROAD("offRoad"),

    /**
     * Vehicle is on fire.
     * 
     */
    @XmlEnumValue("onFire")
    ON_FIRE("onFire"),

    /**
     * Vehicle is on top of the crash barrier, and cannot leave that position
     *             autonomously
     *           
     * 
     */
    @XmlEnumValue("onTopOfCrashBarrier")
    ON_TOP_OF_CRASH_BARRIER("onTopOfCrashBarrier"),

    /**
     * Vehicle is in its upright position after the accident. No special lifting
     *             equipment is needed to put it on its wheels
     *           
     * 
     */
    @XmlEnumValue("onWheels")
    ON_WHEELS("onWheels"),

    /**
     * Vehicle is on its side or upside down
     * 
     */
    @XmlEnumValue("overturned")
    OVERTURNED("overturned"),

    /**
     * The vehicle can be rolled on its own wheels. There is no special equipment needed
     *             to lift the vehicle, because of blocked wheels or other mechanical problems.
     *           
     * 
     */
    @XmlEnumValue("rollable")
    ROLLABLE("rollable"),

    /**
     * Vehicle has come to rest not facing its intended line of travel.
     *           
     * 
     */
    @XmlEnumValue("spunAround")
    SPUN_AROUND("spunAround"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VehicleStatusEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnum2 fromValue(String v) {
        for (VehicleStatusEnum2 c: VehicleStatusEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
