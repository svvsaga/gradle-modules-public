
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingUsageScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingUsageScenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingUsageScenario" type="{http://datex2.eu/schema/2/2_0}ParkingUsageScenarioEnum"/&gt;
 *         &lt;element name="truckParkingDynamicManagement" type="{http://datex2.eu/schema/2/2_0}TruckParkingDynamicManagementEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventParkingType" type="{http://datex2.eu/schema/2/2_0}PublicEventTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="eventParkingType2" type="{http://datex2.eu/schema/2/2_0}PublicEventType2Enum" minOccurs="0"/&gt;
 *         &lt;element name="scenarioAvailability" type="{http://datex2.eu/schema/2/2_0}OverallPeriod" minOccurs="0"/&gt;
 *         &lt;element name="parkingUsageScenarioExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingUsageScenario", propOrder = {
    "parkingUsageScenario",
    "truckParkingDynamicManagement",
    "eventParkingType",
    "eventParkingType2",
    "scenarioAvailability",
    "parkingUsageScenarioExtension"
})
public class ParkingUsageScenario {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParkingUsageScenarioEnum parkingUsageScenario;
    @XmlSchemaType(name = "string")
    protected List<TruckParkingDynamicManagementEnum> truckParkingDynamicManagement;
    @XmlSchemaType(name = "string")
    protected PublicEventTypeEnum eventParkingType;
    @XmlSchemaType(name = "string")
    protected PublicEventType2Enum eventParkingType2;
    protected OverallPeriod scenarioAvailability;
    protected _ExtensionType parkingUsageScenarioExtension;

    /**
     * Gets the value of the parkingUsageScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUsageScenarioEnum }
     *     
     */
    public ParkingUsageScenarioEnum getParkingUsageScenario() {
        return parkingUsageScenario;
    }

    /**
     * Sets the value of the parkingUsageScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUsageScenarioEnum }
     *     
     */
    public void setParkingUsageScenario(ParkingUsageScenarioEnum value) {
        this.parkingUsageScenario = value;
    }

    /**
     * Gets the value of the truckParkingDynamicManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the truckParkingDynamicManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTruckParkingDynamicManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TruckParkingDynamicManagementEnum }
     * 
     * 
     */
    public List<TruckParkingDynamicManagementEnum> getTruckParkingDynamicManagement() {
        if (truckParkingDynamicManagement == null) {
            truckParkingDynamicManagement = new ArrayList<TruckParkingDynamicManagementEnum>();
        }
        return this.truckParkingDynamicManagement;
    }

    /**
     * Gets the value of the eventParkingType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getEventParkingType() {
        return eventParkingType;
    }

    /**
     * Sets the value of the eventParkingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setEventParkingType(PublicEventTypeEnum value) {
        this.eventParkingType = value;
    }

    /**
     * Gets the value of the eventParkingType2 property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventType2Enum }
     *     
     */
    public PublicEventType2Enum getEventParkingType2() {
        return eventParkingType2;
    }

    /**
     * Sets the value of the eventParkingType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventType2Enum }
     *     
     */
    public void setEventParkingType2(PublicEventType2Enum value) {
        this.eventParkingType2 = value;
    }

    /**
     * Gets the value of the scenarioAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getScenarioAvailability() {
        return scenarioAvailability;
    }

    /**
     * Sets the value of the scenarioAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setScenarioAvailability(OverallPeriod value) {
        this.scenarioAvailability = value;
    }

    /**
     * Gets the value of the parkingUsageScenarioExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingUsageScenarioExtension() {
        return parkingUsageScenarioExtension;
    }

    /**
     * Sets the value of the parkingUsageScenarioExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingUsageScenarioExtension(_ExtensionType value) {
        this.parkingUsageScenarioExtension = value;
    }

}
