
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointByCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="pointAlongLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}PointAlongLinearElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/3/locationReferencing}AlertCPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tpegPointLocation" type="{http://datex2.eu/schema/3/locationReferencing}TpegPointLocation" minOccurs="0"/&gt;
 *         &lt;element name="openlrPointLocationReference" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrPointLocationReference" minOccurs="0"/&gt;
 *         &lt;element name="_pointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointLocation", propOrder = {
    "pointByCoordinates",
    "pointAlongLinearElement",
    "alertCPoint",
    "tpegPointLocation",
    "openlrPointLocationReference",
    "pointLocationExtension"
})
public class PointLocation
    extends NetworkLocation
{

    protected PointByCoordinates pointByCoordinates;
    protected List<PointAlongLinearElement> pointAlongLinearElement;
    protected List<AlertCPoint> alertCPoint;
    protected TpegPointLocation tpegPointLocation;
    protected OpenlrPointLocationReference openlrPointLocationReference;
    @XmlElement(name = "_pointLocationExtension")
    protected ExtensionType pointLocationExtension;

    /**
     * Gets the value of the pointByCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Sets the value of the pointByCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Gets the value of the pointAlongLinearElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pointAlongLinearElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointAlongLinearElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointAlongLinearElement }
     * 
     * 
     */
    public List<PointAlongLinearElement> getPointAlongLinearElement() {
        if (pointAlongLinearElement == null) {
            pointAlongLinearElement = new ArrayList<PointAlongLinearElement>();
        }
        return this.pointAlongLinearElement;
    }

    /**
     * Gets the value of the alertCPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alertCPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCPoint }
     * 
     * 
     */
    public List<AlertCPoint> getAlertCPoint() {
        if (alertCPoint == null) {
            alertCPoint = new ArrayList<AlertCPoint>();
        }
        return this.alertCPoint;
    }

    /**
     * Gets the value of the tpegPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPointLocation }
     *     
     */
    public TpegPointLocation getTpegPointLocation() {
        return tpegPointLocation;
    }

    /**
     * Sets the value of the tpegPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPointLocation }
     *     
     */
    public void setTpegPointLocation(TpegPointLocation value) {
        this.tpegPointLocation = value;
    }

    /**
     * Gets the value of the openlrPointLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public OpenlrPointLocationReference getOpenlrPointLocationReference() {
        return openlrPointLocationReference;
    }

    /**
     * Sets the value of the openlrPointLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public void setOpenlrPointLocationReference(OpenlrPointLocationReference value) {
        this.openlrPointLocationReference = value;
    }

    /**
     * Gets the value of the pointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointLocationExtension() {
        return pointLocationExtension;
    }

    /**
     * Sets the value of the pointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointLocationExtension(ExtensionType value) {
        this.pointLocationExtension = value;
    }

}
