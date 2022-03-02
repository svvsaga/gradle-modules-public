
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsDatexSupplementalPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsDatexSupplementalPictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="distanceToTheBeginningofTheApplicationZone"/&gt;
 *     &lt;enumeration value="exceptAnyPowerDrivenVehicleDrawingTrailer"/&gt;
 *     &lt;enumeration value="exceptBus"/&gt;
 *     &lt;enumeration value="exceptGoodsVehicles"/&gt;
 *     &lt;enumeration value="exceptSemiTrailer"/&gt;
 *     &lt;enumeration value="exceptVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="inCaseOfIceOrSnow"/&gt;
 *     &lt;enumeration value="lengthOfTheApplicationZone"/&gt;
 *     &lt;enumeration value="restrictedToAnyPowerDrivenVehicleDrawingTrailer"/&gt;
 *     &lt;enumeration value="restricetdToBus"/&gt;
 *     &lt;enumeration value="restrictedToGoodsVehicles"/&gt;
 *     &lt;enumeration value="restrictedToSemiTrailer"/&gt;
 *     &lt;enumeration value="restrictedToVehiclesCarryingDangerousGoods"/&gt;
 *     &lt;enumeration value="maintenanceVehicles"/&gt;
 *     &lt;enumeration value="snowPloughs"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsDatexSupplementalPictogramEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum VmsDatexSupplementalPictogramEnum {

    @XmlEnumValue("distanceToTheBeginningofTheApplicationZone")
    DISTANCE_TO_THE_BEGINNINGOF_THE_APPLICATION_ZONE("distanceToTheBeginningofTheApplicationZone"),
    @XmlEnumValue("exceptAnyPowerDrivenVehicleDrawingTrailer")
    EXCEPT_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("exceptAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("exceptBus")
    EXCEPT_BUS("exceptBus"),
    @XmlEnumValue("exceptGoodsVehicles")
    EXCEPT_GOODS_VEHICLES("exceptGoodsVehicles"),
    @XmlEnumValue("exceptSemiTrailer")
    EXCEPT_SEMI_TRAILER("exceptSemiTrailer"),
    @XmlEnumValue("exceptVehiclesCarryingDangerousGoods")
    EXCEPT_VEHICLES_CARRYING_DANGEROUS_GOODS("exceptVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("inCaseOfIceOrSnow")
    IN_CASE_OF_ICE_OR_SNOW("inCaseOfIceOrSnow"),
    @XmlEnumValue("lengthOfTheApplicationZone")
    LENGTH_OF_THE_APPLICATION_ZONE("lengthOfTheApplicationZone"),
    @XmlEnumValue("restrictedToAnyPowerDrivenVehicleDrawingTrailer")
    RESTRICTED_TO_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("restrictedToAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("restricetdToBus")
    RESTRICETD_TO_BUS("restricetdToBus"),
    @XmlEnumValue("restrictedToGoodsVehicles")
    RESTRICTED_TO_GOODS_VEHICLES("restrictedToGoodsVehicles"),
    @XmlEnumValue("restrictedToSemiTrailer")
    RESTRICTED_TO_SEMI_TRAILER("restrictedToSemiTrailer"),
    @XmlEnumValue("restrictedToVehiclesCarryingDangerousGoods")
    RESTRICTED_TO_VEHICLES_CARRYING_DANGEROUS_GOODS("restrictedToVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("maintenanceVehicles")
    MAINTENANCE_VEHICLES("maintenanceVehicles"),
    @XmlEnumValue("snowPloughs")
    SNOW_PLOUGHS("snowPloughs"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsDatexSupplementalPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsDatexSupplementalPictogramEnum fromValue(String v) {
        for (VmsDatexSupplementalPictogramEnum c: VmsDatexSupplementalPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
