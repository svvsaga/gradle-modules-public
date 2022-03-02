
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthOfYearEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="january"/&gt;
 *     &lt;enumeration value="february"/&gt;
 *     &lt;enumeration value="march"/&gt;
 *     &lt;enumeration value="april"/&gt;
 *     &lt;enumeration value="may"/&gt;
 *     &lt;enumeration value="june"/&gt;
 *     &lt;enumeration value="july"/&gt;
 *     &lt;enumeration value="august"/&gt;
 *     &lt;enumeration value="september"/&gt;
 *     &lt;enumeration value="october"/&gt;
 *     &lt;enumeration value="november"/&gt;
 *     &lt;enumeration value="december"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum2 {


    /**
     * The month of January.
     * 
     */
    @XmlEnumValue("january")
    JANUARY("january"),

    /**
     * The month of February.
     * 
     */
    @XmlEnumValue("february")
    FEBRUARY("february"),

    /**
     * The month of March.
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     * The month of April.
     * 
     */
    @XmlEnumValue("april")
    APRIL("april"),

    /**
     * The month of May.
     * 
     */
    @XmlEnumValue("may")
    MAY("may"),

    /**
     * The month of June.
     * 
     */
    @XmlEnumValue("june")
    JUNE("june"),

    /**
     * The month of July.
     * 
     */
    @XmlEnumValue("july")
    JULY("july"),

    /**
     * The month of August.
     * 
     */
    @XmlEnumValue("august")
    AUGUST("august"),

    /**
     * The month of September.
     * 
     */
    @XmlEnumValue("september")
    SEPTEMBER("september"),

    /**
     * The month of October.
     * 
     */
    @XmlEnumValue("october")
    OCTOBER("october"),

    /**
     * The month of November.
     * 
     */
    @XmlEnumValue("november")
    NOVEMBER("november"),

    /**
     * The month of December.
     * 
     */
    @XmlEnumValue("december")
    DECEMBER("december"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    MonthOfYearEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum2 fromValue(String v) {
        for (MonthOfYearEnum2 c: MonthOfYearEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
