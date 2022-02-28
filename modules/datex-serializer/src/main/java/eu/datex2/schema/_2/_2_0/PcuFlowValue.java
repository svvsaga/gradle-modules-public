
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PcuFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PcuFlowValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pcuFlowRate" type="{http://datex2.eu/schema/2/2_0}PassengerCarUnitsPerHour"/&gt;
 *         &lt;element name="pcuFlowValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcuFlowValue", propOrder = {
    "pcuFlowRate",
    "pcuFlowValueExtension"
})
public class PcuFlowValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pcuFlowRate;
    protected _ExtensionType pcuFlowValueExtension;

    /**
     * Gets the value of the pcuFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcuFlowRate() {
        return pcuFlowRate;
    }

    /**
     * Sets the value of the pcuFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcuFlowRate(BigInteger value) {
        this.pcuFlowRate = value;
    }

    /**
     * Gets the value of the pcuFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPcuFlowValueExtension() {
        return pcuFlowValueExtension;
    }

    /**
     * Sets the value of the pcuFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPcuFlowValueExtension(_ExtensionType value) {
        this.pcuFlowValueExtension = value;
    }

}
