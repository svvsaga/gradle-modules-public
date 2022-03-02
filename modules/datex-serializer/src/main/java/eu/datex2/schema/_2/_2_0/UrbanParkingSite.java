
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanParkingSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanParkingSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingSite"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urbanParkingSiteType" type="{http://datex2.eu/schema/2/2_0}UrbanParkingSiteTypeEnum"/&gt;
 *         &lt;element name="parkingZone" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="urbanParkingSiteExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanParkingSite", propOrder = {
    "urbanParkingSiteType",
    "parkingZone",
    "urbanParkingSiteExtension"
})
public class UrbanParkingSite
    extends ParkingSite
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UrbanParkingSiteTypeEnum urbanParkingSiteType;
    protected MultilingualString parkingZone;
    protected ExtensionType urbanParkingSiteExtension;

    /**
     * Gets the value of the urbanParkingSiteType property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanParkingSiteTypeEnum }
     *     
     */
    public UrbanParkingSiteTypeEnum getUrbanParkingSiteType() {
        return urbanParkingSiteType;
    }

    /**
     * Sets the value of the urbanParkingSiteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanParkingSiteTypeEnum }
     *     
     */
    public void setUrbanParkingSiteType(UrbanParkingSiteTypeEnum value) {
        this.urbanParkingSiteType = value;
    }

    /**
     * Gets the value of the parkingZone property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingZone() {
        return parkingZone;
    }

    /**
     * Sets the value of the parkingZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingZone(MultilingualString value) {
        this.parkingZone = value;
    }

    /**
     * Gets the value of the urbanParkingSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getUrbanParkingSiteExtension() {
        return urbanParkingSiteExtension;
    }

    /**
     * Sets the value of the urbanParkingSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setUrbanParkingSiteExtension(ExtensionType value) {
        this.urbanParkingSiteExtension = value;
    }

}
