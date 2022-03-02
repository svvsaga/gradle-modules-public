
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionRelativeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PositionRelativeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="above"/&gt;
 *     &lt;enumeration value="below"/&gt;
 *     &lt;enumeration value="toTheLeft"/&gt;
 *     &lt;enumeration value="toTheRight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionRelativeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PositionRelativeEnum {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("toTheLeft")
    TO_THE_LEFT("toTheLeft"),
    @XmlEnumValue("toTheRight")
    TO_THE_RIGHT("toTheRight");
    private final String value;

    PositionRelativeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionRelativeEnum fromValue(String v) {
        for (PositionRelativeEnum c: PositionRelativeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
