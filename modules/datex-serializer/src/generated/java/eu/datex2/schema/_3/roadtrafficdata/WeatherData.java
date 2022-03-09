
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_weatherDataExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherData", propOrder = {
    "_WeatherDataExtension"
})
@XmlSeeAlso({
    HumidityInformation.class,
    PollutionInformation.class,
    PrecipitationInformation.class,
    PressureInformation.class,
    RoadSurfaceConditionInformation.class,
    TemperatureInformation.class,
    VisibilityInformation.class,
    WindInformation.class
})
public abstract class WeatherData
    extends BasicData
{

    @XmlElement(name = "_weatherDataExtension")
    protected _ExtensionType _WeatherDataExtension;

    /**
     * Gets the value of the _WeatherDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WeatherDataExtension() {
        return _WeatherDataExtension;
    }

    /**
     * Sets the value of the _WeatherDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WeatherDataExtension(_ExtensionType value) {
        this._WeatherDataExtension = value;
    }

}
