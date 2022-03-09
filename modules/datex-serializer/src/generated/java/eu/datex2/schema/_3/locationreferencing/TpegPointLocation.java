
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum"/&gt;
 *         &lt;element name="_tpegPointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointLocation", propOrder = {
    "tpegDirection",
    "_TpegPointLocationExtension"
})
@XmlSeeAlso({
    TpegFramedPoint.class,
    TpegSimplePoint.class
})
public abstract class TpegPointLocation {

    @XmlElement(required = true)
    protected _DirectionEnum tpegDirection;
    @XmlElement(name = "_tpegPointLocationExtension")
    protected _ExtensionType _TpegPointLocationExtension;

    /**
     * Gets the value of the tpegDirection property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionEnum }
     *     
     */
    public _DirectionEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Sets the value of the tpegDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionEnum }
     *     
     */
    public void setTpegDirection(_DirectionEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Gets the value of the _TpegPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegPointLocationExtension() {
        return _TpegPointLocationExtension;
    }

    /**
     * Sets the value of the _TpegPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegPointLocationExtension(_ExtensionType value) {
        this._TpegPointLocationExtension = value;
    }

}
