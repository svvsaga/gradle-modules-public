
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Multiple physically separate locations arranged as an ordered set that defines an
 *         itinerary or route. The index qualifier indicates the order.
 *       
 * 
 * <p>Java class for ItineraryByIndexedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryByIndexedLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Itinerary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInItinerary" type="{http://datex2.eu/schema/3/locationReferencing}_LocationContainedInItinerary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_itineraryByIndexedLocationsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByIndexedLocations", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "locationContainedInItinerary",
    "itineraryByIndexedLocationsExtension"
})
public class ItineraryByIndexedLocations
    extends Itinerary
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<LocationContainedInItinerary> locationContainedInItinerary;
    @XmlElement(name = "_itineraryByIndexedLocationsExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType itineraryByIndexedLocationsExtension;

    /**
     * Gets the value of the locationContainedInItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContainedInItinerary }
     * 
     * 
     */
    public List<LocationContainedInItinerary> getLocationContainedInItinerary() {
        if (locationContainedInItinerary == null) {
            locationContainedInItinerary = new ArrayList<LocationContainedInItinerary>();
        }
        return this.locationContainedInItinerary;
    }

    /**
     * Gets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryByIndexedLocationsExtension() {
        return itineraryByIndexedLocationsExtension;
    }

    /**
     * Sets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryByIndexedLocationsExtension(ExtensionType value) {
        this.itineraryByIndexedLocationsExtension = value;
    }

}
