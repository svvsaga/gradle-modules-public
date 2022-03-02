
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSpaces complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfParkingSpaces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingSpaceBasics"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingNumberOfSpaces" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="parkingTypeOfGroup" type="{http://datex2.eu/schema/2/2_0}ParkingTypeOfGroup"/&gt;
 *         &lt;element name="identicalToGroup" type="{http://datex2.eu/schema/2/2_0}IndexReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="realSubsetOfGroup" type="{http://datex2.eu/schema/2/2_0}IndexReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="minimumParkingSpaceDimension" type="{http://datex2.eu/schema/2/2_0}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="dimensionOfGroup" type="{http://datex2.eu/schema/2/2_0}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="maximumParkingSpaceDimension" type="{http://datex2.eu/schema/2/2_0}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="parkingSpace" type="{http://datex2.eu/schema/2/2_0}_GroupOfParkingSpacesParkingSpaceIndexParkingSpace" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSpacesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfParkingSpaces", propOrder = {
    "parkingNumberOfSpaces",
    "parkingTypeOfGroup",
    "identicalToGroup",
    "realSubsetOfGroup",
    "minimumParkingSpaceDimension",
    "dimensionOfGroup",
    "maximumParkingSpaceDimension",
    "parkingSpace",
    "groupOfLocations",
    "groupOfParkingSpacesExtension"
})
public class GroupOfParkingSpaces2
    extends ParkingSpaceBasics
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumberOfSpaces;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ParkingTypeOfGroup parkingTypeOfGroup;
    protected List<String> identicalToGroup;
    protected List<String> realSubsetOfGroup;
    protected Dimension minimumParkingSpaceDimension;
    protected Dimension dimensionOfGroup;
    protected Dimension maximumParkingSpaceDimension;
    protected List<GroupOfParkingSpacesParkingSpaceIndexParkingSpace> parkingSpace;
    protected GroupOfLocations groupOfLocations;
    protected ExtensionType groupOfParkingSpacesExtension;

    /**
     * Gets the value of the parkingNumberOfSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumberOfSpaces() {
        return parkingNumberOfSpaces;
    }

    /**
     * Sets the value of the parkingNumberOfSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumberOfSpaces(BigInteger value) {
        this.parkingNumberOfSpaces = value;
    }

    /**
     * Gets the value of the parkingTypeOfGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingTypeOfGroup }
     *     
     */
    public ParkingTypeOfGroup getParkingTypeOfGroup() {
        return parkingTypeOfGroup;
    }

    /**
     * Sets the value of the parkingTypeOfGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingTypeOfGroup }
     *     
     */
    public void setParkingTypeOfGroup(ParkingTypeOfGroup value) {
        this.parkingTypeOfGroup = value;
    }

    /**
     * Gets the value of the identicalToGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identicalToGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdenticalToGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdenticalToGroup() {
        if (identicalToGroup == null) {
            identicalToGroup = new ArrayList<String>();
        }
        return this.identicalToGroup;
    }

    /**
     * Gets the value of the realSubsetOfGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the realSubsetOfGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealSubsetOfGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRealSubsetOfGroup() {
        if (realSubsetOfGroup == null) {
            realSubsetOfGroup = new ArrayList<String>();
        }
        return this.realSubsetOfGroup;
    }

    /**
     * Gets the value of the minimumParkingSpaceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getMinimumParkingSpaceDimension() {
        return minimumParkingSpaceDimension;
    }

    /**
     * Sets the value of the minimumParkingSpaceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setMinimumParkingSpaceDimension(Dimension value) {
        this.minimumParkingSpaceDimension = value;
    }

    /**
     * Gets the value of the dimensionOfGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getDimensionOfGroup() {
        return dimensionOfGroup;
    }

    /**
     * Sets the value of the dimensionOfGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setDimensionOfGroup(Dimension value) {
        this.dimensionOfGroup = value;
    }

    /**
     * Gets the value of the maximumParkingSpaceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getMaximumParkingSpaceDimension() {
        return maximumParkingSpaceDimension;
    }

    /**
     * Sets the value of the maximumParkingSpaceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setMaximumParkingSpaceDimension(Dimension value) {
        this.maximumParkingSpaceDimension = value;
    }

    /**
     * Gets the value of the parkingSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfParkingSpacesParkingSpaceIndexParkingSpace }
     * 
     * 
     */
    public List<GroupOfParkingSpacesParkingSpaceIndexParkingSpace> getParkingSpace() {
        if (parkingSpace == null) {
            parkingSpace = new ArrayList<GroupOfParkingSpacesParkingSpaceIndexParkingSpace>();
        }
        return this.parkingSpace;
    }

    /**
     * Gets the value of the groupOfLocations property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Sets the value of the groupOfLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Gets the value of the groupOfParkingSpacesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfParkingSpacesExtension() {
        return groupOfParkingSpacesExtension;
    }

    /**
     * Sets the value of the groupOfParkingSpacesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfParkingSpacesExtension(ExtensionType value) {
        this.groupOfParkingSpacesExtension = value;
    }

}
