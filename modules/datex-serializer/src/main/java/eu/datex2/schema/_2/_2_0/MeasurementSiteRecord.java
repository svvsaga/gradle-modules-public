
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
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
 * <p>Java class for MeasurementSiteRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteRecordVersionTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/2/2_0}ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/2/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristics" type="{http://datex2.eu/schema/2/2_0}_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations"/&gt;
 *         &lt;element name="measurementSiteRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementSiteRecord", propOrder = {
    "measurementSiteRecordVersionTime",
    "computationMethod",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteIdentification",
    "measurementSide",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "measurementSiteRecordExtension"
})
public class MeasurementSiteRecord {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementSiteRecordVersionTime;
    @XmlSchemaType(name = "string")
    protected ComputationMethodEnum computationMethod;
    protected String measurementEquipmentReference;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected MultilingualString measurementSiteName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteIdentification;
    @XmlSchemaType(name = "string")
    protected DirectionEnum measurementSide;
    protected List<_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected GroupOfLocations measurementSiteLocation;
    protected _ExtensionType measurementSiteRecordExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the measurementSiteRecordVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementSiteRecordVersionTime() {
        return measurementSiteRecordVersionTime;
    }

    /**
     * Sets the value of the measurementSiteRecordVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementSiteRecordVersionTime(XMLGregorianCalendar value) {
        this.measurementSiteRecordVersionTime = value;
    }

    /**
     * Gets the value of the computationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Sets the value of the computationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Gets the value of the measurementEquipmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementEquipmentReference() {
        return measurementEquipmentReference;
    }

    /**
     * Sets the value of the measurementEquipmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementEquipmentReference(String value) {
        this.measurementEquipmentReference = value;
    }

    /**
     * Gets the value of the measurementEquipmentTypeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Sets the value of the measurementEquipmentTypeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Gets the value of the measurementSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementSiteName() {
        return measurementSiteName;
    }

    /**
     * Sets the value of the measurementSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementSiteName(MultilingualString value) {
        this.measurementSiteName = value;
    }

    /**
     * Gets the value of the measurementSiteNumberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteNumberOfLanes() {
        return measurementSiteNumberOfLanes;
    }

    /**
     * Sets the value of the measurementSiteNumberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteNumberOfLanes(BigInteger value) {
        this.measurementSiteNumberOfLanes = value;
    }

    /**
     * Gets the value of the measurementSiteIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteIdentification() {
        return measurementSiteIdentification;
    }

    /**
     * Sets the value of the measurementSiteIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteIdentification(String value) {
        this.measurementSiteIdentification = value;
    }

    /**
     * Gets the value of the measurementSide property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Sets the value of the measurementSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSpecificCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSpecificCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _MeasurementSiteRecordIndexMeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<_MeasurementSiteRecordIndexMeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    /**
     * Gets the value of the measurementSiteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Sets the value of the measurementSiteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setMeasurementSiteLocation(GroupOfLocations value) {
        this.measurementSiteLocation = value;
    }

    /**
     * Gets the value of the measurementSiteRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getMeasurementSiteRecordExtension() {
        return measurementSiteRecordExtension;
    }

    /**
     * Sets the value of the measurementSiteRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setMeasurementSiteRecordExtension(_ExtensionType value) {
        this.measurementSiteRecordExtension = value;
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
