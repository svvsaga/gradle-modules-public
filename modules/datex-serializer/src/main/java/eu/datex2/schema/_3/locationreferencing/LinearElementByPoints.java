
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A linear element along a single linear object defined by its start and end points.
 *       
 * 
 * <p>Java class for LinearElementByPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByPoints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startPointOfLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}Referent"/&gt;
 *         &lt;element name="intermediatePointOnLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}_IntermediatePointOnLinearElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endPointOfLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}Referent"/&gt;
 *         &lt;element name="_linearElementByPointsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByPoints", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "startPointOfLinearElement",
    "intermediatePointOnLinearElement",
    "endPointOfLinearElement",
    "linearElementByPointsExtension"
})
public class LinearElementByPoints
    extends LinearElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected Referent startPointOfLinearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<IntermediatePointOnLinearElement> intermediatePointOnLinearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected Referent endPointOfLinearElement;
    @XmlElement(name = "_linearElementByPointsExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType linearElementByPointsExtension;

    /**
     * Gets the value of the startPointOfLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link Referent }
     *     
     */
    public Referent getStartPointOfLinearElement() {
        return startPointOfLinearElement;
    }

    /**
     * Sets the value of the startPointOfLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referent }
     *     
     */
    public void setStartPointOfLinearElement(Referent value) {
        this.startPointOfLinearElement = value;
    }

    /**
     * Gets the value of the intermediatePointOnLinearElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the intermediatePointOnLinearElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermediatePointOnLinearElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermediatePointOnLinearElement }
     * 
     * 
     */
    public List<IntermediatePointOnLinearElement> getIntermediatePointOnLinearElement() {
        if (intermediatePointOnLinearElement == null) {
            intermediatePointOnLinearElement = new ArrayList<IntermediatePointOnLinearElement>();
        }
        return this.intermediatePointOnLinearElement;
    }

    /**
     * Gets the value of the endPointOfLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link Referent }
     *     
     */
    public Referent getEndPointOfLinearElement() {
        return endPointOfLinearElement;
    }

    /**
     * Sets the value of the endPointOfLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referent }
     *     
     */
    public void setEndPointOfLinearElement(Referent value) {
        this.endPointOfLinearElement = value;
    }

    /**
     * Gets the value of the linearElementByPointsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearElementByPointsExtension() {
        return linearElementByPointsExtension;
    }

    /**
     * Sets the value of the linearElementByPointsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearElementByPointsExtension(ExtensionType value) {
        this.linearElementByPointsExtension = value;
    }

}
