
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingVMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingVMS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsUnitUsedToManageParking" type="{http://datex2.eu/schema/2/2_0}_VmsUnitRecordVersionedReference"/&gt;
 *         &lt;element name="vmsOperator" type="{http://datex2.eu/schema/2/2_0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingVMSExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingVMS", propOrder = {
    "vmsUnitUsedToManageParking",
    "vmsOperator",
    "parkingVMSExtension"
})
public class ParkingVMS {

    @XmlElement(required = true)
    protected _VmsUnitRecordVersionedReference vmsUnitUsedToManageParking;
    protected List<Contact> vmsOperator;
    protected _ExtensionType parkingVMSExtension;

    /**
     * Gets the value of the vmsUnitUsedToManageParking property.
     * 
     * @return
     *     possible object is
     *     {@link _VmsUnitRecordVersionedReference }
     *     
     */
    public _VmsUnitRecordVersionedReference getVmsUnitUsedToManageParking() {
        return vmsUnitUsedToManageParking;
    }

    /**
     * Sets the value of the vmsUnitUsedToManageParking property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VmsUnitRecordVersionedReference }
     *     
     */
    public void setVmsUnitUsedToManageParking(_VmsUnitRecordVersionedReference value) {
        this.vmsUnitUsedToManageParking = value;
    }

    /**
     * Gets the value of the vmsOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getVmsOperator() {
        if (vmsOperator == null) {
            vmsOperator = new ArrayList<Contact>();
        }
        return this.vmsOperator;
    }

    /**
     * Gets the value of the parkingVMSExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getParkingVMSExtension() {
        return parkingVMSExtension;
    }

    /**
     * Sets the value of the parkingVMSExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setParkingVMSExtension(_ExtensionType value) {
        this.parkingVMSExtension = value;
    }

}
