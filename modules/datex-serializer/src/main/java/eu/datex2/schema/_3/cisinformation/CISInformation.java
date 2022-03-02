
package eu.datex2.schema._3.cisinformation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CISInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CISInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceFeedback" type="{http://datex2.eu/schema/3/cisInformation}ServiceFeedback" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceRequest" type="{http://datex2.eu/schema/3/cisInformation}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_cisInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CISInformation", propOrder = {
    "serviceFeedback",
    "serviceRequest",
    "cisInformationExtension"
})
public class CISInformation {

    protected List<ServiceFeedback> serviceFeedback;
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "_cisInformationExtension")
    protected ExtensionType cisInformationExtension;

    /**
     * Gets the value of the serviceFeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeedback }
     * 
     * 
     */
    public List<ServiceFeedback> getServiceFeedback() {
        if (serviceFeedback == null) {
            serviceFeedback = new ArrayList<ServiceFeedback>();
        }
        return this.serviceFeedback;
    }

    /**
     * Gets the value of the serviceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * 
     * 
     */
    public List<ServiceRequest> getServiceRequest() {
        if (serviceRequest == null) {
            serviceRequest = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequest;
    }

    /**
     * Gets the value of the cisInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCisInformationExtension() {
        return cisInformationExtension;
    }

    /**
     * Sets the value of the cisInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCisInformationExtension(ExtensionType value) {
        this.cisInformationExtension = value;
    }

}
