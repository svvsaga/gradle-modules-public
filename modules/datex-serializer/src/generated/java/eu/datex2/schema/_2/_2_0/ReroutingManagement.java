
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReroutingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReroutingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/2/2_0}ReroutingManagementTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="reroutingItineraryDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="signedRerouting" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="entry" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="exit" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="roadOrJunctionNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="alternativeRoute" type="{http://datex2.eu/schema/2/2_0}Itinerary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reroutingManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "entry",
    "exit",
    "roadOrJunctionNumber",
    "alternativeRoute",
    "reroutingManagementExtension"
})
public class ReroutingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<ReroutingManagementTypeEnum> reroutingManagementType;
    protected MultilingualString reroutingItineraryDescription;
    protected Boolean signedRerouting;
    protected String entry;
    protected String exit;
    protected String roadOrJunctionNumber;
    protected List<Itinerary> alternativeRoute;
    protected ExtensionType reroutingManagementExtension;

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
     * {@link ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<ReroutingManagementTypeEnum>();
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
     * Gets the value of the reroutingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReroutingManagementExtension() {
        return reroutingManagementExtension;
    }

    /**
     * Sets the value of the reroutingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReroutingManagementExtension(ExtensionType value) {
        this.reroutingManagementExtension = value;
    }

}
