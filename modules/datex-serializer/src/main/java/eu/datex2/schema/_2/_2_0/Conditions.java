
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drivingConditionType" type="{http://datex2.eu/schema/2/2_0}DrivingConditionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="conditionsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conditions", propOrder = {
    "drivingConditionType",
    "conditionsExtension"
})
@XmlSeeAlso({
    PoorEnvironmentConditions.class,
    RoadConditions.class
})
public class Conditions
    extends TrafficElement
{

    @XmlSchemaType(name = "string")
    protected DrivingConditionTypeEnum drivingConditionType;
    protected _ExtensionType conditionsExtension;

    /**
     * Gets the value of the drivingConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public DrivingConditionTypeEnum getDrivingConditionType() {
        return drivingConditionType;
    }

    /**
     * Sets the value of the drivingConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionType(DrivingConditionTypeEnum value) {
        this.drivingConditionType = value;
    }

    /**
     * Gets the value of the conditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getConditionsExtension() {
        return conditionsExtension;
    }

    /**
     * Sets the value of the conditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setConditionsExtension(_ExtensionType value) {
        this.conditionsExtension = value;
    }

}
