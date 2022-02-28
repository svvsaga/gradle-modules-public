
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of direction as a point of the compass.
 * 
 * <p>Java class for DirectionCompassValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionCompassValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionCompass" type="{http://datex2.eu/schema/3/common}_DirectionCompassEnum"/&gt;
 *         &lt;element name="_directionCompassValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionCompassValue", propOrder = {
    "directionCompass",
    "_DirectionCompassValueExtension"
})
public class DirectionCompassValue
    extends DataValue
{

    @XmlElement(required = true)
    protected _DirectionCompassEnum directionCompass;
    @XmlElement(name = "_directionCompassValueExtension")
    protected _ExtensionType _DirectionCompassValueExtension;

    /**
     * Gets the value of the directionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public _DirectionCompassEnum getDirectionCompass() {
        return directionCompass;
    }

    /**
     * Sets the value of the directionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public void setDirectionCompass(_DirectionCompassEnum value) {
        this.directionCompass = value;
    }

    /**
     * Gets the value of the _DirectionCompassValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DirectionCompassValueExtension() {
        return _DirectionCompassValueExtension;
    }

    /**
     * Sets the value of the _DirectionCompassValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DirectionCompassValueExtension(_ExtensionType value) {
        this._DirectionCompassValueExtension = value;
    }

}
