
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadType2Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadType2Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="refrigeratedGoods"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadType2Enum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum LoadType2Enum {

    @XmlEnumValue("refrigeratedGoods")
    REFRIGERATED_GOODS("refrigeratedGoods");
    private final String value;

    LoadType2Enum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadType2Enum fromValue(String v) {
        for (LoadType2Enum c: LoadType2Enum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
