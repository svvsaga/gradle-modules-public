
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any conditions which have the potential to degrade normal driving conditions.
 *       
 * 
 * <p>Java class for Conditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drivingConditionType" type="{http://datex2.eu/schema/3/situation}_DrivingConditionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_conditionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_ConditionsExtension"
})
@XmlSeeAlso({
    PoorEnvironmentConditions.class,
    RoadSurfaceConditions.class
})
public class Conditions
    extends TrafficElement
{

    protected _DrivingConditionTypeEnum drivingConditionType;
    @XmlElement(name = "_conditionsExtension")
    protected _ExtensionType _ConditionsExtension;

    /**
     * Gets the value of the drivingConditionType property.
     * 
     * @return
     *     possible object is
     *     {@link _DrivingConditionTypeEnum }
     *     
     */
    public _DrivingConditionTypeEnum getDrivingConditionType() {
        return drivingConditionType;
    }

    /**
     * Sets the value of the drivingConditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionType(_DrivingConditionTypeEnum value) {
        this.drivingConditionType = value;
    }

    /**
     * Gets the value of the _ConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ConditionsExtension() {
        return _ConditionsExtension;
    }

    /**
     * Sets the value of the _ConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ConditionsExtension(_ExtensionType value) {
        this._ConditionsExtension = value;
    }

}
