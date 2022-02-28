
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsDatexPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsDatexPictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="advisorySpeed"/&gt;
 *     &lt;enumeration value="animalsOnRoad"/&gt;
 *     &lt;enumeration value="blankVoid"/&gt;
 *     &lt;enumeration value="bridgeClosed"/&gt;
 *     &lt;enumeration value="bridgeSwingInOperation"/&gt;
 *     &lt;enumeration value="carParkFull"/&gt;
 *     &lt;enumeration value="carParkSpacesAvailable"/&gt;
 *     &lt;enumeration value="carriagewayNarrows"/&gt;
 *     &lt;enumeration value="carriagewayNarrowsOnTheLeft"/&gt;
 *     &lt;enumeration value="carriagewayNarrowsOnTheRight"/&gt;
 *     &lt;enumeration value="carriagewayReducedToOneLane"/&gt;
 *     &lt;enumeration value="carriagewayReducedToTwoLanes"/&gt;
 *     &lt;enumeration value="carriagewayReducedToThreeLanes"/&gt;
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/&gt;
 *     &lt;enumeration value="compulsoryMinimumSpeed"/&gt;
 *     &lt;enumeration value="crossWind"/&gt;
 *     &lt;enumeration value="dangerOfFire"/&gt;
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/&gt;
 *     &lt;enumeration value="endOfAdvisorySpeed"/&gt;
 *     &lt;enumeration value="endOfCompulsoryMinimumSpeed"/&gt;
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/&gt;
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/&gt;
 *     &lt;enumeration value="endOfSpeedLimit"/&gt;
 *     &lt;enumeration value="exitClosed"/&gt;
 *     &lt;enumeration value="fallingRocks"/&gt;
 *     &lt;enumeration value="fastenChildrensSeatBelts"/&gt;
 *     &lt;enumeration value="fastenYourSeatBelt"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="floodingOrFlashFloods"/&gt;
 *     &lt;enumeration value="fog"/&gt;
 *     &lt;enumeration value="footballMatch"/&gt;
 *     &lt;enumeration value="hardShoulderNotRunning"/&gt;
 *     &lt;enumeration value="hardShoulderRunning"/&gt;
 *     &lt;enumeration value="keepASafeDistance"/&gt;
 *     &lt;enumeration value="keepLeft"/&gt;
 *     &lt;enumeration value="keepRight"/&gt;
 *     &lt;enumeration value="lane1ClosedOf2"/&gt;
 *     &lt;enumeration value="lane2ClosedOf2"/&gt;
 *     &lt;enumeration value="lane1ClosedOf3"/&gt;
 *     &lt;enumeration value="lane3ClosedOf3"/&gt;
 *     &lt;enumeration value="lanes1And2ClosedOf3"/&gt;
 *     &lt;enumeration value="lanes2And3ClosedOf3"/&gt;
 *     &lt;enumeration value="lane1ClosedOf4"/&gt;
 *     &lt;enumeration value="lane4ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes1And2ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes3And4ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes1And2And3ClosedOf4"/&gt;
 *     &lt;enumeration value="lanes2And3And4ClosedOf4"/&gt;
 *     &lt;enumeration value="laneClosed"/&gt;
 *     &lt;enumeration value="laneDeviationToLeft"/&gt;
 *     &lt;enumeration value="laneDeviationToRight"/&gt;
 *     &lt;enumeration value="laneOpen"/&gt;
 *     &lt;enumeration value="leftHandLaneClosed"/&gt;
 *     &lt;enumeration value="lightSignals"/&gt;
 *     &lt;enumeration value="looseGravel"/&gt;
 *     &lt;enumeration value="maintenanceVehicleInAction"/&gt;
 *     &lt;enumeration value="maximumSpeedLimitedToTheFigureIndicated"/&gt;
 *     &lt;enumeration value="narrowLanesAead"/&gt;
 *     &lt;enumeration value="noEntry"/&gt;
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailer"/&gt;
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"/&gt;
 *     &lt;enumeration value="noEntryForGoodsVehicles"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"/&gt;
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="otherDangers"/&gt;
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/&gt;
 *     &lt;enumeration value="overtakingProhibited"/&gt;
 *     &lt;enumeration value="pollutionOrSmogAlert"/&gt;
 *     &lt;enumeration value="queue"/&gt;
 *     &lt;enumeration value="rain"/&gt;
 *     &lt;enumeration value="rightHandLaneClosed"/&gt;
 *     &lt;enumeration value="roadClosedAhead"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="slipperyRoad"/&gt;
 *     &lt;enumeration value="smoke"/&gt;
 *     &lt;enumeration value="snow"/&gt;
 *     &lt;enumeration value="snowChainsCompulsory"/&gt;
 *     &lt;enumeration value="snowTyresCompulsory"/&gt;
 *     &lt;enumeration value="snowPloughInAction"/&gt;
 *     &lt;enumeration value="speedCamerasInAction"/&gt;
 *     &lt;enumeration value="trafficCongestion"/&gt;
 *     &lt;enumeration value="trafficDeviatedToOppositeCarriagewayAhead"/&gt;
 *     &lt;enumeration value="trafficPartiallyDeviatedToOppositeCarriagewayAhead"/&gt;
 *     &lt;enumeration value="tunnelClosed"/&gt;
 *     &lt;enumeration value="turnLeft"/&gt;
 *     &lt;enumeration value="turnRight"/&gt;
 *     &lt;enumeration value="twoWayTraffic"/&gt;
 *     &lt;enumeration value="unevenRoad"/&gt;
 *     &lt;enumeration value="vehicleFire"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsDatexPictogramEnum")
