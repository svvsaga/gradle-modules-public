
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imageData" type="{http://datex2.eu/schema/3/common}Base64Binary"/&gt;
 *         &lt;element name="imageFormat" type="{http://datex2.eu/schema/3/vms}_ImageFormatEnum"/&gt;
 *         &lt;element name="_imageExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "imageData",
    "imageFormat",
    "_ImageExtension"
})
public class Image {

    @XmlElement(required = true)
    protected byte[] imageData;
    @XmlElement(required = true)
    protected _ImageFormatEnum imageFormat;
    @XmlElement(name = "_imageExtension")
    protected _ExtensionType _ImageExtension;

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = value;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link _ImageFormatEnum }
     *     
     */
    public _ImageFormatEnum getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ImageFormatEnum }
     *     
     */
    public void setImageFormat(_ImageFormatEnum value) {
        this.imageFormat = value;
    }

    /**
     * Gets the value of the _ImageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ImageExtension() {
        return _ImageExtension;
    }

    /**
     * Sets the value of the _ImageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ImageExtension(_ExtensionType value) {
        this._ImageExtension = value;
    }

}
