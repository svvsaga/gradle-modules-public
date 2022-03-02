
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
@XmlType(name = "SignSetting", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vmsSetting",
    "signSettingExtension"
})
public class SignSetting
    extends OperatorAction
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected VmsSetting vmsSetting;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType signSettingExtension;

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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Sets the value of the signSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

}
