
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changedFlag" type="{http://datex2.eu/schema/2/2_0}ChangedFlagEnum" minOccurs="0"/&gt;
 *         &lt;element name="clientIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="deliveryBreak" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="denyReason" type="{http://datex2.eu/schema/2/2_0}DenyReasonEnum" minOccurs="0"/&gt;
 *         &lt;element name="historicalStartDate" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="historicalStopDate" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="keepAlive" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="requestType" type="{http://datex2.eu/schema/2/2_0}RequestTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://datex2.eu/schema/2/2_0}ResponseEnum" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionReference" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="supplierIdentification" type="{http://datex2.eu/schema/2/2_0}InternationalIdentifier"/&gt;
 *         &lt;element name="target" type="{http://datex2.eu/schema/2/2_0}Target" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{http://datex2.eu/schema/2/2_0}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="filterReference" type="{http://datex2.eu/schema/2/2_0}FilterReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catalogueReference" type="{http://datex2.eu/schema/2/2_0}CatalogueReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exchangeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exchange", propOrder = {
    "changedFlag",
    "clientIdentification",
    "deliveryBreak",
    "denyReason",
    "historicalStartDate",
    "historicalStopDate",
    "keepAlive",
    "requestType",
    "response",
    "subscriptionReference",
    "supplierIdentification",
    "target",
    "subscription",
    "filterReference",
    "catalogueReference",
    "exchangeExtension"
})
public class Exchange {

    @XmlSchemaType(name = "string")
    protected ChangedFlagEnum changedFlag;
    protected String clientIdentification;
    protected Boolean deliveryBreak;
    @XmlSchemaType(name = "string")
    protected DenyReasonEnum denyReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historicalStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historicalStopDate;
    protected Boolean keepAlive;
    @XmlSchemaType(name = "string")
    protected RequestTypeEnum requestType;
    @XmlSchemaType(name = "string")
    protected ResponseEnum response;
    protected String subscriptionReference;
    @XmlElement(required = true)
    protected InternationalIdentifier supplierIdentification;
    protected Target target;
    protected Subscription subscription;
    protected List<FilterReference> filterReference;
    protected List<CatalogueReference> catalogueReference;
    protected _ExtensionType exchangeExtension;

    /**
     * Gets the value of the changedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public ChangedFlagEnum getChangedFlag() {
        return changedFlag;
    }

    /**
     * Sets the value of the changedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public void setChangedFlag(ChangedFlagEnum value) {
        this.changedFlag = value;
    }

    /**
     * Gets the value of the clientIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentification() {
        return clientIdentification;
    }

    /**
     * Sets the value of the clientIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentification(String value) {
        this.clientIdentification = value;
    }

    /**
     * Gets the value of the deliveryBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryBreak() {
        return deliveryBreak;
    }

    /**
     * Sets the value of the deliveryBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryBreak(Boolean value) {
        this.deliveryBreak = value;
    }

    /**
     * Gets the value of the denyReason property.
     * 
     * @return
     *     possible object is
     *     {@link DenyReasonEnum }
     *     
     */
    public DenyReasonEnum getDenyReason() {
        return denyReason;
    }

    /**
     * Sets the value of the denyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenyReasonEnum }
     *     
     */
    public void setDenyReason(DenyReasonEnum value) {
        this.denyReason = value;
    }

    /**
     * Gets the value of the historicalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricalStartDate() {
        return historicalStartDate;
    }

    /**
     * Sets the value of the historicalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricalStartDate(XMLGregorianCalendar value) {
        this.historicalStartDate = value;
    }

    /**
     * Gets the value of the historicalStopDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoricalStopDate() {
        return historicalStopDate;
    }

    /**
     * Sets the value of the historicalStopDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoricalStopDate(XMLGregorianCalendar value) {
        this.historicalStopDate = value;
    }

    /**
     * Gets the value of the keepAlive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAlive() {
        return keepAlive;
    }

    /**
     * Sets the value of the keepAlive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAlive(Boolean value) {
        this.keepAlive = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestType(RequestTypeEnum value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEnum }
     *     
     */
    public ResponseEnum getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEnum }
     *     
     */
    public void setResponse(ResponseEnum value) {
        this.response = value;
    }

    /**
     * Gets the value of the subscriptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Sets the value of the subscriptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionReference(String value) {
        this.subscriptionReference = value;
    }

    /**
     * Gets the value of the supplierIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getSupplierIdentification() {
        return supplierIdentification;
    }

    /**
     * Sets the value of the supplierIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setSupplierIdentification(InternationalIdentifier value) {
        this.supplierIdentification = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the filterReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the filterReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterReference }
     * 
     * 
     */
    public List<FilterReference> getFilterReference() {
        if (filterReference == null) {
            filterReference = new ArrayList<FilterReference>();
        }
        return this.filterReference;
    }

    /**
     * Gets the value of the catalogueReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catalogueReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogueReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogueReference }
     * 
     * 
     */
    public List<CatalogueReference> getCatalogueReference() {
        if (catalogueReference == null) {
            catalogueReference = new ArrayList<CatalogueReference>();
        }
        return this.catalogueReference;
    }

    /**
     * Gets the value of the exchangeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getExchangeExtension() {
        return exchangeExtension;
    }

    /**
     * Sets the value of the exchangeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setExchangeExtension(_ExtensionType value) {
        this.exchangeExtension = value;
    }

}
