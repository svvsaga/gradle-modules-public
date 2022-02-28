
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElementByPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByPoints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}LinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startPointOfLinearElement" type="{http://datex2.eu/schema/2/2_0}Referent"/&gt;
 *         &lt;element name="intermediatePointOnLinearElement" type="{http://datex2.eu/schema/2/2_0}_IntermediatePointOnLinearElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endPointOfLinearElement" type="{http://datex2.eu/schema/2/2_0}Referent"/&gt;
 *         &lt;element name="linearElementByPointsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByPoints", propOrder = {
    "startPointOfLinearElement",
    "intermediatePointOnLinearElement",
    "endPointOfLinearElement",
    "linearElementByPointsExtension"
})
public class LinearElementByPoints
    extends LinearElement
{

    @XmlElement(required = true)
    protected Referent startPointOfLinearElement;
    protected List<_IntermediatePointOnLinearElement> intermediatePointOnLinearElement;
    @XmlElement(required = true)
    protected Referent endPointOfLinearElement;
    protected _ExtensionType linearElementByPointsExtension;

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
     * {@link _IntermediatePointOnLinearElement }
     * 
     * 
     */
    public List<_IntermediatePointOnLinearElement> getIntermediatePointOnLinearElement() {
        if (intermediatePointOnLinearElement == null) {
            intermediatePointOnLinearElement = new ArrayList<_IntermediatePointOnLinearElement>();
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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getLinearElementByPointsExtension() {
        return linearElementByPointsExtension;
    }

    /**
     * Sets the value of the linearElementByPointsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setLinearElementByPointsExtension(_ExtensionType value) {
        this.linearElementByPointsExtension = value;
    }

}
