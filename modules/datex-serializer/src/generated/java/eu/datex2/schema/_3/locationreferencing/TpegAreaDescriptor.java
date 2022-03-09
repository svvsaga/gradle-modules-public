
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegAreaDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc03AreaDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="_tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "_TpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor
{

    @XmlElement(required = true)
    protected _TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    @XmlElement(name = "_tpegAreaDescriptorExtension")
    protected _ExtensionType _TpegAreaDescriptorExtension;

    /**
     * Gets the value of the tpegAreaDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public _TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Sets the value of the tpegAreaDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(_TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Gets the value of the _TpegAreaDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegAreaDescriptorExtension() {
        return _TpegAreaDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegAreaDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegAreaDescriptorExtension(_ExtensionType value) {
        this._TpegAreaDescriptorExtension = value;
    }

}
