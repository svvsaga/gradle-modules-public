
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Location representing a linear section along a single road with optional directionality
 *         defined between two points on the same road. No matter the kind of linear reference it uses, the
 *         constraint of using only a single road must be preserved.
 *       
 * 
 * <p>Java class for SingleRoadLinearLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleRoadLinearLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LinearLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/3/locationReferencing}TpegLinearLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLinear" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="linearWithinLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}LinearWithinLinearElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_singleRoadLinearLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleRoadLinearLocation", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "linearWithinLinearElement",
    "singleRoadLinearLocationExtension"
})
public class SingleRoadLinearLocation
    extends LinearLocation
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected TpegLinearLocation tpegLinearLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<AlertCLinear> alertCLinear;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected List<LinearWithinLinearElement> linearWithinLinearElement;
    @XmlElement(name = "_singleRoadLinearLocationExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType singleRoadLinearLocationExtension;

    /**
     * Gets the value of the tpegLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Sets the value of the tpegLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alertCLinear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCLinear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCLinear }
     * 
     * 
     */
    public List<AlertCLinear> getAlertCLinear() {
        if (alertCLinear == null) {
            alertCLinear = new ArrayList<AlertCLinear>();
        }
        return this.alertCLinear;
    }

    /**
     * Gets the value of the linearWithinLinearElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the linearWithinLinearElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearWithinLinearElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearWithinLinearElement }
     * 
     * 
     */
    public List<LinearWithinLinearElement> getLinearWithinLinearElement() {
        if (linearWithinLinearElement == null) {
            linearWithinLinearElement = new ArrayList<LinearWithinLinearElement>();
        }
        return this.linearWithinLinearElement;
    }

    /**
     * Gets the value of the singleRoadLinearLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSingleRoadLinearLocationExtension() {
        return singleRoadLinearLocationExtension;
    }

    /**
     * Sets the value of the singleRoadLinearLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSingleRoadLinearLocationExtension(ExtensionType value) {
        this.singleRoadLinearLocationExtension = value;
    }

}
