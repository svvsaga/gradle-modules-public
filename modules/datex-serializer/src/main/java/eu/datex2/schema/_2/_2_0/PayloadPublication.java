
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="feedDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="feedType" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="publicationTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="publicationCreator" type="{http://datex2.eu/schema/2/2_0}InternationalIdentifier"/&gt;
 *         &lt;element name="payloadPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{http://datex2.eu/schema/2/2_0}Language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadPublication", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "feedDescription",
    "feedType",
    "publicationTime",
    "publicationCreator",
    "payloadPublicationExtension"
})
@XmlSeeAlso({
    ElaboratedDataPublication.class,
    GenericPublication.class,
    MeasuredDataPublication.class,
    MeasurementSiteTablePublication.class,
    PredefinedLocationsPublication.class,
    SituationPublication.class,
    TrafficViewPublication.class,
    VmsPublication.class,
    VmsTablePublication.class
})
public abstract class PayloadPublication {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString feedDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String feedType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected InternationalIdentifier publicationCreator;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType payloadPublicationExtension;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

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

}
