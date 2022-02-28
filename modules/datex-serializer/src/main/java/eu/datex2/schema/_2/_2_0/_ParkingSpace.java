
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingSpace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingSpace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingSpaceBasics" type="{http://datex2.eu/schema/2/2_0}ParkingSpaceBasics"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="parkingSpaceIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingSpace", propOrder = {
    "parkingSpaceBasics"
})
public class _ParkingSpace {

    @XmlElement(required = true)
    protected ParkingSpaceBasics parkingSpaceBasics;
    @XmlAttribute(name = "parkingSpaceIndex", required = true)
    protected int parkingSpaceIndex;

    /**
     * Gets the value of the parkingSpaceBasics property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingSpaceBasics }
     *     
     */
    public ParkingSpaceBasics getParkingSpaceBasics() {
        return parkingSpaceBasics;
    }

    /**
     * Sets the value of the parkingSpaceBasics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpaceBasics }
     *     
     */
    public void setParkingSpaceBasics(ParkingSpaceBasics value) {
        this.parkingSpaceBasics = value;
    }

    /**
     * Gets the value of the parkingSpaceIndex property.
     * 
     */
    public int getParkingSpaceIndex() {
        return parkingSpaceIndex;
    }

    /**
     * Sets the value of the parkingSpaceIndex property.
     * 
     */
    public void setParkingSpaceIndex(int value) {
        this.parkingSpaceIndex = value;
    }

}
