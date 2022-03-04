
package eu.datex2.schema._3.common;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.locationreferencing.PredefinedLocationsPublication;
import eu.datex2.schema._3.roadtrafficdata.ElaboratedDataPublication;
import eu.datex2.schema._3.roadtrafficdata.MeasuredDataPublication;
import eu.datex2.schema._3.roadtrafficdata.MeasurementSiteTablePublication;
import eu.datex2.schema._3.situation.SituationPublication;
import eu.datex2.schema._3.vms.VmsPublication;
import eu.datex2.schema._3.vms.VmsTablePublication;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PayloadPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feedDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="feedType" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="publicationTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="publicationCreator" type="{http://datex2.eu/schema/3/common}InternationalIdentifier"/&gt;
 *         &lt;element name="_payloadPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{http://datex2.eu/schema/3/common}Language" /&gt;
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" /&gt;
 *       &lt;attribute name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="extensionVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="profileVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadPublication", propOrder = {
    "feedDescription",
    "feedType",
    "publicationTime",
    "publicationCreator",
    "payloadPublicationExtension"
})
@XmlSeeAlso({
    GenericPublication.class,
    PredefinedLocationsPublication.class,
    VmsPublication.class,
    VmsTablePublication.class,
    SituationPublication.class,
    ElaboratedDataPublication.class,
    MeasuredDataPublication.class,
    MeasurementSiteTablePublication.class
})
public abstract class PayloadPublication {

    protected MultilingualString feedDescription;
    protected String feedType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationTime;
    @XmlElement(required = true)
    protected InternationalIdentifier publicationCreator;
    @XmlElement(name = "_payloadPublicationExtension")
    protected ExtensionType payloadPublicationExtension;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    protected String modelBaseVersion;
    @XmlAttribute(name = "extensionName")
    protected String extensionName;
    @XmlAttribute(name = "extensionVersion")
    protected String extensionVersion;
    @XmlAttribute(name = "profileName")
    protected String profileName;
    @XmlAttribute(name = "profileVersion")
    protected String profileVersion;

    /**
     * Gets the value of the feedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFeedDescription() {
        return feedDescription;
    }

    /**
     * Sets the value of the feedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFeedDescription(MultilingualString value) {
        this.feedDescription = value;
    }

    /**
     * Gets the value of the feedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Sets the value of the feedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    /**
     * Gets the value of the publicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationTime() {
        return publicationTime;
    }

    /**
     * Sets the value of the publicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationTime(XMLGregorianCalendar value) {
        this.publicationTime = value;
    }

    /**
     * Gets the value of the publicationCreator property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getPublicationCreator() {
        return publicationCreator;
    }

    /**
     * Sets the value of the publicationCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setPublicationCreator(InternationalIdentifier value) {
        this.publicationCreator = value;
    }

    /**
     * Gets the value of the payloadPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPayloadPublicationExtension() {
        return payloadPublicationExtension;
    }

    /**
     * Sets the value of the payloadPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPayloadPublicationExtension(ExtensionType value) {
        this.payloadPublicationExtension = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "3";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionVersion() {
        return extensionVersion;
    }

    /**
     * Sets the value of the extensionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionVersion(String value) {
        this.extensionVersion = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

}
