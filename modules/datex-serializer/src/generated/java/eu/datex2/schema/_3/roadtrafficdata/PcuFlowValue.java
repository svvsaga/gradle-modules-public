
package eu.datex2.schema._3.roadtrafficdata;

import java.math.BigInteger;
import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common._ExtensionType;
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
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pcuFlowRate" type="{http://datex2.eu/schema/3/roadTrafficData}PassengerCarUnitsPerHour"/&gt;
 *         &lt;element name="_pcuFlowValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_PcuFlowValueExtension"
})
public class PcuFlowValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pcuFlowRate;
    @XmlElement(name = "_pcuFlowValueExtension")
    protected _ExtensionType _PcuFlowValueExtension;

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
     * Gets the value of the _PcuFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PcuFlowValueExtension() {
        return _PcuFlowValueExtension;
    }

    /**
     * Sets the value of the _PcuFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PcuFlowValueExtension(_ExtensionType value) {
        this._PcuFlowValueExtension = value;
    }

}
