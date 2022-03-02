
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inOperation"/&gt;
 *     &lt;enumeration value="limitedOperation"/&gt;
 *     &lt;enumeration value="notInOperation"/&gt;
 *     &lt;enumeration value="notInOperationAbnormal"/&gt;
 *     &lt;enumeration value="technicalDefect"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationStatusEnum")
@XmlEnum
public enum OperationStatusEnum {

    @XmlEnumValue("inOperation")
    IN_OPERATION("inOperation"),
    @XmlEnumValue("limitedOperation")
    LIMITED_OPERATION("limitedOperation"),
    @XmlEnumValue("notInOperation")
    NOT_IN_OPERATION("notInOperation"),
    @XmlEnumValue("notInOperationAbnormal")
    NOT_IN_OPERATION_ABNORMAL("notInOperationAbnormal"),
    @XmlEnumValue("technicalDefect")
    TECHNICAL_DEFECT("technicalDefect"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    OperationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationStatusEnum fromValue(String v) {
        for (OperationStatusEnum c: OperationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
