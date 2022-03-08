
package eu.datex2.schema._3.datadictionaryextension;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namespace" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="className" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="attributeName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="definition" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="designation" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="translation" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="translationDefinition" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="typeNamespace" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_attributeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "namespace",
    "className",
    "attributeName",
    "definition",
    "designation",
    "translation",
    "translationDefinition",
    "typeNamespace",
    "attributeExtension"
})
public class Attribute {

    @XmlElement(required = true)
    protected String namespace;
    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected String attributeName;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String designation;
    protected MultilingualString translation;
    protected MultilingualString translationDefinition;
    @XmlElement(required = true)
    protected String typeNamespace;
    @XmlElement(name = "_attributeExtension")
    protected ExtensionType attributeExtension;

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
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
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
     * Gets the value of the typeNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Sets the value of the typeNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNamespace(String value) {
        this.typeNamespace = value;
    }

    /**
     * Gets the value of the attributeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAttributeExtension() {
        return attributeExtension;
    }

    /**
     * Sets the value of the attributeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAttributeExtension(ExtensionType value) {
        this.attributeExtension = value;
    }

}
