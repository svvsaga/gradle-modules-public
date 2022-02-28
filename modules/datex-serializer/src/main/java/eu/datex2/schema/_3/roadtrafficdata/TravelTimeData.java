
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.SpeedValue;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._VehicleTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Derived/computed travel time information relating to a linear section of the road network;
 *         forecast = true means a forecast for a vehicle at the start of the specified location, forecast = false
 *         means calculation/measurement at the end.
 *       
 * 
 * <p>Java class for TravelTimeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/3/roadTrafficData}_TravelTimeTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/3/roadTrafficData}_TravelTimeTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/3/common}_VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="travelTimeDelay" type="{http://datex2.eu/schema/3/roadTrafficData}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/3/common}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="_travelTimeDataExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "travelTimeDelay",
    "freeFlowSpeed",
    "_TravelTimeDataExtension"
})
public class TravelTimeData
    extends BasicData
{

    protected _TravelTimeTrendTypeEnum travelTimeTrendType;
    protected _TravelTimeTypeEnum travelTimeType;
    protected List<_VehicleTypeEnum> vehicleType;
    protected DurationValue travelTime;
    protected DurationValue freeFlowTravelTime;
    protected DurationValue normallyExpectedTravelTime;
    protected DurationValue travelTimeDelay;
    protected SpeedValue freeFlowSpeed;
    @XmlElement(name = "_travelTimeDataExtension")
    protected _ExtensionType _TravelTimeDataExtension;

    /**
     * Gets the value of the travelTimeTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link _TravelTimeTrendTypeEnum }
     *     
     */
    public _TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Sets the value of the travelTimeTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendType(_TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    /**
     * Gets the value of the travelTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link _TravelTimeTypeEnum }
     *     
     */
    public _TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Sets the value of the travelTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeType(_TravelTimeTypeEnum value) {
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
     * {@link _VehicleTypeEnum }
     * 
     * 
     */
    public List<_VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<_VehicleTypeEnum>();
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
     * Gets the value of the travelTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getTravelTimeDelay() {
        return travelTimeDelay;
    }

    /**
     * Sets the value of the travelTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setTravelTimeDelay(DurationValue value) {
        this.travelTimeDelay = value;
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
     * Gets the value of the _TravelTimeDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TravelTimeDataExtension() {
        return _TravelTimeDataExtension;
    }

    /**
     * Sets the value of the _TravelTimeDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TravelTimeDataExtension(_ExtensionType value) {
        this._TravelTimeDataExtension = value;
    }

}
