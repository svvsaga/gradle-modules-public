
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
 *     &lt;extension base="{http://datex2.eu/schema/3/common}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="namedAreaType" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="_namedAreaExtension" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
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
    "_LocNamedAreaExtension"
})
@XmlSeeAlso({
    IsoNamedArea.class,
    NutsNamedArea.class
})
public class NamedArea
    extends eu.datex2.schema._3.common.NamedArea
{

    @XmlElement(required = true)
    protected MultilingualString areaName;
    protected _NamedAreaTypeEnum namedAreaType;
    protected String country;
    @XmlElement(name = "_namedAreaExtension")
    protected _NamedAreaExtensionType _LocNamedAreaExtension;

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
     *     {@link _NamedAreaTypeEnum }
     *     
     */
    public _NamedAreaTypeEnum getNamedAreaType() {
        return namedAreaType;
    }

    /**
     * Sets the value of the namedAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NamedAreaTypeEnum }
     *     
     */
    public void setNamedAreaType(_NamedAreaTypeEnum value) {
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
     * Gets the value of the _LocNamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _NamedAreaExtensionType }
     *     
     */
    public _NamedAreaExtensionType get_LocNamedAreaExtension() {
        return _LocNamedAreaExtension;
    }

    /**
     * Sets the value of the _LocNamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NamedAreaExtensionType }
     *     
     */
    public void set_LocNamedAreaExtension(_NamedAreaExtensionType value) {
        this._LocNamedAreaExtension = value;
    }

}
