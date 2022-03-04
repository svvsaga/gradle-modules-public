
package eu.datex2.schema._3.locationreferencing;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightGradeEnum")
@XmlEnum
public enum HeightGradeEnum2 {

    @XmlEnumValue("aboveGrade")
    ABOVE_GRADE("aboveGrade"),
    @XmlEnumValue("atGrade")
    AT_GRADE("atGrade"),
    @XmlEnumValue("belowGrade")
    BELOW_GRADE("belowGrade"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    HeightGradeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightGradeEnum2 fromValue(String v) {
        for (HeightGradeEnum2 c: HeightGradeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
