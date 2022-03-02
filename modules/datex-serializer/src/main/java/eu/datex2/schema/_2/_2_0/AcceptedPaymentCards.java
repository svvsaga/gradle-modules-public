
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptedPaymentCards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptedPaymentCards"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentCards" type="{http://datex2.eu/schema/2/2_0}PaymentCardTypesEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="otherPaymentCards" type="{http://datex2.eu/schema/2/2_0}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardBrands" type="{http://datex2.eu/schema/2/2_0}PaymentCardBrandsEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherPaymentCardBrands" type="{http://datex2.eu/schema/2/2_0}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acceptedPaymentCardsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptedPaymentCards", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "paymentCards",
    "otherPaymentCards",
    "paymentCardBrands",
    "otherPaymentCardBrands",
    "acceptedPaymentCardsExtension"
})
public class AcceptedPaymentCards {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected List<PaymentCardTypesEnum> paymentCards;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<String> otherPaymentCards;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected List<PaymentCardBrandsEnum> paymentCardBrands;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<String> otherPaymentCardBrands;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType acceptedPaymentCardsExtension;

    /**
     * Gets the value of the paymentCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardTypesEnum }
     * 
     * 
     */
    public List<PaymentCardTypesEnum> getPaymentCards() {
        if (paymentCards == null) {
            paymentCards = new ArrayList<PaymentCardTypesEnum>();
        }
        return this.paymentCards;
    }

    /**
     * Gets the value of the otherPaymentCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaymentCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaymentCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherPaymentCards() {
        if (otherPaymentCards == null) {
            otherPaymentCards = new ArrayList<String>();
        }
        return this.otherPaymentCards;
    }

    /**
     * Gets the value of the paymentCardBrands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardBrands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCardBrands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardBrandsEnum }
     * 
     * 
     */
    public List<PaymentCardBrandsEnum> getPaymentCardBrands() {
        if (paymentCardBrands == null) {
            paymentCardBrands = new ArrayList<PaymentCardBrandsEnum>();
        }
        return this.paymentCardBrands;
    }

    /**
     * Gets the value of the otherPaymentCardBrands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the otherPaymentCardBrands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPaymentCardBrands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherPaymentCardBrands() {
        if (otherPaymentCardBrands == null) {
            otherPaymentCardBrands = new ArrayList<String>();
        }
        return this.otherPaymentCardBrands;
    }

    /**
     * Gets the value of the acceptedPaymentCardsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAcceptedPaymentCardsExtension() {
        return acceptedPaymentCardsExtension;
    }

    /**
     * Sets the value of the acceptedPaymentCardsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAcceptedPaymentCardsExtension(ExtensionType value) {
        this.acceptedPaymentCardsExtension = value;
    }

}
