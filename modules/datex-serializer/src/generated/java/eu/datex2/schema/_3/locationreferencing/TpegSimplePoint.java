
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegSimplePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegSimplePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegSimplePointLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01SimplePointLocationSubtypeEnum"/&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"/&gt;
 *         &lt;element name="_tpegSimplePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegSimplePoint", propOrder = {
    "tpegSimplePointLocationType",
    "point",
    "_TpegSimplePointExtension"
})
public class TpegSimplePoint
    extends TpegPointLocation
{

    @XmlElement(required = true)
    protected _TpegLoc01SimplePointLocationSubtypeEnum tpegSimplePointLocationType;
    @XmlElement(required = true)
    protected TpegPoint point;
    @XmlElement(name = "_tpegSimplePointExtension")
    protected _ExtensionType _TpegSimplePointExtension;

    /**
     * Gets the value of the tpegSimplePointLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public _TpegLoc01SimplePointLocationSubtypeEnum getTpegSimplePointLocationType() {
        return tpegSimplePointLocationType;
    }

    /**
     * Sets the value of the tpegSimplePointLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegSimplePointLocationType(_TpegLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegSimplePointLocationType = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setPoint(TpegPoint value) {
        this.point = value;
    }

    /**
     * Gets the value of the _TpegSimplePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegSimplePointExtension() {
        return _TpegSimplePointExtension;
    }

    /**
     * Sets the value of the _TpegSimplePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegSimplePointExtension(_ExtensionType value) {
        this._TpegSimplePointExtension = value;
    }

}
