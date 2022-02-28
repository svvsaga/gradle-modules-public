
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.Fault;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of a fault related to the derivation of a quantity
 * 
 * <p>Java class for PhysicalQuantityFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalQuantityFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalQuantityFaultType" type="{http://datex2.eu/schema/3/roadTrafficData}_PhysicalQuantityFaultEnum"/&gt;
 *         &lt;element name="_physicalQuantityFaultExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalQuantityFault", propOrder = {
    "physicalQuantityFaultType",
    "_PhysicalQuantityFaultExtension"
})
public class PhysicalQuantityFault
    extends Fault
{

    @XmlElement(required = true)
    protected _PhysicalQuantityFaultEnum physicalQuantityFaultType;
    @XmlElement(name = "_physicalQuantityFaultExtension")
    protected _ExtensionType _PhysicalQuantityFaultExtension;

    /**
     * Gets the value of the physicalQuantityFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link _PhysicalQuantityFaultEnum }
     *     
     */
    public _PhysicalQuantityFaultEnum getPhysicalQuantityFaultType() {
        return physicalQuantityFaultType;
    }

    /**
     * Sets the value of the physicalQuantityFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PhysicalQuantityFaultEnum }
     *     
     */
    public void setPhysicalQuantityFaultType(_PhysicalQuantityFaultEnum value) {
        this.physicalQuantityFaultType = value;
    }

    /**
     * Gets the value of the _PhysicalQuantityFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PhysicalQuantityFaultExtension() {
        return _PhysicalQuantityFaultExtension;
    }

    /**
     * Sets the value of the _PhysicalQuantityFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PhysicalQuantityFaultExtension(_ExtensionType value) {
        this._PhysicalQuantityFaultExtension = value;
    }

}
