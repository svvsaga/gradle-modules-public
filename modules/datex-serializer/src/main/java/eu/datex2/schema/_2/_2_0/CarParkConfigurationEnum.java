
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarParkConfigurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CarParkConfigurationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="multiStorey"/&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="singleLevel"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarParkConfigurationEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum CarParkConfigurationEnum {

    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    CarParkConfigurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkConfigurationEnum fromValue(String v) {
        for (CarParkConfigurationEnum c: CarParkConfigurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
