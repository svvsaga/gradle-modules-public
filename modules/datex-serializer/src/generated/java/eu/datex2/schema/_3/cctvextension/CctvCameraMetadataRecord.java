
package eu.datex2.schema._3.cctvextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.Source;
import eu.datex2.schema._3.locationreferencing.Location;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraMetadataRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraMetadataRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraIdentification" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="cctvCameraSerialNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraRecordVersionTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="cctvCameraSiteLocalDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraSiteNationalDescription" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraOrientationDescription" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraType" type="{http://datex2.eu/schema/3/cctvExtension}_CctvCameraTypeEnum"/&gt;
 *         &lt;element name="cctvCameraHeightAboveRoadway" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="cctvFixedCamera" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="cctvStaticCamera" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="nextCctvCamera" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="previousCctvCamera" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/3/common}Source" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraLocation" type="{http://datex2.eu/schema/3/locationReferencing}Location"/&gt;
 *         &lt;element name="cctvPotentialMonitoringLocation" type="{http://datex2.eu/schema/3/locationReferencing}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryConrolResponsibility" type="{http://datex2.eu/schema/3/cctvExtension}PrimaryConrolResponsibility" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageService" type="{http://datex2.eu/schema/3/cctvExtension}CctvStillImageService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvVideoService" type="{http://datex2.eu/schema/3/cctvExtension}CctvVideoService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraControlData" type="{http://datex2.eu/schema/3/cctvExtension}CctvCameraControlData" minOccurs="0"/&gt;
 *         &lt;element name="_cctvCameraMetadataRecordExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraMetadataRecord", propOrder = {
    "cctvCameraIdentification",
    "cctvCameraSerialNumber",
    "cctvCameraRecordVersionTime",
    "cctvCameraSiteLocalDescription",
    "cctvCameraSiteNationalDescription",
    "cctvCameraOrientationDescription",
    "cctvCameraType",
    "cctvCameraHeightAboveRoadway",
    "cctvFixedCamera",
    "cctvStaticCamera",
    "nextCctvCamera",
    "previousCctvCamera",
    "source",
    "cctvCameraLocation",
    "cctvPotentialMonitoringLocation",
    "primaryConrolResponsibility",
    "cctvStillImageService",
    "cctvVideoService",
    "cctvCameraControlData",
    "cctvCameraMetadataRecordExtension"
})
public class CctvCameraMetadataRecord {

    @XmlElement(required = true)
    protected String cctvCameraIdentification;
    protected String cctvCameraSerialNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cctvCameraRecordVersionTime;
    protected MultilingualString cctvCameraSiteLocalDescription;
    protected MultilingualString cctvCameraSiteNationalDescription;
    protected List<String> cctvCameraOrientationDescription;
    @XmlElement(required = true)
    protected CctvCameraTypeEnum cctvCameraType;
    protected Float cctvCameraHeightAboveRoadway;
    protected Boolean cctvFixedCamera;
    protected Boolean cctvStaticCamera;
    protected List<String> nextCctvCamera;
    protected List<String> previousCctvCamera;
    protected Source source;
    @XmlElement(required = true)
    protected Location cctvCameraLocation;
    protected List<Location> cctvPotentialMonitoringLocation;
    protected PrimaryConrolResponsibility primaryConrolResponsibility;
    protected List<CctvStillImageService> cctvStillImageService;
    protected List<CctvVideoService> cctvVideoService;
    protected CctvCameraControlData cctvCameraControlData;
    @XmlElement(name = "_cctvCameraMetadataRecordExtension")
    protected ExtensionType cctvCameraMetadataRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the cctvCameraIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraIdentification() {
        return cctvCameraIdentification;
    }

    /**
     * Sets the value of the cctvCameraIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraIdentification(String value) {
        this.cctvCameraIdentification = value;
    }

    /**
     * Gets the value of the cctvCameraSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraSerialNumber() {
        return cctvCameraSerialNumber;
    }

    /**
     * Sets the value of the cctvCameraSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraSerialNumber(String value) {
        this.cctvCameraSerialNumber = value;
    }

    /**
     * Gets the value of the cctvCameraRecordVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCctvCameraRecordVersionTime() {
        return cctvCameraRecordVersionTime;
    }

    /**
     * Sets the value of the cctvCameraRecordVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCctvCameraRecordVersionTime(XMLGregorianCalendar value) {
        this.cctvCameraRecordVersionTime = value;
    }

    /**
     * Gets the value of the cctvCameraSiteLocalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvCameraSiteLocalDescription() {
        return cctvCameraSiteLocalDescription;
    }

    /**
     * Sets the value of the cctvCameraSiteLocalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvCameraSiteLocalDescription(MultilingualString value) {
        this.cctvCameraSiteLocalDescription = value;
    }

    /**
     * Gets the value of the cctvCameraSiteNationalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvCameraSiteNationalDescription() {
        return cctvCameraSiteNationalDescription;
    }

    /**
     * Sets the value of the cctvCameraSiteNationalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvCameraSiteNationalDescription(MultilingualString value) {
        this.cctvCameraSiteNationalDescription = value;
    }

    /**
     * Gets the value of the cctvCameraOrientationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCameraOrientationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCameraOrientationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCctvCameraOrientationDescription() {
        if (cctvCameraOrientationDescription == null) {
            cctvCameraOrientationDescription = new ArrayList<String>();
        }
        return this.cctvCameraOrientationDescription;
    }

    /**
     * Gets the value of the cctvCameraType property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraTypeEnum }
     *     
     */
    public CctvCameraTypeEnum getCctvCameraType() {
        return cctvCameraType;
    }

