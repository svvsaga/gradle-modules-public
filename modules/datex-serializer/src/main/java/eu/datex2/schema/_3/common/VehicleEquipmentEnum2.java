
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleEquipmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VehicleEquipmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="notUsingSnowChains"/&gt;
 *     &lt;enumeration value="notUsingSnowChainsOrTyres"/&gt;
 *     &lt;enumeration value="snowChainsInUse"/&gt;
 *     &lt;enumeration value="snowTyresInUse"/&gt;
 *     &lt;enumeration value="snowChainsOrTyresInUse"/&gt;
 *     &lt;enumeration value="withoutSnowTyresOrChainsOnBoard"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleEquipmentEnum")
@XmlEnum
public enum VehicleEquipmentEnum2 {

    @XmlEnumValue("notUsingSnowChains")
    NOT_USING_SNOW_CHAINS("notUsingSnowChains"),
    @XmlEnumValue("notUsingSnowChainsOrTyres")
    NOT_USING_SNOW_CHAINS_OR_TYRES("notUsingSnowChainsOrTyres"),
    @XmlEnumValue("snowChainsInUse")
    SNOW_CHAINS_IN_USE("snowChainsInUse"),
    @XmlEnumValue("snowTyresInUse")
    SNOW_TYRES_IN_USE("snowTyresInUse"),
    @XmlEnumValue("snowChainsOrTyresInUse")
    SNOW_CHAINS_OR_TYRES_IN_USE("snowChainsOrTyresInUse"),
    @XmlEnumValue("withoutSnowTyresOrChainsOnBoard")
    WITHOUT_SNOW_TYRES_OR_CHAINS_ON_BOARD("withoutSnowTyresOrChainsOnBoard"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VehicleEquipmentEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleEquipmentEnum2 fromValue(String v) {
        for (VehicleEquipmentEnum2 c: VehicleEquipmentEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
