
package eu.datex2.schema._3.datadictionaryextension;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Association"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namespace" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="className" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="roleName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="definition" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="designation" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="translation" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="translationDefinition" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="targetNamespace" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_associationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Association", propOrder = {
    "namespace",
    "className",
    "roleName",
    "definition",
    "designation",
    "translation",
    "translationDefinition",
    "targetNamespace",
    "_AssociationExtension"
})
public class Association {

    @XmlElement(required = true)
    protected String namespace;
    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected String roleName;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String designation;
    protected MultilingualString translation;
    protected MultilingualString translationDefinition;
    @XmlElement(required = true)
    protected String targetNamespace;
    @XmlElement(name = "_associationExtension")
    protected _ExtensionType _AssociationExtension;

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
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
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
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the _AssociationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AssociationExtension() {
        return _AssociationExtension;
    }

    /**
     * Sets the value of the _AssociationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AssociationExtension(_ExtensionType value) {
        this._AssociationExtension = value;
    }

}
