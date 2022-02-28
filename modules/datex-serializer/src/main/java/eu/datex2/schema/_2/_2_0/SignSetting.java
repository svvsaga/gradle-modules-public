
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsSetting" type="{http://datex2.eu/schema/2/2_0}VmsSetting"/&gt;
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "vmsSetting",
    "signSettingExtension"
})
public class SignSetting
    extends OperatorAction
{

    @XmlElement(required = true)
    protected VmsSetting vmsSetting;
    protected _ExtensionType signSettingExtension;

    /**
     * Gets the value of the vmsSetting property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSetting }
     *     
     */
    public VmsSetting getVmsSetting() {
        return vmsSetting;
    }

    /**
     * Sets the value of the vmsSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSetting }
     *     
     */
    public void setVmsSetting(VmsSetting value) {
        this.vmsSetting = value;
    }

    /**
     * Gets the value of the signSettingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Sets the value of the signSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setSignSettingExtension(_ExtensionType value) {
        this.signSettingExtension = value;
    }

}
