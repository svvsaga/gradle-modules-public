
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dimensionLength" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="dimensionWidth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="dimensionHeight" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="dimensionUsableArea" type="{http://datex2.eu/schema/2/2_0}SquareMetres" minOccurs="0"/&gt;
 *         &lt;element name="dimensionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimension", propOrder = {
    "dimensionLength",
    "dimensionWidth",
    "dimensionHeight",
    "dimensionUsableArea",
    "dimensionExtension"
})
public class Dimension {

    protected Float dimensionLength;
    protected Float dimensionWidth;
    protected Float dimensionHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dimensionUsableArea;
    protected ExtensionType dimensionExtension;

    /**
     * Gets the value of the dimensionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDimensionLength() {
        return dimensionLength;
    }

    /**
     * Sets the value of the dimensionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDimensionLength(Float value) {
        this.dimensionLength = value;
    }

    /**
     * Gets the value of the dimensionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDimensionWidth() {
        return dimensionWidth;
    }

    /**
     * Sets the value of the dimensionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDimensionWidth(Float value) {
        this.dimensionWidth = value;
    }

    /**
     * Gets the value of the dimensionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDimensionHeight() {
        return dimensionHeight;
    }

    /**
     * Sets the value of the dimensionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDimensionHeight(Float value) {
        this.dimensionHeight = value;
    }

    /**
     * Gets the value of the dimensionUsableArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimensionUsableArea() {
        return dimensionUsableArea;
    }

    /**
     * Sets the value of the dimensionUsableArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimensionUsableArea(BigInteger value) {
        this.dimensionUsableArea = value;
    }

    /**
     * Gets the value of the dimensionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDimensionExtension() {
        return dimensionExtension;
    }

    /**
     * Sets the value of the dimensionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDimensionExtension(ExtensionType value) {
        this.dimensionExtension = value;
    }

}
