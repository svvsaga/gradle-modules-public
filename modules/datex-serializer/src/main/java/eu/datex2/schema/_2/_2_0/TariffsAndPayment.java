
package eu.datex2.schema._2._2_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TariffsAndPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffsAndPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lastUpdated" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="acceptedMeansOfPayment" type="{http://datex2.eu/schema/2/2_0}MeansOfPaymentEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentMode" type="{http://datex2.eu/schema/2/2_0}ParkingPaymentModeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentAdditionalDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="freeOfCharge" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="reservationFee" type="{http://datex2.eu/schema/2/2_0}AmountOfMoney" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="chargeBand" type="{http://datex2.eu/schema/2/2_0}ChargeBand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chargeBandByReference" type="{http://datex2.eu/schema/2/2_0}ChargeBandByReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acceptedPaymentCards" type="{http://datex2.eu/schema/2/2_0}AcceptedPaymentCards" minOccurs="0"/&gt;
 *         &lt;element name="tariffsAndPaymentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffsAndPayment", propOrder = {
    "lastUpdated",
    "acceptedMeansOfPayment",
    "paymentMode",
    "paymentAdditionalDescription",
    "freeOfCharge",
    "reservationFee",
    "urlLinkAddress",
    "chargeBand",
    "chargeBandByReference",
    "acceptedPaymentCards",
    "tariffsAndPaymentExtension"
})
public class TariffsAndPayment {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlSchemaType(name = "string")
    protected List<MeansOfPaymentEnum> acceptedMeansOfPayment;
    @XmlSchemaType(name = "string")
    protected List<ParkingPaymentModeEnum> paymentMode;
    protected MultilingualString paymentAdditionalDescription;
    protected Boolean freeOfCharge;
    protected BigDecimal reservationFee;
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    protected List<ChargeBand> chargeBand;
    protected List<ChargeBandByReference> chargeBandByReference;
    protected AcceptedPaymentCards acceptedPaymentCards;
    protected ExtensionType tariffsAndPaymentExtension;

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the acceptedMeansOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedMeansOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedMeansOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeansOfPaymentEnum }
     * 
     * 
     */
    public List<MeansOfPaymentEnum> getAcceptedMeansOfPayment() {
        if (acceptedMeansOfPayment == null) {
            acceptedMeansOfPayment = new ArrayList<MeansOfPaymentEnum>();
        }
        return this.acceptedMeansOfPayment;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingPaymentModeEnum }
     * 
     * 
     */
    public List<ParkingPaymentModeEnum> getPaymentMode() {
        if (paymentMode == null) {
            paymentMode = new ArrayList<ParkingPaymentModeEnum>();
        }
        return this.paymentMode;
    }

    /**
     * Gets the value of the paymentAdditionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPaymentAdditionalDescription() {
        return paymentAdditionalDescription;
    }

    /**
     * Sets the value of the paymentAdditionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPaymentAdditionalDescription(MultilingualString value) {
        this.paymentAdditionalDescription = value;
    }

    /**
     * Gets the value of the freeOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeOfCharge() {
        return freeOfCharge;
    }

    /**
     * Sets the value of the freeOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeOfCharge(Boolean value) {
        this.freeOfCharge = value;
    }

    /**
     * Gets the value of the reservationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservationFee() {
        return reservationFee;
    }

    /**
     * Sets the value of the reservationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservationFee(BigDecimal value) {
        this.reservationFee = value;
    }

    /**
     * Gets the value of the urlLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Sets the value of the urlLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Gets the value of the chargeBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargeBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeBand }
     * 
     * 
     */
    public List<ChargeBand> getChargeBand() {
        if (chargeBand == null) {
            chargeBand = new ArrayList<ChargeBand>();
        }
        return this.chargeBand;
    }

    /**
     * Gets the value of the chargeBandByReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargeBandByReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeBandByReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeBandByReference }
     * 
     * 
     */
    public List<ChargeBandByReference> getChargeBandByReference() {
        if (chargeBandByReference == null) {
            chargeBandByReference = new ArrayList<ChargeBandByReference>();
        }
        return this.chargeBandByReference;
    }

    /**
     * Gets the value of the acceptedPaymentCards property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedPaymentCards }
     *     
     */
    public AcceptedPaymentCards getAcceptedPaymentCards() {
        return acceptedPaymentCards;
    }

    /**
     * Sets the value of the acceptedPaymentCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentCards }
     *     
     */
    public void setAcceptedPaymentCards(AcceptedPaymentCards value) {
        this.acceptedPaymentCards = value;
    }

    /**
     * Gets the value of the tariffsAndPaymentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTariffsAndPaymentExtension() {
        return tariffsAndPaymentExtension;
    }

    /**
     * Sets the value of the tariffsAndPaymentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTariffsAndPaymentExtension(ExtensionType value) {
        this.tariffsAndPaymentExtension = value;
    }

}
