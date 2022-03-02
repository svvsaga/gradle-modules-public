
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeightGradeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="HeightGradeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="aboveGrade"/&gt;
 *     &lt;enumeration value="atGrade"/&gt;
 *     &lt;enumeration value="belowGrade"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightGradeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum HeightGradeEnum {

    @XmlEnumValue("aboveGrade")
    ABOVE_GRADE("aboveGrade"),
    @XmlEnumValue("atGrade")
    AT_GRADE("atGrade"),
    @XmlEnumValue("belowGrade")
    BELOW_GRADE("belowGrade");
    private final String value;

    HeightGradeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightGradeEnum fromValue(String v) {
        for (HeightGradeEnum c: HeightGradeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
