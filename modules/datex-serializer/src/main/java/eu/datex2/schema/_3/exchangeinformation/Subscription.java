
package eu.datex2.schema._3.exchangeinformation;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Reference;
import eu.datex2.schema._3.common.Validity;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="referenceID" type="{http://datex2.eu/schema/3/common}Reference" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionStart" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionEnd" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliveyFrequency" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://datex2.eu/schema/3/common}Validity" minOccurs="0"/&gt;
 *         &lt;element name="_subscriptionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", namespace = "http://datex2.eu/schema/3/exchangeInformation", propOrder = {
    "name",
    "referenceID",
    "subscriptionStart",
    "subscriptionEnd",
    "deliveyFrequency",
    "validity",
    "subscriptionExtension"
})
public class Subscription {

    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected String name;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected Reference referenceID;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionStart;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionEnd;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger deliveyFrequency;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected Validity validity;
    @XmlElement(name = "_subscriptionExtension", namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected ExtensionType subscriptionExtension;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReferenceID(Reference value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the subscriptionStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionStart() {
        return subscriptionStart;
    }

    /**
     * Sets the value of the subscriptionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionStart(XMLGregorianCalendar value) {
        this.subscriptionStart = value;
    }

    /**
     * Gets the value of the subscriptionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionEnd() {
        return subscriptionEnd;
    }

    /**
     * Sets the value of the subscriptionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionEnd(XMLGregorianCalendar value) {
        this.subscriptionEnd = value;
    }

    /**
     * Gets the value of the deliveyFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveyFrequency() {
        return deliveyFrequency;
    }

    /**
     * Sets the value of the deliveyFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveyFrequency(BigInteger value) {
        this.deliveyFrequency = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the subscriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubscriptionExtension() {
        return subscriptionExtension;
    }

    /**
     * Sets the value of the subscriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubscriptionExtension(ExtensionType value) {
        this.subscriptionExtension = value;
    }

}
