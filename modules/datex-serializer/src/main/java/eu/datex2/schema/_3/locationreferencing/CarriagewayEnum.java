
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


    /**
     * On the connecting carriageway.
     * 
     */
    @XmlEnumValue("connectingCarriageway")
    CONNECTING_CARRIAGEWAY("connectingCarriageway"),

    /**
     * Independent road or part of a road designated for cycles, signposted as such. A
     *             cycle track is separated from other roads or other parts of the same road by structural means.
     *           
     * 
     */
    @XmlEnumValue("cycleTrack")
    CYCLE_TRACK("cycleTrack"),

    /**
     * On the entry slip road.
     * 
     */
    @XmlEnumValue("entrySlipRoad")
    ENTRY_SLIP_ROAD("entrySlipRoad"),

    /**
     * On the exit slip road.
     * 
     */
    @XmlEnumValue("exitSlipRoad")
    EXIT_SLIP_ROAD("exitSlipRoad"),

    /**
     * On the flyover, i.e. the section of road passing over another.
     * 
     */
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),

    /**
     * On the footpath
     * 
     */
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),

    /**
     * On the left hand feeder road.
     * 
     */
    @XmlEnumValue("leftHandFeederRoad")
    LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),

    /**
     * On the left hand parallel carriageway.
     * 
     */
    @XmlEnumValue("leftHandParallelCarriageway")
    LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),

    /**
     * On the main carriageway.
     * 
     */
    @XmlEnumValue("mainCarriageway")
    MAIN_CARRIAGEWAY("mainCarriageway"),

    /**
     * On the opposite carriageway.
     * 
     */
    @XmlEnumValue("oppositeCarriageway")
    OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),

    /**
     * On the adjacent external parallel carriageway.
     * 
     */
    @XmlEnumValue("parallelCarriageway")
    PARALLEL_CARRIAGEWAY("parallelCarriageway"),

    /**
     * On the right hand feeder road.
     * 
     */
    @XmlEnumValue("rightHandFeederRoad")
    RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),

    /**
     * On the right hand parallel carriageway.
     * 
     */
    @XmlEnumValue("rightHandParallelCarriageway")
    RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),

    /**
     * On the roundabout.
     * 
     */
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),

    /**
     * On the adjacent service road.
     * 
     */
    @XmlEnumValue("serviceRoad")
    SERVICE_ROAD("serviceRoad"),

    /**
     * On the slip roads.
     * 
     */
    @XmlEnumValue("slipRoads")
    SLIP_ROADS("slipRoads"),

    /**
     * On the underpass, i.e. the section of road passing under another.
     *           
     * 
     */
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),

    /**
     * On an unspecified carriageway
     * 
     */
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
