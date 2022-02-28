
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingAccessStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingAccessStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessReference" type="{http://datex2.eu/schema/2/2_0}_ParkingAccessReference"/&gt;
 *         &lt;element name="accessOpeningStatus" type="{http://datex2.eu/schema/2/2_0}OpeningStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="accessFault" type="{http://datex2.eu/schema/2/2_0}ParkingFaultEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingAccessStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingAccessStatus", propOrder = {
    "accessReference",
    "accessOpeningStatus",
    "accessFault",
    "parkingAccessStatusExtension"
})
public class ParkingAccessStatus {

    @XmlElement(required = true)
    protected _ParkingAccessReference accessReference;
    @XmlSchemaType(name = "string")
    protected OpeningStatusEnum accessOpeningStatus;
    @XmlSchemaType(name = "string")
    protected List<ParkingFaultEnum> accessFault;
    protected _ExtensionType parkingAccessStatusExtension;

    /**
     * Gets the value of the accessReference property.
     * 
     * @return
     *     possible object is
     *     {@link _ParkingAccessReference }
     *     
     */
    public _ParkingAccessReference getAccessReference() {
        return accessReference;
    }

    /**
     * Sets the value of the accessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ParkingAccessReference }
     *     
     */
    public void setAccessReference(_ParkingAccessReference value) {
        this.accessReference = value;
    }

    /**
     * Gets the value of the accessOpeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public OpeningStatusEnum getAccessOpeningStatus() {
        return accessOpeningStatus;
    }

    /**
     * Sets the value of the accessOpeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningStatusEnum }
     *     
     */
    public void setAccessOpeningStatus(OpeningStatusEnum value) {
        this.accessOpeningStatus = value;
    }

    /**
     * Gets the value of the accessFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingFaultEnum }
     * 
     * 
     */
    public List<ParkingFaultEnum> getAccessFault() {
        if (accessFault == null) {
            accessFault = new ArrayList<ParkingFaultEnum>();
        }
        return this.accessFault;
    }

    /**
     * Gets the value of the parkingAccessStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingAccessStatusExtension() {
        return parkingAccessStatusExtension;
    }

    /**
     * Sets the value of the parkingAccessStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingAccessStatusExtension(_ExtensionType value) {
        this.parkingAccessStatusExtension = value;
    }

}
