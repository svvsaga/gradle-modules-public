
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupOfParkingSitesStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfParkingSitesStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRecordStatus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupOfParkingSitesStatus" type="{http://datex2.eu/schema/2/2_0}GroupOfParkingSitesStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSitesStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfParkingSitesStatus", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "groupOfParkingSitesStatus",
    "groupOfParkingSitesStatusExtension"
})
public class GroupOfParkingSitesStatus
    extends ParkingRecordStatus
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected GroupOfParkingSitesStatusEnum groupOfParkingSitesStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType groupOfParkingSitesStatusExtension;

    /**
     * Gets the value of the groupOfParkingSitesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfParkingSitesStatusEnum }
     *     
     */
    public GroupOfParkingSitesStatusEnum getGroupOfParkingSitesStatus() {
        return groupOfParkingSitesStatus;
    }

    /**
     * Sets the value of the groupOfParkingSitesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfParkingSitesStatusEnum }
     *     
     */
    public void setGroupOfParkingSitesStatus(GroupOfParkingSitesStatusEnum value) {
        this.groupOfParkingSitesStatus = value;
    }

    /**
     * Gets the value of the groupOfParkingSitesStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfParkingSitesStatusExtension() {
        return groupOfParkingSitesStatusExtension;
    }

    /**
     * Sets the value of the groupOfParkingSitesStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfParkingSitesStatusExtension(ExtensionType value) {
        this.groupOfParkingSitesStatusExtension = value;
    }

}
