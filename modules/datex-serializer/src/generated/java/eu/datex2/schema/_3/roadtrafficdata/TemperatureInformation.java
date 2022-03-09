
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.Temperature;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/3/common}Temperature"/&gt;
 *         &lt;element name="_temperatureInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureInformation", propOrder = {
    "temperature",
    "_TemperatureInformationExtension"
})
public class TemperatureInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Temperature temperature;
    @XmlElement(name = "_temperatureInformationExtension")
    protected _ExtensionType _TemperatureInformationExtension;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the _TemperatureInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TemperatureInformationExtension() {
        return _TemperatureInformationExtension;
    }

    /**
     * Sets the value of the _TemperatureInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TemperatureInformationExtension(_ExtensionType value) {
        this._TemperatureInformationExtension = value;
    }

}
