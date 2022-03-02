
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.HeaderInformation;
import eu.datex2.schema._3.common.InternationalIdentifier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An identifiable instance of a traffic/travel situation comprising one or more
 *         traffic/travel circumstances which are linked by one or more causal relationships. Each traffic/travel
 *         circumstance is represented by a Situation Record.
 *       
 * 
 * <p>Java class for Situation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Situation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallSeverity" type="{http://datex2.eu/schema/3/situation}_SeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="situationVersionTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/3/common}HeaderInformation"/&gt;
 *         &lt;element name="situationRecord" type="{http://datex2.eu/schema/3/situation}SituationRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/3/situation}SituationReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="informationManager" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="situationSummary" type="{http://datex2.eu/schema/3/situation}SituationRecord" minOccurs="0"/&gt;
 *         &lt;element name="_situationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Situation", propOrder = {
    "overallSeverity",
    "situationVersionTime",
    "headerInformation",
    "situationRecord",
    "relatedSituation",
    "informationManager",
    "situationSummary",
    "situationExtension"
})
public class Situation {

    protected SeverityEnum overallSeverity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar situationVersionTime;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SituationRecord> situationRecord;
    protected List<SituationReference> relatedSituation;
    protected InternationalIdentifier informationManager;
    protected SituationRecord situationSummary;
    @XmlElement(name = "_situationExtension")
    protected ExtensionType situationExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the overallSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnum }
     *     
     */
    public SeverityEnum getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * Sets the value of the overallSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnum }
     *     
     */
    public void setOverallSeverity(SeverityEnum value) {
        this.overallSeverity = value;
    }

    /**
     * Gets the value of the situationVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationVersionTime() {
        return situationVersionTime;
    }

    /**
     * Sets the value of the situationVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationVersionTime(XMLGregorianCalendar value) {
        this.situationVersionTime = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the situationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the situationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRecord }
     * 
     * 
     */
    public List<SituationRecord> getSituationRecord() {
        if (situationRecord == null) {
            situationRecord = new ArrayList<SituationRecord>();
        }
        return this.situationRecord;
    }

    /**
     * Gets the value of the relatedSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationReference }
     * 
     * 
     */
    public List<SituationReference> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<SituationReference>();
        }
        return this.relatedSituation;
    }

    /**
     * Gets the value of the informationManager property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManager() {
        return informationManager;
    }

    /**
     * Sets the value of the informationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManager(InternationalIdentifier value) {
        this.informationManager = value;
    }

    /**
     * Gets the value of the situationSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecord }
     *     
     */
    public SituationRecord getSituationSummary() {
        return situationSummary;
    }

    /**
     * Sets the value of the situationSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecord }
     *     
     */
    public void setSituationSummary(SituationRecord value) {
        this.situationSummary = value;
    }

    /**
     * Gets the value of the situationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationExtension() {
        return situationExtension;
    }

    /**
     * Sets the value of the situationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationExtension(ExtensionType value) {
        this.situationExtension = value;
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

}
