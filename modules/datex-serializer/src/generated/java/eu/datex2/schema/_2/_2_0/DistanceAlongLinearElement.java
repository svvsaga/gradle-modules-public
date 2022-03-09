
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceAlongLinearElement", propOrder = {
    "distanceAlongLinearElementExtension"
})
@XmlSeeAlso({
    DistanceFromLinearElementReferent.class,
    DistanceFromLinearElementStart.class,
    PercentageDistanceAlongLinearElement.class
})
public abstract class DistanceAlongLinearElement {

    protected _ExtensionType distanceAlongLinearElementExtension;

    /**
     * Gets the value of the distanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getDistanceAlongLinearElementExtension() {
        return distanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the distanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setDistanceAlongLinearElementExtension(_ExtensionType value) {
        this.distanceAlongLinearElementExtension = value;
    }

}
