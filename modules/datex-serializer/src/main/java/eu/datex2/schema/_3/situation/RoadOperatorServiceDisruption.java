
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of disruption to normal road operator services
 * 
 * <p>Java class for RoadOperatorServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadOperatorServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}ServiceInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOperatorServiceDisruptionType" type="{http://datex2.eu/schema/3/situation}_RoadOperatorServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_roadOperatorServiceDisruptionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOperatorServiceDisruption", propOrder = {
    "roadOperatorServiceDisruptionType",
    "_RoadOperatorServiceDisruptionExtension"
})
public class RoadOperatorServiceDisruption
    extends ServiceInformation
{

    @XmlElement(required = true)
    protected List<_RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    @XmlElement(name = "_roadOperatorServiceDisruptionExtension")
    protected _ExtensionType _RoadOperatorServiceDisruptionExtension;

    /**
     * Gets the value of the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadOperatorServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadOperatorServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<_RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<_RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    /**
     * Gets the value of the _RoadOperatorServiceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadOperatorServiceDisruptionExtension() {
        return _RoadOperatorServiceDisruptionExtension;
    }

    /**
     * Sets the value of the _RoadOperatorServiceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadOperatorServiceDisruptionExtension(_ExtensionType value) {
        this._RoadOperatorServiceDisruptionExtension = value;
    }

}
