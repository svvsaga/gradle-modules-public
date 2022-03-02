
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/2/2_0}EnvironmentalObstructionTypeEnum"/&gt;
 *         &lt;element name="environmentalObstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalObstruction", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "depth",
    "environmentalObstructionType",
    "environmentalObstructionExtension"
})
public class EnvironmentalObstruction
    extends Obstruction
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float depth;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected EnvironmentalObstructionTypeEnum environmentalObstructionType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType environmentalObstructionExtension;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepth(Float value) {
        this.depth = value;
    }

    /**
     * Gets the value of the environmentalObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Sets the value of the environmentalObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Gets the value of the environmentalObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnvironmentalObstructionExtension() {
        return environmentalObstructionExtension;
    }

    /**
     * Sets the value of the environmentalObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnvironmentalObstructionExtension(ExtensionType value) {
        this.environmentalObstructionExtension = value;
    }

}
