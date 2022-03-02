
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingSpace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingSpace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingSpaceBasics"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identicalToParkingSpace" type="{http://datex2.eu/schema/2/2_0}IndexReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://datex2.eu/schema/2/2_0}Location" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceDimension" type="{http://datex2.eu/schema/2/2_0}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpaceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingSpace", propOrder = {
    "identicalToParkingSpace",
    "location",
    "parkingSpaceDimension",
    "parkingSpaceExtension"
})
public class ParkingSpace2
    extends ParkingSpaceBasics
{

    protected List<String> identicalToParkingSpace;
    protected Location location;
    protected Dimension parkingSpaceDimension;
    protected ExtensionType parkingSpaceExtension;

    /**
     * Gets the value of the identicalToParkingSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identicalToParkingSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdenticalToParkingSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdenticalToParkingSpace() {
        if (identicalToParkingSpace == null) {
            identicalToParkingSpace = new ArrayList<String>();
        }
        return this.identicalToParkingSpace;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the parkingSpaceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getParkingSpaceDimension() {
        return parkingSpaceDimension;
    }

    /**
     * Sets the value of the parkingSpaceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setParkingSpaceDimension(Dimension value) {
        this.parkingSpaceDimension = value;
    }

    /**
     * Gets the value of the parkingSpaceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingSpaceExtension() {
        return parkingSpaceExtension;
    }

    /**
     * Sets the value of the parkingSpaceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingSpaceExtension(ExtensionType value) {
        this.parkingSpaceExtension = value;
    }

}
