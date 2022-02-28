
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of the accumulation rate of precipitation.
 *       
 * 
 * <p>Java class for PrecipitationIntensityValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationIntensityValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="millimetresPerHourIntensity" type="{http://datex2.eu/schema/3/common}IntensityMillimetresPerHour"/&gt;
 *         &lt;element name="_precipitationIntensityValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationIntensityValue", propOrder = {
    "millimetresPerHourIntensity",
    "_PrecipitationIntensityValueExtension"
})
public class PrecipitationIntensityValue
    extends DataValue
{

    protected float millimetresPerHourIntensity;
    @XmlElement(name = "_precipitationIntensityValueExtension")
    protected _ExtensionType _PrecipitationIntensityValueExtension;

    /**
     * Gets the value of the millimetresPerHourIntensity property.
     * 
     */
    public float getMillimetresPerHourIntensity() {
        return millimetresPerHourIntensity;
    }

    /**
     * Sets the value of the millimetresPerHourIntensity property.
     * 
     */
    public void setMillimetresPerHourIntensity(float value) {
        this.millimetresPerHourIntensity = value;
    }

    /**
     * Gets the value of the _PrecipitationIntensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PrecipitationIntensityValueExtension() {
        return _PrecipitationIntensityValueExtension;
    }

    /**
     * Sets the value of the _PrecipitationIntensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PrecipitationIntensityValueExtension(_ExtensionType value) {
        this._PrecipitationIntensityValueExtension = value;
    }

}
