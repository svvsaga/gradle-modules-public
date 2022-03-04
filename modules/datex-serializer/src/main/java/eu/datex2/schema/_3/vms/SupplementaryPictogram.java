
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementaryPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}SupplementaryInformationDisplay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramDescription" type="{http://datex2.eu/schema/3/vms}_SupplementalPictogramEnum" minOccurs="0"/&gt;
 *         &lt;element name="pictogramCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="pictogramUrl" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&gt;
 *         &lt;element name="additionalDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pictogramFlashing" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramInformationType" type="{http://datex2.eu/schema/3/vms}_InformationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_supplementaryPictogramExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPictogram", propOrder = {
    "pictogramDescription",
    "pictogramCode",
    "pictogramUrl",
    "additionalDescription",
    "pictogramFlashing",
    "pictogramInformationType",
    "supplementaryPictogramExtension"
})
public class SupplementaryPictogram
    extends SupplementaryInformationDisplay
{

    protected SupplementalPictogramEnum pictogramDescription;
    protected String pictogramCode;
    @XmlSchemaType(name = "anyURI")
    protected String pictogramUrl;
    protected MultilingualString additionalDescription;
    protected Boolean pictogramFlashing;
    protected InformationTypeEnum pictogramInformationType;
    @XmlElement(name = "_supplementaryPictogramExtension")
    protected ExtensionType supplementaryPictogramExtension;

    /**
     * Gets the value of the pictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalPictogramEnum }
     *     
     */
    public SupplementalPictogramEnum getPictogramDescription() {
        return pictogramDescription;
    }

    /**
     * Sets the value of the pictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalPictogramEnum }
     *     
     */
    public void setPictogramDescription(SupplementalPictogramEnum value) {
        this.pictogramDescription = value;
    }

    /**
     * Gets the value of the pictogramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramCode() {
        return pictogramCode;
    }

    /**
     * Sets the value of the pictogramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramCode(String value) {
        this.pictogramCode = value;
    }

    /**
     * Gets the value of the pictogramUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramUrl() {
        return pictogramUrl;
    }

    /**
     * Sets the value of the pictogramUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramUrl(String value) {
        this.pictogramUrl = value;
    }

    /**
     * Gets the value of the additionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * Sets the value of the additionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdditionalDescription(MultilingualString value) {
        this.additionalDescription = value;
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
     * Gets the value of the pictogramInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link InformationTypeEnum }
     *     
     */
    public InformationTypeEnum getPictogramInformationType() {
        return pictogramInformationType;
    }

    /**
     * Sets the value of the pictogramInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationTypeEnum }
     *     
     */
    public void setPictogramInformationType(InformationTypeEnum value) {
        this.pictogramInformationType = value;
    }

    /**
     * Gets the value of the supplementaryPictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPictogramExtension() {
        return supplementaryPictogramExtension;
    }

    /**
     * Sets the value of the supplementaryPictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPictogramExtension(ExtensionType value) {
        this.supplementaryPictogramExtension = value;
    }

}
