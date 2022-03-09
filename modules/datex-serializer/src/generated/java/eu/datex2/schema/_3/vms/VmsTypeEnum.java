
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
public enum VmsTypeEnum {

    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),
    @XmlEnumValue("rotatingPrismSign")
    ROTATING_PRISM_SIGN("rotatingPrismSign"),
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),
    @XmlEnumValue("simpleMatrixSign")
    SIMPLE_MATRIX_SIGN("simpleMatrixSign"),
    @XmlEnumValue("fullMatrixSign")
    FULL_MATRIX_SIGN("fullMatrixSign"),
    @XmlEnumValue("rollerBlindSign")
    ROLLER_BLIND_SIGN("rollerBlindSign"),
    @XmlEnumValue("virtualVms")
    VIRTUAL_VMS("virtualVms"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    VmsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsTypeEnum fromValue(String v) {
        for (VmsTypeEnum c: VmsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
