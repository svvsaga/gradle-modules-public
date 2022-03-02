
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingEquipmentOrServiceFacilityStatus" type="{http://datex2.eu/schema/2/2_0}ParkingEquipmentOrServiceFacilityStatus"/&gt;
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
@XmlType(name = "_ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus", propOrder = {
    "parkingEquipmentOrServiceFacilityStatus"
})
public class ParkingRecordStatusEquipmentOrServiceFacilityIndexParkingEquipmentOrServiceFacilityStatus {

    @XmlElement(required = true)
    protected ParkingEquipmentOrServiceFacilityStatus parkingEquipmentOrServiceFacilityStatus;
    @XmlAttribute(name = "equipmentOrServiceFacilityIndex", required = true)
    protected int equipmentOrServiceFacilityIndex;

    /**
     * Gets the value of the parkingEquipmentOrServiceFacilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingEquipmentOrServiceFacilityStatus }
     *     
     */
    public ParkingEquipmentOrServiceFacilityStatus getParkingEquipmentOrServiceFacilityStatus() {
        return parkingEquipmentOrServiceFacilityStatus;
    }

    /**
     * Sets the value of the parkingEquipmentOrServiceFacilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingEquipmentOrServiceFacilityStatus }
     *     
     */
    public void setParkingEquipmentOrServiceFacilityStatus(ParkingEquipmentOrServiceFacilityStatus value) {
        this.parkingEquipmentOrServiceFacilityStatus = value;
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
