
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
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
@XmlType(name = "OperatorAction", propOrder = {
    "actionOrigin",
    "actionPlanIdentifier",
    "operatorActionStatus",
    "_OperatorActionExtension"
})
@XmlSeeAlso({
    RoadsideAssistance.class,
    Roadworks.class,
    NetworkManagement.class
})
public abstract class OperatorAction
    extends SituationRecord
{

    protected _OperatorActionOriginEnum actionOrigin;
    protected String actionPlanIdentifier;
    protected _OperatorActionStatusEnum operatorActionStatus;
    @XmlElement(name = "_operatorActionExtension")
    protected _ExtensionType _OperatorActionExtension;

    /**
     * Gets the value of the actionOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link _OperatorActionOriginEnum }
     *     
     */
    public _OperatorActionOriginEnum getActionOrigin() {
        return actionOrigin;
    }

    /**
     * Sets the value of the actionOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatorActionOriginEnum }
     *     
     */
    public void setActionOrigin(_OperatorActionOriginEnum value) {
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
     *     {@link _OperatorActionStatusEnum }
     *     
     */
    public _OperatorActionStatusEnum getOperatorActionStatus() {
        return operatorActionStatus;
    }

    /**
     * Sets the value of the operatorActionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatus(_OperatorActionStatusEnum value) {
        this.operatorActionStatus = value;
    }

    /**
     * Gets the value of the _OperatorActionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OperatorActionExtension() {
        return _OperatorActionExtension;
    }

    /**
     * Sets the value of the _OperatorActionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OperatorActionExtension(_ExtensionType value) {
        this._OperatorActionExtension = value;
    }

}
