
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositePictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompositePictogramEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="conditionOnCurrentSectionAfterNextExit"/&gt;
 *     &lt;enumeration value="conditionAtNextExit"/&gt;
 *     &lt;enumeration value="conditionOnCurrentSectionAfterSecondtExit"/&gt;
 *     &lt;enumeration value="conditionAtSecondExit"/&gt;
 *     &lt;enumeration value="restrictionOnCurrentSectionAfterNextExit"/&gt;
 *     &lt;enumeration value="restrictionAtNextExit"/&gt;
 *     &lt;enumeration value="restrictionOnCurrentSectionAfterSecondExit"/&gt;
 *     &lt;enumeration value="restrictionAtSecondtExit"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompositePictogramEnum")
@XmlEnum
public enum CompositePictogramEnum {

    @XmlEnumValue("conditionOnCurrentSectionAfterNextExit")
    CONDITION_ON_CURRENT_SECTION_AFTER_NEXT_EXIT("conditionOnCurrentSectionAfterNextExit"),
    @XmlEnumValue("conditionAtNextExit")
    CONDITION_AT_NEXT_EXIT("conditionAtNextExit"),
    @XmlEnumValue("conditionOnCurrentSectionAfterSecondtExit")
    CONDITION_ON_CURRENT_SECTION_AFTER_SECONDT_EXIT("conditionOnCurrentSectionAfterSecondtExit"),
    @XmlEnumValue("conditionAtSecondExit")
    CONDITION_AT_SECOND_EXIT("conditionAtSecondExit"),
    @XmlEnumValue("restrictionOnCurrentSectionAfterNextExit")
    RESTRICTION_ON_CURRENT_SECTION_AFTER_NEXT_EXIT("restrictionOnCurrentSectionAfterNextExit"),
    @XmlEnumValue("restrictionAtNextExit")
    RESTRICTION_AT_NEXT_EXIT("restrictionAtNextExit"),
    @XmlEnumValue("restrictionOnCurrentSectionAfterSecondExit")
    RESTRICTION_ON_CURRENT_SECTION_AFTER_SECOND_EXIT("restrictionOnCurrentSectionAfterSecondExit"),
    @XmlEnumValue("restrictionAtSecondtExit")
    RESTRICTION_AT_SECONDT_EXIT("restrictionAtSecondtExit"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    CompositePictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompositePictogramEnum fromValue(String v) {
        for (CompositePictogramEnum c: CompositePictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
