
package eu.datex2.schema._3.cisinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedServiceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PredefinedServiceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="broadcastDelivery"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="tmpActivation"/&gt;
 *     &lt;enumeration value="vmsMessageProcessing"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PredefinedServiceEnum")
@XmlEnum
public enum PredefinedServiceEnum2 {

    @XmlEnumValue("broadcastDelivery")
    BROADCAST_DELIVERY("broadcastDelivery"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("tmpActivation")
    TMP_ACTIVATION("tmpActivation"),
    @XmlEnumValue("vmsMessageProcessing")
    VMS_MESSAGE_PROCESSING("vmsMessageProcessing"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    PredefinedServiceEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredefinedServiceEnum2 fromValue(String v) {
        for (PredefinedServiceEnum2 c: PredefinedServiceEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
