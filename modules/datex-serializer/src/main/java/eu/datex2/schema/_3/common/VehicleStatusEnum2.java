
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
@XmlType(name = "VehicleStatusEnum")
@XmlEnum
public enum VehicleStatusEnum2 {

    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),
    @XmlEnumValue("damagedAndImmobilized")
    DAMAGED_AND_IMMOBILIZED("damagedAndImmobilized"),
    @XmlEnumValue("inDitch")
    IN_DITCH("inDitch"),
    @XmlEnumValue("jacknifed")
    JACKNIFED("jacknifed"),
    @XmlEnumValue("offRoad")
    OFF_ROAD("offRoad"),
    @XmlEnumValue("onFire")
    ON_FIRE("onFire"),
    @XmlEnumValue("onTopOfCrashBarrier")
    ON_TOP_OF_CRASH_BARRIER("onTopOfCrashBarrier"),
    @XmlEnumValue("onWheels")
    ON_WHEELS("onWheels"),
    @XmlEnumValue("overturned")
    OVERTURNED("overturned"),
    @XmlEnumValue("rollable")
    ROLLABLE("rollable"),
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
