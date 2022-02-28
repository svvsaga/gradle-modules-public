
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryByIndexedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryByIndexedLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Itinerary"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationContainedInItinerary" type="{http://datex2.eu/schema/2/2_0}_LocationContainedInItinerary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itineraryByIndexedLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByIndexedLocations", propOrder = {
    "locationContainedInItinerary",
    "itineraryByIndexedLocationsExtension"
})
public class ItineraryByIndexedLocations
    extends Itinerary
{

    protected List<_LocationContainedInItinerary> locationContainedInItinerary;
    protected _ExtensionType itineraryByIndexedLocationsExtension;

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
     * {@link _LocationContainedInItinerary }
     * 
     * 
     */
    public List<_LocationContainedInItinerary> getLocationContainedInItinerary() {
        if (locationContainedInItinerary == null) {
            locationContainedInItinerary = new ArrayList<_LocationContainedInItinerary>();
        }
        return this.locationContainedInItinerary;
    }

    /**
     * Gets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getItineraryByIndexedLocationsExtension() {
        return itineraryByIndexedLocationsExtension;
    }

    /**
     * Sets the value of the itineraryByIndexedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setItineraryByIndexedLocationsExtension(_ExtensionType value) {
        this.itineraryByIndexedLocationsExtension = value;
    }

}
