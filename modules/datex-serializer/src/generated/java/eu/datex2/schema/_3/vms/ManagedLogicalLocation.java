
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Location;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedLogicalLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedLogicalLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managedLogicalLocation" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromLogicalLocation" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="managedLocation" type="{http://datex2.eu/schema/3/locationReferencing}Location" minOccurs="0"/&gt;
 *         &lt;element name="_managedLogicalLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedLogicalLocation", propOrder = {
    "managedLogicalLocation",
    "distanceFromLogicalLocation",
    "managedLocation",
    "_ManagedLogicalLocationExtension"
})
public class ManagedLogicalLocation {

    protected MultilingualString managedLogicalLocation;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromLogicalLocation;
    protected Location managedLocation;
    @XmlElement(name = "_managedLogicalLocationExtension")
    protected _ExtensionType _ManagedLogicalLocationExtension;

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
     * Gets the value of the _ManagedLogicalLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ManagedLogicalLocationExtension() {
        return _ManagedLogicalLocationExtension;
    }

    /**
     * Sets the value of the _ManagedLogicalLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ManagedLogicalLocationExtension(_ExtensionType value) {
        this._ManagedLogicalLocationExtension = value;
    }

}
