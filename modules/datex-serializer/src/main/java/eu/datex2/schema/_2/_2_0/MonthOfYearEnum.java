
package eu.datex2.schema._2._2_0;

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
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum {

    @XmlEnumValue("january")
    JANUARY("january"),
    @XmlEnumValue("february")
    FEBRUARY("february"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("april")
    APRIL("april"),
    @XmlEnumValue("may")
    MAY("may"),
    @XmlEnumValue("june")
    JUNE("june"),
    @XmlEnumValue("july")
    JULY("july"),
    @XmlEnumValue("august")
    AUGUST("august"),
    @XmlEnumValue("september")
    SEPTEMBER("september"),
    @XmlEnumValue("october")
    OCTOBER("october"),
    @XmlEnumValue("november")
    NOVEMBER("november"),
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
