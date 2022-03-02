
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacility" type="{http://datex2.eu/schema/2/2_0}ParkingEquipmentOrServiceFacility"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="equipmentOrServiceFacilityIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility", propOrder = {
    "parkingEquipmentOrServiceFacility"
})
public class ParkingRecordEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacility {

    @XmlElement(required = true)
    protected ParkingEquipmentOrServiceFacility parkingEquipmentOrServiceFacility;
    @XmlAttribute(name = "equipmentOrServiceFacilityIndex", required = true)
    protected int equipmentOrServiceFacilityIndex;

    /**
     * Gets the value of the parkingEquipmentOrServiceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingEquipmentOrServiceFacility }
     *     
     */
    public ParkingEquipmentOrServiceFacility getParkingEquipmentOrServiceFacility() {
        return parkingEquipmentOrServiceFacility;
    }

    /**
     * Sets the value of the parkingEquipmentOrServiceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingEquipmentOrServiceFacility }
     *     
     */
    public void setParkingEquipmentOrServiceFacility(ParkingEquipmentOrServiceFacility value) {
        this.parkingEquipmentOrServiceFacility = value;
    }

    /**
     * Gets the value of the equipmentOrServiceFacilityIndex property.
     * 
     */
    public int getEquipmentOrServiceFacilityIndex() {
        return equipmentOrServiceFacilityIndex;
    }

    /**
     * Sets the value of the equipmentOrServiceFacilityIndex property.
     * 
     */
    public void setEquipmentOrServiceFacilityIndex(int value) {
        this.equipmentOrServiceFacilityIndex = value;
    }

}
