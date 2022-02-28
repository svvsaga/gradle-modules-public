
package eu.datex2.schema._3.common;

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
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationStatusEnum")
@XmlEnum
public enum InformationStatusEnum {


    /**
     * The information is real. It is not a test or exercise.
     * 
     */
    @XmlEnumValue("real")
    REAL("real"),

    /**
     * The information is part of an exercise which is for testing security.
     *           
     * 
     */
    @XmlEnumValue("securityExercise")
    SECURITY_EXERCISE("securityExercise"),

    /**
     * The information is part of an exercise which includes tests of associated
     *             technical subsystems.
     *           
     * 
     */
    @XmlEnumValue("technicalExercise")
    TECHNICAL_EXERCISE("technicalExercise"),

    /**
     * The information is part of a test for checking the exchange of this type of
     *             information.
     *           
     * 
     */
    @XmlEnumValue("test")
    TEST("test"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
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
