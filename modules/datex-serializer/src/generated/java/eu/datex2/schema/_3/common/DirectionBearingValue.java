
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionBearingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionBearingValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees"/&gt;
 *         &lt;element name="_directionBearingValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionBearingValue", propOrder = {
    "directionBearing",
    "_DirectionBearingValueExtension"
})
public class DirectionBearingValue
    extends DataValue
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected int directionBearing;
    @XmlElement(name = "_directionBearingValueExtension")
    protected _ExtensionType _DirectionBearingValueExtension;

    /**
     * Gets the value of the directionBearing property.
     * 
     */
    public int getDirectionBearing() {
        return directionBearing;
    }

    /**
     * Sets the value of the directionBearing property.
     * 
     */
    public void setDirectionBearing(int value) {
        this.directionBearing = value;
    }

    /**
     * Gets the value of the _DirectionBearingValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DirectionBearingValueExtension() {
        return _DirectionBearingValueExtension;
    }

    /**
     * Sets the value of the _DirectionBearingValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DirectionBearingValueExtension(_ExtensionType value) {
        this._DirectionBearingValueExtension = value;
    }

}
