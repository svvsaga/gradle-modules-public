
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
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
 *         &lt;element name="descriptor" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="_tpegDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_TpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class,
    TpegPointDescriptor.class
})
public abstract class TpegDescriptor {

    @XmlElement(required = true)
    protected MultilingualString descriptor;
    @XmlElement(name = "_tpegDescriptorExtension")
    protected _ExtensionType _TpegDescriptorExtension;

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
     * Gets the value of the _TpegDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegDescriptorExtension() {
        return _TpegDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegDescriptorExtension(_ExtensionType value) {
        this._TpegDescriptorExtension = value;
    }

}
