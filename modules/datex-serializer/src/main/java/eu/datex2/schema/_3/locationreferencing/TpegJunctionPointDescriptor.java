
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a point at a junction on a road network.
 * 
 * <p>Java class for TpegJunctionPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegJunctionPointDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPointDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegJunctionPointDescriptorType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc03JunctionPointDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="_tpegJunctionPointDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunctionPointDescriptor", propOrder = {
    "tpegJunctionPointDescriptorType",
    "tpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    @XmlElement(name = "_tpegJunctionPointDescriptorExtension")
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
