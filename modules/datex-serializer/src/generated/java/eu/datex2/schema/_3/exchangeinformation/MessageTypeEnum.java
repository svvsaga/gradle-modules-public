
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessageTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="payloadDelivery"/&gt;
 *     &lt;enumeration value="openSession"/&gt;
 *     &lt;enumeration value="keepAlive"/&gt;
 *     &lt;enumeration value="closeSession"/&gt;
 *     &lt;enumeration value="return"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeEnum")
@XmlEnum
public enum MessageTypeEnum {

    @XmlEnumValue("payloadDelivery")
    PAYLOAD_DELIVERY("payloadDelivery"),
    @XmlEnumValue("openSession")
    OPEN_SESSION("openSession"),
    @XmlEnumValue("keepAlive")
    KEEP_ALIVE("keepAlive"),
    @XmlEnumValue("closeSession")
    CLOSE_SESSION("closeSession"),
    @XmlEnumValue("return")
    RETURN("return"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    MessageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeEnum fromValue(String v) {
        for (MessageTypeEnum c: MessageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
