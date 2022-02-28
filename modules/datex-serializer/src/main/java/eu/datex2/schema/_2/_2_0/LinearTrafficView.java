
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearTrafficView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearTrafficView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linearPredefinedLocationReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedLocationVersionedReference"/&gt;
 *         &lt;element name="trafficViewRecord" type="{http://datex2.eu/schema/2/2_0}TrafficViewRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="linearTrafficViewExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearTrafficView", propOrder = {
    "linearPredefinedLocationReference",
    "trafficViewRecord",
    "linearTrafficViewExtension"
})
public class LinearTrafficView {

    @XmlElement(required = true)
    protected _PredefinedLocationVersionedReference linearPredefinedLocationReference;
    @XmlElement(required = true)
    protected List<TrafficViewRecord> trafficViewRecord;
    protected _ExtensionType linearTrafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the linearPredefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedLocationVersionedReference }
     *     
     */
    public _PredefinedLocationVersionedReference getLinearPredefinedLocationReference() {
        return linearPredefinedLocationReference;
    }

    /**
     * Sets the value of the linearPredefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedLocationVersionedReference }
     *     
     */
    public void setLinearPredefinedLocationReference(_PredefinedLocationVersionedReference value) {
        this.linearPredefinedLocationReference = value;
    }

    /**
     * Gets the value of the trafficViewRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trafficViewRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficViewRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficViewRecord }
     * 
     * 
     */
    public List<TrafficViewRecord> getTrafficViewRecord() {
        if (trafficViewRecord == null) {
            trafficViewRecord = new ArrayList<TrafficViewRecord>();
        }
        return this.trafficViewRecord;
    }

    /**
     * Gets the value of the linearTrafficViewExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getLinearTrafficViewExtension() {
        return linearTrafficViewExtension;
    }

    /**
     * Sets the value of the linearTrafficViewExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setLinearTrafficViewExtension(_ExtensionType value) {
        this.linearTrafficViewExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
