
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Destination;
import eu.datex2.schema._3.locationreferencing.Itinerary;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rerouting management action that is issued by the network/road operator.
 *       
 * 
 * <p>Java class for ReroutingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReroutingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/3/situation}_ReroutingManagementTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="reroutingItineraryDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="signedRerouting" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="alternativeRouteIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="entry" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="exit" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="roadOrJunctionNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="alternativeRoute" type="{http://datex2.eu/schema/3/locationReferencing}Itinerary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://datex2.eu/schema/3/locationReferencing}Destination" minOccurs="0"/&gt;
 *         &lt;element name="_reroutingManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReroutingManagement", propOrder = {
    "reroutingManagementType",
    "reroutingItineraryDescription",
    "signedRerouting",
    "alternativeRouteIdentifier",
    "entry",
    "exit",
    "roadOrJunctionNumber",
    "alternativeRoute",
    "destination",
    "_ReroutingManagementExtension"
})
public class ReroutingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected List<_ReroutingManagementTypeEnum> reroutingManagementType;
    protected MultilingualString reroutingItineraryDescription;
    protected Boolean signedRerouting;
    protected String alternativeRouteIdentifier;
    protected String entry;
    protected String exit;
    protected String roadOrJunctionNumber;
    protected List<Itinerary> alternativeRoute;
    protected Destination destination;
    @XmlElement(name = "_reroutingManagementExtension")
    protected _ExtensionType _ReroutingManagementExtension;

    /**
     * Gets the value of the reroutingManagementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reroutingManagementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReroutingManagementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<_ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<_ReroutingManagementTypeEnum>();
        }
        return this.reroutingManagementType;
    }

    /**
     * Gets the value of the reroutingItineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReroutingItineraryDescription() {
        return reroutingItineraryDescription;
    }

    /**
     * Sets the value of the reroutingItineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReroutingItineraryDescription(MultilingualString value) {
        this.reroutingItineraryDescription = value;
    }

    /**
     * Gets the value of the signedRerouting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignedRerouting() {
        return signedRerouting;
    }

    /**
     * Sets the value of the signedRerouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignedRerouting(Boolean value) {
        this.signedRerouting = value;
    }

    /**
     * Gets the value of the alternativeRouteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeRouteIdentifier() {
        return alternativeRouteIdentifier;
    }

    /**
     * Sets the value of the alternativeRouteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeRouteIdentifier(String value) {
        this.alternativeRouteIdentifier = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    /**
     * Gets the value of the exit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExit() {
        return exit;
    }

    /**
     * Sets the value of the exit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExit(String value) {
        this.exit = value;
    }

    /**
     * Gets the value of the roadOrJunctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadOrJunctionNumber() {
        return roadOrJunctionNumber;
    }

    /**
     * Sets the value of the roadOrJunctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadOrJunctionNumber(String value) {
        this.roadOrJunctionNumber = value;
    }

    /**
     * Gets the value of the alternativeRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getAlternativeRoute() {
        if (alternativeRoute == null) {
            alternativeRoute = new ArrayList<Itinerary>();
        }
        return this.alternativeRoute;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the _ReroutingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ReroutingManagementExtension() {
        return _ReroutingManagementExtension;
    }

    /**
     * Sets the value of the _ReroutingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ReroutingManagementExtension(_ExtensionType value) {
        this._ReroutingManagementExtension = value;
    }

}
