
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperatorActionOriginEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="external"/&gt;
 *     &lt;enumeration value="internal"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionOriginEnum")
@XmlEnum
public enum OperatorActionOriginEnum2 {


    /**
     * Operator action originated externally to the authority which is taking the
     *             action.
     *           
     * 
     */
    @XmlEnumValue("external")
    EXTERNAL("external"),

    /**
     * Operator action originated within the authority which is taking the action.
     *           
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    OperatorActionOriginEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionOriginEnum2 fromValue(String v) {
        for (OperatorActionOriginEnum2 c: OperatorActionOriginEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
