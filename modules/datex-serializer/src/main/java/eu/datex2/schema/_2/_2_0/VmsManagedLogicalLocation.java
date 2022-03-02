
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsManagedLogicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsManagedLogicalLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managedLogicalLocation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromLogicalLocation" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="managedLocation" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/&gt;
 *         &lt;element name="vmsManagedLogicalLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsManagedLogicalLocation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "managedLogicalLocation",
    "distanceFromLogicalLocation",
    "managedLocation",
    "vmsManagedLogicalLocationExtension"
})
public class VmsManagedLogicalLocation {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString managedLogicalLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromLogicalLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Location managedLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType vmsManagedLogicalLocationExtension;

    /**
     * Gets the value of the managedLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getManagedLogicalLocation() {
        return managedLogicalLocation;
    }

    /**
     * Sets the value of the managedLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setManagedLogicalLocation(MultilingualString value) {
        this.managedLogicalLocation = value;
    }

    /**
     * Gets the value of the distanceFromLogicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromLogicalLocation() {
        return distanceFromLogicalLocation;
    }

    /**
     * Sets the value of the distanceFromLogicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromLogicalLocation(BigInteger value) {
        this.distanceFromLogicalLocation = value;
    }

    /**
     * Gets the value of the managedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getManagedLocation() {
        return managedLocation;
    }

    /**
     * Sets the value of the managedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setManagedLocation(Location value) {
        this.managedLocation = value;
    }

    /**
     * Gets the value of the vmsManagedLogicalLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsManagedLogicalLocationExtension() {
        return vmsManagedLogicalLocationExtension;
    }

    /**
     * Sets the value of the vmsManagedLogicalLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsManagedLogicalLocationExtension(ExtensionType value) {
        this.vmsManagedLogicalLocationExtension = value;
    }

}
