
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonWeatherRelatedRoadConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonWeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}RoadConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2/2_0}NonWeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonWeatherRelatedRoadConditions", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "nonWeatherRelatedRoadConditionType",
    "nonWeatherRelatedRoadConditionsExtension"
})
public class NonWeatherRelatedRoadConditions
    extends RoadConditions
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected List<NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType nonWeatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<NonWeatherRelatedRoadConditionTypeEnum>();
        }
        return this.nonWeatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonWeatherRelatedRoadConditionsExtension() {
        return nonWeatherRelatedRoadConditionsExtension;
    }

    /**
     * Sets the value of the nonWeatherRelatedRoadConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.nonWeatherRelatedRoadConditionsExtension = value;
    }

}
