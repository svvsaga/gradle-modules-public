
package eu.datex2.schema._3.roadtrafficdata;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Period;
import eu.datex2.schema._3.common.TimePrecisionEnum2;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Describes the time at which a measured or calculated value or set of values was measured
 *         or calculated. It may be a future time at which a data value is predicted to apply.
 *       
 * 
 * <p>Java class for MeasurementOrCalculationTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementOrCalculationTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeMeaning" type="{http://datex2.eu/schema/3/roadTrafficData}_TimeMeaningEnum" minOccurs="0"/&gt;
 *         &lt;element name="timeValue" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/3/common}Period" minOccurs="0"/&gt;
 *         &lt;element name="_measurementOrCalculationTimeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="timePrecision" type="{http://datex2.eu/schema/3/common}TimePrecisionEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementOrCalculationTime", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "timeMeaning",
    "timeValue",
    "period",
    "measurementOrCalculationTimeExtension"
})
public class MeasurementOrCalculationTime {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected TimeMeaningEnum timeMeaning;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeValue;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Period period;
    @XmlElement(name = "_measurementOrCalculationTimeExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType measurementOrCalculationTimeExtension;
    @XmlAttribute(name = "timePrecision")
    protected TimePrecisionEnum2 timePrecision;

    /**
     * Gets the value of the timeMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeaningEnum }
     *     
     */
    public TimeMeaningEnum getTimeMeaning() {
        return timeMeaning;
    }

    /**
     * Sets the value of the timeMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeaningEnum }
     *     
     */
    public void setTimeMeaning(TimeMeaningEnum value) {
        this.timeMeaning = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeValue(XMLGregorianCalendar value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the measurementOrCalculationTimeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementOrCalculationTimeExtension() {
        return measurementOrCalculationTimeExtension;
    }

    /**
     * Sets the value of the measurementOrCalculationTimeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementOrCalculationTimeExtension(ExtensionType value) {
        this.measurementOrCalculationTimeExtension = value;
    }

    /**
     * Gets the value of the timePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrecisionEnum2 }
     *     
     */
    public TimePrecisionEnum2 getTimePrecision() {
        return timePrecision;
    }

    /**
     * Sets the value of the timePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrecisionEnum2 }
     *     
     */
    public void setTimePrecision(TimePrecisionEnum2 value) {
        this.timePrecision = value;
    }

}
