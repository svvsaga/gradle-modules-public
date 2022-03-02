
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ConfidentialityValueEnum;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common.Source;
import eu.datex2.schema._3.common.UrlLink;
import eu.datex2.schema._3.common.Validity;
import eu.datex2.schema._3.locationreferencing.LocationReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An identifiable versioned instance of a single record/element within a situation.
 *       
 * 
 * <p>Java class for SituationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="situationRecordCreationReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordCreationTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="situationRecordObservationTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="situationRecordVersionTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="situationRecordFirstSupplierVersionTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="confidentialityOverride" type="{http://datex2.eu/schema/3/common}_ConfidentialityValueEnum" minOccurs="0"/&gt;
 *         &lt;element name="probabilityOfOccurrence" type="{http://datex2.eu/schema/3/situation}_ProbabilityOfOccurrenceEnum"/&gt;
 *         &lt;element name="severity" type="{http://datex2.eu/schema/3/situation}_SeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="safetyRelatedMessage" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/3/common}Source" minOccurs="0"/&gt;
 *         &lt;element name="validity" type="{http://datex2.eu/schema/3/common}Validity"/&gt;
 *         &lt;element name="impact" type="{http://datex2.eu/schema/3/situation}Impact" minOccurs="0"/&gt;
 *         &lt;element name="cause" type="{http://datex2.eu/schema/3/situation}Cause" minOccurs="0"/&gt;
 *         &lt;element name="generalPublicComment" type="{http://datex2.eu/schema/3/situation}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nonGeneralPublicComment" type="{http://datex2.eu/schema/3/situation}Comment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urlLink" type="{http://datex2.eu/schema/3/common}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationReference" type="{http://datex2.eu/schema/3/locationReferencing}LocationReference"/&gt;
 *         &lt;element name="informationManagerOverride" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="impactOnOppositeDirection" type="{http://datex2.eu/schema/3/situation}Impact" minOccurs="0"/&gt;
 *         &lt;element name="_situationRecordExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "SituationRecord", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "situationRecordCreationReference",
    "situationRecordCreationTime",
    "situationRecordObservationTime",
    "situationRecordVersionTime",
    "situationRecordFirstSupplierVersionTime",
    "confidentialityOverride",
    "probabilityOfOccurrence",
    "severity",
    "safetyRelatedMessage",
    "source",
    "validity",
    "impact",
    "cause",
    "generalPublicComment",
    "nonGeneralPublicComment",
    "urlLink",
    "locationReference",
    "informationManagerOverride",
    "impactOnOppositeDirection",
    "situationRecordExtension"
})
@XmlSeeAlso({
    GenericSituationRecord.class,
    ServiceInformation.class,
    TrafficElement.class,
    OperatorAction.class
})
public abstract class SituationRecord {

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected String situationRecordCreationReference;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar situationRecordCreationTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar situationRecordObservationTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar situationRecordVersionTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar situationRecordFirstSupplierVersionTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected ConfidentialityValueEnum confidentialityOverride;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrence;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected SeverityEnum severity;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Boolean safetyRelatedMessage;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Source source;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    protected Validity validity;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Impact impact;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Cause cause;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected List<Comment> generalPublicComment;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected List<Comment> nonGeneralPublicComment;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected List<UrlLink> urlLink;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation", required = true)
    protected LocationReference locationReference;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected InternationalIdentifier informationManagerOverride;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Impact impactOnOppositeDirection;
    @XmlElement(name = "_situationRecordExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType situationRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the situationRecordCreationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationRecordCreationReference() {
        return situationRecordCreationReference;
    }

    /**
     * Sets the value of the situationRecordCreationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationReference(String value) {
        this.situationRecordCreationReference = value;
    }

    /**
     * Gets the value of the situationRecordCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordCreationTime() {
        return situationRecordCreationTime;
    }

    /**
     * Sets the value of the situationRecordCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordCreationTime(XMLGregorianCalendar value) {
        this.situationRecordCreationTime = value;
    }

    /**
     * Gets the value of the situationRecordObservationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordObservationTime() {
        return situationRecordObservationTime;
    }

    /**
     * Sets the value of the situationRecordObservationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordObservationTime(XMLGregorianCalendar value) {
        this.situationRecordObservationTime = value;
    }

    /**
     * Gets the value of the situationRecordVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordVersionTime() {
        return situationRecordVersionTime;
    }

    /**
     * Sets the value of the situationRecordVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordVersionTime(XMLGregorianCalendar value) {
        this.situationRecordVersionTime = value;
    }

    /**
     * Gets the value of the situationRecordFirstSupplierVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationRecordFirstSupplierVersionTime() {
        return situationRecordFirstSupplierVersionTime;
    }

    /**
     * Sets the value of the situationRecordFirstSupplierVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationRecordFirstSupplierVersionTime(XMLGregorianCalendar value) {
        this.situationRecordFirstSupplierVersionTime = value;
    }

    /**
     * Gets the value of the confidentialityOverride property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentialityOverride() {
        return confidentialityOverride;
    }

    /**
     * Sets the value of the confidentialityOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentialityOverride(ConfidentialityValueEnum value) {
        this.confidentialityOverride = value;
    }

    /**
     * Gets the value of the probabilityOfOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    /**
     * Sets the value of the probabilityOfOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrence = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnum }
     *     
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnum }
     *     
     */
    public void setSeverity(SeverityEnum value) {
        this.severity = value;
    }

    /**
     * Gets the value of the safetyRelatedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafetyRelatedMessage() {
        return safetyRelatedMessage;
    }

    /**
     * Sets the value of the safetyRelatedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyRelatedMessage(Boolean value) {
        this.safetyRelatedMessage = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
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
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpact(Impact value) {
        this.impact = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link Cause }
     *     
     */
    public Cause getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cause }
     *     
     */
    public void setCause(Cause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the generalPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generalPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getGeneralPublicComment() {
        if (generalPublicComment == null) {
            generalPublicComment = new ArrayList<Comment>();
        }
        return this.generalPublicComment;
    }

    /**
     * Gets the value of the nonGeneralPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonGeneralPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getNonGeneralPublicComment() {
        if (nonGeneralPublicComment == null) {
            nonGeneralPublicComment = new ArrayList<Comment>();
        }
        return this.nonGeneralPublicComment;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the urlLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getUrlLink() {
        if (urlLink == null) {
            urlLink = new ArrayList<UrlLink>();
        }
        return this.urlLink;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setLocationReference(LocationReference value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the informationManagerOverride property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManagerOverride() {
        return informationManagerOverride;
    }

    /**
     * Sets the value of the informationManagerOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManagerOverride(InternationalIdentifier value) {
        this.informationManagerOverride = value;
    }

    /**
     * Gets the value of the impactOnOppositeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpactOnOppositeDirection() {
        return impactOnOppositeDirection;
    }

    /**
     * Sets the value of the impactOnOppositeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpactOnOppositeDirection(Impact value) {
        this.impactOnOppositeDirection = value;
    }

    /**
     * Gets the value of the situationRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordExtension() {
        return situationRecordExtension;
    }

    /**
     * Sets the value of the situationRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordExtension(ExtensionType value) {
        this.situationRecordExtension = value;
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
