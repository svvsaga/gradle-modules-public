
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeDestination" type="{http://datex2.eu/schema/2/2_0}Destination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itineraryExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "routeDestination",
    "itineraryExtension"
})
@XmlSeeAlso({
    ItineraryByIndexedLocations.class,
    ItineraryByReference.class
})
public abstract class Itinerary
    extends GroupOfLocations
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<Destination> routeDestination;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType itineraryExtension;

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
     * Gets the value of the itineraryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryExtension() {
        return itineraryExtension;
    }

    /**
     * Sets the value of the itineraryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryExtension(ExtensionType value) {
        this.itineraryExtension = value;
    }

}
