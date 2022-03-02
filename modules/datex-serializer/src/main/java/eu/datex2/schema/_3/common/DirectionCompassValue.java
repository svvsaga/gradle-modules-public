
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of direction as a point of the compass.
 * 
 * <p>Java class for DirectionCompassValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionCompassValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionCompass" type="{http://datex2.eu/schema/3/common}_DirectionCompassEnum"/&gt;
 *         &lt;element name="_directionCompassValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionCompassValue", propOrder = {
    "directionCompass",
    "directionCompassValueExtension"
})
public class DirectionCompassValue
    extends DataValue
{

    @XmlElement(required = true)
    protected DirectionCompassEnum directionCompass;
    @XmlElement(name = "_directionCompassValueExtension")
    protected ExtensionType directionCompassValueExtension;

    /**
     * Gets the value of the directionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getDirectionCompass() {
        return directionCompass;
    }

    /**
     * Sets the value of the directionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setDirectionCompass(DirectionCompassEnum value) {
        this.directionCompass = value;
    }

    /**
     * Gets the value of the directionCompassValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDirectionCompassValueExtension() {
        return directionCompassValueExtension;
    }

    /**
     * Sets the value of the directionCompassValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDirectionCompassValueExtension(ExtensionType value) {
        this.directionCompassValueExtension = value;
    }

}
