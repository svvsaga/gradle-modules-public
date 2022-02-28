
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * General descriptor for describing a point.
 * 
 * <p>Java class for TpegOtherPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc03OtherPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="_tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", propOrder = {
    "tpegOtherPointDescriptorType",
    "_TpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected _TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    @XmlElement(name = "_tpegOtherPointDescriptorExtension")
    protected _ExtensionType _TpegOtherPointDescriptorExtension;

    /**
     * Gets the value of the tpegOtherPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public _TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Sets the value of the tpegOtherPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(_TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    /**
     * Gets the value of the _TpegOtherPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegOtherPointDescriptorExtension() {
        return _TpegOtherPointDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegOtherPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegOtherPointDescriptorExtension(_ExtensionType value) {
        this._TpegOtherPointDescriptorExtension = value;
    }

}
