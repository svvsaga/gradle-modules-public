
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPolygonLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPolygonLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPolygonCorners" type="{http://datex2.eu/schema/2/2_0}OpenlrPolygonCorners"/&gt;
 *         &lt;element name="openlrPolygonLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonLocationReference", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrPolygonCorners",
    "openlrPolygonLocationReferenceExtension"
})
public class OpenlrPolygonLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrPolygonCorners openlrPolygonCorners;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType openlrPolygonLocationReferenceExtension;

    /**
     * Gets the value of the openlrPolygonCorners property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public OpenlrPolygonCorners getOpenlrPolygonCorners() {
        return openlrPolygonCorners;
    }

    /**
     * Sets the value of the openlrPolygonCorners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public void setOpenlrPolygonCorners(OpenlrPolygonCorners value) {
        this.openlrPolygonCorners = value;
    }

    /**
     * Gets the value of the openlrPolygonLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPolygonLocationReferenceExtension() {
        return openlrPolygonLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrPolygonLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPolygonLocationReferenceExtension(ExtensionType value) {
        this.openlrPolygonLocationReferenceExtension = value;
    }

}
