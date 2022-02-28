
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Represents one or more physically separate locations. Multiple locations may be related,
 *         as in an itinerary or route, or may be unrelated. One LocationReference should not use multiple Location
 *         objects to represent the same physical location.
 *       
 * 
 * <p>Java class for LocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_locationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationReference", propOrder = {
    "_LocationReferenceExtension"
})
@XmlSeeAlso({
    Itinerary.class,
    LocationGroup.class,
    Location.class
})
public abstract class LocationReference {

    @XmlElement(name = "_locationReferenceExtension")
    protected _ExtensionType _LocationReferenceExtension;

    /**
     * Gets the value of the _LocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationReferenceExtension() {
        return _LocationReferenceExtension;
    }

    /**
     * Sets the value of the _LocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationReferenceExtension(_ExtensionType value) {
        this._LocationReferenceExtension = value;
    }

}
