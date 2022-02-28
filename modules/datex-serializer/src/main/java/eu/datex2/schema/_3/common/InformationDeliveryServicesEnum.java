
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


    /**
     * Includes any general delivery channel such as broadcast channels (e.g. radio, tv,
     *             RDS-TMC, TPEG services, etc.) or web publishing available to public or to specific users,
     *             depending on Service Provider policies.
     *           
     * 
     */
    @XmlEnumValue("anyGeneralDeliveryService")
    ANY_GENERAL_DELIVERY_SERVICE("anyGeneralDeliveryService"),

    /**
     * Specific services which deliver warning alerts to end users to enhance safety via
     *             any specific application available to drivers, including C-ITS services.
     *           
     * 
     */
    @XmlEnumValue("safetyServices")
    SAFETY_SERVICES("safetyServices"),

    /**
     * Variable Message Signs or any other visual roadside devices which information are
     *             accessible to drivers which aim to affect driving style improving safety and road network LoS.
     *           
     * 
     */
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
