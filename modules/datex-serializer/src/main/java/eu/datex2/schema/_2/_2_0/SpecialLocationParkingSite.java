
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialLocationParkingSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialLocationParkingSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingSite"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSpecialLocation" type="{http://datex2.eu/schema/2/2_0}ParkingSpecialLocationEnum"/&gt;
 *         &lt;element name="parkingOtherSpecialLocation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="specialLocationParkingSiteExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialLocationParkingSite", propOrder = {
    "parkingSpecialLocation",
    "parkingOtherSpecialLocation",
    "specialLocationParkingSiteExtension"
})
public class SpecialLocationParkingSite
    extends ParkingSite
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParkingSpecialLocationEnum parkingSpecialLocation;
    protected MultilingualString parkingOtherSpecialLocation;
    protected ExtensionType specialLocationParkingSiteExtension;

    /**
     * Gets the value of the parkingSpecialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSpecialLocationEnum }
     *     
     */
    public ParkingSpecialLocationEnum getParkingSpecialLocation() {
        return parkingSpecialLocation;
    }

    /**
     * Sets the value of the parkingSpecialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpecialLocationEnum }
     *     
     */
    public void setParkingSpecialLocation(ParkingSpecialLocationEnum value) {
        this.parkingSpecialLocation = value;
    }

    /**
     * Gets the value of the parkingOtherSpecialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingOtherSpecialLocation() {
        return parkingOtherSpecialLocation;
    }

    /**
     * Sets the value of the parkingOtherSpecialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingOtherSpecialLocation(MultilingualString value) {
        this.parkingOtherSpecialLocation = value;
    }

    /**
     * Gets the value of the specialLocationParkingSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpecialLocationParkingSiteExtension() {
        return specialLocationParkingSiteExtension;
    }

    /**
     * Sets the value of the specialLocationParkingSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpecialLocationParkingSiteExtension(ExtensionType value) {
        this.specialLocationParkingSiteExtension = value;
    }

}
