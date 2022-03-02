
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OccupancyChangeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccupancyChangeValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="occupancyChange" type="{http://datex2.eu/schema/2/2_0}Integer"/&gt;
 *         &lt;element name="occupancyChangeValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupancyChangeValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "occupancyChange",
    "occupancyChangeValueExtension"
})
public class OccupancyChangeValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected BigInteger occupancyChange;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType occupancyChangeValueExtension;

    /**
     * Gets the value of the occupancyChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupancyChange() {
        return occupancyChange;
    }

    /**
     * Sets the value of the occupancyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupancyChange(BigInteger value) {
        this.occupancyChange = value;
    }

    /**
     * Gets the value of the occupancyChangeValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOccupancyChangeValueExtension() {
        return occupancyChangeValueExtension;
    }

    /**
     * Sets the value of the occupancyChangeValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOccupancyChangeValueExtension(ExtensionType value) {
        this.occupancyChangeValueExtension = value;
    }

}
