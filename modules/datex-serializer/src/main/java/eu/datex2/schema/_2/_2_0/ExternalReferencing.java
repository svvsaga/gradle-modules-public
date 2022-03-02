
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalReferencing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferencing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalLocationCode" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="externalReferencingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "externalReferencingExtension"
})
public class ExternalReferencing {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String externalLocationCode;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String externalReferencingSystem;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType externalReferencingExtension;

    /**
     * Gets the value of the externalLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Sets the value of the externalLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    /**
     * Gets the value of the externalReferencingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Sets the value of the externalReferencingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    /**
     * Gets the value of the externalReferencingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExternalReferencingExtension() {
        return externalReferencingExtension;
    }

    /**
     * Sets the value of the externalReferencingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExternalReferencingExtension(ExtensionType value) {
        this.externalReferencingExtension = value;
    }

}
