
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrClosedLineLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrClosedLineLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/2/2_0}OpenlrLocationReferencePoint" maxOccurs="unbounded"/&gt;
 *         &lt;element name="openlrLastLine" type="{http://datex2.eu/schema/2/2_0}OpenlrLineAttributes"/&gt;
 *         &lt;element name="openlrClosedLineLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrClosedLineLocationReference", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrLocationReferencePoint",
    "openlrLastLine",
    "openlrClosedLineLocationReferenceExtension"
})
public class OpenlrClosedLineLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<OpenlrLocationReferencePoint> openlrLocationReferencePoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrLineAttributes openlrLastLine;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
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
     *     {@link OpenlrLineAttributes }
     *     
     */
    public OpenlrLineAttributes getOpenlrLastLine() {
        return openlrLastLine;
    }

    /**
     * Sets the value of the openlrLastLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineAttributes }
     *     
     */
    public void setOpenlrLastLine(OpenlrLineAttributes value) {
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
