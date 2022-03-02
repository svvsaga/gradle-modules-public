
package eu.datex2.schema._3.roadtrafficdata;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Vehicle;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measured or calculated data values relating to individual vehicles derived from detectors
 *         at the specified measurement site.
 *       
 * 
 * <p>Java class for IndividualVehicleDataValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleDataValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="exitTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="passageDuration" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="presenceDuration" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="speed" type="{http://datex2.eu/schema/3/common}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="timeGap" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="timeHeadway" type="{http://datex2.eu/schema/3/common}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="individualVehicle" type="{http://datex2.eu/schema/3/common}Vehicle" minOccurs="0"/&gt;
 *         &lt;element name="_individualVehicleDataValuesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleDataValues", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "arrivalTime",
    "distanceGap",
    "distanceHeadway",
    "exitTime",
    "passageDuration",
    "presenceDuration",
    "speed",
    "timeGap",
    "timeHeadway",
    "individualVehicle",
    "individualVehicleDataValuesExtension"
})
public class IndividualVehicleDataValues
    extends TrafficData
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float distanceGap;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float distanceHeadway;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exitTime;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float passageDuration;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float presenceDuration;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float speed;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float timeGap;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float timeHeadway;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Vehicle individualVehicle;
    @XmlElement(name = "_individualVehicleDataValuesExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType individualVehicleDataValuesExtension;

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the distanceGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceGap() {
        return distanceGap;
    }

    /**
     * Sets the value of the distanceGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceGap(Float value) {
        this.distanceGap = value;
    }

    /**
     * Gets the value of the distanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Sets the value of the distanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceHeadway(Float value) {
        this.distanceHeadway = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitTime(XMLGregorianCalendar value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the passageDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPassageDuration() {
        return passageDuration;
    }

    /**
     * Sets the value of the passageDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPassageDuration(Float value) {
        this.passageDuration = value;
    }

    /**
     * Gets the value of the presenceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPresenceDuration() {
        return presenceDuration;
    }

    /**
     * Sets the value of the presenceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPresenceDuration(Float value) {
        this.presenceDuration = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the timeGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeGap() {
        return timeGap;
    }

    /**
     * Sets the value of the timeGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeGap(Float value) {
        this.timeGap = value;
    }

    /**
     * Gets the value of the timeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeHeadway() {
        return timeHeadway;
    }

    /**
     * Sets the value of the timeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeHeadway(Float value) {
        this.timeHeadway = value;
    }

    /**
     * Gets the value of the individualVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getIndividualVehicle() {
        return individualVehicle;
    }

    /**
     * Sets the value of the individualVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setIndividualVehicle(Vehicle value) {
        this.individualVehicle = value;
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
