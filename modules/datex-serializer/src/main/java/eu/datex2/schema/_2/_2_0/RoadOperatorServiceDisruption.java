
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOperatorServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadOperatorServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadOperatorServiceDisruptionType" type="{http://datex2.eu/schema/2/2_0}RoadOperatorServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadOperatorServiceDisruptionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "roadOperatorServiceDisruptionExtension"
})
public class RoadOperatorServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadOperatorServiceDisruptionTypeEnum> roadOperatorServiceDisruptionType;
    protected _ExtensionType roadOperatorServiceDisruptionExtension;

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
     * {@link RoadOperatorServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadOperatorServiceDisruptionTypeEnum> getRoadOperatorServiceDisruptionType() {
        if (roadOperatorServiceDisruptionType == null) {
            roadOperatorServiceDisruptionType = new ArrayList<RoadOperatorServiceDisruptionTypeEnum>();
        }
        return this.roadOperatorServiceDisruptionType;
    }

    /**
     * Gets the value of the roadOperatorServiceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getRoadOperatorServiceDisruptionExtension() {
        return roadOperatorServiceDisruptionExtension;
    }

    /**
     * Sets the value of the roadOperatorServiceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setRoadOperatorServiceDisruptionExtension(_ExtensionType value) {
        this.roadOperatorServiceDisruptionExtension = value;
    }

}
