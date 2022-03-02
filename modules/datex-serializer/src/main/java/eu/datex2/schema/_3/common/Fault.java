
package eu.datex2.schema._3.common;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.roadtrafficdata.PhysicalQuantityFault;
import eu.datex2.schema._3.vms.VmsControllerFault;
import eu.datex2.schema._3.vms.VmsFault;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about a fault relating to a specific piece of equipment or process.
 *       
 * 
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="faultDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="faultCreationTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="faultLastUpdateTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="faultImpactSeverity" type="{http://datex2.eu/schema/3/common}_FaultSeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="faultUrgencyToRectify" type="{http://datex2.eu/schema/3/common}_FaultUrgencyEnum" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerFaultCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="_faultExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {
    "faultIdentifier",
    "faultDescription",
    "faultCreationTime",
    "faultLastUpdateTime",
    "faultImpactSeverity",
    "faultUrgencyToRectify",
    "manufacturerFaultCode",
    "faultExtension"
})
@XmlSeeAlso({
    VmsControllerFault.class,
    VmsFault.class,
    PhysicalQuantityFault.class
})
public class Fault {

    protected String faultIdentifier;
    protected MultilingualString faultDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar faultCreationTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar faultLastUpdateTime;
    protected FaultSeverityEnum faultImpactSeverity;
    protected FaultUrgencyEnum faultUrgencyToRectify;
    protected String manufacturerFaultCode;
    @XmlElement(name = "_faultExtension")
    protected ExtensionType faultExtension;

    /**
     * Gets the value of the faultIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultIdentifier() {
        return faultIdentifier;
    }

    /**
     * Sets the value of the faultIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultIdentifier(String value) {
        this.faultIdentifier = value;
    }

    /**
     * Gets the value of the faultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFaultDescription() {
        return faultDescription;
    }

    /**
     * Sets the value of the faultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFaultDescription(MultilingualString value) {
        this.faultDescription = value;
    }

    /**
     * Gets the value of the faultCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaultCreationTime() {
        return faultCreationTime;
    }

    /**
     * Sets the value of the faultCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaultCreationTime(XMLGregorianCalendar value) {
        this.faultCreationTime = value;
    }

    /**
     * Gets the value of the faultLastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaultLastUpdateTime() {
        return faultLastUpdateTime;
    }

    /**
     * Sets the value of the faultLastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaultLastUpdateTime(XMLGregorianCalendar value) {
        this.faultLastUpdateTime = value;
    }

    /**
     * Gets the value of the faultImpactSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link FaultSeverityEnum }
     *     
     */
    public FaultSeverityEnum getFaultImpactSeverity() {
        return faultImpactSeverity;
    }

    /**
     * Sets the value of the faultImpactSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultSeverityEnum }
     *     
     */
    public void setFaultImpactSeverity(FaultSeverityEnum value) {
        this.faultImpactSeverity = value;
    }

    /**
     * Gets the value of the faultUrgencyToRectify property.
     * 
     * @return
     *     possible object is
     *     {@link FaultUrgencyEnum }
     *     
     */
    public FaultUrgencyEnum getFaultUrgencyToRectify() {
        return faultUrgencyToRectify;
    }

    /**
     * Sets the value of the faultUrgencyToRectify property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultUrgencyEnum }
     *     
     */
    public void setFaultUrgencyToRectify(FaultUrgencyEnum value) {
        this.faultUrgencyToRectify = value;
    }

    /**
     * Gets the value of the manufacturerFaultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerFaultCode() {
        return manufacturerFaultCode;
    }

    /**
     * Sets the value of the manufacturerFaultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerFaultCode(String value) {
        this.manufacturerFaultCode = value;
    }

    /**
     * Gets the value of the faultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFaultExtension() {
        return faultExtension;
    }

    /**
     * Sets the value of the faultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFaultExtension(ExtensionType value) {
        this.faultExtension = value;
    }

}
