
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A geographic or geometric area defined by a TPEG-Loc structure which may include height
 *         information for additional geospatial discrimination.
 *       
 * 
 * <p>Java class for TpegAreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01AreaLocationSubtypeEnum"/&gt;
 *         &lt;element name="tpegHeight" type="{http://datex2.eu/schema/3/locationReferencing}TpegHeight" minOccurs="0"/&gt;
 *         &lt;element name="_tpegAreaLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaLocation", propOrder = {
    "tpegAreaLocationType",
    "tpegHeight",
    "_TpegAreaLocationExtension"
})
@XmlSeeAlso({
    TpegGeometricArea.class,
    TpegNamedOnlyArea.class
})
public abstract class TpegAreaLocation {

    @XmlElement(required = true)
    protected _TpegLoc01AreaLocationSubtypeEnum tpegAreaLocationType;
    protected TpegHeight tpegHeight;
    @XmlElement(name = "_tpegAreaLocationExtension")
    protected _ExtensionType _TpegAreaLocationExtension;

    /**
     * Gets the value of the tpegAreaLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public _TpegLoc01AreaLocationSubtypeEnum getTpegAreaLocationType() {
        return tpegAreaLocationType;
    }

    /**
     * Sets the value of the tpegAreaLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegAreaLocationType(_TpegLoc01AreaLocationSubtypeEnum value) {
        this.tpegAreaLocationType = value;
    }

    /**
     * Gets the value of the tpegHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TpegHeight }
     *     
     */
    public TpegHeight getTpegHeight() {
        return tpegHeight;
    }

    /**
     * Sets the value of the tpegHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegHeight }
     *     
     */
    public void setTpegHeight(TpegHeight value) {
        this.tpegHeight = value;
    }

    /**
     * Gets the value of the _TpegAreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegAreaLocationExtension() {
        return _TpegAreaLocationExtension;
    }

    /**
     * Sets the value of the _TpegAreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegAreaLocationExtension(_ExtensionType value) {
        this._TpegAreaLocationExtension = value;
    }

}
