
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccidentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AccidentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="accidentInvolvingHazardousMaterials"/&gt;
 *     &lt;enumeration value="accidentInvolvingHeavyLorries"/&gt;
 *     &lt;enumeration value="accidentInvolvingMassTransitVehicle"/&gt;
 *     &lt;enumeration value="accidentInvolvingPublicTransport"/&gt;
 *     &lt;enumeration value="accidentInvolvingRadioactiveMaterial"/&gt;
 *     &lt;enumeration value="accidentInvolvingTrain"/&gt;
 *     &lt;enumeration value="collision"/&gt;
 *     &lt;enumeration value="multipleVehicleAccident"/&gt;
 *     &lt;enumeration value="secondaryAccident"/&gt;
 *     &lt;enumeration value="seriousInjuryOrFatalAccident"/&gt;
 *     &lt;enumeration value="vehicleStuckUnderBridge"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccidentTypeEnum")
@XmlEnum
public enum AccidentTypeEnum2 {


    /**
     * Accidents are situations in which one or more vehicles lose control and do not
     *             recover. They include collisions between vehicle(s) or other road user(s), between vehicle(s)
     *             and fixed obstacle(s), or they result from a vehicle running off the road.
     *           
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * Includes all accidents involving at least one vehicle believed to be carrying
     *             materials, which could present an additional hazard to road users.
     *           
     * 
     */
    @XmlEnumValue("accidentInvolvingHazardousMaterials")
    ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),

    /**
     * Includes all accidents involving at least one heavy goods vehicle.
     *           
     * 
     */
    @XmlEnumValue("accidentInvolvingHeavyLorries")
    ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),

    /**
     * Includes all accidents involving at least one mass transit vehicle.
     *           
     * 
     */
    @XmlEnumValue("accidentInvolvingMassTransitVehicle")
    ACCIDENT_INVOLVING_MASS_TRANSIT_VEHICLE("accidentInvolvingMassTransitVehicle"),

    /**
     * Includes all accidents involving public transport
     * 
     */
    @XmlEnumValue("accidentInvolvingPublicTransport")
    ACCIDENT_INVOLVING_PUBLIC_TRANSPORT("accidentInvolvingPublicTransport"),

    /**
     * Accident involving radioactive material.
     * 
     */
    @XmlEnumValue("accidentInvolvingRadioactiveMaterial")
    ACCIDENT_INVOLVING_RADIOACTIVE_MATERIAL("accidentInvolvingRadioactiveMaterial"),

    /**
     * Includes all accidents involving collision with a train.
     * 
     */
    @XmlEnumValue("accidentInvolvingTrain")
    ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),

    /**
     * Collision of vehicle with another object of unspecified type.
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),

    /**
     * Includes all accidents involving three or more vehicles.
     * 
     */
    @XmlEnumValue("multipleVehicleAccident")
    MULTIPLE_VEHICLE_ACCIDENT("multipleVehicleAccident"),

    /**
     * Includes all situations resulting from vehicles avoiding or being distracted by
     *             earlier accidents.
     *           
     * 
     */
    @XmlEnumValue("secondaryAccident")
    SECONDARY_ACCIDENT("secondaryAccident"),

    /**
     * Includes all accidents believed to involve fatality or injury expected to require
     *             overnight hospitalisation.
     *           
     * 
     */
    @XmlEnumValue("seriousInjuryOrFatalAccident")
    SERIOUS_INJURY_OR_FATAL_ACCIDENT("seriousInjuryOrFatalAccident"),

    /**
     * A vehicle is stuck under a bridge.
     * 
     */
    @XmlEnumValue("vehicleStuckUnderBridge")
    VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AccidentTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentTypeEnum2 fromValue(String v) {
        for (AccidentTypeEnum2 c: AccidentTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
