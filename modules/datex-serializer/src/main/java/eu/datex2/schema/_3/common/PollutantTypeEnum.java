
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
public enum PollutantTypeEnum {


    /**
     * Benzene, toluene or xylene.
     * 
     */
    @XmlEnumValue("benzeneTolueneXylene")
    BENZENE_TOLUENE_XYLENE("benzeneTolueneXylene"),

    /**
     * Carbon monoxide.
     * 
     */
    @XmlEnumValue("carbonMonoxide")
    CARBON_MONOXIDE("carbonMonoxide"),

    /**
     * Lead.
     * 
     */
    @XmlEnumValue("lead")
    LEAD("lead"),

    /**
     * Methane.
     * 
     */
    @XmlEnumValue("methane")
    METHANE("methane"),

    /**
     * Nitric oxide.
     * 
     */
    @XmlEnumValue("nitricOxide")
    NITRIC_OXIDE("nitricOxide"),

    /**
     * Nitrogen dioxide.
     * 
     */
    @XmlEnumValue("nitrogenDioxide")
    NITROGEN_DIOXIDE("nitrogenDioxide"),

    /**
     * Nitrogen monoxide.
     * 
     */
    @XmlEnumValue("nitrogenMonoxide")
    NITROGEN_MONOXIDE("nitrogenMonoxide"),

    /**
     * Nitrogen oxides.
     * 
     */
    @XmlEnumValue("nitrogenOxides")
    NITROGEN_OXIDES("nitrogenOxides"),

    /**
     * Non-methane hydrocarbons.
     * 
     */
    @XmlEnumValue("nonMethaneHydrocarbons")
    NON_METHANE_HYDROCARBONS("nonMethaneHydrocarbons"),

    /**
     * Ozone.
     * 
     */
    @XmlEnumValue("ozone")
    OZONE("ozone"),

    /**
     * Particulate matter which passes through a size-selective inlet with a 50% cut-off
     *             efficiency at an aerodynamic diameter of 10 µm (micrometres).
     *           
     * 
     */
    @XmlEnumValue("particulates10")
    PARTICULATES_10("particulates10"),

    /**
     * Polycyclic aromatic hydrocarbons.
     * 
     */
    @XmlEnumValue("polycyclicAromaticHydrocarbons")
    POLYCYCLIC_AROMATIC_HYDROCARBONS("polycyclicAromaticHydrocarbons"),

    /**
     * Primary particulate particles.
     * 
     */
    @XmlEnumValue("primaryParticulate")
    PRIMARY_PARTICULATE("primaryParticulate"),

    /**
     * Sulphur dioxide.
     * 
     */
    @XmlEnumValue("sulphurDioxide")
    SULPHUR_DIOXIDE("sulphurDioxide"),

    /**
     * Total hydrocarbons, i.e. including methane and non-methane.
     * 
     */
    @XmlEnumValue("totalHydrocarbons")
    TOTAL_HYDROCARBONS("totalHydrocarbons"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PollutantTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollutantTypeEnum fromValue(String v) {
        for (PollutantTypeEnum c: PollutantTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
