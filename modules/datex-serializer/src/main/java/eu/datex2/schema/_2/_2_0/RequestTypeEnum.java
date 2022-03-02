
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="catalogue"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *     &lt;enumeration value="requestData"/&gt;
 *     &lt;enumeration value="requestHistoricalData"/&gt;
 *     &lt;enumeration value="subscription"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RequestTypeEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("requestData")
    REQUEST_DATA("requestData"),
    @XmlEnumValue("requestHistoricalData")
    REQUEST_HISTORICAL_DATA("requestHistoricalData"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
