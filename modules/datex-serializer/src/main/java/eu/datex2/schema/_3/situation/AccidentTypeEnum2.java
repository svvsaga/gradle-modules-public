
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

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("accidentInvolvingHazardousMaterials")
    ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),
    @XmlEnumValue("accidentInvolvingHeavyLorries")
    ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),
    @XmlEnumValue("accidentInvolvingMassTransitVehicle")
    ACCIDENT_INVOLVING_MASS_TRANSIT_VEHICLE("accidentInvolvingMassTransitVehicle"),
    @XmlEnumValue("accidentInvolvingPublicTransport")
    ACCIDENT_INVOLVING_PUBLIC_TRANSPORT("accidentInvolvingPublicTransport"),
    @XmlEnumValue("accidentInvolvingRadioactiveMaterial")
    ACCIDENT_INVOLVING_RADIOACTIVE_MATERIAL("accidentInvolvingRadioactiveMaterial"),
    @XmlEnumValue("accidentInvolvingTrain")
    ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("multipleVehicleAccident")
    MULTIPLE_VEHICLE_ACCIDENT("multipleVehicleAccident"),
    @XmlEnumValue("secondaryAccident")
    SECONDARY_ACCIDENT("secondaryAccident"),
    @XmlEnumValue("seriousInjuryOrFatalAccident")
    SERIOUS_INJURY_OR_FATAL_ACCIDENT("seriousInjuryOrFatalAccident"),
    @XmlEnumValue("vehicleStuckUnderBridge")
    VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),
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
