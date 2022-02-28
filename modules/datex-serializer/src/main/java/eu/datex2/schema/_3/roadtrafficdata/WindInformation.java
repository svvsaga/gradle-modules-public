
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.Wind;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements of wind conditions.
 * 
 * <p>Java class for WindInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wind" type="{http://datex2.eu/schema/3/common}Wind"/&gt;
 *         &lt;element name="_windInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindInformation", propOrder = {
    "wind",
    "_WindInformationExtension"
})
public class WindInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Wind wind;
    @XmlElement(name = "_windInformationExtension")
    protected _ExtensionType _WindInformationExtension;

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
     * Gets the value of the _WindInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WindInformationExtension() {
        return _WindInformationExtension;
    }

    /**
     * Sets the value of the _WindInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WindInformationExtension(_ExtensionType value) {
        this._WindInformationExtension = value;
    }

}
