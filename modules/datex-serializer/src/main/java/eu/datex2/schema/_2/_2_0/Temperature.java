
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Temperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Temperature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="dewPointTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="maximumTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="minimumTemperature" type="{http://datex2.eu/schema/2/2_0}TemperatureValue" minOccurs="0"/&gt;
 *         &lt;element name="temperatureExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", propOrder = {
    "airTemperature",
    "dewPointTemperature",
    "maximumTemperature",
    "minimumTemperature",
    "temperatureExtension"
})
public class Temperature {

    protected TemperatureValue airTemperature;
    protected TemperatureValue dewPointTemperature;
    protected TemperatureValue maximumTemperature;
    protected TemperatureValue minimumTemperature;
    protected _ExtensionType temperatureExtension;

    /**
     * Gets the value of the airTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getAirTemperature() {
        return airTemperature;
    }

    /**
     * Sets the value of the airTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setAirTemperature(TemperatureValue value) {
        this.airTemperature = value;
    }

    /**
     * Gets the value of the dewPointTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Sets the value of the dewPointTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setDewPointTemperature(TemperatureValue value) {
        this.dewPointTemperature = value;
    }

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setMaximumTemperature(TemperatureValue value) {
        this.maximumTemperature = value;
    }

    /**
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setMinimumTemperature(TemperatureValue value) {
        this.minimumTemperature = value;
    }

    /**
     * Gets the value of the temperatureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTemperatureExtension() {
        return temperatureExtension;
    }

    /**
     * Sets the value of the temperatureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTemperatureExtension(_ExtensionType value) {
        this.temperatureExtension = value;
    }

}
