
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingVehiclesPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingVehiclesPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingTableReference" type="{http://datex2.eu/schema/2/2_0}_ParkingTableVersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingVehicle" type="{http://datex2.eu/schema/2/2_0}ParkingVehicle" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingVehiclesPublication", propOrder = {
    "parkingTableReference",
    "parkingVehicle"
})
public class ParkingVehiclesPublication {

    protected List<ParkingTableVersionedReference> parkingTableReference;
    @XmlElement(required = true)
    protected List<ParkingVehicle> parkingVehicle;

    /**
     * Gets the value of the parkingTableReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingTableReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingTableReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingTableVersionedReference }
     * 
     * 
     */
    public List<ParkingTableVersionedReference> getParkingTableReference() {
        if (parkingTableReference == null) {
            parkingTableReference = new ArrayList<ParkingTableVersionedReference>();
        }
        return this.parkingTableReference;
    }

    /**
     * Gets the value of the parkingVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingVehicle }
     * 
     * 
     */
    public List<ParkingVehicle> getParkingVehicle() {
        if (parkingVehicle == null) {
            parkingVehicle = new ArrayList<ParkingVehicle>();
        }
        return this.parkingVehicle;
    }

}
