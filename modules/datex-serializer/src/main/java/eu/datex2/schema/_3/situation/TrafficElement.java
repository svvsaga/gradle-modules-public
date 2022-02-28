
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An event which is not planned by the traffic operator, which is affecting, or has the
 *         potential to affect traffic flow.
 *       
 * 
 * <p>Java class for TrafficElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficConstrictionType" type="{http://datex2.eu/schema/3/situation}_TrafficConstrictionTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_trafficElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficElement", propOrder = {
    "trafficConstrictionType",
    "_TrafficElementExtension"
})
@XmlSeeAlso({
    AbnormalTraffic.class,
    Accident.class,
    EquipmentOrSystemFault.class,
    Activity.class,
    Obstruction.class,
    Conditions.class
})
public abstract class TrafficElement
    extends SituationRecord
{

    protected _TrafficConstrictionTypeEnum trafficConstrictionType;
    @XmlElement(name = "_trafficElementExtension")
    protected _ExtensionType _TrafficElementExtension;

    /**
     * Gets the value of the trafficConstrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link _TrafficConstrictionTypeEnum }
     *     
     */
    public _TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Sets the value of the trafficConstrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(_TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    /**
     * Gets the value of the _TrafficElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrafficElementExtension() {
        return _TrafficElementExtension;
    }

    /**
     * Sets the value of the _TrafficElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrafficElementExtension(_ExtensionType value) {
        this._TrafficElementExtension = value;
    }

}
