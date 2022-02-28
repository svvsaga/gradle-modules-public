
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Road maintenance, installation and construction activities, works in the road, or other
 *         construction or maintenance actions that may affect normal operation of a road.
 *       
 * 
 * <p>Java class for Roadworks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roadworks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicTransportAlternative" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadworksDurationClassification" type="{http://datex2.eu/schema/3/situation}_RoadworksDurationEnum" minOccurs="0"/&gt;
 *         &lt;element name="roadworksIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="roadworksScale" type="{http://datex2.eu/schema/3/situation}_RoadworksScaleEnum" minOccurs="0"/&gt;
 *         &lt;element name="underTraffic" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="urgentRoadworks" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobility" type="{http://datex2.eu/schema/3/situation}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="subjects" type="{http://datex2.eu/schema/3/situation}Subjects" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceVehicles" type="{http://datex2.eu/schema/3/situation}MaintenanceVehicles" minOccurs="0"/&gt;
 *         &lt;element name="_roadworksExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadworks", propOrder = {
    "publicTransportAlternative",
    "roadworksDurationClassification",
    "roadworksIdentifier",
    "roadworksScale",
    "underTraffic",
    "urgentRoadworks",
    "mobility",
    "subjects",
    "maintenanceVehicles",
    "_RoadworksExtension"
})
@XmlSeeAlso({
    ConstructionWorks.class,
    MaintenanceWorks.class
})
public abstract class Roadworks
    extends OperatorAction
{

    protected MultilingualString publicTransportAlternative;
    protected _RoadworksDurationEnum roadworksDurationClassification;
    protected String roadworksIdentifier;
    protected _RoadworksScaleEnum roadworksScale;
    protected Boolean underTraffic;
    protected Boolean urgentRoadworks;
    protected Mobility mobility;
    protected Subjects subjects;
    protected MaintenanceVehicles maintenanceVehicles;
    @XmlElement(name = "_roadworksExtension")
    protected _ExtensionType _RoadworksExtension;

    /**
     * Gets the value of the publicTransportAlternative property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPublicTransportAlternative() {
        return publicTransportAlternative;
    }

    /**
     * Sets the value of the publicTransportAlternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPublicTransportAlternative(MultilingualString value) {
        this.publicTransportAlternative = value;
    }

    /**
     * Gets the value of the roadworksDurationClassification property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadworksDurationEnum }
     *     
     */
    public _RoadworksDurationEnum getRoadworksDurationClassification() {
        return roadworksDurationClassification;
    }

    /**
     * Sets the value of the roadworksDurationClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDurationClassification(_RoadworksDurationEnum value) {
        this.roadworksDurationClassification = value;
    }

    /**
     * Gets the value of the roadworksIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadworksIdentifier() {
        return roadworksIdentifier;
    }

    /**
     * Sets the value of the roadworksIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadworksIdentifier(String value) {
        this.roadworksIdentifier = value;
    }

    /**
     * Gets the value of the roadworksScale property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadworksScaleEnum }
     *     
     */
    public _RoadworksScaleEnum getRoadworksScale() {
        return roadworksScale;
    }

    /**
     * Sets the value of the roadworksScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScale(_RoadworksScaleEnum value) {
        this.roadworksScale = value;
    }

    /**
     * Gets the value of the underTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderTraffic() {
        return underTraffic;
    }

    /**
     * Sets the value of the underTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderTraffic(Boolean value) {
        this.underTraffic = value;
    }

    /**
     * Gets the value of the urgentRoadworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgentRoadworks() {
        return urgentRoadworks;
    }

    /**
     * Sets the value of the urgentRoadworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgentRoadworks(Boolean value) {
        this.urgentRoadworks = value;
    }

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobility(Mobility value) {
        this.mobility = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the maintenanceVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public MaintenanceVehicles getMaintenanceVehicles() {
        return maintenanceVehicles;
    }

    /**
     * Sets the value of the maintenanceVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public void setMaintenanceVehicles(MaintenanceVehicles value) {
        this.maintenanceVehicles = value;
    }

    /**
     * Gets the value of the _RoadworksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadworksExtension() {
        return _RoadworksExtension;
    }

    /**
     * Sets the value of the _RoadworksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadworksExtension(_ExtensionType value) {
        this._RoadworksExtension = value;
    }

}
