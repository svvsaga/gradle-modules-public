
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road resulting from an environmental cause.
 * 
 * <p>Java class for EnvironmentalObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/3/situation}_EnvironmentalObstructionTypeEnum"/&gt;
 *         &lt;element name="_environmentalObstructionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalObstruction", propOrder = {
    "depth",
    "environmentalObstructionType",
    "_EnvironmentalObstructionExtension"
})
public class EnvironmentalObstruction
    extends Obstruction
{

    protected Float depth;
    @XmlElement(required = true)
    protected _EnvironmentalObstructionTypeEnum environmentalObstructionType;
    @XmlElement(name = "_environmentalObstructionExtension")
    protected _ExtensionType _EnvironmentalObstructionExtension;

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
     *     {@link _EnvironmentalObstructionTypeEnum }
     *     
     */
    public _EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Sets the value of the environmentalObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(_EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Gets the value of the _EnvironmentalObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnvironmentalObstructionExtension() {
        return _EnvironmentalObstructionExtension;
    }

    /**
     * Sets the value of the _EnvironmentalObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnvironmentalObstructionExtension(_ExtensionType value) {
        this._EnvironmentalObstructionExtension = value;
    }

}
