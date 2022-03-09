
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_WindSpeedValueExtension"
})
public class WindSpeedValue
    extends DataValue
{

    protected float windSpeed;
    @XmlElement(name = "_windSpeedValueExtension")
    protected _ExtensionType _WindSpeedValueExtension;

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
     * Gets the value of the _WindSpeedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WindSpeedValueExtension() {
        return _WindSpeedValueExtension;
    }

    /**
     * Sets the value of the _WindSpeedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WindSpeedValueExtension(_ExtensionType value) {
        this._WindSpeedValueExtension = value;
    }

}
