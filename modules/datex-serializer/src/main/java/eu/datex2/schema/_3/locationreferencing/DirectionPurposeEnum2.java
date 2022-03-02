
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionPurposeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DirectionPurposeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inbound"/&gt;
 *     &lt;enumeration value="outbound"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DirectionPurposeEnum")
@XmlEnum
public enum DirectionPurposeEnum2 {


    /**
     * On the carriageway or lane which is inbound towards the centre of the town or
     *             city.
     *           
     * 
     */
    @XmlEnumValue("inbound")
    INBOUND("inbound"),

    /**
     * On the carriageway or lane which is outbound from the centre of the town or
     *             city.
     *           
     * 
     */
    @XmlEnumValue("outbound")
    OUTBOUND("outbound"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    DirectionPurposeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionPurposeEnum2 fromValue(String v) {
        for (DirectionPurposeEnum2 c: DirectionPurposeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
