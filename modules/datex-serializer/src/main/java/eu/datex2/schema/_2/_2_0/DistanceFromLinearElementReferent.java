
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceFromLinearElementReferent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementReferent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/&gt;
 *         &lt;element name="fromReferent" type="{http://datex2.eu/schema/2/2_0}Referent"/&gt;
 *         &lt;element name="towardsReferent" type="{http://datex2.eu/schema/2/2_0}Referent" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromLinearElementReferentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceFromLinearElementReferent", propOrder = {
    "distanceAlong",
    "fromReferent",
    "towardsReferent",
    "distanceFromLinearElementReferentExtension"
})
public class DistanceFromLinearElementReferent
    extends DistanceAlongLinearElement
{

    protected float distanceAlong;
    @XmlElement(required = true)
    protected Referent fromReferent;
    protected Referent towardsReferent;
    protected _ExtensionType distanceFromLinearElementReferentExtension;

    /**
     * Gets the value of the distanceAlong property.
     * 
     */
    public float getDistanceAlong() {
        return distanceAlong;
    }

    /**
     * Sets the value of the distanceAlong property.
     * 
     */
    public void setDistanceAlong(float value) {
        this.distanceAlong = value;
    }

    /**
     * Gets the value of the fromReferent property.
     * 
     * @return
     *     possible object is
     *     {@link Referent }
     *     
     */
    public Referent getFromReferent() {
        return fromReferent;
    }

    /**
     * Sets the value of the fromReferent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referent }
     *     
     */
    public void setFromReferent(Referent value) {
        this.fromReferent = value;
    }

    /**
     * Gets the value of the towardsReferent property.
     * 
     * @return
     *     possible object is
     *     {@link Referent }
     *     
     */
    public Referent getTowardsReferent() {
        return towardsReferent;
    }

    /**
     * Sets the value of the towardsReferent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referent }
     *     
     */
    public void setTowardsReferent(Referent value) {
        this.towardsReferent = value;
    }

    /**
     * Gets the value of the distanceFromLinearElementReferentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getDistanceFromLinearElementReferentExtension() {
        return distanceFromLinearElementReferentExtension;
    }

    /**
     * Sets the value of the distanceFromLinearElementReferentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setDistanceFromLinearElementReferentExtension(_ExtensionType value) {
        this.distanceFromLinearElementReferentExtension = value;
    }

}
