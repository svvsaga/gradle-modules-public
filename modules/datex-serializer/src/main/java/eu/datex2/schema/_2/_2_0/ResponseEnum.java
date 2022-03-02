
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="acknowledge"/&gt;
 *     &lt;enumeration value="catalogueRequestDenied"/&gt;
 *     &lt;enumeration value="filterRequestDenied"/&gt;
 *     &lt;enumeration value="requestDenied"/&gt;
 *     &lt;enumeration value="subscriptionRequestDenied"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum ResponseEnum {

    @XmlEnumValue("acknowledge")
    ACKNOWLEDGE("acknowledge"),
    @XmlEnumValue("catalogueRequestDenied")
    CATALOGUE_REQUEST_DENIED("catalogueRequestDenied"),
    @XmlEnumValue("filterRequestDenied")
    FILTER_REQUEST_DENIED("filterRequestDenied"),
    @XmlEnumValue("requestDenied")
    REQUEST_DENIED("requestDenied"),
    @XmlEnumValue("subscriptionRequestDenied")
    SUBSCRIPTION_REQUEST_DENIED("subscriptionRequestDenied");
    private final String value;

    ResponseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseEnum fromValue(String v) {
        for (ResponseEnum c: ResponseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
