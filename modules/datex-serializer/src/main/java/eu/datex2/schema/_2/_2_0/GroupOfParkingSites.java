
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfParkingSites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupOfParkingSitesType" type="{http://datex2.eu/schema/2/2_0}GroupOfParkingSitesTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="parkingSiteByReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRecordVersionedReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parkingSite" type="{http://datex2.eu/schema/2/2_0}ParkingSite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSitesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfParkingSites", propOrder = {
    "groupOfParkingSitesType",
    "parkingSiteByReference",
    "parkingSite",
    "groupOfParkingSitesExtension"
})
public class GroupOfParkingSites
    extends ParkingRecord
{

    @XmlSchemaType(name = "string")
    protected GroupOfParkingSitesTypeEnum groupOfParkingSitesType;
    protected List<ParkingRecordVersionedReference> parkingSiteByReference;
    protected List<ParkingSite> parkingSite;
    protected ExtensionType groupOfParkingSitesExtension;

    /**
     * Gets the value of the groupOfParkingSitesType property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfParkingSitesTypeEnum }
     *     
     */
    public GroupOfParkingSitesTypeEnum getGroupOfParkingSitesType() {
        return groupOfParkingSitesType;
    }

    /**
     * Sets the value of the groupOfParkingSitesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfParkingSitesTypeEnum }
     *     
     */
    public void setGroupOfParkingSitesType(GroupOfParkingSitesTypeEnum value) {
        this.groupOfParkingSitesType = value;
    }

    /**
     * Gets the value of the parkingSiteByReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSiteByReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSiteByReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingRecordVersionedReference }
     * 
     * 
     */
    public List<ParkingRecordVersionedReference> getParkingSiteByReference() {
        if (parkingSiteByReference == null) {
            parkingSiteByReference = new ArrayList<ParkingRecordVersionedReference>();
        }
        return this.parkingSiteByReference;
    }

    /**
     * Gets the value of the parkingSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parkingSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingSite }
     * 
     * 
     */
    public List<ParkingSite> getParkingSite() {
        if (parkingSite == null) {
            parkingSite = new ArrayList<ParkingSite>();
        }
        return this.parkingSite;
    }

    /**
     * Gets the value of the groupOfParkingSitesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfParkingSitesExtension() {
        return groupOfParkingSitesExtension;
    }

    /**
     * Sets the value of the groupOfParkingSitesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfParkingSitesExtension(ExtensionType value) {
        this.groupOfParkingSitesExtension = value;
    }

}
