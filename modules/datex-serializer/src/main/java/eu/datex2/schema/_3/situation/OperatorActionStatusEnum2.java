
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
@XmlType(name = "OperatorActionStatusEnum", namespace = "http://datex2.eu/schema/3/situation")
@XmlEnum
public enum OperatorActionStatusEnum2 {


    /**
     * A request, either internal or external, has been received to implement an action.
     *             It has neither been approved nor has any activity yet been undertaken to implement the action.
     *           
     * 
     */
    @XmlEnumValue("requested")
    REQUESTED("requested"),

    /**
     * The action has been approved by the recipient of the request but activity to
     *             implement the action has not yet commenced.
     *           
     * 
     */
    @XmlEnumValue("approved")
    APPROVED("approved"),

    /**
     * The action is in the process of being implemented.
     * 
     */
    @XmlEnumValue("beingImplemented")
    BEING_IMPLEMENTED("beingImplemented"),

    /**
     * The action is fully implemented.
     * 
     */
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),

    /**
     * The action has been rejected by the recipient of the request and hence is not
     *             implemented.
     *           
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * A request, either internal or external, has been received to terminate the action,
     *             but activity to terminate the action has not yet commenced.
     *           
     * 
     */
    @XmlEnumValue("terminationRequested")
    TERMINATION_REQUESTED("terminationRequested"),

    /**
     * The action is in the process of being terminated either because the action has
     *             reached the end of its validity period or because new circumstances have arisen and its
     *             termination has been requested, e.g. because of a traffic jam on the alternative route.
     *           
     * 
     */
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
