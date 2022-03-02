
package eu.datex2.schema._3.exchangeinformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtocolTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProtocolTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="deltaPull"/&gt;
 *     &lt;enumeration value="deltaPush"/&gt;
 *     &lt;enumeration value="simpleCIS"/&gt;
 *     &lt;enumeration value="simplePush"/&gt;
 *     &lt;enumeration value="snapshotPull"/&gt;
 *     &lt;enumeration value="snapshotPush"/&gt;
 *     &lt;enumeration value="statefulCIS"/&gt;
 *     &lt;enumeration value="statefulPush"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtocolTypeEnum")
@XmlEnum
public enum ProtocolTypeEnum2 {

    @XmlEnumValue("deltaPull")
    DELTA_PULL("deltaPull"),
    @XmlEnumValue("deltaPush")
    DELTA_PUSH("deltaPush"),
    @XmlEnumValue("simpleCIS")
    SIMPLE_CIS("simpleCIS"),
    @XmlEnumValue("simplePush")
    SIMPLE_PUSH("simplePush"),
    @XmlEnumValue("snapshotPull")
    SNAPSHOT_PULL("snapshotPull"),
    @XmlEnumValue("snapshotPush")
    SNAPSHOT_PUSH("snapshotPush"),
    @XmlEnumValue("statefulCIS")
    STATEFUL_CIS("statefulCIS"),
    @XmlEnumValue("statefulPush")
    STATEFUL_PUSH("statefulPush"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ProtocolTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolTypeEnum2 fromValue(String v) {
        for (ProtocolTypeEnum2 c: ProtocolTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
