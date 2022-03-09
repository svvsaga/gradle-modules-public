
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegFramedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegFramedPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegFramedPointLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01FramedPointLocationSubtypeEnum"/&gt;
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/3/locationReferencing}TpegNonJunctionPoint"/&gt;
 *         &lt;element name="to" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="from" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="_tpegFramedPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegFramedPoint", propOrder = {
    "tpegFramedPointLocationType",
    "framedPoint",
    "to",
    "from",
    "_TpegFramedPointExtension"
})
public class TpegFramedPoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    protected _TpegLoc01FramedPointLocationSubtypeEnum tpegFramedPointLocationType;
    @XmlElement(required = true)
    protected TpegNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    @XmlElement(name = "_tpegFramedPointExtension")
    protected _ExtensionType _TpegFramedPointExtension;

    /**
     * Gets the value of the tpegFramedPointLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public _TpegLoc01FramedPointLocationSubtypeEnum getTpegFramedPointLocationType() {
        return tpegFramedPointLocationType;
    }

    /**
     * Sets the value of the tpegFramedPointLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegFramedPointLocationType(_TpegLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegFramedPointLocationType = value;
    }

    /**
     * Gets the value of the framedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public TpegNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Sets the value of the framedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TpegNonJunctionPoint value) {
        this.framedPoint = value;
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
     * Gets the value of the _TpegFramedPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegFramedPointExtension() {
        return _TpegFramedPointExtension;
    }

    /**
     * Sets the value of the _TpegFramedPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegFramedPointExtension(_ExtensionType value) {
        this._TpegFramedPointExtension = value;
    }

}
