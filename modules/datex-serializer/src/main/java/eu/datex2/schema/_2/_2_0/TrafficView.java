
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficViewTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference"/&gt;
 *         &lt;element name="linearTrafficView" type="{http://datex2.eu/schema/2/2_0}LinearTrafficView" maxOccurs="unbounded"/&gt;
 *         &lt;element name="trafficViewExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "TrafficView", propOrder = {
    "trafficViewTime",
    "predefinedNonOrderedLocationGroupReference",
    "linearTrafficView",
    "trafficViewExtension"
})
public class TrafficView {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trafficViewTime;
    @XmlElement(required = true)
    protected _PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    @XmlElement(required = true)
    protected List<LinearTrafficView> linearTrafficView;
    protected _ExtensionType trafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the trafficViewTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrafficViewTime() {
        return trafficViewTime;
    }

    /**
     * Sets the value of the trafficViewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrafficViewTime(XMLGregorianCalendar value) {
        this.trafficViewTime = value;
    }

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(_PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
    }

    /**
     * Gets the value of the linearTrafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the linearTrafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearTrafficView }
     * 
     * 
     */
    public List<LinearTrafficView> getLinearTrafficView() {
        if (linearTrafficView == null) {
            linearTrafficView = new ArrayList<LinearTrafficView>();
        }
        return this.linearTrafficView;
    }

    /**
     * Gets the value of the trafficViewExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getTrafficViewExtension() {
        return trafficViewExtension;
    }

    /**
     * Sets the value of the trafficViewExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setTrafficViewExtension(_ExtensionType value) {
        this.trafficViewExtension = value;
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
