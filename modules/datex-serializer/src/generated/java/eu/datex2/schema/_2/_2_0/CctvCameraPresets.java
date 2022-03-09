
package eu.datex2.schema._2._2_0;

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
 *         &lt;element name="cctvCameraPresetIdentification" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="cctvCameraPresetName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraPresetsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "cctvCameraPresetsExtension"
})
public class CctvCameraPresets {

    @XmlElement(required = true)
    protected String cctvCameraPresetIdentification;
    protected String cctvCameraPresetName;
    protected _ExtensionType cctvCameraPresetsExtension;

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
     * Gets the value of the cctvCameraPresetsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getCctvCameraPresetsExtension() {
        return cctvCameraPresetsExtension;
    }

    /**
     * Sets the value of the cctvCameraPresetsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setCctvCameraPresetsExtension(_ExtensionType value) {
        this.cctvCameraPresetsExtension = value;
    }

}
