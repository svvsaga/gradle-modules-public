
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicHoliday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicHoliday"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/2/2_0}CountryEnum"/&gt;
 *         &lt;element name="countrySubdivision" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="publicHolidayType" type="{http://datex2.eu/schema/2/2_0}PublicHolidayTypeEnum"/&gt;
 *         &lt;element name="publicHolidayName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="publicHolidayExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicHoliday", propOrder = {
    "country",
    "countrySubdivision",
    "region",
    "publicHolidayType",
    "publicHolidayName",
    "publicHolidayExtension"
})
public class PublicHoliday {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryEnum country;
    protected String countrySubdivision;
    protected MultilingualString region;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PublicHolidayTypeEnum publicHolidayType;
    protected MultilingualString publicHolidayName;
    protected ExtensionType publicHolidayExtension;

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
     * Gets the value of the countrySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Sets the value of the countrySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivision(String value) {
        this.countrySubdivision = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRegion(MultilingualString value) {
        this.region = value;
    }

    /**
     * Gets the value of the publicHolidayType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicHolidayTypeEnum }
     *     
     */
    public PublicHolidayTypeEnum getPublicHolidayType() {
        return publicHolidayType;
    }

    /**
     * Sets the value of the publicHolidayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicHolidayTypeEnum }
     *     
     */
    public void setPublicHolidayType(PublicHolidayTypeEnum value) {
        this.publicHolidayType = value;
    }

    /**
     * Gets the value of the publicHolidayName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPublicHolidayName() {
        return publicHolidayName;
    }

    /**
     * Sets the value of the publicHolidayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPublicHolidayName(MultilingualString value) {
        this.publicHolidayName = value;
    }

    /**
     * Gets the value of the publicHolidayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicHolidayExtension() {
        return publicHolidayExtension;
    }

    /**
     * Sets the value of the publicHolidayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicHolidayExtension(ExtensionType value) {
        this.publicHolidayExtension = value;
    }

}
