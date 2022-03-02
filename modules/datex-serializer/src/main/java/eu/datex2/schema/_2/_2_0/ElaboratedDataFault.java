
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elaboratedDataFault" type="{http://datex2.eu/schema/2/2_0}ElaboratedDataFaultEnum"/&gt;
 *         &lt;element name="elaboratedDataFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataFault", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "elaboratedDataFault",
    "elaboratedDataFaultExtension"
})
public class ElaboratedDataFault
    extends Fault
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected ElaboratedDataFaultEnum elaboratedDataFault;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType elaboratedDataFaultExtension;

    /**
     * Gets the value of the elaboratedDataFault property.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedDataFaultEnum }
     *     
     */
    public ElaboratedDataFaultEnum getElaboratedDataFault() {
        return elaboratedDataFault;
    }

    /**
     * Sets the value of the elaboratedDataFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedDataFaultEnum }
     *     
     */
    public void setElaboratedDataFault(ElaboratedDataFaultEnum value) {
        this.elaboratedDataFault = value;
    }

    /**
     * Gets the value of the elaboratedDataFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataFaultExtension() {
        return elaboratedDataFaultExtension;
    }

    /**
     * Sets the value of the elaboratedDataFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataFaultExtension(ExtensionType value) {
        this.elaboratedDataFaultExtension = value;
    }

}
