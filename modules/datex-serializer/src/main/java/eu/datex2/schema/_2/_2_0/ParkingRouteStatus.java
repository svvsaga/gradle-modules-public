
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRouteStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRouteReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRouteDetailsVersionedReference"/&gt;
 *         &lt;element name="parkingRouteActive" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="parkingRouteStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRouteStatus", propOrder = {
    "parkingRouteReference",
    "parkingRouteActive",
    "parkingRouteStatusExtension"
})
public class ParkingRouteStatus {

    @XmlElement(required = true)
    protected _ParkingRouteDetailsVersionedReference parkingRouteReference;
    protected boolean parkingRouteActive;
    protected _ExtensionType parkingRouteStatusExtension;

    /**
     * Gets the value of the parkingRouteReference property.
     * 
     * @return
     *     possible object is
     *     {@link _ParkingRouteDetailsVersionedReference }
     *     
     */
    public _ParkingRouteDetailsVersionedReference getParkingRouteReference() {
        return parkingRouteReference;
    }

    /**
     * Sets the value of the parkingRouteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ParkingRouteDetailsVersionedReference }
     *     
     */
    public void setParkingRouteReference(_ParkingRouteDetailsVersionedReference value) {
        this.parkingRouteReference = value;
    }

    /**
     * Gets the value of the parkingRouteActive property.
     * 
     */
    public boolean isParkingRouteActive() {
        return parkingRouteActive;
    }

    /**
     * Sets the value of the parkingRouteActive property.
     * 
     */
    public void setParkingRouteActive(boolean value) {
        this.parkingRouteActive = value;
    }

    /**
     * Gets the value of the parkingRouteStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingRouteStatusExtension() {
        return parkingRouteStatusExtension;
    }

    /**
     * Sets the value of the parkingRouteStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingRouteStatusExtension(_ExtensionType value) {
        this.parkingRouteStatusExtension = value;
    }

}
