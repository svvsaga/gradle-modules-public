
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupOfParkingSpacesStatus" type="{http://datex2.eu/schema/2/2_0}GroupOfParkingSpacesStatus"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="groupIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus", propOrder = {
    "groupOfParkingSpacesStatus"
})
public class ParkingRecordStatusGroupIndexGroupOfParkingSpacesStatus {

    @XmlElement(required = true)
    protected GroupOfParkingSpacesStatus groupOfParkingSpacesStatus;
    @XmlAttribute(name = "groupIndex", required = true)
    protected int groupIndex;

    /**
     * Gets the value of the groupOfParkingSpacesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfParkingSpacesStatus }
     *     
     */
    public GroupOfParkingSpacesStatus getGroupOfParkingSpacesStatus() {
        return groupOfParkingSpacesStatus;
    }

    /**
     * Sets the value of the groupOfParkingSpacesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfParkingSpacesStatus }
     *     
     */
    public void setGroupOfParkingSpacesStatus(GroupOfParkingSpacesStatus value) {
        this.groupOfParkingSpacesStatus = value;
    }

    /**
     * Gets the value of the groupIndex property.
     * 
     */
    public int getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     */
    public void setGroupIndex(int value) {
        this.groupIndex = value;
    }

}
