
package eu.datex2.schema._3.cisinformation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.Reference;
import eu.datex2.schema._3.common.VersionedReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="externalIdCondition" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencedCondition" type="{http://datex2.eu/schema/3/common}Reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="versionReferencedCondition" type="{http://datex2.eu/schema/3/common}VersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_serviceRequestConditionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestCondition", namespace = "http://datex2.eu/schema/3/cisInformation", propOrder = {
    "conditionDescription",
    "externalIdCondition",
    "referencedCondition",
    "versionReferencedCondition",
    "serviceRequestConditionExtension"
})
public class ServiceRequestCondition {

    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation")
    protected MultilingualString conditionDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation")
    protected List<String> externalIdCondition;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation")
    protected List<Reference> referencedCondition;
    @XmlElement(namespace = "http://datex2.eu/schema/3/cisInformation")
    protected List<VersionedReference> versionReferencedCondition;
    @XmlElement(name = "_serviceRequestConditionExtension", namespace = "http://datex2.eu/schema/3/cisInformation")
    protected ExtensionType serviceRequestConditionExtension;

    /**
     * Gets the value of the conditionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getConditionDescription() {
        return conditionDescription;
    }

    /**
     * Sets the value of the conditionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setConditionDescription(MultilingualString value) {
        this.conditionDescription = value;
    }

    /**
     * Gets the value of the externalIdCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the externalIdCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalIdCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalIdCondition() {
        if (externalIdCondition == null) {
            externalIdCondition = new ArrayList<String>();
        }
        return this.externalIdCondition;
    }

    /**
     * Gets the value of the referencedCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referencedCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getReferencedCondition() {
        if (referencedCondition == null) {
            referencedCondition = new ArrayList<Reference>();
        }
        return this.referencedCondition;
    }

    /**
     * Gets the value of the versionReferencedCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the versionReferencedCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionReferencedCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionedReference }
     * 
     * 
     */
    public List<VersionedReference> getVersionReferencedCondition() {
        if (versionReferencedCondition == null) {
            versionReferencedCondition = new ArrayList<VersionedReference>();
        }
        return this.versionReferencedCondition;
    }

    /**
     * Gets the value of the serviceRequestConditionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceRequestConditionExtension() {
        return serviceRequestConditionExtension;
    }

    /**
     * Sets the value of the serviceRequestConditionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceRequestConditionExtension(ExtensionType value) {
        this.serviceRequestConditionExtension = value;
    }

}
