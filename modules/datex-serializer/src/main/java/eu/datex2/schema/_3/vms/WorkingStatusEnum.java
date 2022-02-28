
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkingStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WorkingStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blank"/&gt;
 *     &lt;enumeration value="covered"/&gt;
 *     &lt;enumeration value="notWorking"/&gt;
 *     &lt;enumeration value="working"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkingStatusEnum")
@XmlEnum
public enum WorkingStatusEnum {


    /**
     * The VMS is blank
     * 
     */
    @XmlEnumValue("blank")
    BLANK("blank"),

    /**
     * The VMS is physically covered so no messages can be seen.
     * 
     */
    @XmlEnumValue("covered")
    COVERED("covered"),

    /**
     * The VMS is not working
     * 
     */
    @XmlEnumValue("notWorking")
    NOT_WORKING("notWorking"),

    /**
     * The VMS is working
     * 
     */
    @XmlEnumValue("working")
    WORKING("working"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    WorkingStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkingStatusEnum fromValue(String v) {
        for (WorkingStatusEnum c: WorkingStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
