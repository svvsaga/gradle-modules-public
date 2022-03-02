
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRoute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRouteColour" type="{http://datex2.eu/schema/2/2_0}RGBColour" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRoute", propOrder = {
    "parkingRouteColour",
    "parkingRouteExtension"
})
@XmlSeeAlso({
    ParkingRouteByReference.class,
    ParkingRouteDetails.class
})
public abstract class ParkingRoute {

    protected RGBColour parkingRouteColour;
    protected ExtensionType parkingRouteExtension;

    /**
     * Gets the value of the parkingRouteColour property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColour }
     *     
     */
    public RGBColour getParkingRouteColour() {
        return parkingRouteColour;
    }

    /**
     * Sets the value of the parkingRouteColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColour }
     *     
     */
    public void setParkingRouteColour(RGBColour value) {
        this.parkingRouteColour = value;
    }

    /**
     * Gets the value of the parkingRouteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRouteExtension() {
        return parkingRouteExtension;
    }

    /**
     * Sets the value of the parkingRouteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRouteExtension(ExtensionType value) {
        this.parkingRouteExtension = value;
    }

}
