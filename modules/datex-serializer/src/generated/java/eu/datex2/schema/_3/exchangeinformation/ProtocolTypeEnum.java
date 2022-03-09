
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
 *     &lt;enumeration value="simplePush"/&gt;
 *     &lt;enumeration value="snapshotPull"/&gt;
 *     &lt;enumeration value="snapshotPush"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProtocolTypeEnum")
@XmlEnum
public enum ProtocolTypeEnum {

    @XmlEnumValue("simplePush")
    SIMPLE_PUSH("simplePush"),
    @XmlEnumValue("snapshotPull")
    SNAPSHOT_PULL("snapshotPull"),
    @XmlEnumValue("snapshotPush")
    SNAPSHOT_PUSH("snapshotPush"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ProtocolTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolTypeEnum fromValue(String v) {
        for (ProtocolTypeEnum c: ProtocolTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
