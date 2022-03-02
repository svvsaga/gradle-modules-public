
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegOtherPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegOtherPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegOtherPointDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03OtherPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegOtherPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegOtherPointDescriptor", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegOtherPointDescriptorType",
    "tpegOtherPointDescriptorExtension"
})
public class TpegOtherPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03OtherPointDescriptorSubtypeEnum tpegOtherPointDescriptorType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegOtherPointDescriptorExtension;

    /**
     * Gets the value of the tpegOtherPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03OtherPointDescriptorSubtypeEnum getTpegOtherPointDescriptorType() {
        return tpegOtherPointDescriptorType;
    }

    /**
     * Sets the value of the tpegOtherPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegOtherPointDescriptorType(TpegLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegOtherPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegOtherPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegOtherPointDescriptorExtension() {
        return tpegOtherPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegOtherPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegOtherPointDescriptorExtension(ExtensionType value) {
        this.tpegOtherPointDescriptorExtension = value;
    }

}
