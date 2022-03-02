
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegJunctionPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegJunctionPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegJunctionPointDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03JunctionPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegJunctionPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunctionPointDescriptor", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegJunctionPointDescriptorType",
    "tpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegJunctionPointDescriptorExtension;

    /**
     * Gets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03JunctionPointDescriptorSubtypeEnum getTpegJunctionPointDescriptorType() {
        return tpegJunctionPointDescriptorType;
    }

    /**
     * Sets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegJunctionPointDescriptorType(TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegJunctionPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegJunctionPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionPointDescriptorExtension() {
        return tpegJunctionPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegJunctionPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionPointDescriptorExtension(ExtensionType value) {
        this.tpegJunctionPointDescriptorExtension = value;
    }

}
