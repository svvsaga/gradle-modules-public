
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfrastructureDamageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InfrastructureDamageTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="burstPipe"/&gt;
 *     &lt;enumeration value="burstWaterMain"/&gt;
 *     &lt;enumeration value="collapsedSewer"/&gt;
 *     &lt;enumeration value="damagedBridge"/&gt;
 *     &lt;enumeration value="damagedCrashBarrier"/&gt;
 *     &lt;enumeration value="damagedFlyover"/&gt;
 *     &lt;enumeration value="damagedGallery"/&gt;
 *     &lt;enumeration value="damagedGantry"/&gt;
 *     &lt;enumeration value="damagedRoadSurface"/&gt;
 *     &lt;enumeration value="damagedTunnel"/&gt;
 *     &lt;enumeration value="damagedViaduct"/&gt;
 *     &lt;enumeration value="fallenPowerCables"/&gt;
 *     &lt;enumeration value="gasLeak"/&gt;
 *     &lt;enumeration value="weakBridge"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InfrastructureDamageTypeEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum InfrastructureDamageTypeEnum2 {


    /**
     * The road surface has sunken or collapsed in places due to burst pipes.
     *           
     * 
     */
    @XmlEnumValue("burstPipe")
    BURST_PIPE("burstPipe"),

    /**
     * Traffic may be disrupted due to local flooding and/or subsidence because of a
     *             broken water main.
     *           
     * 
     */
    @XmlEnumValue("burstWaterMain")
    BURST_WATER_MAIN("burstWaterMain"),

    /**
     * The road surface has sunken or collapsed in places due to sewer failure.
     *           
     * 
     */
    @XmlEnumValue("collapsedSewer")
    COLLAPSED_SEWER("collapsedSewer"),

    /**
     * Damage to a bridge that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedBridge")
    DAMAGED_BRIDGE("damagedBridge"),

    /**
     * Damage to a crash barrier that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedCrashBarrier")
    DAMAGED_CRASH_BARRIER("damagedCrashBarrier"),

    /**
     * Damage to an elevated section of the carriageway over another carriageway that may
     *             cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("damagedFlyover")
    DAMAGED_FLYOVER("damagedFlyover"),

    /**
     * Damage to a gallery that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedGallery")
    DAMAGED_GALLERY("damagedGallery"),

    /**
     * Damage to a gantry above the roadway that may cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("damagedGantry")
    DAMAGED_GANTRY("damagedGantry"),

    /**
     * Damage to the road surface that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedRoadSurface")
    DAMAGED_ROAD_SURFACE("damagedRoadSurface"),

    /**
     * Damage to a tunnel that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedTunnel")
    DAMAGED_TUNNEL("damagedTunnel"),

    /**
     * Damage to a viaduct that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedViaduct")
    DAMAGED_VIADUCT("damagedViaduct"),

    /**
     * The road is obstructed or partially obstructed by one or more fallen power
     *             cables.
     *           
     * 
     */
    @XmlEnumValue("fallenPowerCables")
    FALLEN_POWER_CABLES("fallenPowerCables"),

    /**
     * Traffic may be disrupted due to an explosion hazard from gas escaping in or near
     *             the roadway.
     *           
     * 
     */
    @XmlEnumValue("gasLeak")
    GAS_LEAK("gasLeak"),

    /**
     * Weak bridge capable of carrying a reduced load, typically with a reduced weight
     *             limit restriction imposed.
     *           
     * 
     */
    @XmlEnumValue("weakBridge")
    WEAK_BRIDGE("weakBridge"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    InfrastructureDamageTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfrastructureDamageTypeEnum2 fromValue(String v) {
        for (InfrastructureDamageTypeEnum2 c: InfrastructureDamageTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
