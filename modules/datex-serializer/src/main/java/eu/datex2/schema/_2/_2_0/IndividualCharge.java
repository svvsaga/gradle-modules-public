
package eu.datex2.schema._2._2_0;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeBandReference" type="{http://datex2.eu/schema/2/2_0}_ChargeBandVersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="chargePaid" type="{http://datex2.eu/schema/2/2_0}AmountOfMoney"/&gt;
 *         &lt;element name="chargeCurrency" type="{http://datex2.eu/schema/2/2_0}CurrencyEnum" minOccurs="0"/&gt;
 *         &lt;element name="usedMeansOfPayment" type="{http://datex2.eu/schema/2/2_0}MeansOfPaymentEnum" minOccurs="0"/&gt;
 *         &lt;element name="withReservation" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="usedPaymentCard" type="{http://datex2.eu/schema/2/2_0}UsedPaymentCard" minOccurs="0"/&gt;
 *         &lt;element name="individualChargeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCharge", propOrder = {
    "chargeBandReference",
    "chargePaid",
    "chargeCurrency",
    "usedMeansOfPayment",
    "withReservation",
    "usedPaymentCard",
    "individualChargeExtension"
})
public class IndividualCharge {

    protected ChargeBandVersionedReference chargeBandReference;
    @XmlElement(required = true)
    protected BigDecimal chargePaid;
    @XmlSchemaType(name = "string")
    protected CurrencyEnum chargeCurrency;
    @XmlSchemaType(name = "string")
    protected MeansOfPaymentEnum usedMeansOfPayment;
    protected Boolean withReservation;
    protected UsedPaymentCard usedPaymentCard;
    protected ExtensionType individualChargeExtension;

    /**
     * Gets the value of the chargeBandReference property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBandVersionedReference }
     *     
     */
    public ChargeBandVersionedReference getChargeBandReference() {
        return chargeBandReference;
    }

    /**
     * Sets the value of the chargeBandReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBandVersionedReference }
     *     
     */
    public void setChargeBandReference(ChargeBandVersionedReference value) {
        this.chargeBandReference = value;
    }

    /**
     * Gets the value of the chargePaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargePaid() {
        return chargePaid;
    }

    /**
     * Sets the value of the chargePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargePaid(BigDecimal value) {
        this.chargePaid = value;
    }

    /**
     * Gets the value of the chargeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getChargeCurrency() {
        return chargeCurrency;
    }

    /**
     * Sets the value of the chargeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setChargeCurrency(CurrencyEnum value) {
        this.chargeCurrency = value;
    }

    /**
     * Gets the value of the usedMeansOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link MeansOfPaymentEnum }
     *     
     */
    public MeansOfPaymentEnum getUsedMeansOfPayment() {
        return usedMeansOfPayment;
    }

    /**
     * Sets the value of the usedMeansOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeansOfPaymentEnum }
     *     
     */
    public void setUsedMeansOfPayment(MeansOfPaymentEnum value) {
        this.usedMeansOfPayment = value;
    }

    /**
     * Gets the value of the withReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithReservation() {
        return withReservation;
    }

    /**
     * Sets the value of the withReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithReservation(Boolean value) {
        this.withReservation = value;
    }

    /**
     * Gets the value of the usedPaymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link UsedPaymentCard }
     *     
     */
    public UsedPaymentCard getUsedPaymentCard() {
        return usedPaymentCard;
    }

    /**
     * Sets the value of the usedPaymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsedPaymentCard }
     *     
     */
    public void setUsedPaymentCard(UsedPaymentCard value) {
        this.usedPaymentCard = value;
    }

    /**
     * Gets the value of the individualChargeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualChargeExtension() {
        return individualChargeExtension;
    }

    /**
     * Sets the value of the individualChargeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualChargeExtension(ExtensionType value) {
        this.individualChargeExtension = value;
    }

}
