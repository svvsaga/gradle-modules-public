
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A collection of information providing descriptive references to locations using the
 *         TPEG-Loc location referencing approach.
 *       
 * 
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
    "tpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class,
    TpegPointDescriptor.class
})
public abstract class TpegDescriptor {

    @XmlElement(required = true)
    protected MultilingualString descriptor;
    @XmlElement(name = "_tpegDescriptorExtension")
    protected ExtensionType tpegDescriptorExtension;

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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegDescriptorExtension() {
        return tpegDescriptorExtension;
    }

    /**
     * Sets the value of the tpegDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegDescriptorExtension(ExtensionType value) {
        this.tpegDescriptorExtension = value;
    }

}
