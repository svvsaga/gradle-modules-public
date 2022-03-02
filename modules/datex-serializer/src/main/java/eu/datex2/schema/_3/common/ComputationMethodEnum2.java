
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


    /**
     * Arithmetic average of sample values based on a fixed number of samples.
     *           
     * 
     */
    @XmlEnumValue("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples")
    ARITHMETIC_AVERAGE_OF_SAMPLES_BASED_ON_A_FIXED_NUMBER_OF_SAMPLES("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"),

    /**
     * Arithmetic average of sample values in a time period.
     * 
     */
    @XmlEnumValue("arithmeticAverageOfSamplesInATimePeriod")
    ARITHMETIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("arithmeticAverageOfSamplesInATimePeriod"),

    /**
     * Harmonic average of sample values in a time period.
     * 
     */
    @XmlEnumValue("harmonicAverageOfSamplesInATimePeriod")
    HARMONIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("harmonicAverageOfSamplesInATimePeriod"),

    /**
     * Median of sample values taken over a time period.
     * 
     */
    @XmlEnumValue("medianOfSamplesInATimePeriod")
    MEDIAN_OF_SAMPLES_IN_A_TIME_PERIOD("medianOfSamplesInATimePeriod"),

    /**
     * Moving average of sample values.
     * 
     */
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
