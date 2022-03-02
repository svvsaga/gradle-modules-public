
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsPictogramImageExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsPictogramImageExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramImage" type="{http://datex2.eu/schema/2/2_0}Base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsPictogramImageExtension", propOrder = {
    "pictogramImage"
})
public class VmsPictogramImageExtension {

    @XmlElement(required = true)
    protected byte[] pictogramImage;

    /**
     * Gets the value of the pictogramImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPictogramImage() {
        return pictogramImage;
    }

    /**
     * Sets the value of the pictogramImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPictogramImage(byte[] value) {
        this.pictogramImage = value;
    }

}
