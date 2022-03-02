
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="colourGraphic"/&gt;
 *     &lt;enumeration value="rotatingPrismSign"/&gt;
 *     &lt;enumeration value="monochromeGraphic"/&gt;
 *     &lt;enumeration value="simpleMatrixSign"/&gt;
 *     &lt;enumeration value="fullMatrixSign"/&gt;
 *     &lt;enumeration value="rollerBlindSign"/&gt;
 *     &lt;enumeration value="virtualVms"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsTypeEnum")
@XmlEnum
public enum VmsTypeEnum2 {


    /**
     * A colour graphic display.
     * 
     */
    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),

    /**
     * A sign implementing fixed messages which are made visible to drivers by
     *             electromechanical means e.g. a fixed sign parallel to traffic flow and therefore not legible is
     *             rotated to be orthogonal to traffic flow and becomes legible.
     *           
     * 
     */
    @XmlEnumValue("rotatingPrismSign")
    ROTATING_PRISM_SIGN("rotatingPrismSign"),

    /**
     * A monochrome graphic display.
     * 
     */
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),

    /**
     * Simple display made up of a fixed matrix of pixels (e.g. sets of LEDs or lights)
     *             capable of showing a limited set of aspects (or matrix images). The display area is regarded as
     *             a pictogram area in DATEX II.
     *           
     * 
     */
    @XmlEnumValue("simpleMatrixSign")
    SIMPLE_MATRIX_SIGN("simpleMatrixSign"),

    /**
     * A full-matrix sign.
     * 
     */
    @XmlEnumValue("fullMatrixSign")
    FULL_MATRIX_SIGN("fullMatrixSign"),

    /**
     * Continuous sign using a roller blind.
     * 
     */
    @XmlEnumValue("rollerBlindSign")
    ROLLER_BLIND_SIGN("rollerBlindSign"),

    /**
     * Not a physical VMS but a conceptual one used in the electronic distribution of
     *             information
     *           
     * 
     */
    @XmlEnumValue("virtualVms")
    VIRTUAL_VMS("virtualVms"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    VmsTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum2 fromValue(String v) {
        for (VmsTypeEnum2 c: VmsTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
