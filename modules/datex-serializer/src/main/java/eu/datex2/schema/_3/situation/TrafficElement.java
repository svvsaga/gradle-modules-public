
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "trafficElementExtension"
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

    protected TrafficConstrictionTypeEnum trafficConstrictionType;
    @XmlElement(name = "_trafficElementExtension")
    protected ExtensionType trafficElementExtension;

    /**
     * Gets the value of the trafficConstrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public TrafficConstrictionTypeEnum getTrafficConstrictionType() {
        return trafficConstrictionType;
    }

    /**
     * Sets the value of the trafficConstrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficConstrictionTypeEnum }
     *     
     */
    public void setTrafficConstrictionType(TrafficConstrictionTypeEnum value) {
        this.trafficConstrictionType = value;
    }

    /**
     * Gets the value of the trafficElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficElementExtension() {
        return trafficElementExtension;
    }

    /**
     * Sets the value of the trafficElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficElementExtension(ExtensionType value) {
        this.trafficElementExtension = value;
    }

}
