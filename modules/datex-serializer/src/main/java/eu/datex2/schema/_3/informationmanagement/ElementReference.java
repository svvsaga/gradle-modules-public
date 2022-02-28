
package eu.datex2.schema._3.informationmanagement;

import eu.datex2.schema._3.common.Reference;
import eu.datex2.schema._3.common.VersionedReference;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managementStatus" type="{http://datex2.eu/schema/3/informationManagement}_ManagementTypeEnum"/&gt;
 *         &lt;element name="reference" type="{http://datex2.eu/schema/3/common}Reference" minOccurs="0"/&gt;
 *         &lt;element name="versionedReference" type="{http://datex2.eu/schema/3/common}VersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="_elementReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementReference", propOrder = {
    "managementStatus",
    "reference",
    "versionedReference",
    "_ElementReferenceExtension"
})
public class ElementReference {

    @XmlElement(required = true)
    protected _ManagementTypeEnum managementStatus;
    protected Reference reference;
    protected VersionedReference versionedReference;
    @XmlElement(name = "_elementReferenceExtension")
    protected _ExtensionType _ElementReferenceExtension;

    /**
     * Gets the value of the managementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ManagementTypeEnum }
     *     
     */
    public _ManagementTypeEnum getManagementStatus() {
        return managementStatus;
    }

    /**
     * Sets the value of the managementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ManagementTypeEnum }
     *     
     */
    public void setManagementStatus(_ManagementTypeEnum value) {
        this.managementStatus = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the versionedReference property.
     * 
     * @return
     *     possible object is
     *     {@link VersionedReference }
     *     
     */
    public VersionedReference getVersionedReference() {
        return versionedReference;
    }

    /**
     * Sets the value of the versionedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionedReference }
     *     
     */
    public void setVersionedReference(VersionedReference value) {
        this.versionedReference = value;
    }

    /**
     * Gets the value of the _ElementReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElementReferenceExtension() {
        return _ElementReferenceExtension;
    }

    /**
     * Sets the value of the _ElementReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElementReferenceExtension(_ExtensionType value) {
        this._ElementReferenceExtension = value;
    }

}
