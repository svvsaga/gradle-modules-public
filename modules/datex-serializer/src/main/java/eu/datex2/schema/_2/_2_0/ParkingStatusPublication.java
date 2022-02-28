
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingStatusPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingStatusPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingTableReference" type="{http://datex2.eu/schema/2/2_0}_ParkingTableVersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation" minOccurs="0"/&gt;
 *         &lt;element name="parkingRecordStatus" type="{http://datex2.eu/schema/2/2_0}ParkingRecordStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingStatusPublication", propOrder = {
    "parkingTableReference",
    "headerInformation",
    "parkingRecordStatus"
})
public class ParkingStatusPublication {

    protected List<_ParkingTableVersionedReference> parkingTableReference;
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<ParkingRecordStatus> parkingRecordStatus;

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
     * {@link _ParkingTableVersionedReference }
     * 
     * 
     */
    public List<_ParkingTableVersionedReference> getParkingTableReference() {
        if (parkingTableReference == null) {
            parkingTableReference = new ArrayList<_ParkingTableVersionedReference>();
        }
        return this.parkingTableReference;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the parkingRecordStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingRecordStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingRecordStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordStatus }
     * 
     * 
     */
    public List<ParkingRecordStatus> getParkingRecordStatus() {
        if (parkingRecordStatus == null) {
            parkingRecordStatus = new ArrayList<ParkingRecordStatus>();
        }
        return this.parkingRecordStatus;
    }

}
