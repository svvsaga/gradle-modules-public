
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mobility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/3/situation}_MobilityTypeEnum"/&gt;
 *         &lt;element name="speed" type="{http://datex2.eu/schema/3/common}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="_mobilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", propOrder = {
    "mobilityType",
    "speed",
    "_MobilityExtension"
})
public class Mobility {

    @XmlElement(required = true)
    protected _MobilityTypeEnum mobilityType;
    protected Float speed;
    @XmlElement(name = "_mobilityExtension")
    protected _ExtensionType _MobilityExtension;

    /**
     * Gets the value of the mobilityType property.
     * 
     * @return
     *     possible object is
     *     {@link _MobilityTypeEnum }
     *     
     */
    public _MobilityTypeEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Sets the value of the mobilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _MobilityTypeEnum }
     *     
     */
    public void setMobilityType(_MobilityTypeEnum value) {
        this.mobilityType = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the _MobilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MobilityExtension() {
        return _MobilityExtension;
    }

    /**
     * Sets the value of the _MobilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MobilityExtension(_ExtensionType value) {
        this._MobilityExtension = value;
    }

}
