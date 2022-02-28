
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Distance of a point along a linear element measured from the start node expressed as a
 *         percentage of the whole length of the linear element, where start node is relative to the element
 *         definition rather than the direction of traffic flow.
 *       
 * 
 * <p>Java class for PercentageDistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageDistanceAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentageDistanceAlong" type="{http://datex2.eu/schema/3/common}Percentage"/&gt;
 *         &lt;element name="_percentageDistanceAlongLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageDistanceAlongLinearElement", propOrder = {
    "percentageDistanceAlong",
    "_PercentageDistanceAlongLinearElementExtension"
})
public class PercentageDistanceAlongLinearElement
    extends DistanceAlongLinearElement
{

    protected float percentageDistanceAlong;
    @XmlElement(name = "_percentageDistanceAlongLinearElementExtension")
    protected _ExtensionType _PercentageDistanceAlongLinearElementExtension;

    /**
     * Gets the value of the percentageDistanceAlong property.
     * 
     */
    public float getPercentageDistanceAlong() {
        return percentageDistanceAlong;
    }

    /**
     * Sets the value of the percentageDistanceAlong property.
     * 
     */
    public void setPercentageDistanceAlong(float value) {
        this.percentageDistanceAlong = value;
    }

    /**
     * Gets the value of the _PercentageDistanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PercentageDistanceAlongLinearElementExtension() {
        return _PercentageDistanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the _PercentageDistanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PercentageDistanceAlongLinearElementExtension(_ExtensionType value) {
        this._PercentageDistanceAlongLinearElementExtension = value;
    }

}
