
package eu.datex2.schema._3.cisinformation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.VersionedReference;
import eu.datex2.schema._3.exchangeinformation.Agent;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeedback complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeedback"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceRequestFeedbackReason" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="serviceRequestStatus" type="{http://datex2.eu/schema/3/cisInformation}_ServiceActionStatusEnum"/&gt;
 *         &lt;element name="serviceRequestReference" type="{http://datex2.eu/schema/3/common}VersionedReference"/&gt;
 *         &lt;element name="serviceProvider" type="{http://datex2.eu/schema/3/exchangeInformation}Agent"/&gt;
 *         &lt;element name="_serviceFeedbackExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeedback", namespace = "http://datex2.eu/schema/3/cisInformation", propOrder = {
    "serviceRequestFeedbackReason",
    "serviceRequestStatus",
    "serviceRequestReference",
    "serviceProvider",
    "serviceFeedbackExtension"
})
public class ServiceFeedback {

    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation")
    protected MultilingualString serviceRequestFeedbackReason;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation", required = true)
    protected ServiceActionStatusEnum serviceRequestStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation", required = true)
    protected VersionedReference serviceRequestReference;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation", required = true)
    protected Agent serviceProvider;
    @XmlElement(name = "_serviceFeedbackExtension", namespace = "http://datex2.eu/schema/3/cisInformation")
    protected ExtensionType serviceFeedbackExtension;

    /**
     * Gets the value of the serviceRequestFeedbackReason property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getServiceRequestFeedbackReason() {
        return serviceRequestFeedbackReason;
    }

    /**
     * Sets the value of the serviceRequestFeedbackReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setServiceRequestFeedbackReason(MultilingualString value) {
        this.serviceRequestFeedbackReason = value;
    }

    /**
     * Gets the value of the serviceRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceActionStatusEnum }
     *     
     */
    public ServiceActionStatusEnum getServiceRequestStatus() {
        return serviceRequestStatus;
    }

    /**
     * Sets the value of the serviceRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceActionStatusEnum }
     *     
     */
    public void setServiceRequestStatus(ServiceActionStatusEnum value) {
        this.serviceRequestStatus = value;
    }

    /**
     * Gets the value of the serviceRequestReference property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getServiceRequestReference() {
        return serviceRequestReference;
    }

    /**
     * Sets the value of the serviceRequestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setServiceRequestReference(VersionedReference value) {
        this.serviceRequestReference = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setServiceProvider(Agent value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the serviceFeedbackExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceFeedbackExtension() {
        return serviceFeedbackExtension;
    }

    /**
     * Sets the value of the serviceFeedbackExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceFeedbackExtension(ExtensionType value) {
        this.serviceFeedbackExtension = value;
    }

}
