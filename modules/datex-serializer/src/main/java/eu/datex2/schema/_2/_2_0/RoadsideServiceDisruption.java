
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/2/2_0}RoadsideServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadsideServiceDisruptionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideServiceDisruption", propOrder = {
    "roadsideServiceDisruptionType",
    "roadsideServiceDisruptionExtension"
})
public class RoadsideServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadsideServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    protected _ExtensionType roadsideServiceDisruptionExtension;

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadsideServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadsideServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<RoadsideServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Gets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getRoadsideServiceDisruptionExtension() {
        return roadsideServiceDisruptionExtension;
    }

    /**
     * Sets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setRoadsideServiceDisruptionExtension(_ExtensionType value) {
        this.roadsideServiceDisruptionExtension = value;
    }

}
