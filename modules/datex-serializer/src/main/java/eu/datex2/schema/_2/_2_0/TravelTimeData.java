
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/2/2_0}TravelTimeTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/2/2_0}TravelTimeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeData", propOrder = {
    "travelTimeTrendType",
    "travelTimeType",
    "vehicleType",
    "travelTime",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "freeFlowSpeed",
    "travelTimeDataExtension"
})
public class TravelTimeData
    extends BasicData
{

    @XmlSchemaType(name = "string")
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    @XmlSchemaType(name = "string")
    protected TravelTimeTypeEnum travelTimeType;
    @XmlSchemaType(name = "string")
    protected List<VehicleTypeEnum> vehicleType;
    protected DurationValue travelTime;
    protected DurationValue freeFlowTravelTime;
    protected DurationValue normallyExpectedTravelTime;
    protected SpeedValue freeFlowSpeed;
    protected _ExtensionType travelTimeDataExtension;

    /**
     * Gets the value of the travelTimeTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Sets the value of the travelTimeTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    /**
     * Gets the value of the travelTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Sets the value of the travelTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setTravelTime(DurationValue value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the freeFlowTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Sets the value of the freeFlowTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setFreeFlowTravelTime(DurationValue value) {
        this.freeFlowTravelTime = value;
    }

    /**
     * Gets the value of the normallyExpectedTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Sets the value of the normallyExpectedTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setNormallyExpectedTravelTime(DurationValue value) {
        this.normallyExpectedTravelTime = value;
    }

    /**
     * Gets the value of the freeFlowSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Sets the value of the freeFlowSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setFreeFlowSpeed(SpeedValue value) {
        this.freeFlowSpeed = value;
    }

    /**
     * Gets the value of the travelTimeDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTravelTimeDataExtension() {
        return travelTimeDataExtension;
    }

    /**
     * Sets the value of the travelTimeDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTravelTimeDataExtension(_ExtensionType value) {
        this.travelTimeDataExtension = value;
    }

}
