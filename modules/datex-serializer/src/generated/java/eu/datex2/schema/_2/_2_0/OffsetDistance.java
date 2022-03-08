
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffsetDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffsetDistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger"/&gt;
 *         &lt;element name="offsetDistanceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetDistance", propOrder = {
    "offsetDistance",
    "offsetDistanceExtension"
})
public class OffsetDistance {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger offsetDistance;
    protected ExtensionType offsetDistanceExtension;

    /**
     * Gets the value of the offsetDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Sets the value of the offsetDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetDistance(BigInteger value) {
        this.offsetDistance = value;
    }

    /**
     * Gets the value of the offsetDistanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOffsetDistanceExtension() {
        return offsetDistanceExtension;
    }

    /**
     * Sets the value of the offsetDistanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOffsetDistanceExtension(ExtensionType value) {
        this.offsetDistanceExtension = value;
    }

}
