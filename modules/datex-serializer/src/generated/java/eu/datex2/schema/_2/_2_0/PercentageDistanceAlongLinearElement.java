
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageDistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageDistanceAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentageDistanceAlong" type="{http://datex2.eu/schema/2/2_0}Percentage"/&gt;
 *         &lt;element name="percentageDistanceAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageDistanceAlongLinearElement", propOrder = {
    "percentageDistanceAlong",
    "percentageDistanceAlongLinearElementExtension"
})
public class PercentageDistanceAlongLinearElement
    extends DistanceAlongLinearElement
{

    protected float percentageDistanceAlong;
    protected _ExtensionType percentageDistanceAlongLinearElementExtension;

    /**
     * Gets the value of the percentageDistanceAlong property.
     * 
     */
    public float getPercentageDistanceAlong() {
        return percentageDistanceAlong;
    }

    /**
     * Sets the value of the percentageDistanceAlong property.
     * 
     */
    public void setPercentageDistanceAlong(float value) {
        this.percentageDistanceAlong = value;
    }

    /**
     * Gets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPercentageDistanceAlongLinearElementExtension() {
        return percentageDistanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the percentageDistanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPercentageDistanceAlongLinearElementExtension(_ExtensionType value) {
        this.percentageDistanceAlongLinearElementExtension = value;
    }

}
