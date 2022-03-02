
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingStatusColourMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingStatusColourMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSiteStatus" type="{http://datex2.eu/schema/2/2_0}ParkingSiteStatusEnum"/&gt;
 *         &lt;element name="rgbColour" type="{http://datex2.eu/schema/2/2_0}RGBColour"/&gt;
 *         &lt;element name="parkingStatusColourMappingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingStatusColourMapping", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "parkingSiteStatus",
    "rgbColour",
    "parkingStatusColourMappingExtension"
})
public class ParkingStatusColourMapping {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected ParkingSiteStatusEnum parkingSiteStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected RGBColour rgbColour;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingStatusColourMappingExtension;

    /**
     * Gets the value of the parkingSiteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSiteStatusEnum }
     *     
     */
    public ParkingSiteStatusEnum getParkingSiteStatus() {
        return parkingSiteStatus;
    }

    /**
     * Sets the value of the parkingSiteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSiteStatusEnum }
     *     
     */
    public void setParkingSiteStatus(ParkingSiteStatusEnum value) {
        this.parkingSiteStatus = value;
    }

    /**
     * Gets the value of the rgbColour property.
     * 
     * @return
     *     possible object is
     *     {@link RGBColour }
     *     
     */
    public RGBColour getRgbColour() {
        return rgbColour;
    }

    /**
     * Sets the value of the rgbColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGBColour }
     *     
     */
    public void setRgbColour(RGBColour value) {
        this.rgbColour = value;
    }

    /**
     * Gets the value of the parkingStatusColourMappingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingStatusColourMappingExtension() {
        return parkingStatusColourMappingExtension;
    }

    /**
     * Sets the value of the parkingStatusColourMappingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingStatusColourMappingExtension(ExtensionType value) {
        this.parkingStatusColourMappingExtension = value;
    }

}
