
package eu.datex2.schema._3.cisinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Reference;
import eu.datex2.schema._3.common.VersionedReference;
import eu.datex2.schema._3.exchangeinformation.Agent;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementToProcessReference" type="{http://datex2.eu/schema/3/common}Reference" minOccurs="0"/&gt;
 *         &lt;element name="elementToProcessVersionedReference" type="{http://datex2.eu/schema/3/common}VersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="expiryTime" type="{http://datex2.eu/schema/3/common}VersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="externalReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="notPredefinedServiceName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="predefinedService" type="{http://datex2.eu/schema/3/cisInformation}_PredefinedServiceEnum"/&gt;
 *         &lt;element name="requestedAction" type="{http://datex2.eu/schema/3/cisInformation}_ServiceActionEnum"/&gt;
 *         &lt;element name="servicerRequestCreationTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="servicerRequestVersionTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="customServiceParameter" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="serviceRequester" type="{http://datex2.eu/schema/3/exchangeInformation}Agent"/&gt;
 *         &lt;element name="serviceProvider" type="{http://datex2.eu/schema/3/exchangeInformation}Agent" maxOccurs="unbounded"/&gt;
 *         &lt;element name="serviceRequestCondition" type="{http://datex2.eu/schema/3/cisInformation}ServiceRequestCondition" minOccurs="0"/&gt;
 *         &lt;element name="_serviceRequestExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest", propOrder = {
    "elementToProcessReference",
    "elementToProcessVersionedReference",
    "expiryTime",
    "externalReference",
    "notPredefinedServiceName",
    "predefinedService",
    "requestedAction",
    "servicerRequestCreationTime",
    "servicerRequestVersionTime",
    "customServiceParameter",
    "serviceRequester",
    "serviceProvider",
    "serviceRequestCondition",
    "serviceRequestExtension"
})
public class ServiceRequest {

    protected Reference elementToProcessReference;
    protected VersionedReference elementToProcessVersionedReference;
    protected VersionedReference expiryTime;
    protected String externalReference;
    protected String notPredefinedServiceName;
    @XmlElement(required = true)
    protected PredefinedServiceEnum predefinedService;
    @XmlElement(required = true)
    protected ServiceActionEnum requestedAction;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servicerRequestCreationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar servicerRequestVersionTime;
    protected String customServiceParameter;
    @XmlElement(required = true)
    protected Agent serviceRequester;
    @XmlElement(required = true)
    protected List<Agent> serviceProvider;
    protected ServiceRequestCondition serviceRequestCondition;
    @XmlElement(name = "_serviceRequestExtension")
    protected ExtensionType serviceRequestExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the elementToProcessReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getElementToProcessReference() {
        return elementToProcessReference;
    }

    /**
     * Sets the value of the elementToProcessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setElementToProcessReference(Reference value) {
        this.elementToProcessReference = value;
    }

    /**
     * Gets the value of the elementToProcessVersionedReference property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getElementToProcessVersionedReference() {
        return elementToProcessVersionedReference;
    }

    /**
     * Sets the value of the elementToProcessVersionedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setElementToProcessVersionedReference(VersionedReference value) {
        this.elementToProcessVersionedReference = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setExpiryTime(VersionedReference value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the notPredefinedServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotPredefinedServiceName() {
        return notPredefinedServiceName;
    }

    /**
     * Sets the value of the notPredefinedServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotPredefinedServiceName(String value) {
        this.notPredefinedServiceName = value;
    }

    /**
     * Gets the value of the predefinedService property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedServiceEnum }
     *     
     */
    public PredefinedServiceEnum getPredefinedService() {
        return predefinedService;
    }

    /**
     * Sets the value of the predefinedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedServiceEnum }
     *     
     */
    public void setPredefinedService(PredefinedServiceEnum value) {
        this.predefinedService = value;
    }

    /**
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceActionEnum }
     *     
     */
    public ServiceActionEnum getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceActionEnum }
     *     
     */
    public void setRequestedAction(ServiceActionEnum value) {
        this.requestedAction = value;
    }

    /**
     * Gets the value of the servicerRequestCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServicerRequestCreationTime() {
        return servicerRequestCreationTime;
    }

    /**
     * Sets the value of the servicerRequestCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServicerRequestCreationTime(XMLGregorianCalendar value) {
        this.servicerRequestCreationTime = value;
    }

    /**
     * Gets the value of the servicerRequestVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServicerRequestVersionTime() {
        return servicerRequestVersionTime;
    }

    /**
     * Sets the value of the servicerRequestVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServicerRequestVersionTime(XMLGregorianCalendar value) {
        this.servicerRequestVersionTime = value;
    }

    /**
     * Gets the value of the customServiceParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomServiceParameter() {
        return customServiceParameter;
    }

    /**
     * Sets the value of the customServiceParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomServiceParameter(String value) {
        this.customServiceParameter = value;
    }

    /**
     * Gets the value of the serviceRequester property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getServiceRequester() {
        return serviceRequester;
    }

    /**
     * Sets the value of the serviceRequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setServiceRequester(Agent value) {
        this.serviceRequester = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getServiceProvider() {
        if (serviceProvider == null) {
            serviceProvider = new ArrayList<Agent>();
        }
        return this.serviceProvider;
    }

    /**
     * Gets the value of the serviceRequestCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestCondition }
     *     
     */
    public ServiceRequestCondition getServiceRequestCondition() {
        return serviceRequestCondition;
    }

    /**
     * Sets the value of the serviceRequestCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestCondition }
     *     
     */
    public void setServiceRequestCondition(ServiceRequestCondition value) {
        this.serviceRequestCondition = value;
    }

    /**
     * Gets the value of the serviceRequestExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceRequestExtension() {
        return serviceRequestExtension;
    }

    /**
     * Sets the value of the serviceRequestExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceRequestExtension(ExtensionType value) {
        this.serviceRequestExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
