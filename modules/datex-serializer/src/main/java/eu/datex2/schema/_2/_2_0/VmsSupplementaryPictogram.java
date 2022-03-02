
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsSupplementaryPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsSupplementaryPictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPictogramDescription" type="{http://datex2.eu/schema/2/2_0}VmsDatexSupplementalPictogramEnum" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPictogramCode" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPictogramUrl" type="{http://datex2.eu/schema/2/2_0}Url" minOccurs="0"/&gt;
 *         &lt;element name="additionalSupplementaryPictogramDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pictogramFlashing" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="vmsSupplementaryPictogramExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsSupplementaryPictogram", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "supplementaryPictogramDescription",
    "supplementaryPictogramCode",
    "supplementaryPictogramUrl",
    "additionalSupplementaryPictogramDescription",
    "pictogramFlashing",
    "vmsSupplementaryPictogramExtension"
})
public class VmsSupplementaryPictogram {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected VmsDatexSupplementalPictogramEnum supplementaryPictogramDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String supplementaryPictogramCode;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "anyURI")
    protected String supplementaryPictogramUrl;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString additionalSupplementaryPictogramDescription;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean pictogramFlashing;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsSupplementaryPictogramExtension;

    /**
     * Gets the value of the supplementaryPictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VmsDatexSupplementalPictogramEnum }
     *     
     */
    public VmsDatexSupplementalPictogramEnum getSupplementaryPictogramDescription() {
        return supplementaryPictogramDescription;
    }

    /**
     * Sets the value of the supplementaryPictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsDatexSupplementalPictogramEnum }
     *     
     */
    public void setSupplementaryPictogramDescription(VmsDatexSupplementalPictogramEnum value) {
        this.supplementaryPictogramDescription = value;
    }

    /**
     * Gets the value of the supplementaryPictogramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryPictogramCode() {
        return supplementaryPictogramCode;
    }

    /**
     * Sets the value of the supplementaryPictogramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryPictogramCode(String value) {
        this.supplementaryPictogramCode = value;
    }

    /**
     * Gets the value of the supplementaryPictogramUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryPictogramUrl() {
        return supplementaryPictogramUrl;
    }

    /**
     * Sets the value of the supplementaryPictogramUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryPictogramUrl(String value) {
        this.supplementaryPictogramUrl = value;
    }

    /**
     * Gets the value of the additionalSupplementaryPictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdditionalSupplementaryPictogramDescription() {
        return additionalSupplementaryPictogramDescription;
    }

    /**
     * Sets the value of the additionalSupplementaryPictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdditionalSupplementaryPictogramDescription(MultilingualString value) {
        this.additionalSupplementaryPictogramDescription = value;
    }

    /**
     * Gets the value of the pictogramFlashing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictogramFlashing() {
        return pictogramFlashing;
    }

    /**
     * Sets the value of the pictogramFlashing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictogramFlashing(Boolean value) {
        this.pictogramFlashing = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsSupplementaryPictogramExtension() {
        return vmsSupplementaryPictogramExtension;
    }

    /**
     * Sets the value of the vmsSupplementaryPictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsSupplementaryPictogramExtension(ExtensionType value) {
        this.vmsSupplementaryPictogramExtension = value;
    }

}
