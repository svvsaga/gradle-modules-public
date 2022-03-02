
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OwnershipTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="private"/&gt;
 *     &lt;enumeration value="publicPrivate"/&gt;
 *     &lt;enumeration value="resident"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OwnershipTypeEnum")
@XmlEnum
public enum OwnershipTypeEnum {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("private")
    PRIVATE("private"),
    @XmlEnumValue("publicPrivate")
    PUBLIC_PRIVATE("publicPrivate"),
    @XmlEnumValue("resident")
    RESIDENT("resident"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OwnershipTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipTypeEnum fromValue(String v) {
        for (OwnershipTypeEnum c: OwnershipTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
