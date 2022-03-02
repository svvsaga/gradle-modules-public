
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Road"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="junctionName" type="{http://datex2.eu/schema/2/2_0}MultilingualString"/&gt;
 *         &lt;element name="roadNodeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadNode", propOrder = {
    "junctionName",
    "roadNodeExtension"
})
public class RoadNode
    extends Road
{

    @XmlElement(required = true)
    protected MultilingualString junctionName;
    protected ExtensionType roadNodeExtension;

    /**
     * Gets the value of the junctionName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJunctionName() {
        return junctionName;
    }

    /**
     * Sets the value of the junctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJunctionName(MultilingualString value) {
        this.junctionName = value;
    }

    /**
     * Gets the value of the roadNodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadNodeExtension() {
        return roadNodeExtension;
    }

    /**
     * Sets the value of the roadNodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadNodeExtension(ExtensionType value) {
        this.roadNodeExtension = value;
    }

}
