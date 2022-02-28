
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The specification of a destination. This may be either a point location or an area
 *         location.
 *       
 * 
 * <p>Java class for Destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Destination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_destinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Destination", propOrder = {
    "_DestinationExtension"
})
@XmlSeeAlso({
    AreaDestination.class,
    PointDestination.class
})
public abstract class Destination {

    @XmlElement(name = "_destinationExtension")
    protected _ExtensionType _DestinationExtension;

    /**
     * Gets the value of the _DestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DestinationExtension() {
        return _DestinationExtension;
    }

    /**
     * Sets the value of the _DestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DestinationExtension(_ExtensionType value) {
        this._DestinationExtension = value;
    }

}
