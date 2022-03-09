
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VmsFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="incorrectMessageDisplayed"/&gt;
 *     &lt;enumeration value="incorrectPictogramDisplayed"/&gt;
 *     &lt;enumeration value="outOfService"/&gt;
 *     &lt;enumeration value="unableToClearDown"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VmsFaultEnum")
@XmlEnum
public enum VmsFaultEnum {

    @XmlEnumValue("incorrectMessageDisplayed")
    INCORRECT_MESSAGE_DISPLAYED("incorrectMessageDisplayed"),
    @XmlEnumValue("incorrectPictogramDisplayed")
    INCORRECT_PICTOGRAM_DISPLAYED("incorrectPictogramDisplayed"),
    @XmlEnumValue("outOfService")
    OUT_OF_SERVICE("outOfService"),
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    VmsFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsFaultEnum fromValue(String v) {
        for (VmsFaultEnum c: VmsFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
