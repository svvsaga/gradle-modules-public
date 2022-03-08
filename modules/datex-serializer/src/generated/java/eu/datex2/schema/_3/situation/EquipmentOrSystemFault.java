
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentOrSystemFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentOrSystemFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentOrSystemFaultType" type="{http://datex2.eu/schema/3/situation}_EquipmentOrSystemFaultTypeEnum"/&gt;
 *         &lt;element name="faultyEquipmentOrSystemType" type="{http://datex2.eu/schema/3/situation}_EquipmentOrSystemTypeEnum"/&gt;
 *         &lt;element name="_equipmentOrSystemFaultExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrSystemFault", propOrder = {
    "equipmentOrSystemFaultType",
    "faultyEquipmentOrSystemType",
    "equipmentOrSystemFaultExtension"
})
public class EquipmentOrSystemFault
    extends TrafficElement
{

    @XmlElement(required = true)
    protected EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    @XmlElement(required = true)
    protected EquipmentOrSystemTypeEnum faultyEquipmentOrSystemType;
    @XmlElement(name = "_equipmentOrSystemFaultExtension")
    protected ExtensionType equipmentOrSystemFaultExtension;

    /**
     * Gets the value of the equipmentOrSystemFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Gets the value of the faultyEquipmentOrSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public EquipmentOrSystemTypeEnum getFaultyEquipmentOrSystemType() {
        return faultyEquipmentOrSystemType;
    }

    /**
     * Sets the value of the faultyEquipmentOrSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public void setFaultyEquipmentOrSystemType(EquipmentOrSystemTypeEnum value) {
        this.faultyEquipmentOrSystemType = value;
    }

    /**
     * Gets the value of the equipmentOrSystemFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEquipmentOrSystemFaultExtension() {
        return equipmentOrSystemFaultExtension;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEquipmentOrSystemFaultExtension(ExtensionType value) {
        this.equipmentOrSystemFaultExtension = value;
    }

}
