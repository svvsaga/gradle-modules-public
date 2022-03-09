
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
public enum SupplementalPictogramEnum {

    @XmlEnumValue("distanceToTheBeginningOfTheApplicationZone")
    DISTANCE_TO_THE_BEGINNING_OF_THE_APPLICATION_ZONE("distanceToTheBeginningOfTheApplicationZone"),
    @XmlEnumValue("exceptAnyPowerDrivenVehicleDrawingTrailer")
    EXCEPT_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("exceptAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("exceptBus")
    EXCEPT_BUS("exceptBus"),
    @XmlEnumValue("exceptGoodsVehicles")
    EXCEPT_GOODS_VEHICLES("exceptGoodsVehicles"),
    @XmlEnumValue("exceptSemitrailer")
    EXCEPT_SEMITRAILER("exceptSemitrailer"),
    @XmlEnumValue("exceptVehiclesCarryingDangerousGoods")
    EXCEPT_VEHICLES_CARRYING_DANGEROUS_GOODS("exceptVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("inCaseOfIceOrSnow")
    IN_CASE_OF_ICE_OR_SNOW("inCaseOfIceOrSnow"),
    @XmlEnumValue("lengthOfTheApplicationZone")
    LENGTH_OF_THE_APPLICATION_ZONE("lengthOfTheApplicationZone"),
    @XmlEnumValue("restrictedToAnyPowerDrivenVehicleDrawingTrailer")
    RESTRICTED_TO_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("restrictedToAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("restrictedToBus")
    RESTRICTED_TO_BUS("restrictedToBus"),
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
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    SupplementalPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupplementalPictogramEnum fromValue(String v) {
        for (SupplementalPictogramEnum c: SupplementalPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
