
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of direction as a bearing.
 * 
 * <p>Java class for DirectionBearingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionBearingValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees"/&gt;
 *         &lt;element name="_directionBearingValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionBearingValue", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "directionBearing",
    "directionBearingValueExtension"
})
public class DirectionBearingValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int directionBearing;
    @XmlElement(name = "_directionBearingValueExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType directionBearingValueExtension;

    /**
     * Gets the value of the directionBearing property.
     * 
     */
    public int getDirectionBearing() {
        return directionBearing;
    }

    /**
     * Sets the value of the directionBearing property.
     * 
     */
    public void setDirectionBearing(int value) {
        this.directionBearing = value;
    }

    /**
     * Gets the value of the directionBearingValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDirectionBearingValueExtension() {
        return directionBearingValueExtension;
    }

    /**
     * Sets the value of the directionBearingValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDirectionBearingValueExtension(ExtensionType value) {
        this.directionBearingValueExtension = value;
    }

}
