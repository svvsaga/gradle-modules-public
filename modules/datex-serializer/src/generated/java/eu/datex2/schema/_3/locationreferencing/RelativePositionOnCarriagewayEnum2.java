
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativePositionOnCarriagewayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RelativePositionOnCarriagewayEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inTheCentre"/&gt;
 *     &lt;enumeration value="onTheLeft"/&gt;
 *     &lt;enumeration value="onTheRight"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelativePositionOnCarriagewayEnum")
@XmlEnum
public enum RelativePositionOnCarriagewayEnum2 {

    @XmlEnumValue("inTheCentre")
    IN_THE_CENTRE("inTheCentre"),
    @XmlEnumValue("onTheLeft")
    ON_THE_LEFT("onTheLeft"),
    @XmlEnumValue("onTheRight")
    ON_THE_RIGHT("onTheRight"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    RelativePositionOnCarriagewayEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativePositionOnCarriagewayEnum2 fromValue(String v) {
        for (RelativePositionOnCarriagewayEnum2 c: RelativePositionOnCarriagewayEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
