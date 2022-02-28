
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data that are either measured or calculated at the same time or over the same time
 *         period.
 *       
 * 
 * <p>Java class for BasicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementOrCalculationTime" type="{http://datex2.eu/schema/3/roadTrafficData}MeasurementOrCalculationTime" minOccurs="0"/&gt;
 *         &lt;element name="_basicDataExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicData", propOrder = {
    "measurementOrCalculationTime",
    "_BasicDataExtension"
})
@XmlSeeAlso({
    TrafficData.class,
    TrafficStatus.class,
    TravelTimeData.class,
    WeatherData.class
})
public abstract class BasicData {

    protected MeasurementOrCalculationTime measurementOrCalculationTime;
    @XmlElement(name = "_basicDataExtension")
    protected _ExtensionType _BasicDataExtension;

    /**
     * Gets the value of the measurementOrCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementOrCalculationTime }
     *     
     */
    public MeasurementOrCalculationTime getMeasurementOrCalculationTime() {
        return measurementOrCalculationTime;
    }

    /**
     * Sets the value of the measurementOrCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementOrCalculationTime }
     *     
     */
    public void setMeasurementOrCalculationTime(MeasurementOrCalculationTime value) {
        this.measurementOrCalculationTime = value;
    }

    /**
     * Gets the value of the _BasicDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_BasicDataExtension() {
        return _BasicDataExtension;
    }

    /**
     * Sets the value of the _BasicDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_BasicDataExtension(_ExtensionType value) {
        this._BasicDataExtension = value;
    }

}
