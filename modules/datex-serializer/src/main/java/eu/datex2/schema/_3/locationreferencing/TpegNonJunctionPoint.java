
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is not a road junction point.
 * 
 * <p>Java class for TpegNonJunctionPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegNonJunctionPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/3/locationReferencing}TpegOtherPointDescriptor" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_tpegNonJunctionPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNonJunctionPoint", propOrder = {
    "pointCoordinates",
    "name",
    "tpegNonJunctionPointExtension"
})
public class TpegNonJunctionPoint
    extends TpegPoint
{

    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(required = true)
    protected List<TpegOtherPointDescriptor> name;
    @XmlElement(name = "_tpegNonJunctionPointExtension")
    protected ExtensionType tpegNonJunctionPointExtension;

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegOtherPointDescriptor }
     * 
     * 
     */
    public List<TpegOtherPointDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TpegOtherPointDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegNonJunctionPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegNonJunctionPointExtension() {
        return tpegNonJunctionPointExtension;
    }

    /**
     * Sets the value of the tpegNonJunctionPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegNonJunctionPointExtension(ExtensionType value) {
        this.tpegNonJunctionPointExtension = value;
    }

}
