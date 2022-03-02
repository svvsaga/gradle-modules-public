
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SeverityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="highest"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="lowest"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeverityEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum SeverityEnum2 {


    /**
     * Perceived by supplier as being of the highest level.
     * 
     */
    @XmlEnumValue("highest")
    HIGHEST("highest"),

    /**
     * Perceived by supplier as being of a high level.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * Perceived by supplier as being of a medium level.
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * Perceived by supplier as being of a low level.
     * 
     */
    @XmlEnumValue("low")
    LOW("low"),

    /**
     * Perceived by supplier as being of the lowest discernible level.
     * 
     */
    @XmlEnumValue("lowest")
    LOWEST("lowest"),

    /**
     * Perceived by supplier as having a severity rating of none.
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Perceived by supplier as being of an unknown level.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    SeverityEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityEnum2 fromValue(String v) {
        for (SeverityEnum2 c: SeverityEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
