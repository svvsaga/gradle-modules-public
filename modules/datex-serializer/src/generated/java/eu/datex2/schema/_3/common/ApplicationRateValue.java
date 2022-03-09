
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationRateValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationRate" type="{http://datex2.eu/schema/3/common}IntensityKilogramsPerSquareMetre"/&gt;
 *         &lt;element name="_applicationRateValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationRateValue", propOrder = {
    "applicationRate",
    "_ApplicationRateValueExtension"
})
public class ApplicationRateValue
    extends DataValue
{

    protected float applicationRate;
    @XmlElement(name = "_applicationRateValueExtension")
    protected _ExtensionType _ApplicationRateValueExtension;

    /**
     * Gets the value of the applicationRate property.
     * 
     */
    public float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     */
    public void setApplicationRate(float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the _ApplicationRateValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ApplicationRateValueExtension() {
        return _ApplicationRateValueExtension;
    }

    /**
     * Sets the value of the _ApplicationRateValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ApplicationRateValueExtension(_ExtensionType value) {
        this._ApplicationRateValueExtension = value;
    }

}
