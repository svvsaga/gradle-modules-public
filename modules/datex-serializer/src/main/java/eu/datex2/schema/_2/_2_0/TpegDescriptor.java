
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptor" type="{http://datex2.eu/schema/2/2_0}MultilingualString"/&gt;
 *         &lt;element name="tpegDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegDescriptor", propOrder = {
    "descriptor",
    "tpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class,
    TpegPointDescriptor.class
})
public abstract class TpegDescriptor {

    @XmlElement(required = true)
    protected MultilingualString descriptor;
    protected _ExtensionType tpegDescriptorExtension;

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescriptor(MultilingualString value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the tpegDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTpegDescriptorExtension() {
        return tpegDescriptorExtension;
    }

    /**
     * Sets the value of the tpegDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTpegDescriptorExtension(_ExtensionType value) {
        this.tpegDescriptorExtension = value;
    }

}
