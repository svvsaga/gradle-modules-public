
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

    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("buriedCables")
    BURIED_CABLES("buriedCables"),
    @XmlEnumValue("buriedServices")
    BURIED_SERVICES("buriedServices"),
    @XmlEnumValue("crashBarrier")
    CRASH_BARRIER("crashBarrier"),
    @XmlEnumValue("cycleTrack")
    CYCLE_TRACK("cycleTrack"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),
    @XmlEnumValue("gallery")
    GALLERY("gallery"),
    @XmlEnumValue("gantry")
    GANTRY("gantry"),
    @XmlEnumValue("gasMainWork")
    GAS_MAIN_WORK("gasMainWork"),
    @XmlEnumValue("heatingPipe")
    HEATING_PIPE("heatingPipe"),
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),
    @XmlEnumValue("lightingSystem")
    LIGHTING_SYSTEM("lightingSystem"),
    @XmlEnumValue("lock")
    LOCK("lock"),
    @XmlEnumValue("measurementEquipment")
    MEASUREMENT_EQUIPMENT("measurementEquipment"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("noiseProtection")
    NOISE_PROTECTION("noiseProtection"),
    @XmlEnumValue("parking")
    PARKING("parking"),
    @XmlEnumValue("publicTransportInfrastructure")
    PUBLIC_TRANSPORT_INFRASTRUCTURE("publicTransportInfrastructure"),
    @XmlEnumValue("publicTransportStop")
    PUBLIC_TRANSPORT_STOP("publicTransportStop"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("roadSigns")
    ROAD_SIGNS("roadSigns"),
    @XmlEnumValue("roadsideDrains")
    ROADSIDE_DRAINS("roadsideDrains"),
    @XmlEnumValue("roadsideEmbankment")
    ROADSIDE_EMBANKMENT("roadsideEmbankment"),
    @XmlEnumValue("roadsideEquipment")
    ROADSIDE_EQUIPMENT("roadsideEquipment"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("sewer")
    SEWER("sewer"),
    @XmlEnumValue("streetParking")
    STREET_PARKING("streetParking"),
    @XmlEnumValue("tollGate")
    TOLL_GATE("tollGate"),
    @XmlEnumValue("trafficSignals")
    TRAFFIC_SIGNALS("trafficSignals"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("waterBank")
    WATER_BANK("waterBank"),
    @XmlEnumValue("waterMain")
    WATER_MAIN("waterMain"),
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
