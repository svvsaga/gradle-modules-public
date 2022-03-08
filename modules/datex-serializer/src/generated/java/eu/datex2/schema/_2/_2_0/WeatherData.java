
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "weatherDataExtension"
})
@XmlSeeAlso({
    HumidityInformation.class,
    PollutionInformation.class,
    PrecipitationInformation.class,
    RoadSurfaceConditionInformation.class,
    TemperatureInformation.class,
    VisibilityInformation.class,
    WindInformation.class
})
public abstract class WeatherData
    extends BasicData
{

    protected ExtensionType weatherDataExtension;

    /**
     * Gets the value of the weatherDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherDataExtension() {
        return weatherDataExtension;
    }

    /**
     * Sets the value of the weatherDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherDataExtension(ExtensionType value) {
        this.weatherDataExtension = value;
    }

}
