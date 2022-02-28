
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a point location.
 * 
 * <p>Java class for TpegPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_tpegPointDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointDescriptor", propOrder = {
    "_TpegPointDescriptorExtension"
})
@XmlSeeAlso({
    TpegIlcPointDescriptor.class,
    TpegJunctionPointDescriptor.class,
    TpegOtherPointDescriptor.class
})
public abstract class TpegPointDescriptor
    extends TpegDescriptor
{

    @XmlElement(name = "_tpegPointDescriptorExtension")
    protected _ExtensionType _TpegPointDescriptorExtension;

    /**
     * Gets the value of the _TpegPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegPointDescriptorExtension() {
        return _TpegPointDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegPointDescriptorExtension(_ExtensionType value) {
        this._TpegPointDescriptorExtension = value;
    }

}
