
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Humidity;
import eu.datex2.schema._3.common.Pollution;
import eu.datex2.schema._3.common.PrecipitationDetail;
import eu.datex2.schema._3.common.Pressure;
import eu.datex2.schema._3.common.Temperature;
import eu.datex2.schema._3.common.Visibility;
import eu.datex2.schema._3.common.Wind;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any environmental conditions which may be affecting the driving conditions on the road.
 *       
 * 
 * <p>Java class for PoorEnvironmentConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoorEnvironmentConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Conditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poorEnvironmentType" type="{http://datex2.eu/schema/3/situation}_PoorEnvironmentTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/3/common}PrecipitationDetail" minOccurs="0"/&gt;
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/3/common}Visibility" minOccurs="0"/&gt;
 *         &lt;element name="pollution" type="{http://datex2.eu/schema/3/common}Pollution" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/3/common}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="wind" type="{http://datex2.eu/schema/3/common}Wind" minOccurs="0"/&gt;
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/3/common}Humidity" minOccurs="0"/&gt;
 *         &lt;element name="pressure" type="{http://datex2.eu/schema/3/common}Pressure" minOccurs="0"/&gt;
 *         &lt;element name="_poorEnvironmentConditionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorEnvironmentConditions", propOrder = {
    "poorEnvironmentType",
    "precipitationDetail",
    "visibility",
    "pollution",
    "temperature",
    "wind",
    "humidity",
    "pressure",
    "poorEnvironmentConditionsExtension"
})
public class PoorEnvironmentConditions
    extends Conditions
{

    @XmlElement(required = true)
    protected List<PoorEnvironmentTypeEnum> poorEnvironmentType;
    protected PrecipitationDetail precipitationDetail;
    protected Visibility visibility;
    protected Pollution pollution;
    protected Temperature temperature;
    protected Wind wind;
    protected Humidity humidity;
    protected Pressure pressure;
    @XmlElement(name = "_poorEnvironmentConditionsExtension")
    protected ExtensionType poorEnvironmentConditionsExtension;

    /**
     * Gets the value of the poorEnvironmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poorEnvironmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoorEnvironmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoorEnvironmentTypeEnum }
     * 
     * 
     */
    public List<PoorEnvironmentTypeEnum> getPoorEnvironmentType() {
        if (poorEnvironmentType == null) {
            poorEnvironmentType = new ArrayList<PoorEnvironmentTypeEnum>();
        }
        return this.poorEnvironmentType;
    }

    /**
     * Gets the value of the precipitationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Sets the value of the precipitationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the pollution property.
     * 
     * @return
     *     possible object is
     *     {@link Pollution }
     *     
     */
    public Pollution getPollution() {
        return pollution;
    }

    /**
     * Sets the value of the pollution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pollution }
     *     
     */
    public void setPollution(Pollution value) {
        this.pollution = value;
    }

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
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link Pressure }
     *     
     */
    public Pressure getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pressure }
     *     
     */
    public void setPressure(Pressure value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the poorEnvironmentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPoorEnvironmentConditionsExtension() {
        return poorEnvironmentConditionsExtension;
    }

    /**
     * Sets the value of the poorEnvironmentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPoorEnvironmentConditionsExtension(ExtensionType value) {
        this.poorEnvironmentConditionsExtension = value;
    }

}