    /**
     * Sets the value of the cctvCameraType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraTypeEnum }
     *     
     */
    public void setCctvCameraType(CctvCameraTypeEnum value) {
        this.cctvCameraType = value;
    }

    /**
     * Gets the value of the cctvCameraHeightAboveRoadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCctvCameraHeightAboveRoadway() {
        return cctvCameraHeightAboveRoadway;
    }

    /**
     * Sets the value of the cctvCameraHeightAboveRoadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCctvCameraHeightAboveRoadway(Float value) {
        this.cctvCameraHeightAboveRoadway = value;
    }

    /**
     * Gets the value of the cctvFixedCamera property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCctvFixedCamera() {
        return cctvFixedCamera;
    }

    /**
     * Sets the value of the cctvFixedCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCctvFixedCamera(Boolean value) {
        this.cctvFixedCamera = value;
    }

    /**
     * Gets the value of the cctvStaticCamera property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCctvStaticCamera() {
        return cctvStaticCamera;
    }

    /**
     * Sets the value of the cctvStaticCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCctvStaticCamera(Boolean value) {
        this.cctvStaticCamera = value;
    }

    /**
     * Gets the value of the nextCctvCamera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nextCctvCamera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextCctvCamera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNextCctvCamera() {
        if (nextCctvCamera == null) {
            nextCctvCamera = new ArrayList<String>();
        }
        return this.nextCctvCamera;
    }

    /**
     * Gets the value of the previousCctvCamera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the previousCctvCamera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCctvCamera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreviousCctvCamera() {
        if (previousCctvCamera == null) {
            previousCctvCamera = new ArrayList<String>();
        }
        return this.previousCctvCamera;
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
     * Gets the value of the cctvCameraLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getCctvCameraLocation() {
        return cctvCameraLocation;
    }

    /**
     * Sets the value of the cctvCameraLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setCctvCameraLocation(Location value) {
        this.cctvCameraLocation = value;
    }

    /**
     * Gets the value of the cctvPotentialMonitoringLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvPotentialMonitoringLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvPotentialMonitoringLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getCctvPotentialMonitoringLocation() {
        if (cctvPotentialMonitoringLocation == null) {
            cctvPotentialMonitoringLocation = new ArrayList<Location>();
        }
        return this.cctvPotentialMonitoringLocation;
    }

    /**
     * Gets the value of the primaryConrolResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryConrolResponsibility }
     *     
     */
    public PrimaryConrolResponsibility getPrimaryConrolResponsibility() {
        return primaryConrolResponsibility;
    }

    /**
     * Sets the value of the primaryConrolResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryConrolResponsibility }
     *     
     */
    public void setPrimaryConrolResponsibility(PrimaryConrolResponsibility value) {
        this.primaryConrolResponsibility = value;
    }

    /**
     * Gets the value of the cctvStillImageService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvStillImageService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvStillImageService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvStillImageService }
     * 
     * 
     */
    public List<CctvStillImageService> getCctvStillImageService() {
        if (cctvStillImageService == null) {
            cctvStillImageService = new ArrayList<CctvStillImageService>();
        }
        return this.cctvStillImageService;
    }

    /**
     * Gets the value of the cctvVideoService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvVideoService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvVideoService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvVideoService }
     * 
     * 
     */
    public List<CctvVideoService> getCctvVideoService() {
        if (cctvVideoService == null) {
            cctvVideoService = new ArrayList<CctvVideoService>();
        }
        return this.cctvVideoService;
    }

    /**
     * Gets the value of the cctvCameraControlData property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraControlData }
     *     
     */
    public CctvCameraControlData getCctvCameraControlData() {
        return cctvCameraControlData;
    }

    /**
     * Sets the value of the cctvCameraControlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraControlData }
     *     
     */
    public void setCctvCameraControlData(CctvCameraControlData value) {
        this.cctvCameraControlData = value;
    }

    /**
     * Gets the value of the cctvCameraMetadataRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraMetadataRecordExtension() {
        return cctvCameraMetadataRecordExtension;
    }

    /**
     * Sets the value of the cctvCameraMetadataRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraMetadataRecordExtension(ExtensionType value) {
        this.cctvCameraMetadataRecordExtension = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
