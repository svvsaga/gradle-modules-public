
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a junction by defining the intersecting roads.
 *       
 * 
 * <p>Java class for TpegIlcPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegIlcPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegIlcPointDescriptorType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc03IlcPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="_tpegIlcPointDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegIlcPointDescriptor", propOrder = {
    "tpegIlcPointDescriptorType",
    "_TpegIlcPointDescriptorExtension"
})
public class TpegIlcPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected _TpegLoc03IlcPointDescriptorSubtypeEnum tpegIlcPointDescriptorType;
    @XmlElement(name = "_tpegIlcPointDescriptorExtension")
    protected _ExtensionType _TpegIlcPointDescriptorExtension;

    /**
     * Gets the value of the tpegIlcPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public _TpegLoc03IlcPointDescriptorSubtypeEnum getTpegIlcPointDescriptorType() {
        return tpegIlcPointDescriptorType;
    }

    /**
     * Sets the value of the tpegIlcPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegIlcPointDescriptorType(_TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        this.tpegIlcPointDescriptorType = value;
    }

    /**
     * Gets the value of the _TpegIlcPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegIlcPointDescriptorExtension() {
        return _TpegIlcPointDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegIlcPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegIlcPointDescriptorExtension(_ExtensionType value) {
        this._TpegIlcPointDescriptorExtension = value;
    }

}
