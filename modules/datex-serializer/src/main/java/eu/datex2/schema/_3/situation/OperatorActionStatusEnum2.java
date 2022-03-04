
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperatorActionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requested"/&gt;
 *     &lt;enumeration value="approved"/&gt;
 *     &lt;enumeration value="beingImplemented"/&gt;
 *     &lt;enumeration value="implemented"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="terminationRequested"/&gt;
 *     &lt;enumeration value="beingTerminated"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionStatusEnum")
@XmlEnum
public enum OperatorActionStatusEnum2 {

    @XmlEnumValue("requested")
    REQUESTED("requested"),
    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("beingImplemented")
    BEING_IMPLEMENTED("beingImplemented"),
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("terminationRequested")
    TERMINATION_REQUESTED("terminationRequested"),
    @XmlEnumValue("beingTerminated")
    BEING_TERMINATED("beingTerminated"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    OperatorActionStatusEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionStatusEnum2 fromValue(String v) {
        for (OperatorActionStatusEnum2 c: OperatorActionStatusEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