@XmlEnum
public enum VmsDatexPictogramEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),
    @XmlEnumValue("animalsOnRoad")
    ANIMALS_ON_ROAD("animalsOnRoad"),
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),
    @XmlEnumValue("bridgeClosed")
    BRIDGE_CLOSED("bridgeClosed"),
    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkSpacesAvailable")
    CAR_PARK_SPACES_AVAILABLE("carParkSpacesAvailable"),
    @XmlEnumValue("carriagewayNarrows")
    CARRIAGEWAY_NARROWS("carriagewayNarrows"),
    @XmlEnumValue("carriagewayNarrowsOnTheLeft")
    CARRIAGEWAY_NARROWS_ON_THE_LEFT("carriagewayNarrowsOnTheLeft"),
    @XmlEnumValue("carriagewayNarrowsOnTheRight")
    CARRIAGEWAY_NARROWS_ON_THE_RIGHT("carriagewayNarrowsOnTheRight"),
    @XmlEnumValue("carriagewayReducedToOneLane")
    CARRIAGEWAY_REDUCED_TO_ONE_LANE("carriagewayReducedToOneLane"),
    @XmlEnumValue("carriagewayReducedToTwoLanes")
    CARRIAGEWAY_REDUCED_TO_TWO_LANES("carriagewayReducedToTwoLanes"),
    @XmlEnumValue("carriagewayReducedToThreeLanes")
    CARRIAGEWAY_REDUCED_TO_THREE_LANES("carriagewayReducedToThreeLanes"),
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),
    @XmlEnumValue("compulsoryMinimumSpeed")
    COMPULSORY_MINIMUM_SPEED("compulsoryMinimumSpeed"),
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),
    @XmlEnumValue("endOfCompulsoryMinimumSpeed")
    END_OF_COMPULSORY_MINIMUM_SPEED("endOfCompulsoryMinimumSpeed"),
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),
    @XmlEnumValue("fallingRocks")
    FALLING_ROCKS("fallingRocks"),
    @XmlEnumValue("fastenChildrensSeatBelts")
    FASTEN_CHILDRENS_SEAT_BELTS("fastenChildrensSeatBelts"),
    @XmlEnumValue("fastenYourSeatBelt")
    FASTEN_YOUR_SEAT_BELT("fastenYourSeatBelt"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("floodingOrFlashFloods")
    FLOODING_OR_FLASH_FLOODS("floodingOrFlashFloods"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),
    @XmlEnumValue("hardShoulderNotRunning")
    HARD_SHOULDER_NOT_RUNNING("hardShoulderNotRunning"),
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),
    @XmlEnumValue("keepLeft")
    KEEP_LEFT("keepLeft"),
    @XmlEnumValue("keepRight")
    KEEP_RIGHT("keepRight"),
    @XmlEnumValue("lane1ClosedOf2")
    LANE_1_CLOSED_OF_2("lane1ClosedOf2"),
    @XmlEnumValue("lane2ClosedOf2")
    LANE_2_CLOSED_OF_2("lane2ClosedOf2"),
    @XmlEnumValue("lane1ClosedOf3")
    LANE_1_CLOSED_OF_3("lane1ClosedOf3"),
    @XmlEnumValue("lane3ClosedOf3")
    LANE_3_CLOSED_OF_3("lane3ClosedOf3"),
    @XmlEnumValue("lanes1And2ClosedOf3")
    LANES_1_AND_2_CLOSED_OF_3("lanes1And2ClosedOf3"),
    @XmlEnumValue("lanes2And3ClosedOf3")
    LANES_2_AND_3_CLOSED_OF_3("lanes2And3ClosedOf3"),
    @XmlEnumValue("lane1ClosedOf4")
    LANE_1_CLOSED_OF_4("lane1ClosedOf4"),
    @XmlEnumValue("lane4ClosedOf4")
    LANE_4_CLOSED_OF_4("lane4ClosedOf4"),
    @XmlEnumValue("lanes1And2ClosedOf4")
    LANES_1_AND_2_CLOSED_OF_4("lanes1And2ClosedOf4"),
    @XmlEnumValue("lanes3And4ClosedOf4")
    LANES_3_AND_4_CLOSED_OF_4("lanes3And4ClosedOf4"),
    @XmlEnumValue("lanes1And2And3ClosedOf4")
    LANES_1_AND_2_AND_3_CLOSED_OF_4("lanes1And2And3ClosedOf4"),
    @XmlEnumValue("lanes2And3And4ClosedOf4")
    LANES_2_AND_3_AND_4_CLOSED_OF_4("lanes2And3And4ClosedOf4"),
    @XmlEnumValue("laneClosed")
    LANE_CLOSED("laneClosed"),
    @XmlEnumValue("laneDeviationToLeft")
    LANE_DEVIATION_TO_LEFT("laneDeviationToLeft"),
    @XmlEnumValue("laneDeviationToRight")
    LANE_DEVIATION_TO_RIGHT("laneDeviationToRight"),
    @XmlEnumValue("laneOpen")
    LANE_OPEN("laneOpen"),
    @XmlEnumValue("leftHandLaneClosed")
    LEFT_HAND_LANE_CLOSED("leftHandLaneClosed"),
    @XmlEnumValue("lightSignals")
    LIGHT_SIGNALS("lightSignals"),
    @XmlEnumValue("looseGravel")
    LOOSE_GRAVEL("looseGravel"),
    @XmlEnumValue("maintenanceVehicleInAction")
    MAINTENANCE_VEHICLE_IN_ACTION("maintenanceVehicleInAction"),
    @XmlEnumValue("maximumSpeedLimitedToTheFigureIndicated")
    MAXIMUM_SPEED_LIMITED_TO_THE_FIGURE_INDICATED("maximumSpeedLimitedToTheFigureIndicated"),
    @XmlEnumValue("narrowLanesAead")
    NARROW_LANES_AEAD("narrowLanesAead"),
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailer"),
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER_OTHER_THAN_A_SEMI_TRAILER_OR_A_SINGLE_AXLE_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"),
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_WIDTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("otherDangers")
    OTHER_DANGERS("otherDangers"),
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),
    @XmlEnumValue("pollutionOrSmogAlert")
    POLLUTION_OR_SMOG_ALERT("pollutionOrSmogAlert"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("rightHandLaneClosed")
    RIGHT_HAND_LANE_CLOSED("rightHandLaneClosed"),
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("smoke")
    SMOKE("smoke"),
    @XmlEnumValue("snow")
    SNOW("snow"),
    @XmlEnumValue("snowChainsCompulsory")
    SNOW_CHAINS_COMPULSORY("snowChainsCompulsory"),
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),
    @XmlEnumValue("snowPloughInAction")
    SNOW_PLOUGH_IN_ACTION("snowPloughInAction"),
    @XmlEnumValue("speedCamerasInAction")
    SPEED_CAMERAS_IN_ACTION("speedCamerasInAction"),
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion"),
    @XmlEnumValue("trafficDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("trafficPartiallyDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_PARTIALLY_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficPartiallyDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("tunnelClosed")
    TUNNEL_CLOSED("tunnelClosed"),
    @XmlEnumValue("turnLeft")
    TURN_LEFT("turnLeft"),
    @XmlEnumValue("turnRight")
    TURN_RIGHT("turnRight"),
    @XmlEnumValue("twoWayTraffic")
    TWO_WAY_TRAFFIC("twoWayTraffic"),
    @XmlEnumValue("unevenRoad")
    UNEVEN_ROAD("unevenRoad"),
    @XmlEnumValue("vehicleFire")
    VEHICLE_FIRE("vehicleFire"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsDatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsDatexPictogramEnum fromValue(String v) {
        for (VmsDatexPictogramEnum c: VmsDatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
