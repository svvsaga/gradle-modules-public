
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGBColour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGBColour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rgbRedValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="rgbGreenValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="rgbBlueValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="colourName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="rgbColourExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGBColour", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "rgbRedValue",
    "rgbGreenValue",
    "rgbBlueValue",
    "colourName",
    "rgbColourExtension"
})
public class RGBColour {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rgbRedValue;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rgbGreenValue;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rgbBlueValue;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString colourName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType rgbColourExtension;

    /**
     * Gets the value of the rgbRedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRgbRedValue() {
        return rgbRedValue;
    }

    /**
     * Sets the value of the rgbRedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRgbRedValue(BigInteger value) {
        this.rgbRedValue = value;
    }

    /**
     * Gets the value of the rgbGreenValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRgbGreenValue() {
        return rgbGreenValue;
    }

    /**
     * Sets the value of the rgbGreenValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRgbGreenValue(BigInteger value) {
        this.rgbGreenValue = value;
    }

    /**
     * Gets the value of the rgbBlueValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRgbBlueValue() {
        return rgbBlueValue;
    }

    /**
     * Sets the value of the rgbBlueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRgbBlueValue(BigInteger value) {
        this.rgbBlueValue = value;
    }

    /**
     * Gets the value of the colourName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getColourName() {
        return colourName;
    }

    /**
     * Sets the value of the colourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setColourName(MultilingualString value) {
        this.colourName = value;
    }

    /**
     * Gets the value of the rgbColourExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRgbColourExtension() {
        return rgbColourExtension;
    }

    /**
     * Sets the value of the rgbColourExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRgbColourExtension(ExtensionType value) {
        this.rgbColourExtension = value;
    }

}
