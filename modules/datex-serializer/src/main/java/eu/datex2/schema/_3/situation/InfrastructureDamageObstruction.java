
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road resulting from the failure or damage of infrastructure on,
 *         under, above or close to the road.
 *       
 * 
 * <p>Java class for InfrastructureDamageObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/3/situation}_InfrastructureDamageTypeEnum"/&gt;
 *         &lt;element name="_infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureDamageObstruction", propOrder = {
    "infrastructureDamageType",
    "_InfrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    protected _InfrastructureDamageTypeEnum infrastructureDamageType;
    @XmlElement(name = "_infrastructureDamageObstructionExtension")
    protected _ExtensionType _InfrastructureDamageObstructionExtension;

    /**
     * Gets the value of the infrastructureDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link _InfrastructureDamageTypeEnum }
     *     
     */
    public _InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Sets the value of the infrastructureDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(_InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Gets the value of the _InfrastructureDamageObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InfrastructureDamageObstructionExtension() {
        return _InfrastructureDamageObstructionExtension;
    }

    /**
     * Sets the value of the _InfrastructureDamageObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InfrastructureDamageObstructionExtension(_ExtensionType value) {
        this._InfrastructureDamageObstructionExtension = value;
    }

}
