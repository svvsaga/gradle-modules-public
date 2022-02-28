
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementReferenceModel" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementReferenceModelVersion" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="linearElementNature" type="{http://datex2.eu/schema/2/2_0}LinearElementNatureEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "linearElementExtension"
})
@XmlSeeAlso({
    LinearElementByCode.class,
    LinearElementByPoints.class
})
public class LinearElement {

    protected MultilingualString roadName;
    protected String roadNumber;
    protected String linearElementReferenceModel;
    protected String linearElementReferenceModelVersion;
    @XmlSchemaType(name = "string")
    protected LinearElementNatureEnum linearElementNature;
    protected _ExtensionType linearElementExtension;

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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getLinearElementExtension() {
        return linearElementExtension;
    }

    /**
     * Sets the value of the linearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setLinearElementExtension(_ExtensionType value) {
        this.linearElementExtension = value;
    }

}
