
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementalPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SupplementalPictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="distanceToTheBeginningOfTheApplicationZone"/&gt;
 *     &lt;enumeration value="exceptAnyPowerDrivenVehicleDrawingTrailer"/&gt;
 *     &lt;enumeration value="exceptBus"/&gt;
 *     &lt;enumeration value="exceptGoodsVehicles"/&gt;
 *     &lt;enumeration value="exceptSemitrailer"/&gt;
 *     &lt;enumeration value="exceptVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="inCaseOfIceOrSnow"/&gt;
 *     &lt;enumeration value="lengthOfTheApplicationZone"/&gt;
 *     &lt;enumeration value="restrictedToAnyPowerDrivenVehicleDrawingTrailer"/&gt;
 *     &lt;enumeration value="restrictedToBus"/&gt;
 *     &lt;enumeration value="restrictedToGoodsVehicles"/&gt;
 *     &lt;enumeration value="restrictedToSemiTrailer"/&gt;
 *     &lt;enumeration value="restrictedToVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="maintenanceVehicles"/&gt;
 *     &lt;enumeration value="snowPloughs"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SupplementalPictogramEnum")
@XmlEnum
public enum SupplementalPictogramEnum2 {


    /**
     * Distance to the beginning of the application zone.
     * 
     */
    @XmlEnumValue("distanceToTheBeginningOfTheApplicationZone")
    DISTANCE_TO_THE_BEGINNING_OF_THE_APPLICATION_ZONE("distanceToTheBeginningOfTheApplicationZone"),

    /**
     * Except any power-driven vehicle drawing a trailer.
     * 
     */
    @XmlEnumValue("exceptAnyPowerDrivenVehicleDrawingTrailer")
    EXCEPT_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("exceptAnyPowerDrivenVehicleDrawingTrailer"),

    /**
     * Except for buses.
     * 
     */
    @XmlEnumValue("exceptBus")
    EXCEPT_BUS("exceptBus"),

    /**
     * Except for goods vehicles.
     * 
     */
    @XmlEnumValue("exceptGoodsVehicles")
    EXCEPT_GOODS_VEHICLES("exceptGoodsVehicles"),

    /**
     * Except for semitrailers (i.e. any trailer designed to be coupled to a motor
     *             vehicle in such a way that part of its weight and that of its load is borne by the motor
     *             vehicle).
     *           
     * 
     */
    @XmlEnumValue("exceptSemitrailer")
    EXCEPT_SEMITRAILER("exceptSemitrailer"),

    /**
     * Except for vehicles carrying dangerous goods (i.e. for which special sign plating
     *             is prescribed).
     *           
     * 
     */
    @XmlEnumValue("exceptVehiclesCarryingDangerousGoods")
    EXCEPT_VEHICLES_CARRYING_DANGEROUS_GOODS("exceptVehiclesCarryingDangerousGoods"),

    /**
     * In case of ice or snow.
     * 
     */
    @XmlEnumValue("inCaseOfIceOrSnow")
    IN_CASE_OF_ICE_OR_SNOW("inCaseOfIceOrSnow"),

    /**
     * Length of the applicable zone.
     * 
     */
    @XmlEnumValue("lengthOfTheApplicationZone")
    LENGTH_OF_THE_APPLICATION_ZONE("lengthOfTheApplicationZone"),

    /**
     * Restricted to any power driven vehicle drawing a trailer.
     * 
     */
    @XmlEnumValue("restrictedToAnyPowerDrivenVehicleDrawingTrailer")
    RESTRICTED_TO_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("restrictedToAnyPowerDrivenVehicleDrawingTrailer"),

    /**
     * Restricted to buses.
     * 
     */
    @XmlEnumValue("restrictedToBus")
    RESTRICTED_TO_BUS("restrictedToBus"),

    /**
     * Restricted to goods vehicles.
     * 
     */
    @XmlEnumValue("restrictedToGoodsVehicles")
    RESTRICTED_TO_GOODS_VEHICLES("restrictedToGoodsVehicles"),

    /**
     * Restricted to semi trailers (i.e. any trailer designed to be coupled to a motor
     *             vehicle in such a way that part of its weight and that of its load is borne by the motor
     *             vehicle).
     *           
     * 
     */
    @XmlEnumValue("restrictedToSemiTrailer")
    RESTRICTED_TO_SEMI_TRAILER("restrictedToSemiTrailer"),

    /**
     * Restricted to vehicles carrying dangerous goods (i.e. for which special sign
     *             plating is prescribed).
     *           
     * 
     */
    @XmlEnumValue("restrictedToVehiclesCarryingDangerousGoods")
    RESTRICTED_TO_VEHICLES_CARRYING_DANGEROUS_GOODS("restrictedToVehiclesCarryingDangerousGoods"),

    /**
     * Maintenance vehicles.
     * 
     */
    @XmlEnumValue("maintenanceVehicles")
    MAINTENANCE_VEHICLES("maintenanceVehicles"),

    /**
     * Snow ploughs.
     * 
     */
    @XmlEnumValue("snowPloughs")
    SNOW_PLOUGHS("snowPloughs"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SupplementalPictogramEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplementalPictogramEnum2 fromValue(String v) {
        for (SupplementalPictogramEnum2 c: SupplementalPictogramEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
