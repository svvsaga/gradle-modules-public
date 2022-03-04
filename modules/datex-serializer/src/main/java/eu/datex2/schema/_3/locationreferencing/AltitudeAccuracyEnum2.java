
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AltitudeAccuracyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AltitudeAccuracyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="equalToOrLessThan1Centimetre"/&gt;
 *     &lt;enumeration value="equalToOrLessThan2Centimetres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan5Centimetres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan10Centimetres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan20Centimetres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan50Centimetres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan1Metre"/&gt;
 *     &lt;enumeration value="equalToOrLessThan2Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan5Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan10Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan20Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan50Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan100Metres"/&gt;
 *     &lt;enumeration value="equalToOrLessThan200Metres"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AltitudeAccuracyEnum")
@XmlEnum
public enum AltitudeAccuracyEnum2 {

    @XmlEnumValue("equalToOrLessThan1Centimetre")
    EQUAL_TO_OR_LESS_THAN_1_CENTIMETRE("equalToOrLessThan1Centimetre"),
    @XmlEnumValue("equalToOrLessThan2Centimetres")
    EQUAL_TO_OR_LESS_THAN_2_CENTIMETRES("equalToOrLessThan2Centimetres"),
    @XmlEnumValue("equalToOrLessThan5Centimetres")
    EQUAL_TO_OR_LESS_THAN_5_CENTIMETRES("equalToOrLessThan5Centimetres"),
    @XmlEnumValue("equalToOrLessThan10Centimetres")
    EQUAL_TO_OR_LESS_THAN_10_CENTIMETRES("equalToOrLessThan10Centimetres"),
    @XmlEnumValue("equalToOrLessThan20Centimetres")
    EQUAL_TO_OR_LESS_THAN_20_CENTIMETRES("equalToOrLessThan20Centimetres"),
    @XmlEnumValue("equalToOrLessThan50Centimetres")
    EQUAL_TO_OR_LESS_THAN_50_CENTIMETRES("equalToOrLessThan50Centimetres"),
    @XmlEnumValue("equalToOrLessThan1Metre")
    EQUAL_TO_OR_LESS_THAN_1_METRE("equalToOrLessThan1Metre"),
    @XmlEnumValue("equalToOrLessThan2Metres")
    EQUAL_TO_OR_LESS_THAN_2_METRES("equalToOrLessThan2Metres"),
    @XmlEnumValue("equalToOrLessThan5Metres")
    EQUAL_TO_OR_LESS_THAN_5_METRES("equalToOrLessThan5Metres"),
    @XmlEnumValue("equalToOrLessThan10Metres")
    EQUAL_TO_OR_LESS_THAN_10_METRES("equalToOrLessThan10Metres"),
    @XmlEnumValue("equalToOrLessThan20Metres")
    EQUAL_TO_OR_LESS_THAN_20_METRES("equalToOrLessThan20Metres"),
    @XmlEnumValue("equalToOrLessThan50Metres")
    EQUAL_TO_OR_LESS_THAN_50_METRES("equalToOrLessThan50Metres"),
    @XmlEnumValue("equalToOrLessThan100Metres")
    EQUAL_TO_OR_LESS_THAN_100_METRES("equalToOrLessThan100Metres"),
    @XmlEnumValue("equalToOrLessThan200Metres")
    EQUAL_TO_OR_LESS_THAN_200_METRES("equalToOrLessThan200Metres"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    AltitudeAccuracyEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AltitudeAccuracyEnum2 fromValue(String v) {
        for (AltitudeAccuracyEnum2 c: AltitudeAccuracyEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
