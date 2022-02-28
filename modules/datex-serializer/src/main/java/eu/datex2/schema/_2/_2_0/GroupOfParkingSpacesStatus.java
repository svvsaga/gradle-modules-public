
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSpacesStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfParkingSpacesStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingOccupancy"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupDeclarationValidNow" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSpacesClosed" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSpacesStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfParkingSpacesStatus", propOrder = {
    "groupDeclarationValidNow",
    "groupOfParkingSpacesClosed",
    "groupOfParkingSpacesStatusExtension"
})
public class GroupOfParkingSpacesStatus
    extends ParkingOccupancy
{

    protected Boolean groupDeclarationValidNow;
    protected Boolean groupOfParkingSpacesClosed;
    protected _ExtensionType groupOfParkingSpacesStatusExtension;

    /**
     * Gets the value of the groupDeclarationValidNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupDeclarationValidNow() {
        return groupDeclarationValidNow;
    }

    /**
     * Sets the value of the groupDeclarationValidNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupDeclarationValidNow(Boolean value) {
        this.groupDeclarationValidNow = value;
    }

    /**
     * Gets the value of the groupOfParkingSpacesClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupOfParkingSpacesClosed() {
        return groupOfParkingSpacesClosed;
    }

    /**
     * Sets the value of the groupOfParkingSpacesClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupOfParkingSpacesClosed(Boolean value) {
        this.groupOfParkingSpacesClosed = value;
    }

    /**
     * Gets the value of the groupOfParkingSpacesStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getGroupOfParkingSpacesStatusExtension() {
        return groupOfParkingSpacesStatusExtension;
    }

    /**
     * Sets the value of the groupOfParkingSpacesStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setGroupOfParkingSpacesStatusExtension(_ExtensionType value) {
        this.groupOfParkingSpacesStatusExtension = value;
    }

}
