
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementReferenceModel" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementReferenceModelVersion" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementNature" type="{http://datex2.eu/schema/3/locationReferencing}_LinearElementNatureEnum" minOccurs="0"/&gt;
 *         &lt;element name="_linearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElement", propOrder = {
    "roadName",
    "roadNumber",
    "linearElementReferenceModel",
    "linearElementReferenceModelVersion",
    "linearElementNature",
    "_LinearElementExtension"
})
@XmlSeeAlso({
    LinearElementByCode.class,
    LinearElementByLineString.class,
    LinearElementByPoints.class
})
public class LinearElement {

    protected MultilingualString roadName;
    protected String roadNumber;
    protected String linearElementReferenceModel;
    protected String linearElementReferenceModelVersion;
    protected _LinearElementNatureEnum linearElementNature;
    @XmlElement(name = "_linearElementExtension")
    protected _ExtensionType _LinearElementExtension;

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the linearElementReferenceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearElementReferenceModel() {
        return linearElementReferenceModel;
    }

    /**
     * Sets the value of the linearElementReferenceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearElementReferenceModel(String value) {
        this.linearElementReferenceModel = value;
    }

    /**
     * Gets the value of the linearElementReferenceModelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearElementReferenceModelVersion() {
        return linearElementReferenceModelVersion;
    }

    /**
     * Sets the value of the linearElementReferenceModelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearElementReferenceModelVersion(String value) {
        this.linearElementReferenceModelVersion = value;
    }

    /**
     * Gets the value of the linearElementNature property.
     * 
     * @return
     *     possible object is
     *     {@link _LinearElementNatureEnum }
     *     
     */
    public _LinearElementNatureEnum getLinearElementNature() {
        return linearElementNature;
    }

    /**
     * Sets the value of the linearElementNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LinearElementNatureEnum }
     *     
     */
    public void setLinearElementNature(_LinearElementNatureEnum value) {
        this.linearElementNature = value;
    }

    /**
     * Gets the value of the _LinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LinearElementExtension() {
        return _LinearElementExtension;
    }

    /**
     * Sets the value of the _LinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LinearElementExtension(_ExtensionType value) {
        this._LinearElementExtension = value;
    }

}
