
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An image, with encoded data and identification of format
 * 
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
@XmlType(name = "Image", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "imageData",
    "imageFormat",
    "imageExtension"
})
public class Image {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected byte[] imageData;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected ImageFormatEnum imageFormat;
    @XmlElement(name = "_imageExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType imageExtension;

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
     *     {@link ImageFormatEnum }
     *     
     */
    public ImageFormatEnum getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageFormatEnum }
     *     
     */
    public void setImageFormat(ImageFormatEnum value) {
        this.imageFormat = value;
    }

    /**
     * Gets the value of the imageExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImageExtension() {
        return imageExtension;
    }

    /**
     * Sets the value of the imageExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImageExtension(ExtensionType value) {
        this.imageExtension = value;
    }

}
