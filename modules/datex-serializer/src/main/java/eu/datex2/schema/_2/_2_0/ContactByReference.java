
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Contact"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactReference" type="{http://datex2.eu/schema/2/2_0}_ContactDetailsVersionedReference"/&gt;
 *         &lt;element name="contactByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactByReference", propOrder = {
    "contactReference",
    "contactByReferenceExtension"
})
public class ContactByReference
    extends Contact
{

    @XmlElement(required = true)
    protected _ContactDetailsVersionedReference contactReference;
    protected _ExtensionType contactByReferenceExtension;

    /**
     * Gets the value of the contactReference property.
     * 
     * @return
     *     possible object is
     *     {@link _ContactDetailsVersionedReference }
     *     
     */
    public _ContactDetailsVersionedReference getContactReference() {
        return contactReference;
    }

    /**
     * Sets the value of the contactReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ContactDetailsVersionedReference }
     *     
     */
    public void setContactReference(_ContactDetailsVersionedReference value) {
        this.contactReference = value;
    }

    /**
     * Gets the value of the contactByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getContactByReferenceExtension() {
        return contactByReferenceExtension;
    }

    /**
     * Sets the value of the contactByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setContactByReferenceExtension(_ExtensionType value) {
        this.contactByReferenceExtension = value;
    }

}
