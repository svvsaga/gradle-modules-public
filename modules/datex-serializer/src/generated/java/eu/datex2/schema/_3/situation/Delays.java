
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Delays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delays"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delayBand" type="{http://datex2.eu/schema/3/situation}_DelayBandEnum" minOccurs="0"/&gt;
 *         &lt;element name="delaysType" type="{http://datex2.eu/schema/3/situation}_DelaysTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="delayTimeValue" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="_delaysExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delays", propOrder = {
    "delayBand",
    "delaysType",
    "delayTimeValue",
    "_DelaysExtension"
})
public class Delays {

    protected _DelayBandEnum delayBand;
    protected _DelaysTypeEnum delaysType;
    protected Float delayTimeValue;
    @XmlElement(name = "_delaysExtension")
    protected _ExtensionType _DelaysExtension;

    /**
     * Gets the value of the delayBand property.
     * 
     * @return
     *     possible object is
     *     {@link _DelayBandEnum }
     *     
     */
    public _DelayBandEnum getDelayBand() {
        return delayBand;
    }

    /**
     * Sets the value of the delayBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DelayBandEnum }
     *     
     */
    public void setDelayBand(_DelayBandEnum value) {
        this.delayBand = value;
    }

    /**
     * Gets the value of the delaysType property.
     * 
     * @return
     *     possible object is
     *     {@link _DelaysTypeEnum }
     *     
     */
    public _DelaysTypeEnum getDelaysType() {
        return delaysType;
    }

    /**
     * Sets the value of the delaysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DelaysTypeEnum }
     *     
     */
    public void setDelaysType(_DelaysTypeEnum value) {
        this.delaysType = value;
    }

    /**
     * Gets the value of the delayTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDelayTimeValue() {
        return delayTimeValue;
    }

    /**
     * Sets the value of the delayTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDelayTimeValue(Float value) {
        this.delayTimeValue = value;
    }

    /**
     * Gets the value of the _DelaysExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DelaysExtension() {
        return _DelaysExtension;
    }

    /**
     * Sets the value of the _DelaysExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DelaysExtension(_ExtensionType value) {
        this._DelaysExtension = value;
    }

}
