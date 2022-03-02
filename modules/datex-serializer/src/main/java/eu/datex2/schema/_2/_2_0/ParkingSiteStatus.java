
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSiteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSiteStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRecordStatus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSiteStatus" type="{http://datex2.eu/schema/2/2_0}ParkingSiteStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteOpeningStatus" type="{http://datex2.eu/schema/2/2_0}OpeningStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteOvercrowdingStatus" type="{http://datex2.eu/schema/2/2_0}ParkingSiteOvercrowdingStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteFullAtFloor" type="{http://datex2.eu/schema/2/2_0}Integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSiteStatus", propOrder = {
    "parkingSiteStatus",
    "parkingSiteOpeningStatus",
    "parkingSiteOvercrowdingStatus",
    "parkingSiteFullAtFloor",
    "parkingSiteStatusExtension"
})
public class ParkingSiteStatus
    extends ParkingRecordStatus
{

    @XmlSchemaType(name = "string")
    protected ParkingSiteStatusEnum parkingSiteStatus;
    @XmlSchemaType(name = "string")
    protected OpeningStatusEnum parkingSiteOpeningStatus;
    @XmlSchemaType(name = "string")
    protected ParkingSiteOvercrowdingStatusEnum parkingSiteOvercrowdingStatus;
    protected List<BigInteger> parkingSiteFullAtFloor;
    protected ExtensionType parkingSiteStatusExtension;

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
     * Gets the value of the parkingSiteOpeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public OpeningStatusEnum getParkingSiteOpeningStatus() {
        return parkingSiteOpeningStatus;
    }

    /**
     * Sets the value of the parkingSiteOpeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public void setParkingSiteOpeningStatus(OpeningStatusEnum value) {
        this.parkingSiteOpeningStatus = value;
    }

    /**
     * Gets the value of the parkingSiteOvercrowdingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSiteOvercrowdingStatusEnum }
     *     
     */
    public ParkingSiteOvercrowdingStatusEnum getParkingSiteOvercrowdingStatus() {
        return parkingSiteOvercrowdingStatus;
    }

    /**
     * Sets the value of the parkingSiteOvercrowdingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSiteOvercrowdingStatusEnum }
     *     
     */
    public void setParkingSiteOvercrowdingStatus(ParkingSiteOvercrowdingStatusEnum value) {
        this.parkingSiteOvercrowdingStatus = value;
    }

    /**
     * Gets the value of the parkingSiteFullAtFloor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSiteFullAtFloor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSiteFullAtFloor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getParkingSiteFullAtFloor() {
        if (parkingSiteFullAtFloor == null) {
            parkingSiteFullAtFloor = new ArrayList<BigInteger>();
        }
        return this.parkingSiteFullAtFloor;
    }

    /**
     * Gets the value of the parkingSiteStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingSiteStatusExtension() {
        return parkingSiteStatusExtension;
    }

    /**
     * Sets the value of the parkingSiteStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingSiteStatusExtension(ExtensionType value) {
        this.parkingSiteStatusExtension = value;
    }

}
