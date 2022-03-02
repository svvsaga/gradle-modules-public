
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRouteDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRoute"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRouteName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteType" type="{http://datex2.eu/schema/2/2_0}ParkingRouteTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="dynamicRouteManagement" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteIconIndex" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteDirection" type="{http://datex2.eu/schema/2/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteDirection2" type="{http://datex2.eu/schema/2/2_0}ParkingRouteDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfLocations" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="parkingRouteDetailsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRouteDetails", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "parkingRouteName",
    "parkingRouteType",
    "dynamicRouteManagement",
    "parkingRouteIconIndex",
    "parkingRouteDirection",
    "parkingRouteDirection2",
    "groupOfLocations",
    "parkingRouteDetailsExtension"
})
public class ParkingRouteDetails
    extends ParkingRoute
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString parkingRouteName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected ParkingRouteTypeEnum parkingRouteType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean dynamicRouteManagement;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String parkingRouteIconIndex;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected DirectionEnum parkingRouteDirection;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected ParkingRouteDirectionEnum parkingRouteDirection2;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected GroupOfLocations groupOfLocations;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingRouteDetailsExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the parkingRouteName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getParkingRouteName() {
        return parkingRouteName;
    }

    /**
     * Sets the value of the parkingRouteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setParkingRouteName(MultilingualString value) {
        this.parkingRouteName = value;
    }

    /**
     * Gets the value of the parkingRouteType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRouteTypeEnum }
     *     
     */
    public ParkingRouteTypeEnum getParkingRouteType() {
        return parkingRouteType;
    }

    /**
     * Sets the value of the parkingRouteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRouteTypeEnum }
     *     
     */
    public void setParkingRouteType(ParkingRouteTypeEnum value) {
        this.parkingRouteType = value;
    }

    /**
     * Gets the value of the dynamicRouteManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicRouteManagement() {
        return dynamicRouteManagement;
    }

    /**
     * Sets the value of the dynamicRouteManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicRouteManagement(Boolean value) {
        this.dynamicRouteManagement = value;
    }

    /**
     * Gets the value of the parkingRouteIconIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingRouteIconIndex() {
        return parkingRouteIconIndex;
    }

    /**
     * Sets the value of the parkingRouteIconIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingRouteIconIndex(String value) {
        this.parkingRouteIconIndex = value;
    }

    /**
     * Gets the value of the parkingRouteDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getParkingRouteDirection() {
        return parkingRouteDirection;
    }

    /**
     * Sets the value of the parkingRouteDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setParkingRouteDirection(DirectionEnum value) {
        this.parkingRouteDirection = value;
    }

    /**
     * Gets the value of the parkingRouteDirection2 property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRouteDirectionEnum }
     *     
     */
    public ParkingRouteDirectionEnum getParkingRouteDirection2() {
        return parkingRouteDirection2;
    }

    /**
     * Sets the value of the parkingRouteDirection2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRouteDirectionEnum }
     *     
     */
    public void setParkingRouteDirection2(ParkingRouteDirectionEnum value) {
        this.parkingRouteDirection2 = value;
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
     * Gets the value of the parkingRouteDetailsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRouteDetailsExtension() {
        return parkingRouteDetailsExtension;
    }

    /**
     * Sets the value of the parkingRouteDetailsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRouteDetailsExtension(ExtensionType value) {
        this.parkingRouteDetailsExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
