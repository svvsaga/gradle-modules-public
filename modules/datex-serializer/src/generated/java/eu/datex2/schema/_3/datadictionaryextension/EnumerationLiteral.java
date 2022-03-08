
package eu.datex2.schema._3.datadictionaryextension;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumerationLiteral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnumerationLiteral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namespace" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="enumerationName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="enumerationLiteral" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="definition" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="designation" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="translation" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="translationDefinition" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="_enumerationLiteralExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumerationLiteral", propOrder = {
    "namespace",
    "enumerationName",
    "enumerationLiteral",
    "definition",
    "designation",
    "translation",
    "translationDefinition",
    "enumerationLiteralExtension"
})
public class EnumerationLiteral {

    @XmlElement(required = true)
    protected String namespace;
    @XmlElement(required = true)
    protected String enumerationName;
    @XmlElement(required = true)
    protected String enumerationLiteral;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String designation;
    protected MultilingualString translation;
    protected MultilingualString translationDefinition;
    @XmlElement(name = "_enumerationLiteralExtension")
    protected ExtensionType enumerationLiteralExtension;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

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
     * Gets the value of the enumerationLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumerationLiteral() {
        return enumerationLiteral;
    }

    /**
     * Sets the value of the enumerationLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumerationLiteral(String value) {
        this.enumerationLiteral = value;
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
     * Gets the value of the enumerationLiteralExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnumerationLiteralExtension() {
        return enumerationLiteralExtension;
    }

    /**
     * Sets the value of the enumerationLiteralExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnumerationLiteralExtension(ExtensionType value) {
        this.enumerationLiteralExtension = value;
    }

}
