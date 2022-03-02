
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value expressed as a percentage.
 * 
 * <p>Java class for PercentageValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentage" type="{http://datex2.eu/schema/3/common}Percentage"/&gt;
 *         &lt;element name="_percentageValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageValue", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "percentage",
    "percentageValueExtension"
})
public class PercentageValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected float percentage;
    @XmlElement(name = "_percentageValueExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType percentageValueExtension;

    /**
     * Gets the value of the percentage property.
     * 
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(float value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the percentageValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPercentageValueExtension() {
        return percentageValueExtension;
    }

    /**
     * Sets the value of the percentageValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPercentageValueExtension(ExtensionType value) {
        this.percentageValueExtension = value;
    }

}
