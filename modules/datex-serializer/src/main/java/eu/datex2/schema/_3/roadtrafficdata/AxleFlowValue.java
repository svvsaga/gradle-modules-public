
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
 * A measured or calculated value of the flow rate of vehicle axles.
 * 
 * <p>Java class for AxleFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleFlowValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlowRate" type="{http://datex2.eu/schema/3/common}AxlesPerHour"/&gt;
 *         &lt;element name="_axleFlowValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleFlowValue", propOrder = {
    "axleFlowRate",
    "_AxleFlowValueExtension"
})
public class AxleFlowValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axleFlowRate;
    @XmlElement(name = "_axleFlowValueExtension")
    protected _ExtensionType _AxleFlowValueExtension;

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
     * Gets the value of the _AxleFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AxleFlowValueExtension() {
        return _AxleFlowValueExtension;
    }

    /**
     * Sets the value of the _AxleFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AxleFlowValueExtension(_ExtensionType value) {
        this._AxleFlowValueExtension = value;
    }

}
