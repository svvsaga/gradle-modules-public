
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A linear element along a single linear object, consistent with EN ISO 19148 definitions.
 *       
 * 
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
@XmlType(name = "LinearElement", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "roadName",
    "roadNumber",
    "linearElementReferenceModel",
    "linearElementReferenceModelVersion",
    "linearElementNature",
    "linearElementExtension"
})
@XmlSeeAlso({
    LinearElementByCode.class,
    LinearElementByLineString.class,
    LinearElementByPoints.class
})
public class LinearElement {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected MultilingualString roadName;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String roadNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String linearElementReferenceModel;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String linearElementReferenceModelVersion;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected LinearElementNatureEnum linearElementNature;
    @XmlElement(name = "_linearElementExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType linearElementExtension;

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
     *     {@link LinearElementNatureEnum }
     *     
     */
    public LinearElementNatureEnum getLinearElementNature() {
        return linearElementNature;
    }

    /**
     * Sets the value of the linearElementNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearElementNatureEnum }
     *     
     */
    public void setLinearElementNature(LinearElementNatureEnum value) {
        this.linearElementNature = value;
    }

    /**
     * Gets the value of the linearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearElementExtension() {
        return linearElementExtension;
    }

    /**
     * Sets the value of the linearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearElementExtension(ExtensionType value) {
        this.linearElementExtension = value;
    }

}
