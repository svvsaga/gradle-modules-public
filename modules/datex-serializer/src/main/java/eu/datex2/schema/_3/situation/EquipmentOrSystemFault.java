
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Equipment or system which is faulty, malfunctioning or not in a fully operational state
 *         that may be of interest or concern to road operators and road users.
 *       
 * 
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
    "_EquipmentOrSystemFaultExtension"
})
public class EquipmentOrSystemFault
    extends TrafficElement
{

    @XmlElement(required = true)
    protected _EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    @XmlElement(required = true)
    protected _EquipmentOrSystemTypeEnum faultyEquipmentOrSystemType;
    @XmlElement(name = "_equipmentOrSystemFaultExtension")
    protected _ExtensionType _EquipmentOrSystemFaultExtension;

    /**
     * Gets the value of the equipmentOrSystemFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link _EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public _EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(_EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Gets the value of the faultyEquipmentOrSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link _EquipmentOrSystemTypeEnum }
     *     
     */
    public _EquipmentOrSystemTypeEnum getFaultyEquipmentOrSystemType() {
        return faultyEquipmentOrSystemType;
    }

    /**
     * Sets the value of the faultyEquipmentOrSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EquipmentOrSystemTypeEnum }
     *     
     */
    public void setFaultyEquipmentOrSystemType(_EquipmentOrSystemTypeEnum value) {
        this.faultyEquipmentOrSystemType = value;
    }

    /**
     * Gets the value of the _EquipmentOrSystemFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EquipmentOrSystemFaultExtension() {
        return _EquipmentOrSystemFaultExtension;
    }

    /**
     * Sets the value of the _EquipmentOrSystemFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EquipmentOrSystemFaultExtension(_ExtensionType value) {
        this._EquipmentOrSystemFaultExtension = value;
    }

}
