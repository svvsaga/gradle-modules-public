
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactUnknown" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="contactNotDefined" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="validityOfContact" type="{http://datex2.eu/schema/2/2_0}OverallPeriod" minOccurs="0"/&gt;
 *         &lt;element name="contactExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "contactUnknown",
    "contactNotDefined",
    "validityOfContact",
    "contactExtension"
})
@XmlSeeAlso({
    ContactByReference.class,
    ContactDetails.class
})
public class Contact {

    protected Boolean contactUnknown;
    protected Boolean contactNotDefined;
    protected OverallPeriod validityOfContact;
    protected _ExtensionType contactExtension;

    /**
     * Gets the value of the contactUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactUnknown() {
        return contactUnknown;
    }

    /**
     * Sets the value of the contactUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactUnknown(Boolean value) {
        this.contactUnknown = value;
    }

    /**
     * Gets the value of the contactNotDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactNotDefined() {
        return contactNotDefined;
    }

    /**
     * Sets the value of the contactNotDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactNotDefined(Boolean value) {
        this.contactNotDefined = value;
    }

    /**
     * Gets the value of the validityOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityOfContact() {
        return validityOfContact;
    }

    /**
     * Sets the value of the validityOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityOfContact(OverallPeriod value) {
        this.validityOfContact = value;
    }

    /**
     * Gets the value of the contactExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getContactExtension() {
        return contactExtension;
    }

    /**
     * Sets the value of the contactExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setContactExtension(_ExtensionType value) {
        this.contactExtension = value;
    }

}
