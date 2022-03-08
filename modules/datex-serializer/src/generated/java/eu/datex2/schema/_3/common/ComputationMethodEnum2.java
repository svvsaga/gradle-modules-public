
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ComputationMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"/&gt;
 *     &lt;enumeration value="arithmeticAverageOfSamplesInATimePeriod"/&gt;
 *     &lt;enumeration value="harmonicAverageOfSamplesInATimePeriod"/&gt;
 *     &lt;enumeration value="medianOfSamplesInATimePeriod"/&gt;
 *     &lt;enumeration value="movingAverageOfSamples"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComputationMethodEnum")
@XmlEnum
public enum ComputationMethodEnum2 {

    @XmlEnumValue("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples")
    ARITHMETIC_AVERAGE_OF_SAMPLES_BASED_ON_A_FIXED_NUMBER_OF_SAMPLES("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"),
    @XmlEnumValue("arithmeticAverageOfSamplesInATimePeriod")
    ARITHMETIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("arithmeticAverageOfSamplesInATimePeriod"),
    @XmlEnumValue("harmonicAverageOfSamplesInATimePeriod")
    HARMONIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("harmonicAverageOfSamplesInATimePeriod"),
    @XmlEnumValue("medianOfSamplesInATimePeriod")
    MEDIAN_OF_SAMPLES_IN_A_TIME_PERIOD("medianOfSamplesInATimePeriod"),
    @XmlEnumValue("movingAverageOfSamples")
    MOVING_AVERAGE_OF_SAMPLES("movingAverageOfSamples"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ComputationMethodEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComputationMethodEnum2 fromValue(String v) {
        for (ComputationMethodEnum2 c: ComputationMethodEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
