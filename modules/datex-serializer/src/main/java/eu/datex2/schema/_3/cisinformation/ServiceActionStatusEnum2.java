
package eu.datex2.schema._3.cisinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceActionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceActionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="compliant"/&gt;
 *     &lt;enumeration value="failed"/&gt;
 *     &lt;enumeration value="notCompliant"/&gt;
 *     &lt;enumeration value="processing"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="success"/&gt;
 *     &lt;enumeration value="timedOut"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceActionStatusEnum")
@XmlEnum
public enum ServiceActionStatusEnum2 {

    @XmlEnumValue("compliant")
    COMPLIANT("compliant"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("notCompliant")
    NOT_COMPLIANT("notCompliant"),
    @XmlEnumValue("processing")
    PROCESSING("processing"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("timedOut")
    TIMED_OUT("timedOut"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ServiceActionStatusEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceActionStatusEnum2 fromValue(String v) {
        for (ServiceActionStatusEnum2 c: ServiceActionStatusEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
