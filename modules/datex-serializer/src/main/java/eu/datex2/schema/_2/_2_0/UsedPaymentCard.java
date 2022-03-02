
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsedPaymentCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsedPaymentCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentCard" type="{http://datex2.eu/schema/2/2_0}PaymentCardTypesEnum"/&gt;
 *         &lt;element name="otherPaymentCard" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardBrand" type="{http://datex2.eu/schema/2/2_0}PaymentCardBrandsEnum" minOccurs="0"/&gt;
 *         &lt;element name="otherPaymentCardBrand" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="usedPaymentCardExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsedPaymentCard", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "paymentCard",
    "otherPaymentCard",
    "paymentCardBrand",
    "otherPaymentCardBrand",
    "usedPaymentCardExtension"
})
public class UsedPaymentCard {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentCardTypesEnum paymentCard;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String otherPaymentCard;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected PaymentCardBrandsEnum paymentCardBrand;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String otherPaymentCardBrand;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType usedPaymentCardExtension;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardTypesEnum }
     *     
     */
    public PaymentCardTypesEnum getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardTypesEnum }
     *     
     */
    public void setPaymentCard(PaymentCardTypesEnum value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the otherPaymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentCard() {
        return otherPaymentCard;
    }

    /**
     * Sets the value of the otherPaymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentCard(String value) {
        this.otherPaymentCard = value;
    }

    /**
     * Gets the value of the paymentCardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardBrandsEnum }
     *     
     */
    public PaymentCardBrandsEnum getPaymentCardBrand() {
        return paymentCardBrand;
    }

    /**
     * Sets the value of the paymentCardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardBrandsEnum }
     *     
     */
    public void setPaymentCardBrand(PaymentCardBrandsEnum value) {
        this.paymentCardBrand = value;
    }

    /**
     * Gets the value of the otherPaymentCardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentCardBrand() {
        return otherPaymentCardBrand;
    }

    /**
     * Sets the value of the otherPaymentCardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentCardBrand(String value) {
        this.otherPaymentCardBrand = value;
    }

    /**
     * Gets the value of the usedPaymentCardExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getUsedPaymentCardExtension() {
        return usedPaymentCardExtension;
    }

    /**
     * Sets the value of the usedPaymentCardExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setUsedPaymentCardExtension(ExtensionType value) {
        this.usedPaymentCardExtension = value;
    }

}
