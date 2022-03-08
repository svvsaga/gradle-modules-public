
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="namedAreaType" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="_namedAreaExtension" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedArea", propOrder = {
    "areaName",
    "namedAreaType",
    "country",
    "namedAreaExtension"
})
@XmlSeeAlso({
    IsoNamedArea.class,
    NutsNamedArea.class
})
public class NamedArea {

    @XmlElement(required = true)
    protected MultilingualString areaName;
    protected NamedAreaTypeEnum namedAreaType;
    protected String country;
    @XmlElement(name = "_namedAreaExtension")
    protected NamedAreaExtensionType namedAreaExtension;

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAreaName(MultilingualString value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the namedAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link NamedAreaTypeEnum }
     *     
     */
    public NamedAreaTypeEnum getNamedAreaType() {
        return namedAreaType;
    }

    /**
     * Sets the value of the namedAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedAreaTypeEnum }
     *     
     */
    public void setNamedAreaType(NamedAreaTypeEnum value) {
        this.namedAreaType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the namedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link NamedAreaExtensionType }
     *     
     */
    public NamedAreaExtensionType getNamedAreaExtension() {
        return namedAreaExtension;
    }

    /**
     * Sets the value of the namedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedAreaExtensionType }
     *     
     */
    public void setNamedAreaExtension(NamedAreaExtensionType value) {
        this.namedAreaExtension = value;
    }

}
