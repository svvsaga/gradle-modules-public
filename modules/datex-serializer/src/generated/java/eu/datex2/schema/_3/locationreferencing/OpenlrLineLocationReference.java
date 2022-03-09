
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrLineLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLineLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLocationReferencePoint" maxOccurs="unbounded"/&gt;
 *         &lt;element name="openlrLastLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLastLocationReferencePoint"/&gt;
 *         &lt;element name="openlrOffsets" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrOffsets" minOccurs="0"/&gt;
 *         &lt;element name="_openlrLineLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineLocationReference", propOrder = {
    "openlrLocationReferencePoint",
    "openlrLastLocationReferencePoint",
    "openlrOffsets",
    "_OpenlrLineLocationReferenceExtension"
})
public class OpenlrLineLocationReference {

    @XmlElement(required = true)
    protected List<OpenlrLocationReferencePoint> openlrLocationReferencePoint;
    @XmlElement(required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLocationReferencePoint;
    protected OpenlrOffsets openlrOffsets;
    @XmlElement(name = "_openlrLineLocationReferenceExtension")
    protected _ExtensionType _OpenlrLineLocationReferenceExtension;

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
     * Gets the value of the openlrLastLocationReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public OpenlrLastLocationReferencePoint getOpenlrLastLocationReferencePoint() {
        return openlrLastLocationReferencePoint;
    }

    /**
     * Sets the value of the openlrLastLocationReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public void setOpenlrLastLocationReferencePoint(OpenlrLastLocationReferencePoint value) {
        this.openlrLastLocationReferencePoint = value;
    }

    /**
     * Gets the value of the openlrOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrOffsets }
     *     
     */
    public OpenlrOffsets getOpenlrOffsets() {
        return openlrOffsets;
    }

    /**
     * Sets the value of the openlrOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrOffsets }
     *     
     */
    public void setOpenlrOffsets(OpenlrOffsets value) {
        this.openlrOffsets = value;
    }

    /**
     * Gets the value of the _OpenlrLineLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLineLocationReferenceExtension() {
        return _OpenlrLineLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrLineLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLineLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrLineLocationReferenceExtension = value;
    }

}
