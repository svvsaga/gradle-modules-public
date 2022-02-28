
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfrastructureDamageObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/2/2_0}InfrastructureDamageTypeEnum"/&gt;
 *         &lt;element name="infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "infrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected _ExtensionType infrastructureDamageObstructionExtension;

    /**
     * Gets the value of the infrastructureDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Sets the value of the infrastructureDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Gets the value of the infrastructureDamageObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getInfrastructureDamageObstructionExtension() {
        return infrastructureDamageObstructionExtension;
    }

    /**
     * Sets the value of the infrastructureDamageObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setInfrastructureDamageObstructionExtension(_ExtensionType value) {
        this.infrastructureDamageObstructionExtension = value;
    }

}
