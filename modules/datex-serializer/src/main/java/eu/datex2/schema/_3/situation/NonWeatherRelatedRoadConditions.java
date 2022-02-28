
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Road surface conditions that are not related to the weather but which may affect driving
 *         conditions.
 *       
 * 
 * <p>Java class for NonWeatherRelatedRoadConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonWeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}RoadSurfaceConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionType" type="{http://datex2.eu/schema/3/situation}_NonWeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_nonWeatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonWeatherRelatedRoadConditions", propOrder = {
    "nonWeatherRelatedRoadConditionType",
    "_NonWeatherRelatedRoadConditionsExtension"
})
public class NonWeatherRelatedRoadConditions
    extends RoadSurfaceConditions
{

    @XmlElement(required = true)
    protected List<_NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    @XmlElement(name = "_nonWeatherRelatedRoadConditionsExtension")
    protected _ExtensionType _NonWeatherRelatedRoadConditionsExtension;

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
     * {@link _NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<_NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<_NonWeatherRelatedRoadConditionTypeEnum>();
        }
        return this.nonWeatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the _NonWeatherRelatedRoadConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NonWeatherRelatedRoadConditionsExtension() {
        return _NonWeatherRelatedRoadConditionsExtension;
    }

    /**
     * Sets the value of the _NonWeatherRelatedRoadConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NonWeatherRelatedRoadConditionsExtension(_ExtensionType value) {
        this._NonWeatherRelatedRoadConditionsExtension = value;
    }

}
