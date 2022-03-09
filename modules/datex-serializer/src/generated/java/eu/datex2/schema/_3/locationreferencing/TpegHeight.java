
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegHeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegHeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="height" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc04HeightTypeEnum"/&gt;
 *         &lt;element name="_tpegHeightExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegHeight", propOrder = {
    "height",
    "heightType",
    "_TpegHeightExtension"
})
public class TpegHeight {

    protected Float height;
    @XmlElement(required = true)
    protected _TpegLoc04HeightTypeEnum heightType;
    @XmlElement(name = "_tpegHeightExtension")
    protected _ExtensionType _TpegHeightExtension;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the heightType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc04HeightTypeEnum }
     *     
     */
    public _TpegLoc04HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Sets the value of the heightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc04HeightTypeEnum }
     *     
     */
    public void setHeightType(_TpegLoc04HeightTypeEnum value) {
        this.heightType = value;
    }

    /**
     * Gets the value of the _TpegHeightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegHeightExtension() {
        return _TpegHeightExtension;
    }

    /**
     * Sets the value of the _TpegHeightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegHeightExtension(_ExtensionType value) {
        this._TpegHeightExtension = value;
    }

}
