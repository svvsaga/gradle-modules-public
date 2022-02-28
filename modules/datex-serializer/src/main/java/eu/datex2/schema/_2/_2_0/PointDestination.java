
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/2/2_0}Point"/&gt;
 *         &lt;element name="pointDestinationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointDestination", propOrder = {
    "point",
    "pointDestinationExtension"
})
public class PointDestination
    extends Destination
{

    @XmlElement(required = true)
    protected Point point;
    protected _ExtensionType pointDestinationExtension;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

    /**
     * Gets the value of the pointDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPointDestinationExtension() {
        return pointDestinationExtension;
    }

    /**
     * Sets the value of the pointDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPointDestinationExtension(_ExtensionType value) {
        this.pointDestinationExtension = value;
    }

}
