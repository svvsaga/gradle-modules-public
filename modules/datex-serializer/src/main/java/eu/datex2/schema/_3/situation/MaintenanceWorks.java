
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Roadworks involving the maintenance or installation of infrastructure.
 * 
 * <p>Java class for MaintenanceWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceWorks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Roadworks"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadMaintenanceType" type="{http://datex2.eu/schema/3/situation}_RoadMaintenanceTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_maintenanceWorksExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceWorks", propOrder = {
    "roadMaintenanceType",
    "_MaintenanceWorksExtension"
})
public class MaintenanceWorks
    extends Roadworks
{

    @XmlElement(required = true)
    protected List<_RoadMaintenanceTypeEnum> roadMaintenanceType;
    @XmlElement(name = "_maintenanceWorksExtension")
    protected _ExtensionType _MaintenanceWorksExtension;

    /**
     * Gets the value of the roadMaintenanceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadMaintenanceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadMaintenanceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _RoadMaintenanceTypeEnum }
     * 
     * 
     */
    public List<_RoadMaintenanceTypeEnum> getRoadMaintenanceType() {
        if (roadMaintenanceType == null) {
            roadMaintenanceType = new ArrayList<_RoadMaintenanceTypeEnum>();
        }
        return this.roadMaintenanceType;
    }

    /**
     * Gets the value of the _MaintenanceWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MaintenanceWorksExtension() {
        return _MaintenanceWorksExtension;
    }

    /**
     * Sets the value of the _MaintenanceWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MaintenanceWorksExtension(_ExtensionType value) {
        this._MaintenanceWorksExtension = value;
    }

}
