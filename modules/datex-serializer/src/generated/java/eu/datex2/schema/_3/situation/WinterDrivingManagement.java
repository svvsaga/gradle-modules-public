
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.common._WinterEquipmentManagementTypeEnum;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterDrivingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/3/common}_WinterEquipmentManagementTypeEnum"/&gt;
 *         &lt;element name="_winterDrivingManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", propOrder = {
    "winterEquipmentManagementType",
    "_WinterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected _WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    @XmlElement(name = "_winterDrivingManagementExtension")
    protected _ExtensionType _WinterDrivingManagementExtension;

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _WinterEquipmentManagementTypeEnum }
     *     
     */
    public _WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(_WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the _WinterDrivingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WinterDrivingManagementExtension() {
        return _WinterDrivingManagementExtension;
    }

    /**
     * Sets the value of the _WinterDrivingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WinterDrivingManagementExtension(_ExtensionType value) {
        this._WinterDrivingManagementExtension = value;
    }

}
