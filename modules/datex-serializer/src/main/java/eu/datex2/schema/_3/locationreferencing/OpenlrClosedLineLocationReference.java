
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The OpenLR method of area definition by providing a closed path (i.e. a circuit) in the
 *         road network.
 *         The boundary always consists of road segments
 *       
 * 
 * <p>Java class for OpenlrClosedLineLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrClosedLineLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLocationReferencePoint" maxOccurs="unbounded"/&gt;
 *         &lt;element name="openlrLastLine" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLastLocationReferencePoint"/&gt;
 *         &lt;element name="_openlrClosedLineLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrClosedLineLocationReference", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrLocationReferencePoint",
    "openlrLastLine",
    "openlrClosedLineLocationReferenceExtension"
})
public class OpenlrClosedLineLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected List<OpenlrLocationReferencePoint> openlrLocationReferencePoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLine;
    @XmlElement(name = "_openlrClosedLineLocationReferenceExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrClosedLineLocationReferenceExtension;

    /**
     * Gets the value of the openlrLocationReferencePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the openlrLocationReferencePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenlrLocationReferencePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenlrLocationReferencePoint }
     * 
     * 
     */
    public List<OpenlrLocationReferencePoint> getOpenlrLocationReferencePoint() {
        if (openlrLocationReferencePoint == null) {
            openlrLocationReferencePoint = new ArrayList<OpenlrLocationReferencePoint>();
        }
        return this.openlrLocationReferencePoint;
    }

    /**
     * Gets the value of the openlrLastLine property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public OpenlrLastLocationReferencePoint getOpenlrLastLine() {
        return openlrLastLine;
    }

    /**
     * Sets the value of the openlrLastLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public void setOpenlrLastLine(OpenlrLastLocationReferencePoint value) {
        this.openlrLastLine = value;
    }

    /**
     * Gets the value of the openlrClosedLineLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrClosedLineLocationReferenceExtension() {
        return openlrClosedLineLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrClosedLineLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrClosedLineLocationReferenceExtension(ExtensionType value) {
        this.openlrClosedLineLocationReferenceExtension = value;
    }

}
