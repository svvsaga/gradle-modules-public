
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumerationLitteral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumerationLitteral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enumerationName" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="enumerationLitteral" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="definition" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="designation" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="translation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="translationDefinition" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="enumerationLitteralExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumerationLitteral", propOrder = {
    "enumerationName",
    "enumerationLitteral",
    "definition",
    "designation",
    "translation",
    "translationDefinition",
    "enumerationLitteralExtension"
})
public class EnumerationLitteral {

    @XmlElement(required = true)
    protected String enumerationName;
    @XmlElement(required = true)
    protected String enumerationLitteral;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String designation;
    protected MultilingualString translation;
    protected MultilingualString translationDefinition;
    protected ExtensionType enumerationLitteralExtension;

    /**
     * Gets the value of the enumerationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumerationName() {
        return enumerationName;
    }

    /**
     * Sets the value of the enumerationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumerationName(String value) {
        this.enumerationName = value;
    }

    /**
     * Gets the value of the enumerationLitteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumerationLitteral() {
        return enumerationLitteral;
    }

    /**
     * Sets the value of the enumerationLitteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumerationLitteral(String value) {
        this.enumerationLitteral = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTranslation(MultilingualString value) {
        this.translation = value;
    }

    /**
     * Gets the value of the translationDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTranslationDefinition() {
        return translationDefinition;
    }

    /**
     * Sets the value of the translationDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTranslationDefinition(MultilingualString value) {
        this.translationDefinition = value;
    }

    /**
     * Gets the value of the enumerationLitteralExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnumerationLitteralExtension() {
        return enumerationLitteralExtension;
    }

    /**
     * Sets the value of the enumerationLitteralExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnumerationLitteralExtension(ExtensionType value) {
        this.enumerationLitteralExtension = value;
    }

}
