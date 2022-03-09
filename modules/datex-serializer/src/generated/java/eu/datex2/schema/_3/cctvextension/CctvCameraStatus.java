
package eu.datex2.schema._3.cctvextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.Source;
import eu.datex2.schema._3.common._DirectionCompassEnum;
import eu.datex2.schema._3.common._ExtensionType;
import eu.datex2.schema._3.locationreferencing.Location;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraReference" type="{http://datex2.eu/schema/3/cctvExtension}_CctvCameraMetadataRecordVersionedReference"/&gt;
 *         &lt;element name="cctvCameraStatusTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="cctvCameraOrientationBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraOrientationCompass" type="{http://datex2.eu/schema/3/common}_DirectionCompassEnum" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/3/common}Source" minOccurs="0"/&gt;
 *         &lt;element name="cctvCurrentlyMonitoredLocation" type="{http://datex2.eu/schema/3/locationReferencing}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageServiceStatus" type="{http://datex2.eu/schema/3/cctvExtension}CctvStillImageServiceStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoServiceStatus" type="{http://datex2.eu/schema/3/cctvExtension}CctvVideoServiceStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraControlStatus" type="{http://datex2.eu/schema/3/cctvExtension}CctvCameraControlStatus" minOccurs="0"/&gt;
 *         &lt;element name="_cctvCameraStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraStatus", propOrder = {
    "cctvCameraReference",
    "cctvCameraStatusTime",
    "cctvCameraOrientationBearing",
    "cctvCameraOrientationCompass",
    "source",
    "cctvCurrentlyMonitoredLocation",
    "cctvStillImageServiceStatus",
    "cctvVideoServiceStatus",
    "cctvCameraControlStatus",
    "_CctvCameraStatusExtension"
})
public class CctvCameraStatus {

    @XmlElement(required = true)
    protected _CctvCameraMetadataRecordVersionedReference cctvCameraReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cctvCameraStatusTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer cctvCameraOrientationBearing;
    protected _DirectionCompassEnum cctvCameraOrientationCompass;
    protected Source source;
    protected List<Location> cctvCurrentlyMonitoredLocation;
    protected List<CctvStillImageServiceStatus> cctvStillImageServiceStatus;
    protected List<CctvVideoServiceStatus> cctvVideoServiceStatus;
    protected CctvCameraControlStatus cctvCameraControlStatus;
    @XmlElement(name = "_cctvCameraStatusExtension")
    protected _ExtensionType _CctvCameraStatusExtension;

    /**
     * Gets the value of the cctvCameraReference property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvCameraMetadataRecordVersionedReference }
     *     
     */
    public _CctvCameraMetadataRecordVersionedReference getCctvCameraReference() {
        return cctvCameraReference;
    }

    /**
     * Sets the value of the cctvCameraReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvCameraMetadataRecordVersionedReference }
     *     
     */
    public void setCctvCameraReference(_CctvCameraMetadataRecordVersionedReference value) {
        this.cctvCameraReference = value;
    }

    /**
     * Gets the value of the cctvCameraStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCctvCameraStatusTime() {
        return cctvCameraStatusTime;
    }

    /**
     * Sets the value of the cctvCameraStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCctvCameraStatusTime(XMLGregorianCalendar value) {
        this.cctvCameraStatusTime = value;
    }

    /**
     * Gets the value of the cctvCameraOrientationBearing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraOrientationBearing() {
        return cctvCameraOrientationBearing;
    }

    /**
     * Sets the value of the cctvCameraOrientationBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraOrientationBearing(Integer value) {
        this.cctvCameraOrientationBearing = value;
    }

    /**
     * Gets the value of the cctvCameraOrientationCompass property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public _DirectionCompassEnum getCctvCameraOrientationCompass() {
        return cctvCameraOrientationCompass;
    }

    /**
     * Sets the value of the cctvCameraOrientationCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public void setCctvCameraOrientationCompass(_DirectionCompassEnum value) {
        this.cctvCameraOrientationCompass = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the cctvCurrentlyMonitoredLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCurrentlyMonitoredLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCurrentlyMonitoredLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getCctvCurrentlyMonitoredLocation() {
        if (cctvCurrentlyMonitoredLocation == null) {
            cctvCurrentlyMonitoredLocation = new ArrayList<Location>();
        }
        return this.cctvCurrentlyMonitoredLocation;
    }

    /**
     * Gets the value of the cctvStillImageServiceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvStillImageServiceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvStillImageServiceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvStillImageServiceStatus }
     * 
     * 
     */
    public List<CctvStillImageServiceStatus> getCctvStillImageServiceStatus() {
        if (cctvStillImageServiceStatus == null) {
            cctvStillImageServiceStatus = new ArrayList<CctvStillImageServiceStatus>();
        }
        return this.cctvStillImageServiceStatus;
    }

    /**
     * Gets the value of the cctvVideoServiceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvVideoServiceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvVideoServiceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvVideoServiceStatus }
     * 
     * 
     */
    public List<CctvVideoServiceStatus> getCctvVideoServiceStatus() {
        if (cctvVideoServiceStatus == null) {
            cctvVideoServiceStatus = new ArrayList<CctvVideoServiceStatus>();
        }
        return this.cctvVideoServiceStatus;
    }

    /**
     * Gets the value of the cctvCameraControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraControlStatus }
     *     
     */
    public CctvCameraControlStatus getCctvCameraControlStatus() {
        return cctvCameraControlStatus;
    }

    /**
     * Sets the value of the cctvCameraControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraControlStatus }
     *     
     */
    public void setCctvCameraControlStatus(CctvCameraControlStatus value) {
        this.cctvCameraControlStatus = value;
    }

    /**
     * Gets the value of the _CctvCameraStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvCameraStatusExtension() {
        return _CctvCameraStatusExtension;
    }

    /**
     * Sets the value of the _CctvCameraStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvCameraStatusExtension(_ExtensionType value) {
        this._CctvCameraStatusExtension = value;
    }

}
