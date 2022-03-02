
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxleFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleFlowValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlowRate" type="{http://datex2.eu/schema/2/2_0}AxlesPerHour"/&gt;
 *         &lt;element name="axleFlowValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleFlowValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "axleFlowRate",
    "axleFlowValueExtension"
})
public class AxleFlowValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleFlowRate;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType axleFlowValueExtension;

    /**
     * Gets the value of the axleFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlowRate() {
        return axleFlowRate;
    }

    /**
     * Sets the value of the axleFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlowRate(BigInteger value) {
        this.axleFlowRate = value;
    }

    /**
     * Gets the value of the axleFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleFlowValueExtension() {
        return axleFlowValueExtension;
    }

    /**
     * Sets the value of the axleFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleFlowValueExtension(ExtensionType value) {
        this.axleFlowValueExtension = value;
    }

}
