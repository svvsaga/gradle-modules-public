
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://datex2.eu/schema/2/2_0}Area"/&gt;
 *         &lt;element name="areaDestinationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", propOrder = {
    "area",
    "areaDestinationExtension"
})
public class AreaDestination
    extends Destination
{

    @XmlElement(required = true)
    protected Area area;
    protected _ExtensionType areaDestinationExtension;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getAreaDestinationExtension() {
        return areaDestinationExtension;
    }

    /**
     * Sets the value of the areaDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setAreaDestinationExtension(_ExtensionType value) {
        this.areaDestinationExtension = value;
    }

}
