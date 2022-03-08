
package eu.datex2.schema._3.cctvextension;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvGeographicArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvGeographicArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="nation" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="county" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="areaName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="policeForceControlArea" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadOperatorControlArea" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_cctvGeographicAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvGeographicArea", propOrder = {
    "country",
    "nation",
    "county",
    "areaName",
    "policeForceControlArea",
    "roadOperatorControlArea",
    "cctvGeographicAreaExtension"
})
public class CctvGeographicArea {

    protected String country;
    protected MultilingualString nation;
    protected MultilingualString county;
    protected MultilingualString areaName;
    protected MultilingualString policeForceControlArea;
    protected MultilingualString roadOperatorControlArea;
    @XmlElement(name = "_cctvGeographicAreaExtension")
    protected ExtensionType cctvGeographicAreaExtension;

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
     * Gets the value of the cctvGeographicAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvGeographicAreaExtension() {
        return cctvGeographicAreaExtension;
    }

    /**
     * Sets the value of the cctvGeographicAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvGeographicAreaExtension(ExtensionType value) {
        this.cctvGeographicAreaExtension = value;
    }

}
