
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="country" type="{http://datex2.eu/schema/2/2_0}CountryEnum" minOccurs="0"/&gt;
 *         &lt;element name="nation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="county" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="areaName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="policeForceControlArea" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadOperatorControlArea" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="namedAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "country",
    "nation",
    "county",
    "areaName",
    "policeForceControlArea",
    "roadOperatorControlArea",
    "namedAreaExtension"
})
public class NamedArea {

    @XmlSchemaType(name = "string")
    protected CountryEnum country;
    protected MultilingualString nation;
    protected MultilingualString county;
    protected MultilingualString areaName;
    protected MultilingualString policeForceControlArea;
    protected MultilingualString roadOperatorControlArea;
    protected _ExtensionType namedAreaExtension;

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
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNation(MultilingualString value) {
        this.nation = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCounty(MultilingualString value) {
        this.county = value;
    }

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
     * Gets the value of the policeForceControlArea property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPoliceForceControlArea() {
        return policeForceControlArea;
    }

    /**
     * Sets the value of the policeForceControlArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPoliceForceControlArea(MultilingualString value) {
        this.policeForceControlArea = value;
    }

    /**
     * Gets the value of the roadOperatorControlArea property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadOperatorControlArea() {
        return roadOperatorControlArea;
    }

    /**
     * Sets the value of the roadOperatorControlArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadOperatorControlArea(MultilingualString value) {
        this.roadOperatorControlArea = value;
    }

    /**
     * Gets the value of the namedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getNamedAreaExtension() {
        return namedAreaExtension;
    }

    /**
     * Sets the value of the namedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setNamedAreaExtension(_ExtensionType value) {
        this.namedAreaExtension = value;
    }

}
