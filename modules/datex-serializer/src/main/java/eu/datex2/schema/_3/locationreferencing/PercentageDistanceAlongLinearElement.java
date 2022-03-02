
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "PercentageDistanceAlongLinearElement", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "percentageDistanceAlong",
    "percentageDistanceAlongLinearElementExtension"
})
public class PercentageDistanceAlongLinearElement
    extends DistanceAlongLinearElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected float percentageDistanceAlong;
    @XmlElement(name = "_percentageDistanceAlongLinearElementExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType percentageDistanceAlongLinearElementExtension;

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
     * Gets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPercentageDistanceAlongLinearElementExtension() {
        return percentageDistanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPercentageDistanceAlongLinearElementExtension(ExtensionType value) {
        this.percentageDistanceAlongLinearElementExtension = value;
    }

}
