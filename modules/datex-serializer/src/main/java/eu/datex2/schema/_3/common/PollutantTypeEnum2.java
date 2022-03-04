
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollutantTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PollutantTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="benzeneTolueneXylene"/&gt;
 *     &lt;enumeration value="carbonMonoxide"/&gt;
 *     &lt;enumeration value="lead"/&gt;
 *     &lt;enumeration value="methane"/&gt;
 *     &lt;enumeration value="nitricOxide"/&gt;
 *     &lt;enumeration value="nitrogenDioxide"/&gt;
 *     &lt;enumeration value="nitrogenMonoxide"/&gt;
 *     &lt;enumeration value="nitrogenOxides"/&gt;
 *     &lt;enumeration value="nonMethaneHydrocarbons"/&gt;
 *     &lt;enumeration value="ozone"/&gt;
 *     &lt;enumeration value="particulates10"/&gt;
 *     &lt;enumeration value="polycyclicAromaticHydrocarbons"/&gt;
 *     &lt;enumeration value="primaryParticulate"/&gt;
 *     &lt;enumeration value="sulphurDioxide"/&gt;
 *     &lt;enumeration value="totalHydrocarbons"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PollutantTypeEnum")
@XmlEnum
public enum PollutantTypeEnum2 {

    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),
    @XmlEnumValue("lead")
    LEAD("lead"),
    @XmlEnumValue("methane")
    METHANE("methane"),
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),
    @XmlEnumValue("ozone")
    OZONE("ozone"),
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PollutantTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum2 fromValue(String v) {
        for (PollutantTypeEnum2 c: PollutantTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
