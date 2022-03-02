
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementOrCalculationPeriod" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="measurementOrCalculationTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="basicDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="measurementOrCalculatedTimePrecision" type="{http://datex2.eu/schema/2/2_0}TimePrecisionEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicData", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "measurementOrCalculationPeriod",
    "measurementOrCalculationTime",
    "pertinentLocation",
    "basicDataExtension"
})
@XmlSeeAlso({
    TrafficData.class,
    TrafficStatus.class,
    TravelTimeData.class,
    WeatherData.class
})
public abstract class BasicData {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float measurementOrCalculationPeriod;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementOrCalculationTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected GroupOfLocations pertinentLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType basicDataExtension;
    @XmlAttribute(name = "measurementOrCalculatedTimePrecision")
    protected TimePrecisionEnum measurementOrCalculatedTimePrecision;

    /**
     * Gets the value of the measurementOrCalculationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasurementOrCalculationPeriod() {
        return measurementOrCalculationPeriod;
    }

    /**
     * Sets the value of the measurementOrCalculationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasurementOrCalculationPeriod(Float value) {
        this.measurementOrCalculationPeriod = value;
    }

    /**
     * Gets the value of the measurementOrCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementOrCalculationTime() {
        return measurementOrCalculationTime;
    }

    /**
     * Sets the value of the measurementOrCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementOrCalculationTime(XMLGregorianCalendar value) {
        this.measurementOrCalculationTime = value;
    }

    /**
     * Gets the value of the pertinentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Sets the value of the pertinentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setPertinentLocation(GroupOfLocations value) {
        this.pertinentLocation = value;
    }

    /**
     * Gets the value of the basicDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataExtension() {
        return basicDataExtension;
    }

    /**
     * Sets the value of the basicDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataExtension(ExtensionType value) {
        this.basicDataExtension = value;
    }

    /**
     * Gets the value of the measurementOrCalculatedTimePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrecisionEnum }
     *     
     */
    public TimePrecisionEnum getMeasurementOrCalculatedTimePrecision() {
        return measurementOrCalculatedTimePrecision;
    }

    /**
     * Sets the value of the measurementOrCalculatedTimePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrecisionEnum }
     *     
     */
    public void setMeasurementOrCalculatedTimePrecision(TimePrecisionEnum value) {
        this.measurementOrCalculatedTimePrecision = value;
    }

}
