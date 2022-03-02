
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
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
    "locationReferenceExtension"
})
@XmlSeeAlso({
    Itinerary.class,
    LocationGroup.class,
    Location.class
})
public abstract class LocationReference {

    @XmlElement(name = "_locationReferenceExtension")
    protected ExtensionType locationReferenceExtension;

    /**
     * Gets the value of the locationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationReferenceExtension() {
        return locationReferenceExtension;
    }

    /**
     * Sets the value of the locationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationReferenceExtension(ExtensionType value) {
        this.locationReferenceExtension = value;
    }

}
