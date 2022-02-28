
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingLayoutEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingLayoutEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="multiStorey"/&gt;
 *     &lt;enumeration value="singleLevel"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *     &lt;enumeration value="undergroundAndMultistorey"/&gt;
 *     &lt;enumeration value="automatedParkingGarage"/&gt;
 *     &lt;enumeration value="openSpace"/&gt;
 *     &lt;enumeration value="covered"/&gt;
 *     &lt;enumeration value="nested"/&gt;
 *     &lt;enumeration value="field"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingLayoutEnum")
@XmlEnum
public enum ParkingLayoutEnum {

    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),
    @XmlEnumValue("undergroundAndMultistorey")
    UNDERGROUND_AND_MULTISTOREY("undergroundAndMultistorey"),
    @XmlEnumValue("automatedParkingGarage")
    AUTOMATED_PARKING_GARAGE("automatedParkingGarage"),
    @XmlEnumValue("openSpace")
    OPEN_SPACE("openSpace"),
    @XmlEnumValue("covered")
    COVERED("covered"),
    @XmlEnumValue("nested")
    NESTED("nested"),
    @XmlEnumValue("field")
    FIELD("field"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingLayoutEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingLayoutEnum fromValue(String v) {
        for (ParkingLayoutEnum c: ParkingLayoutEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
