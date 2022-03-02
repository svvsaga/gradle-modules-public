
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyCatalogueReference" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="catalogueReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueReference", propOrder = {
    "keyCatalogueReference",
    "catalogueReferenceExtension"
})
public class CatalogueReference {

    @XmlElement(required = true)
    protected String keyCatalogueReference;
    protected ExtensionType catalogueReferenceExtension;

    /**
     * Gets the value of the keyCatalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCatalogueReference() {
        return keyCatalogueReference;
    }

    /**
     * Sets the value of the keyCatalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCatalogueReference(String value) {
        this.keyCatalogueReference = value;
    }

    /**
     * Gets the value of the catalogueReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCatalogueReferenceExtension() {
        return catalogueReferenceExtension;
    }

    /**
     * Sets the value of the catalogueReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCatalogueReferenceExtension(ExtensionType value) {
        this.catalogueReferenceExtension = value;
    }

}
