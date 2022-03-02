
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegJunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegJunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/&gt;
 *         &lt;element name="name" type="{http://datex2.eu/schema/2/2_0}TpegJunctionPointDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="ilc" type="{http://datex2.eu/schema/2/2_0}TpegIlcPointDescriptor" maxOccurs="3"/&gt;
 *         &lt;element name="otherName" type="{http://datex2.eu/schema/2/2_0}TpegOtherPointDescriptor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tpegJunctionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunction", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pointCoordinates",
    "name",
    "ilc",
    "otherName",
    "tpegJunctionExtension"
})
public class TpegJunction
    extends TpegPoint
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TpegJunctionPointDescriptor name;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected List<TpegIlcPointDescriptor> ilc;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<TpegOtherPointDescriptor> otherName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegJunctionExtension;

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
     * @return
     *     possible object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public TpegJunctionPointDescriptor getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegJunctionPointDescriptor }
     *     
     */
    public void setName(TpegJunctionPointDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the ilc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ilc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegIlcPointDescriptor }
     * 
     * 
     */
    public List<TpegIlcPointDescriptor> getIlc() {
        if (ilc == null) {
            ilc = new ArrayList<TpegIlcPointDescriptor>();
        }
        return this.ilc;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TpegOtherPointDescriptor }
     * 
     * 
     */
    public List<TpegOtherPointDescriptor> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<TpegOtherPointDescriptor>();
        }
        return this.otherName;
    }

    /**
     * Gets the value of the tpegJunctionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionExtension() {
        return tpegJunctionExtension;
    }

    /**
     * Sets the value of the tpegJunctionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionExtension(ExtensionType value) {
        this.tpegJunctionExtension = value;
    }

}
