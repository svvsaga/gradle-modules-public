
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GddStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GddStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gddPictogramIdentification" type="{http://datex2.eu/schema/3/vms}GddPictogramIdentification"/&gt;
 *         &lt;element name="gddPictogramAttributes" type="{http://datex2.eu/schema/3/vms}GddPictogramAttributes" minOccurs="0"/&gt;
 *         &lt;element name="_gddStructureExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GddStructure", propOrder = {
    "gddPictogramIdentification",
    "gddPictogramAttributes",
    "gddStructureExtension"
})
public class GddStructure {

    @XmlElement(required = true)
    protected GddPictogramIdentification gddPictogramIdentification;
    protected GddPictogramAttributes gddPictogramAttributes;
    @XmlElement(name = "_gddStructureExtension")
    protected ExtensionType gddStructureExtension;

    /**
     * Gets the value of the gddPictogramIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link GddPictogramIdentification }
     *     
     */
    public GddPictogramIdentification getGddPictogramIdentification() {
        return gddPictogramIdentification;
    }

    /**
     * Sets the value of the gddPictogramIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link GddPictogramIdentification }
     *     
     */
    public void setGddPictogramIdentification(GddPictogramIdentification value) {
        this.gddPictogramIdentification = value;
    }

    /**
     * Gets the value of the gddPictogramAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link GddPictogramAttributes }
     *     
     */
    public GddPictogramAttributes getGddPictogramAttributes() {
        return gddPictogramAttributes;
    }

    /**
     * Sets the value of the gddPictogramAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GddPictogramAttributes }
     *     
     */
    public void setGddPictogramAttributes(GddPictogramAttributes value) {
        this.gddPictogramAttributes = value;
    }

    /**
     * Gets the value of the gddStructureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGddStructureExtension() {
        return gddStructureExtension;
    }

    /**
     * Sets the value of the gddStructureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGddStructureExtension(ExtensionType value) {
        this.gddStructureExtension = value;
    }

}
