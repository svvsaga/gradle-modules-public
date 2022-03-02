
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ISO 14823 Graphic Data Dictionary attributes with textual or numeric data to supplement a
 *         pictogram identification.
 *       
 * 
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
    "gddPictogramAttributesExtension"
})
public class GddPictogramAttributes {

    @XmlElement(required = true)
    protected byte[] attributes;
    @XmlElement(name = "_gddPictogramAttributesExtension")
    protected ExtensionType gddPictogramAttributesExtension;

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
     * Gets the value of the gddPictogramAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGddPictogramAttributesExtension() {
        return gddPictogramAttributesExtension;
    }

    /**
     * Sets the value of the gddPictogramAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGddPictogramAttributesExtension(ExtensionType value) {
        this.gddPictogramAttributesExtension = value;
    }

}
