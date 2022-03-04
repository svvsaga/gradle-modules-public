
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="_distanceAlongLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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

    @XmlElement(name = "_distanceAlongLinearElementExtension")
    protected ExtensionType distanceAlongLinearElementExtension;

    /**
     * Gets the value of the distanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceAlongLinearElementExtension() {
        return distanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the distanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceAlongLinearElementExtension(ExtensionType value) {
        this.distanceAlongLinearElementExtension = value;
    }

}
