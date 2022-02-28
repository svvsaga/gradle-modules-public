
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterEquipmentManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WinterEquipmentManagementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="doNotUseStudTyres"/&gt;
 *     &lt;enumeration value="useSnowChains"/&gt;
 *     &lt;enumeration value="useSnowChainsOrTyres"/&gt;
 *     &lt;enumeration value="useSnowTyres"/&gt;
 *     &lt;enumeration value="winterEquipmentOnBoardRequired"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentManagementTypeEnum")
@XmlEnum
public enum WinterEquipmentManagementTypeEnum {


    /**
     * Do not use stud tyres.
     * 
     */
    @XmlEnumValue("doNotUseStudTyres")
    DO_NOT_USE_STUD_TYRES("doNotUseStudTyres"),

    /**
     * Use snow chains.
     * 
     */
    @XmlEnumValue("useSnowChains")
    USE_SNOW_CHAINS("useSnowChains"),

    /**
     * Use snow chains or snow tyres.
     * 
     */
    @XmlEnumValue("useSnowChainsOrTyres")
    USE_SNOW_CHAINS_OR_TYRES("useSnowChainsOrTyres"),

    /**
     * Use snow tyres.
     * 
     */
    @XmlEnumValue("useSnowTyres")
    USE_SNOW_TYRES("useSnowTyres"),

    /**
     * The carrying of winter equipment (snow chains and/or snow tyres) is required.
     *           
     * 
     */
    @XmlEnumValue("winterEquipmentOnBoardRequired")
    WINTER_EQUIPMENT_ON_BOARD_REQUIRED("winterEquipmentOnBoardRequired"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    WinterEquipmentManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentManagementTypeEnum fromValue(String v) {
        for (WinterEquipmentManagementTypeEnum c: WinterEquipmentManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
