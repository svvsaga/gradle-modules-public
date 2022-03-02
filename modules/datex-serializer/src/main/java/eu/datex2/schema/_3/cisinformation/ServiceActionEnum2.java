
package eu.datex2.schema._3.cisinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceActionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="agreement"/&gt;
 *     &lt;enumeration value="cancellation"/&gt;
 *     &lt;enumeration value="implementation"/&gt;
 *     &lt;enumeration value="processing"/&gt;
 *     &lt;enumeration value="statusInformation"/&gt;
 *     &lt;enumeration value="termination"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceActionEnum", namespace = "http://datex2.eu/schema/3/cisInformation")
@XmlEnum
public enum ServiceActionEnum2 {

    @XmlEnumValue("agreement")
    AGREEMENT("agreement"),
    @XmlEnumValue("cancellation")
    CANCELLATION("cancellation"),
    @XmlEnumValue("implementation")
    IMPLEMENTATION("implementation"),
    @XmlEnumValue("processing")
    PROCESSING("processing"),
    @XmlEnumValue("statusInformation")
    STATUS_INFORMATION("statusInformation"),
    @XmlEnumValue("termination")
    TERMINATION("termination"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ServiceActionEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceActionEnum2 fromValue(String v) {
        for (ServiceActionEnum2 c: ServiceActionEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
