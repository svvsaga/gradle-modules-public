
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingStandardsAndSecurity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingStandardsAndSecurity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="labelSecurityLevel" type="{http://datex2.eu/schema/2/2_0}LABELSecurityLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="labelServiceLevel" type="{http://datex2.eu/schema/2/2_0}LABELServiceLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="labelSecurityLevelSelfAssessment" type="{http://datex2.eu/schema/2/2_0}LABELSecurityLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="labelServiceLevelSelfAssessment" type="{http://datex2.eu/schema/2/2_0}LABELServiceLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingSecurity" type="{http://datex2.eu/schema/2/2_0}ParkingSecurityEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingAdditionalSecurity" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSupervision" type="{http://datex2.eu/schema/2/2_0}ParkingSupervisionEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSecurityNationalClassification" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="certifiedSecureParking" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateOfCertification" type="{http://datex2.eu/schema/2/2_0}Date" minOccurs="0"/&gt;
 *         &lt;element name="parkingStandardsAndSecurityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingStandardsAndSecurity", propOrder = {
    "labelSecurityLevel",
    "labelServiceLevel",
    "labelSecurityLevelSelfAssessment",
    "labelServiceLevelSelfAssessment",
    "parkingSecurity",
    "parkingAdditionalSecurity",
    "parkingSupervision",
    "parkingSecurityNationalClassification",
    "certifiedSecureParking",
    "dateOfCertification",
    "parkingStandardsAndSecurityExtension"
})
public class ParkingStandardsAndSecurity {

    @XmlSchemaType(name = "string")
    protected LABELSecurityLevelEnum labelSecurityLevel;
    @XmlSchemaType(name = "string")
    protected LABELServiceLevelEnum labelServiceLevel;
    @XmlSchemaType(name = "string")
    protected LABELSecurityLevelEnum labelSecurityLevelSelfAssessment;
    @XmlSchemaType(name = "string")
    protected LABELServiceLevelEnum labelServiceLevelSelfAssessment;
    @XmlSchemaType(name = "string")
    protected List<ParkingSecurityEnum> parkingSecurity;
    protected List<MultilingualString> parkingAdditionalSecurity;
    @XmlSchemaType(name = "string")
    protected List<ParkingSupervisionEnum> parkingSupervision;
    protected MultilingualString parkingSecurityNationalClassification;
    protected Boolean certifiedSecureParking;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfCertification;
    protected ExtensionType parkingStandardsAndSecurityExtension;

    /**
     * Gets the value of the labelSecurityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LABELSecurityLevelEnum }
     *     
     */
    public LABELSecurityLevelEnum getLabelSecurityLevel() {
        return labelSecurityLevel;
    }

    /**
     * Sets the value of the labelSecurityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LABELSecurityLevelEnum }
     *     
     */
    public void setLabelSecurityLevel(LABELSecurityLevelEnum value) {
        this.labelSecurityLevel = value;
    }

    /**
     * Gets the value of the labelServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LABELServiceLevelEnum }
     *     
     */
    public LABELServiceLevelEnum getLabelServiceLevel() {
        return labelServiceLevel;
    }

    /**
     * Sets the value of the labelServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LABELServiceLevelEnum }
     *     
     */
    public void setLabelServiceLevel(LABELServiceLevelEnum value) {
        this.labelServiceLevel = value;
    }

    /**
     * Gets the value of the labelSecurityLevelSelfAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link LABELSecurityLevelEnum }
     *     
     */
    public LABELSecurityLevelEnum getLabelSecurityLevelSelfAssessment() {
        return labelSecurityLevelSelfAssessment;
    }

    /**
     * Sets the value of the labelSecurityLevelSelfAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LABELSecurityLevelEnum }
     *     
     */
    public void setLabelSecurityLevelSelfAssessment(LABELSecurityLevelEnum value) {
        this.labelSecurityLevelSelfAssessment = value;
    }

    /**
     * Gets the value of the labelServiceLevelSelfAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link LABELServiceLevelEnum }
     *     
     */
    public LABELServiceLevelEnum getLabelServiceLevelSelfAssessment() {
        return labelServiceLevelSelfAssessment;
    }

    /**
     * Sets the value of the labelServiceLevelSelfAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LABELServiceLevelEnum }
     *     
     */
    public void setLabelServiceLevelSelfAssessment(LABELServiceLevelEnum value) {
        this.labelServiceLevelSelfAssessment = value;
    }

    /**
     * Gets the value of the parkingSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSecurityEnum }
     * 
     * 
     */
    public List<ParkingSecurityEnum> getParkingSecurity() {
        if (parkingSecurity == null) {
            parkingSecurity = new ArrayList<ParkingSecurityEnum>();
        }
        return this.parkingSecurity;
    }

    /**
     * Gets the value of the parkingAdditionalSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingAdditionalSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingAdditionalSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getParkingAdditionalSecurity() {
        if (parkingAdditionalSecurity == null) {
            parkingAdditionalSecurity = new ArrayList<MultilingualString>();
        }
        return this.parkingAdditionalSecurity;
    }

    /**
     * Gets the value of the parkingSupervision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSupervision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSupervision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSupervisionEnum }
     * 
     * 
     */
    public List<ParkingSupervisionEnum> getParkingSupervision() {
        if (parkingSupervision == null) {
            parkingSupervision = new ArrayList<ParkingSupervisionEnum>();
        }
        return this.parkingSupervision;
    }

    /**
     * Gets the value of the parkingSecurityNationalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingSecurityNationalClassification() {
        return parkingSecurityNationalClassification;
    }

    /**
     * Sets the value of the parkingSecurityNationalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingSecurityNationalClassification(MultilingualString value) {
        this.parkingSecurityNationalClassification = value;
    }

    /**
     * Gets the value of the certifiedSecureParking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertifiedSecureParking() {
        return certifiedSecureParking;
    }

    /**
     * Sets the value of the certifiedSecureParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedSecureParking(Boolean value) {
        this.certifiedSecureParking = value;
    }

    /**
     * Gets the value of the dateOfCertification property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfCertification() {
        return dateOfCertification;
    }

    /**
     * Sets the value of the dateOfCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfCertification(XMLGregorianCalendar value) {
        this.dateOfCertification = value;
    }

    /**
     * Gets the value of the parkingStandardsAndSecurityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingStandardsAndSecurityExtension() {
        return parkingStandardsAndSecurityExtension;
    }

    /**
     * Sets the value of the parkingStandardsAndSecurityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingStandardsAndSecurityExtension(ExtensionType value) {
        this.parkingStandardsAndSecurityExtension = value;
    }

}
