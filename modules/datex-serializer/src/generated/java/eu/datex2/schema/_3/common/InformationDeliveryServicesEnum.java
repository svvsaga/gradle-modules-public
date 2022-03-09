
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationDeliveryServicesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InformationDeliveryServicesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="anyGeneralDeliveryService"/&gt;
 *     &lt;enumeration value="safetyServices"/&gt;
 *     &lt;enumeration value="vms"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationDeliveryServicesEnum")
@XmlEnum
public enum InformationDeliveryServicesEnum {

    @XmlEnumValue("anyGeneralDeliveryService")
    ANY_GENERAL_DELIVERY_SERVICE("anyGeneralDeliveryService"),
    @XmlEnumValue("safetyServices")
    SAFETY_SERVICES("safetyServices"),
    @XmlEnumValue("vms")
    VMS("vms"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    InformationDeliveryServicesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationDeliveryServicesEnum fromValue(String v) {
        for (InformationDeliveryServicesEnum c: InformationDeliveryServicesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
