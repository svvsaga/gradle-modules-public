
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A linear section along a single road defined between two points on the same road by a
 *         TPEG-Loc structure.
 *       
 * 
 * <p>Java class for TpegLinearLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegLinearLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum"/&gt;
 *         &lt;element name="tpegLinearLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01LinearLocationSubtypeEnum"/&gt;
 *         &lt;element name="to" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="from" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="_tpegLinearLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegLinearLocation", propOrder = {
    "tpegDirection",
    "tpegLinearLocationType",
    "to",
    "from",
    "_TpegLinearLocationExtension"
})
public class TpegLinearLocation {

    @XmlElement(required = true)
    protected _DirectionEnum tpegDirection;
    @XmlElement(required = true)
    protected _TpegLoc01LinearLocationSubtypeEnum tpegLinearLocationType;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    @XmlElement(name = "_tpegLinearLocationExtension")
    protected _ExtensionType _TpegLinearLocationExtension;

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
     * Gets the value of the tpegLinearLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public _TpegLoc01LinearLocationSubtypeEnum getTpegLinearLocationType() {
        return tpegLinearLocationType;
    }

    /**
     * Sets the value of the tpegLinearLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public void setTpegLinearLocationType(_TpegLoc01LinearLocationSubtypeEnum value) {
        this.tpegLinearLocationType = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the _TpegLinearLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegLinearLocationExtension() {
        return _TpegLinearLocationExtension;
    }

    /**
     * Sets the value of the _TpegLinearLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegLinearLocationExtension(_ExtensionType value) {
        this._TpegLinearLocationExtension = value;
    }

}
