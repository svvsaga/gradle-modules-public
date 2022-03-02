
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterDrivingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2/2_0}WinterEquipmentManagementTypeEnum"/&gt;
 *         &lt;element name="winterDrivingManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "winterEquipmentManagementType",
    "winterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType winterDrivingManagementExtension;

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the winterDrivingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingManagementExtension() {
        return winterDrivingManagementExtension;
    }

    /**
     * Sets the value of the winterDrivingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingManagementExtension(ExtensionType value) {
        this.winterDrivingManagementExtension = value;
    }

}
