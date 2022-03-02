
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of wind speed.
 * 
 * <p>Java class for WindSpeedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindSpeedValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/3/common}MetresPerSecond"/&gt;
 *         &lt;element name="_windSpeedValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindSpeedValue", propOrder = {
    "windSpeed",
    "windSpeedValueExtension"
})
public class WindSpeedValue
    extends DataValue
{

    protected float windSpeed;
    @XmlElement(name = "_windSpeedValueExtension")
    protected ExtensionType windSpeedValueExtension;

    /**
     * Gets the value of the windSpeed property.
     * 
     */
    public float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     */
    public void setWindSpeed(float value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windSpeedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindSpeedValueExtension() {
        return windSpeedValueExtension;
    }

    /**
     * Sets the value of the windSpeedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindSpeedValueExtension(ExtensionType value) {
        this.windSpeedValueExtension = value;
    }

}
