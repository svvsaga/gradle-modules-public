
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectTypeOfWorksEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SubjectTypeOfWorksEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bridge"/&gt;
 *     &lt;enumeration value="buriedCables"/&gt;
 *     &lt;enumeration value="buriedServices"/&gt;
 *     &lt;enumeration value="crashBarrier"/&gt;
 *     &lt;enumeration value="cycleTrack"/&gt;
 *     &lt;enumeration value="footpath"/&gt;
 *     &lt;enumeration value="gallery"/&gt;
 *     &lt;enumeration value="gantry"/&gt;
 *     &lt;enumeration value="gasMainWork"/&gt;
 *     &lt;enumeration value="heatingPipe"/&gt;
 *     &lt;enumeration value="interchange"/&gt;
 *     &lt;enumeration value="junction"/&gt;
 *     &lt;enumeration value="levelCrossing"/&gt;
 *     &lt;enumeration value="lightingSystem"/&gt;
 *     &lt;enumeration value="lock"/&gt;
 *     &lt;enumeration value="measurementEquipment"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="noiseProtection"/&gt;
 *     &lt;enumeration value="parking"/&gt;
 *     &lt;enumeration value="publicTransportInfrastructure"/&gt;
 *     &lt;enumeration value="publicTransportStop"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="roadSigns"/&gt;
 *     &lt;enumeration value="roadsideDrains"/&gt;
 *     &lt;enumeration value="roadsideEmbankment"/&gt;
 *     &lt;enumeration value="roadsideEquipment"/&gt;
 *     &lt;enumeration value="roundabout"/&gt;
 *     &lt;enumeration value="sewer"/&gt;
 *     &lt;enumeration value="streetParking"/&gt;
 *     &lt;enumeration value="tollGate"/&gt;
 *     &lt;enumeration value="trafficSignals"/&gt;
 *     &lt;enumeration value="tunnel"/&gt;
 *     &lt;enumeration value="waterBank"/&gt;
 *     &lt;enumeration value="waterMain"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubjectTypeOfWorksEnum")
@XmlEnum
public enum SubjectTypeOfWorksEnum {


    /**
     * Bridge on, over or under the highway.
     * 
     */
    @XmlEnumValue("bridge")
    BRIDGE("bridge"),

    /**
     * Buried cables under or along the highway.
     * 
     */
    @XmlEnumValue("buriedCables")
    BURIED_CABLES("buriedCables"),

    /**
     * Unspecified buried services on, under or along the highway.
     * 
     */
    @XmlEnumValue("buriedServices")
    BURIED_SERVICES("buriedServices"),

    /**
     * Crash barrier.
     * 
     */
    @XmlEnumValue("crashBarrier")
    CRASH_BARRIER("crashBarrier"),

    /**
     * Cycle track adjacent to the road
     * 
     */
    @XmlEnumValue("cycleTrack")
    CYCLE_TRACK("cycleTrack"),

    /**
     * a footpath
     * 
     */
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),

    /**
     * Gallery.
     * 
     */
    @XmlEnumValue("gallery")
    GALLERY("gallery"),

    /**
     * Gantry over or above the roadway.
     * 
     */
    @XmlEnumValue("gantry")
    GANTRY("gantry"),

    /**
     * Gas mains.
     * 
     */
    @XmlEnumValue("gasMainWork")
    GAS_MAIN_WORK("gasMainWork"),

    /**
     * a heating pipe
     * 
     */
    @XmlEnumValue("heatingPipe")
    HEATING_PIPE("heatingPipe"),

    /**
     * Motorway or major road interchange.
     * 
     */
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),

    /**
     * Motorway or major road junction.
     * 
     */
    @XmlEnumValue("junction")
    JUNCTION("junction"),

    /**
     * Level-crossing or associated equipment.
     * 
     */
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),

    /**
     * Road lighting system.
     * 
     */
    @XmlEnumValue("lightingSystem")
    LIGHTING_SYSTEM("lightingSystem"),

    /**
     * lock on a waterway adjacent to the road
     * 
     */
    @XmlEnumValue("lock")
    LOCK("lock"),

    /**
     * Equipment used for determining traffic measurements.
     * 
     */
    @XmlEnumValue("measurementEquipment")
    MEASUREMENT_EQUIPMENT("measurementEquipment"),

    /**
     * passenger railway system, typically underground, in a metropolitan area
     *           
     * 
     */
    @XmlEnumValue("metro")
    METRO("metro"),

    /**
     * Installations along the roadway designed to reduce road noise in the surrounding
     *             environment.
     *           
     * 
     */
    @XmlEnumValue("noiseProtection")
    NOISE_PROTECTION("noiseProtection"),

    /**
     * parking facilities
     * 
     */
    @XmlEnumValue("parking")
    PARKING("parking"),

    /**
     * public transport infrastructure
     * 
     */
    @XmlEnumValue("publicTransportInfrastructure")
    PUBLIC_TRANSPORT_INFRASTRUCTURE("publicTransportInfrastructure"),

    /**
     * public transport stop (including but not limited to bus stops, trams stops, taxi
     *             stops)
     *           
     * 
     */
    @XmlEnumValue("publicTransportStop")
    PUBLIC_TRANSPORT_STOP("publicTransportStop"),

    /**
     * Road.
     * 
     */
    @XmlEnumValue("road")
    ROAD("road"),

    /**
     * Road signs.
     * 
     */
    @XmlEnumValue("roadSigns")
    ROAD_SIGNS("roadSigns"),

    /**
     * Roadside drains.
     * 
     */
    @XmlEnumValue("roadsideDrains")
    ROADSIDE_DRAINS("roadsideDrains"),

    /**
     * Roadside embankment.
     * 
     */
    @XmlEnumValue("roadsideEmbankment")
    ROADSIDE_EMBANKMENT("roadsideEmbankment"),

    /**
     * Roadside equipment.
     * 
     */
    @XmlEnumValue("roadsideEquipment")
    ROADSIDE_EQUIPMENT("roadsideEquipment"),

    /**
     * Roundabout.
     * 
     */
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),

    /**
     * a sewer
     * 
     */
    @XmlEnumValue("sewer")
    SEWER("sewer"),

    /**
     * street parking places
     * 
     */
    @XmlEnumValue("streetParking")
    STREET_PARKING("streetParking"),

    /**
     * Toll gate.
     * 
     */
    @XmlEnumValue("tollGate")
    TOLL_GATE("tollGate"),

    /**
     * traffic signals
     * 
     */
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),

    /**
     * Road tunnel.
     * 
     */
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),

    /**
     * bank of a waterway adjacent to the road
     * 
     */
    @XmlEnumValue("waterBank")
    WATER_BANK("waterBank"),

    /**
     * Water main under or along the highway.
     * 
     */
    @XmlEnumValue("waterMain")
    WATER_MAIN("waterMain"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    SubjectTypeOfWorksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectTypeOfWorksEnum fromValue(String v) {
        for (SubjectTypeOfWorksEnum c: SubjectTypeOfWorksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
