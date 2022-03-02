
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InformationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="securityExercise"/&gt;
 *     &lt;enumeration value="technicalExercise"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationStatusEnum")
@XmlEnum
public enum InformationStatusEnum {

    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("securityExercise")
    SECURITY_EXERCISE("securityExercise"),
    @XmlEnumValue("technicalExercise")
    TECHNICAL_EXERCISE("technicalExercise"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    InformationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationStatusEnum fromValue(String v) {
        for (InformationStatusEnum c: InformationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
