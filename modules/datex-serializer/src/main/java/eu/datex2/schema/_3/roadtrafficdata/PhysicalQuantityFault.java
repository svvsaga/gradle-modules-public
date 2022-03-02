
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Fault;
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
    "physicalQuantityFaultExtension"
})
public class PhysicalQuantityFault
    extends Fault
{

    @XmlElement(required = true)
    protected PhysicalQuantityFaultEnum physicalQuantityFaultType;
    @XmlElement(name = "_physicalQuantityFaultExtension")
    protected ExtensionType physicalQuantityFaultExtension;

    /**
     * Gets the value of the physicalQuantityFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityFaultEnum }
     *     
     */
    public PhysicalQuantityFaultEnum getPhysicalQuantityFaultType() {
        return physicalQuantityFaultType;
    }

    /**
     * Sets the value of the physicalQuantityFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityFaultEnum }
     *     
     */
    public void setPhysicalQuantityFaultType(PhysicalQuantityFaultEnum value) {
        this.physicalQuantityFaultType = value;
    }

    /**
     * Gets the value of the physicalQuantityFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPhysicalQuantityFaultExtension() {
        return physicalQuantityFaultExtension;
    }

    /**
     * Sets the value of the physicalQuantityFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPhysicalQuantityFaultExtension(ExtensionType value) {
        this.physicalQuantityFaultExtension = value;
    }

}
