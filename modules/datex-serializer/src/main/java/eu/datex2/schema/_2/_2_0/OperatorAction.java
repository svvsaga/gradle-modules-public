
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOrigin" type="{http://datex2.eu/schema/2/2_0}OperatorActionOriginEnum" minOccurs="0"/&gt;
 *         &lt;element name="actionPlanIdentifier" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionStatus" type="{http://datex2.eu/schema/2/2_0}OperatorActionStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorAction", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "actionOrigin",
    "actionPlanIdentifier",
    "operatorActionStatus",
    "operatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    SignSetting.class,
    NetworkManagement.class
})
public class OperatorAction
    extends SituationRecord
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected OperatorActionOriginEnum actionOrigin;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected String actionPlanIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected OperatorActionStatusEnum operatorActionStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType operatorActionExtension;

    /**
     * Gets the value of the actionOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public OperatorActionOriginEnum getActionOrigin() {
        return actionOrigin;
    }

    /**
     * Sets the value of the actionOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public void setActionOrigin(OperatorActionOriginEnum value) {
        this.actionOrigin = value;
    }

    /**
     * Gets the value of the actionPlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionPlanIdentifier() {
        return actionPlanIdentifier;
    }

    /**
     * Sets the value of the actionPlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionPlanIdentifier(String value) {
        this.actionPlanIdentifier = value;
    }

    /**
     * Gets the value of the operatorActionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public OperatorActionStatusEnum getOperatorActionStatus() {
        return operatorActionStatus;
    }

    /**
     * Sets the value of the operatorActionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatus(OperatorActionStatusEnum value) {
        this.operatorActionStatus = value;
    }

    /**
     * Gets the value of the operatorActionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOperatorActionExtension() {
        return operatorActionExtension;
    }

    /**
     * Sets the value of the operatorActionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOperatorActionExtension(ExtensionType value) {
        this.operatorActionExtension = value;
    }

}
