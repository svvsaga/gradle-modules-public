
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceFromLinearElementStart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementStart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&gt;
 *         &lt;element name="_distanceFromLinearElementStartExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceFromLinearElementStart", propOrder = {
    "distanceAlong",
    "distanceFromLinearElementStartExtension"
})
public class DistanceFromLinearElementStart
    extends DistanceAlongLinearElement
{

    protected float distanceAlong;
    @XmlElement(name = "_distanceFromLinearElementStartExtension")
    protected ExtensionType distanceFromLinearElementStartExtension;

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
     * Gets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceFromLinearElementStartExtension() {
        return distanceFromLinearElementStartExtension;
    }

    /**
     * Sets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceFromLinearElementStartExtension(ExtensionType value) {
        this.distanceFromLinearElementStartExtension = value;
    }

}
