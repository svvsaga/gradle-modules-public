
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualVehicleDataValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleDataValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualVehicleSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/&gt;
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/2/2_0}DateTimeValue" minOccurs="0"/&gt;
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/2/2_0}DateTimeValue" minOccurs="0"/&gt;
 *         &lt;element name="passageDurationTime" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="presenceDurationTime" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/2/2_0}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/2/2_0}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="individualVehicleDataValuesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleDataValues", propOrder = {
    "individualVehicleSpeed",
    "arrivalTime",
    "exitTime",
    "passageDurationTime",
    "presenceDurationTime",
    "timeGap",
    "timeHeadway",
    "distanceGap",
    "distanceHeadway",
    "individualVehicleDataValuesExtension"
})
public class IndividualVehicleDataValues
    extends TrafficData
{

    protected SpeedValue individualVehicleSpeed;
    protected DateTimeValue arrivalTime;
    protected DateTimeValue exitTime;
    protected DurationValue passageDurationTime;
    protected DurationValue presenceDurationTime;
    protected DurationValue timeGap;
    protected DurationValue timeHeadway;
    protected FloatingPointMetreDistanceValue distanceGap;
    protected FloatingPointMetreDistanceValue distanceHeadway;
    protected ExtensionType individualVehicleDataValuesExtension;

    /**
     * Gets the value of the individualVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getIndividualVehicleSpeed() {
        return individualVehicleSpeed;
    }

    /**
     * Sets the value of the individualVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setIndividualVehicleSpeed(SpeedValue value) {
        this.individualVehicleSpeed = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeValue }
     *     
     */
    public DateTimeValue getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeValue }
     *     
     */
    public void setArrivalTime(DateTimeValue value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeValue }
     *     
     */
    public DateTimeValue getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeValue }
     *     
     */
    public void setExitTime(DateTimeValue value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the passageDurationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getPassageDurationTime() {
        return passageDurationTime;
    }

    /**
     * Sets the value of the passageDurationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setPassageDurationTime(DurationValue value) {
        this.passageDurationTime = value;
    }

    /**
     * Gets the value of the presenceDurationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getPresenceDurationTime() {
        return presenceDurationTime;
    }

    /**
     * Sets the value of the presenceDurationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setPresenceDurationTime(DurationValue value) {
        this.presenceDurationTime = value;
    }

    /**
     * Gets the value of the timeGap property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getTimeGap() {
        return timeGap;
    }

    /**
     * Sets the value of the timeGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setTimeGap(DurationValue value) {
        this.timeGap = value;
    }

    /**
     * Gets the value of the timeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Sets the value of the timeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setTimeHeadway(DurationValue value) {
        this.timeHeadway = value;
    }

    /**
     * Gets the value of the distanceGap property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getDistanceGap() {
        return distanceGap;
    }

    /**
     * Sets the value of the distanceGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setDistanceGap(FloatingPointMetreDistanceValue value) {
        this.distanceGap = value;
    }

    /**
     * Gets the value of the distanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Sets the value of the distanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setDistanceHeadway(FloatingPointMetreDistanceValue value) {
        this.distanceHeadway = value;
    }

    /**
     * Gets the value of the individualVehicleDataValuesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualVehicleDataValuesExtension() {
        return individualVehicleDataValuesExtension;
    }

    /**
     * Sets the value of the individualVehicleDataValuesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualVehicleDataValuesExtension(ExtensionType value) {
        this.individualVehicleDataValuesExtension = value;
    }

}
