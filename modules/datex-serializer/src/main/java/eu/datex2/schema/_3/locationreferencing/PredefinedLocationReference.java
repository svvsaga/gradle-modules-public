
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A location reference which is predefined and may be realised by a predefined itinerary,
 *         non-ordered group of locations or single location.
 *       
 * 
 * <p>Java class for PredefinedLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_predefinedLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationReference", propOrder = {
    "_PredefinedLocationReferenceExtension"
})
@XmlSeeAlso({
    PredefinedItinerary.class,
    PredefinedLocation.class,
    PredefinedLocationGroup.class
})
public abstract class PredefinedLocationReference {

    @XmlElement(name = "_predefinedLocationReferenceExtension")
    protected _ExtensionType _PredefinedLocationReferenceExtension;

    /**
     * Gets the value of the _PredefinedLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PredefinedLocationReferenceExtension() {
        return _PredefinedLocationReferenceExtension;
    }

    /**
     * Sets the value of the _PredefinedLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PredefinedLocationReferenceExtension(_ExtensionType value) {
        this._PredefinedLocationReferenceExtension = value;
    }

}
