
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UpdateMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allElementUpdate"/&gt;
 *     &lt;enumeration value="allInformationUpdate"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="singleElementUpdate"/&gt;
 *     &lt;enumeration value="snapshot"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpdateMethodEnum")
@XmlEnum
public enum UpdateMethodEnum2 {

    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),
    @XmlEnumValue("allInformationUpdate")
    ALL_INFORMATION_UPDATE("allInformationUpdate"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("singleElementUpdate")
    SINGLE_ELEMENT_UPDATE("singleElementUpdate"),
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    UpdateMethodEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum2 fromValue(String v) {
        for (UpdateMethodEnum2 c: UpdateMethodEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
