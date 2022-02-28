
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Distance of a point along a linear element measured from a "from referent" on the linear
 *         element, in the sense relative to the linear element definition rather than the direction of traffic
 *         flow or optionally towards a "towards referent".
 *       
 * 
 * <p>Java class for DistanceFromLinearElementReferent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementReferent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="fromReferent" type="{http://datex2.eu/schema/3/locationReferencing}Referent"/&gt;
 *         &lt;element name="towardsReferent" type="{http://datex2.eu/schema/3/locationReferencing}Referent" minOccurs="0"/&gt;
 *         &lt;element name="_distanceFromLinearElementReferentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_DistanceFromLinearElementReferentExtension"
})
public class DistanceFromLinearElementReferent
    extends DistanceAlongLinearElement
{

    protected float distanceAlong;
    @XmlElement(required = true)
    protected Referent fromReferent;
    protected Referent towardsReferent;
    @XmlElement(name = "_distanceFromLinearElementReferentExtension")
    protected _ExtensionType _DistanceFromLinearElementReferentExtension;

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
     * Gets the value of the _DistanceFromLinearElementReferentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DistanceFromLinearElementReferentExtension() {
        return _DistanceFromLinearElementReferentExtension;
    }

    /**
     * Sets the value of the _DistanceFromLinearElementReferentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DistanceFromLinearElementReferentExtension(_ExtensionType value) {
        this._DistanceFromLinearElementReferentExtension = value;
    }

}
