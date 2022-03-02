
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Actions that an authorised operator can decide to implement to prevent or help correct
 *         dangerous or poor driving conditions, or any actions affecting normal operation of a road.
 *       
 * 
 * <p>Java class for OperatorAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionOrigin" type="{http://datex2.eu/schema/3/situation}_OperatorActionOriginEnum" minOccurs="0"/&gt;
 *         &lt;element name="actionPlanIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="operatorActionStatus" type="{http://datex2.eu/schema/3/situation}_OperatorActionStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="_operatorActionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorAction", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "actionOrigin",
    "actionPlanIdentifier",
    "operatorActionStatus",
    "operatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    NetworkManagement.class
})
public abstract class OperatorAction
    extends SituationRecord
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected OperatorActionOriginEnum actionOrigin;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected String actionPlanIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected OperatorActionStatusEnum operatorActionStatus;
    @XmlElement(name = "_operatorActionExtension", namespace = "http://datex2.eu/schema/3/situation")
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
