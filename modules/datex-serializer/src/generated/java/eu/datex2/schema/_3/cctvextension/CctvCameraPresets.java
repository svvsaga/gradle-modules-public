
package eu.datex2.schema._3.cctvextension;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraPresets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraPresets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraPresetIdentification" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="cctvCameraPresetName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="_cctvCameraPresetsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraPresets", propOrder = {
    "cctvCameraPresetIdentification",
    "cctvCameraPresetName",
    "_CctvCameraPresetsExtension"
})
public class CctvCameraPresets {

    @XmlElement(required = true)
    protected String cctvCameraPresetIdentification;
    protected String cctvCameraPresetName;
    @XmlElement(name = "_cctvCameraPresetsExtension")
    protected _ExtensionType _CctvCameraPresetsExtension;

    /**
     * Gets the value of the cctvCameraPresetIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraPresetIdentification() {
        return cctvCameraPresetIdentification;
    }

    /**
     * Sets the value of the cctvCameraPresetIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraPresetIdentification(String value) {
        this.cctvCameraPresetIdentification = value;
    }

    /**
     * Gets the value of the cctvCameraPresetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraPresetName() {
        return cctvCameraPresetName;
    }

    /**
     * Sets the value of the cctvCameraPresetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraPresetName(String value) {
        this.cctvCameraPresetName = value;
    }

    /**
     * Gets the value of the _CctvCameraPresetsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvCameraPresetsExtension() {
        return _CctvCameraPresetsExtension;
    }

    /**
     * Sets the value of the _CctvCameraPresetsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvCameraPresetsExtension(_ExtensionType value) {
        this._CctvCameraPresetsExtension = value;
    }

}
