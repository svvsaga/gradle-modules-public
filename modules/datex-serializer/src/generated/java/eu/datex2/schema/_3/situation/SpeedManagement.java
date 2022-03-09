
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/3/situation}_SpeedManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/3/common}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="_speedManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedManagement", propOrder = {
    "speedManagementType",
    "temporarySpeedLimit",
    "_SpeedManagementExtension"
})
public class SpeedManagement
    extends NetworkManagement
{

    protected _SpeedManagementTypeEnum speedManagementType;
    protected Float temporarySpeedLimit;
    @XmlElement(name = "_speedManagementExtension")
    protected _ExtensionType _SpeedManagementExtension;

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link _SpeedManagementTypeEnum }
     *     
     */
    public _SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(_SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the _SpeedManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpeedManagementExtension() {
        return _SpeedManagementExtension;
    }

    /**
     * Sets the value of the _SpeedManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpeedManagementExtension(_ExtensionType value) {
        this._SpeedManagementExtension = value;
    }

}
