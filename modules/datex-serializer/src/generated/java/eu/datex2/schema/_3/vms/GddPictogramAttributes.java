
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GddPictogramAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GddPictogramAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributes" type="{http://datex2.eu/schema/3/common}Base64Binary"/&gt;
 *         &lt;element name="_gddPictogramAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GddPictogramAttributes", propOrder = {
    "attributes",
    "_GddPictogramAttributesExtension"
})
public class GddPictogramAttributes {

    @XmlElement(required = true)
    protected byte[] attributes;
    @XmlElement(name = "_gddPictogramAttributesExtension")
    protected _ExtensionType _GddPictogramAttributesExtension;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttributes(byte[] value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the _GddPictogramAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GddPictogramAttributesExtension() {
        return _GddPictogramAttributesExtension;
    }

    /**
     * Sets the value of the _GddPictogramAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GddPictogramAttributesExtension(_ExtensionType value) {
        this._GddPictogramAttributesExtension = value;
    }

}
