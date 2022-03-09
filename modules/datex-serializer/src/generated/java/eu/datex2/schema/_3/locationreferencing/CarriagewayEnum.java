
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarriagewayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarriagewayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="connectingCarriageway"/&gt;
 *     &lt;enumeration value="cycleTrack"/&gt;
 *     &lt;enumeration value="entrySlipRoad"/&gt;
 *     &lt;enumeration value="exitSlipRoad"/&gt;
 *     &lt;enumeration value="flyover"/&gt;
 *     &lt;enumeration value="footpath"/&gt;
 *     &lt;enumeration value="leftHandFeederRoad"/&gt;
 *     &lt;enumeration value="leftHandParallelCarriageway"/&gt;
 *     &lt;enumeration value="mainCarriageway"/&gt;
 *     &lt;enumeration value="oppositeCarriageway"/&gt;
 *     &lt;enumeration value="parallelCarriageway"/&gt;
 *     &lt;enumeration value="rightHandFeederRoad"/&gt;
 *     &lt;enumeration value="rightHandParallelCarriageway"/&gt;
 *     &lt;enumeration value="roundabout"/&gt;
 *     &lt;enumeration value="serviceRoad"/&gt;
 *     &lt;enumeration value="slipRoads"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *     &lt;enumeration value="unspecifiedCarriageway"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarriagewayEnum")
@XmlEnum
public enum CarriagewayEnum {

    @XmlEnumValue("connectingCarriageway")
    CONNECTING_CARRIAGEWAY("connectingCarriageway"),
    @XmlEnumValue("cycleTrack")
    CYCLE_TRACK("cycleTrack"),
    @XmlEnumValue("entrySlipRoad")
    ENTRY_SLIP_ROAD("entrySlipRoad"),
    @XmlEnumValue("exitSlipRoad")
    EXIT_SLIP_ROAD("exitSlipRoad"),
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),
    @XmlEnumValue("leftHandFeederRoad")
    LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),
    @XmlEnumValue("leftHandParallelCarriageway")
    LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),
    @XmlEnumValue("mainCarriageway")
    MAIN_CARRIAGEWAY("mainCarriageway"),
    @XmlEnumValue("oppositeCarriageway")
    OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),
    @XmlEnumValue("parallelCarriageway")
    PARALLEL_CARRIAGEWAY("parallelCarriageway"),
    @XmlEnumValue("rightHandFeederRoad")
    RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),
    @XmlEnumValue("rightHandParallelCarriageway")
    RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("serviceRoad")
    SERVICE_ROAD("serviceRoad"),
    @XmlEnumValue("slipRoads")
    SLIP_ROADS("slipRoads"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("unspecifiedCarriageway")
    UNSPECIFIED_CARRIAGEWAY("unspecifiedCarriageway"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    CarriagewayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarriagewayEnum fromValue(String v) {
        for (CarriagewayEnum c: CarriagewayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
