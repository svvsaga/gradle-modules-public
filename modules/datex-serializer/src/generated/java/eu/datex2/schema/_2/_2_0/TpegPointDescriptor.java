
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "tpegPointDescriptorExtension"
})
@XmlSeeAlso({
    TpegIlcPointDescriptor.class,
    TpegJunctionPointDescriptor.class,
    TpegOtherPointDescriptor.class
})
public abstract class TpegPointDescriptor
    extends TpegDescriptor
{

    protected _ExtensionType tpegPointDescriptorExtension;

    /**
     * Gets the value of the tpegPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTpegPointDescriptorExtension() {
        return tpegPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTpegPointDescriptorExtension(_ExtensionType value) {
        this.tpegPointDescriptorExtension = value;
    }

}
