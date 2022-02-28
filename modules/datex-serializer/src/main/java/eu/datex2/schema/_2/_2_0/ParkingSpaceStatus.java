
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpaceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSpaceOccupied" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="parkingSpaceClosed" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceDeclarationValidNow" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="measurementOrCalculationTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastCalibration" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpaceStatus", propOrder = {
    "parkingSpaceOccupied",
    "parkingSpaceClosed",
    "parkingSpaceDeclarationValidNow",
    "measurementOrCalculationTime",
    "lastCalibration",
    "parkingSpaceStatusExtension"
})
public class ParkingSpaceStatus {

    protected boolean parkingSpaceOccupied;
    protected Boolean parkingSpaceClosed;
    protected Boolean parkingSpaceDeclarationValidNow;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementOrCalculationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCalibration;
    protected _ExtensionType parkingSpaceStatusExtension;

    /**
     * Gets the value of the parkingSpaceOccupied property.
     * 
     */
    public boolean isParkingSpaceOccupied() {
        return parkingSpaceOccupied;
    }

    /**
     * Sets the value of the parkingSpaceOccupied property.
     * 
     */
    public void setParkingSpaceOccupied(boolean value) {
        this.parkingSpaceOccupied = value;
    }

    /**
     * Gets the value of the parkingSpaceClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkingSpaceClosed() {
        return parkingSpaceClosed;
    }

    /**
     * Sets the value of the parkingSpaceClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkingSpaceClosed(Boolean value) {
        this.parkingSpaceClosed = value;
    }

    /**
     * Gets the value of the parkingSpaceDeclarationValidNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParkingSpaceDeclarationValidNow() {
        return parkingSpaceDeclarationValidNow;
    }

    /**
     * Sets the value of the parkingSpaceDeclarationValidNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParkingSpaceDeclarationValidNow(Boolean value) {
        this.parkingSpaceDeclarationValidNow = value;
    }

    /**
     * Gets the value of the measurementOrCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementOrCalculationTime() {
        return measurementOrCalculationTime;
    }

    /**
     * Sets the value of the measurementOrCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementOrCalculationTime(XMLGregorianCalendar value) {
        this.measurementOrCalculationTime = value;
    }

    /**
     * Gets the value of the lastCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCalibration() {
        return lastCalibration;
    }

    /**
     * Sets the value of the lastCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCalibration(XMLGregorianCalendar value) {
        this.lastCalibration = value;
    }

    /**
     * Gets the value of the parkingSpaceStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingSpaceStatusExtension() {
        return parkingSpaceStatusExtension;
    }

    /**
     * Sets the value of the parkingSpaceStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingSpaceStatusExtension(_ExtensionType value) {
        this.parkingSpaceStatusExtension = value;
    }

}
