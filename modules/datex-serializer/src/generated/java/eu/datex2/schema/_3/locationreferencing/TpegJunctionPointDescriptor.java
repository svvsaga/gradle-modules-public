
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_TpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    protected _TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    @XmlElement(name = "_tpegJunctionPointDescriptorExtension")
    protected _ExtensionType _TpegJunctionPointDescriptorExtension;

    /**
     * Gets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public _TpegLoc03JunctionPointDescriptorSubtypeEnum getTpegJunctionPointDescriptorType() {
        return tpegJunctionPointDescriptorType;
    }

    /**
     * Sets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegJunctionPointDescriptorType(_TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegJunctionPointDescriptorType = value;
    }

    /**
     * Gets the value of the _TpegJunctionPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegJunctionPointDescriptorExtension() {
        return _TpegJunctionPointDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegJunctionPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegJunctionPointDescriptorExtension(_ExtensionType value) {
        this._TpegJunctionPointDescriptorExtension = value;
    }

}
