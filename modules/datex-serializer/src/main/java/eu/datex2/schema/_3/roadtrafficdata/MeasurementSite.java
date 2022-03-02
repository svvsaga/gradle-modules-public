
package eu.datex2.schema._3.roadtrafficdata;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.locationreferencing.LocationReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An identifiable single measurement site entry/record in the measurement site table.
 *       
 * 
 * <p>Java class for MeasurementSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteRecordVersionTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristics" type="{http://datex2.eu/schema/3/roadTrafficData}_MeasurementSiteIndexMeasurementSpecificCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/3/locationReferencing}LocationReference"/&gt;
 *         &lt;element name="informationManagerOverride" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_measurementSiteExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementSite", propOrder = {
    "measurementSiteRecordVersionTime",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteIdentification",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "informationManagerOverride",
    "measurementSiteExtension"
})
public class MeasurementSite {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementSiteRecordVersionTime;
    protected String measurementEquipmentReference;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected MultilingualString measurementSiteName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteIdentification;
    protected List<MeasurementSiteIndexMeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected LocationReference measurementSiteLocation;
    protected InternationalIdentifier informationManagerOverride;
    @XmlElement(name = "_measurementSiteExtension")
    protected ExtensionType measurementSiteExtension;
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
     * {@link MeasurementSiteIndexMeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<MeasurementSiteIndexMeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<MeasurementSiteIndexMeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    /**
     * Gets the value of the measurementSiteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Sets the value of the measurementSiteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setMeasurementSiteLocation(LocationReference value) {
        this.measurementSiteLocation = value;
    }

    /**
     * Gets the value of the informationManagerOverride property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManagerOverride() {
        return informationManagerOverride;
    }

    /**
     * Sets the value of the informationManagerOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManagerOverride(InternationalIdentifier value) {
        this.informationManagerOverride = value;
    }

    /**
     * Gets the value of the measurementSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteExtension() {
        return measurementSiteExtension;
    }

    /**
     * Sets the value of the measurementSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteExtension(ExtensionType value) {
        this.measurementSiteExtension = value;
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
