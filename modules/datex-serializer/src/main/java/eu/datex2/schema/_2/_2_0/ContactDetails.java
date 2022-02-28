
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Contact"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactOrganisationName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonFirstName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonPosition" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsLanguage" type="{http://datex2.eu/schema/2/2_0}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsAddress" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsStreet" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsHouseNumber" type="{http://datex2.eu/schema/2/2_0}String" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsPostcode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsCity" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/2/2_0}CountryEnum" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsTelephoneNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsFax" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsEMail" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsLogoUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="available24hours" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsResponsibility" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsMoreInfo" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publishingAgreement" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsOwnership" type="{http://datex2.eu/schema/2/2_0}OwnershipTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="contactDetailsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails", propOrder = {
    "contactOrganisationName",
    "contactPersonName",
    "contactPersonFirstName",
    "contactPersonPosition",
    "contactDetailsLanguage",
    "contactDetailsAddress",
    "contactDetailsStreet",
    "contactDetailsHouseNumber",
    "contactDetailsPostcode",
    "contactDetailsCity",
    "country",
    "contactDetailsTelephoneNumber",
    "contactDetailsFax",
    "contactDetailsEMail",
    "urlLinkAddress",
    "contactDetailsLogoUrl",
    "available24Hours",
    "contactDetailsResponsibility",
    "contactDetailsMoreInfo",
    "publishingAgreement",
    "contactDetailsOwnership",
    "groupOfLocations",
    "contactDetailsExtension"
})
public class ContactDetails
    extends Contact
{

    protected MultilingualString contactOrganisationName;
    protected String contactPersonName;
    protected String contactPersonFirstName;
    protected MultilingualString contactPersonPosition;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> contactDetailsLanguage;
    protected MultilingualString contactDetailsAddress;
    protected String contactDetailsStreet;
    protected List<String> contactDetailsHouseNumber;
    protected String contactDetailsPostcode;
    protected MultilingualString contactDetailsCity;
    @XmlSchemaType(name = "string")
    protected CountryEnum country;
    protected String contactDetailsTelephoneNumber;
    protected String contactDetailsFax;
    protected String contactDetailsEMail;
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    @XmlSchemaType(name = "anyURI")
    protected String contactDetailsLogoUrl;
    @XmlElement(name = "available24hours")
    protected Boolean available24Hours;
    protected List<MultilingualString> contactDetailsResponsibility;
    protected List<MultilingualString> contactDetailsMoreInfo;
    protected Boolean publishingAgreement;
    @XmlSchemaType(name = "string")
    protected OwnershipTypeEnum contactDetailsOwnership;
    protected GroupOfLocations groupOfLocations;
    protected _ExtensionType contactDetailsExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the contactOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContactOrganisationName() {
        return contactOrganisationName;
    }

    /**
     * Sets the value of the contactOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContactOrganisationName(MultilingualString value) {
        this.contactOrganisationName = value;
    }

    /**
     * Gets the value of the contactPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonName() {
        return contactPersonName;
    }

    /**
     * Sets the value of the contactPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonName(String value) {
        this.contactPersonName = value;
    }

    /**
     * Gets the value of the contactPersonFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonFirstName() {
        return contactPersonFirstName;
    }

    /**
     * Sets the value of the contactPersonFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonFirstName(String value) {
        this.contactPersonFirstName = value;
    }

    /**
     * Gets the value of the contactPersonPosition property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContactPersonPosition() {
        return contactPersonPosition;
    }

    /**
     * Sets the value of the contactPersonPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContactPersonPosition(MultilingualString value) {
        this.contactPersonPosition = value;
    }

    /**
     * Gets the value of the contactDetailsLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetailsLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetailsLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactDetailsLanguage() {
        if (contactDetailsLanguage == null) {
            contactDetailsLanguage = new ArrayList<String>();
        }
        return this.contactDetailsLanguage;
    }

    /**
     * Gets the value of the contactDetailsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContactDetailsAddress() {
        return contactDetailsAddress;
    }

    /**
     * Sets the value of the contactDetailsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContactDetailsAddress(MultilingualString value) {
        this.contactDetailsAddress = value;
    }

    /**
     * Gets the value of the contactDetailsStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsStreet() {
        return contactDetailsStreet;
    }

    /**
     * Sets the value of the contactDetailsStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsStreet(String value) {
        this.contactDetailsStreet = value;
    }

    /**
     * Gets the value of the contactDetailsHouseNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetailsHouseNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetailsHouseNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactDetailsHouseNumber() {
        if (contactDetailsHouseNumber == null) {
            contactDetailsHouseNumber = new ArrayList<String>();
        }
        return this.contactDetailsHouseNumber;
    }

    /**
     * Gets the value of the contactDetailsPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsPostcode() {
        return contactDetailsPostcode;
    }

    /**
     * Sets the value of the contactDetailsPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsPostcode(String value) {
        this.contactDetailsPostcode = value;
    }

    /**
     * Gets the value of the contactDetailsCity property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getContactDetailsCity() {
        return contactDetailsCity;
    }

    /**
     * Sets the value of the contactDetailsCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setContactDetailsCity(MultilingualString value) {
        this.contactDetailsCity = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setCountry(CountryEnum value) {
        this.country = value;
    }

    /**
     * Gets the value of the contactDetailsTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsTelephoneNumber() {
        return contactDetailsTelephoneNumber;
    }

    /**
     * Sets the value of the contactDetailsTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsTelephoneNumber(String value) {
        this.contactDetailsTelephoneNumber = value;
    }

    /**
     * Gets the value of the contactDetailsFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsFax() {
        return contactDetailsFax;
    }

    /**
     * Sets the value of the contactDetailsFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsFax(String value) {
        this.contactDetailsFax = value;
    }

    /**
     * Gets the value of the contactDetailsEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsEMail() {
        return contactDetailsEMail;
    }

    /**
     * Sets the value of the contactDetailsEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsEMail(String value) {
        this.contactDetailsEMail = value;
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
     * Gets the value of the contactDetailsLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDetailsLogoUrl() {
        return contactDetailsLogoUrl;
    }

    /**
     * Sets the value of the contactDetailsLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDetailsLogoUrl(String value) {
        this.contactDetailsLogoUrl = value;
    }

    /**
     * Gets the value of the available24Hours property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable24Hours() {
        return available24Hours;
    }

    /**
     * Sets the value of the available24Hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable24Hours(Boolean value) {
        this.available24Hours = value;
    }

    /**
     * Gets the value of the contactDetailsResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetailsResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetailsResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getContactDetailsResponsibility() {
        if (contactDetailsResponsibility == null) {
            contactDetailsResponsibility = new ArrayList<MultilingualString>();
        }
        return this.contactDetailsResponsibility;
    }

    /**
     * Gets the value of the contactDetailsMoreInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetailsMoreInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetailsMoreInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getContactDetailsMoreInfo() {
        if (contactDetailsMoreInfo == null) {
            contactDetailsMoreInfo = new ArrayList<MultilingualString>();
        }
        return this.contactDetailsMoreInfo;
    }

    /**
     * Gets the value of the publishingAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishingAgreement() {
        return publishingAgreement;
    }

    /**
     * Sets the value of the publishingAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishingAgreement(Boolean value) {
        this.publishingAgreement = value;
    }

    /**
     * Gets the value of the contactDetailsOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeEnum }
     *     
     */
    public OwnershipTypeEnum getContactDetailsOwnership() {
        return contactDetailsOwnership;
    }

    /**
     * Sets the value of the contactDetailsOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeEnum }
     *     
     */
    public void setContactDetailsOwnership(OwnershipTypeEnum value) {
        this.contactDetailsOwnership = value;
    }

    /**
     * Gets the value of the groupOfLocations property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Sets the value of the groupOfLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Gets the value of the contactDetailsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getContactDetailsExtension() {
        return contactDetailsExtension;
    }

    /**
     * Sets the value of the contactDetailsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setContactDetailsExtension(_ExtensionType value) {
        this.contactDetailsExtension = value;
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
