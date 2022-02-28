
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multiple (i.e. more than one) physically separate locations arranged as an ordered set
 *         that defines an itinerary or route.
 *       
 * 
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeDestination" type="{http://datex2.eu/schema/3/locationReferencing}Destination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_itineraryExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "routeDestination",
    "_ItineraryExtension"
})
@XmlSeeAlso({
    ItineraryByIndexedLocations.class,
    ItineraryByReference.class
})
public abstract class Itinerary
    extends LocationReference
{

    protected List<Destination> routeDestination;
    @XmlElement(name = "_itineraryExtension")
    protected _ExtensionType _ItineraryExtension;

    /**
     * Gets the value of the routeDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the routeDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * 
     * 
     */
    public List<Destination> getRouteDestination() {
        if (routeDestination == null) {
            routeDestination = new ArrayList<Destination>();
        }
        return this.routeDestination;
    }

    /**
     * Gets the value of the _ItineraryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ItineraryExtension() {
        return _ItineraryExtension;
    }

    /**
     * Sets the value of the _ItineraryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ItineraryExtension(_ExtensionType value) {
        this._ItineraryExtension = value;
    }

}
