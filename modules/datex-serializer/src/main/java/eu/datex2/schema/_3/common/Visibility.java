
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of atmospheric visibility.
 * 
 * <p>Java class for Visibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumVisibilityDistance" type="{http://datex2.eu/schema/3/common}IntegerMetreDistanceValue"/&gt;
 *         &lt;element name="_visibilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visibility", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "minimumVisibilityDistance",
    "visibilityExtension"
})
public class Visibility {

    @XmlElement(namespace = "http://datex2.eu/schema/3/common", required = true)
    protected IntegerMetreDistanceValue minimumVisibilityDistance;
    @XmlElement(name = "_visibilityExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType visibilityExtension;

    /**
     * Gets the value of the minimumVisibilityDistance property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerMetreDistanceValue }
     *     
     */
    public IntegerMetreDistanceValue getMinimumVisibilityDistance() {
        return minimumVisibilityDistance;
    }

    /**
     * Sets the value of the minimumVisibilityDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerMetreDistanceValue }
     *     
     */
    public void setMinimumVisibilityDistance(IntegerMetreDistanceValue value) {
        this.minimumVisibilityDistance = value;
    }

    /**
     * Gets the value of the visibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityExtension() {
        return visibilityExtension;
    }

    /**
     * Sets the value of the visibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityExtension(ExtensionType value) {
        this.visibilityExtension = value;
    }

}
