
package eu.datex2.schema._3.cctvextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraListName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraListVersionTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="areaToWhichCameraListRelates" type="{http://datex2.eu/schema/3/cctvExtension}CctvGeographicArea" minOccurs="0"/&gt;
 *         &lt;element name="cctvCameraMetadataRecord" type="{http://datex2.eu/schema/3/cctvExtension}CctvCameraMetadataRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_cctvCameraListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "CctvCameraList", propOrder = {
    "cctvCameraListName",
    "cctvCameraListVersionTime",
    "areaToWhichCameraListRelates",
    "cctvCameraMetadataRecord",
    "_CctvCameraListExtension"
})
public class CctvCameraList {

    protected MultilingualString cctvCameraListName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cctvCameraListVersionTime;
    protected CctvGeographicArea areaToWhichCameraListRelates;
    protected List<CctvCameraMetadataRecord> cctvCameraMetadataRecord;
    @XmlElement(name = "_cctvCameraListExtension")
    protected _ExtensionType _CctvCameraListExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the cctvCameraListName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvCameraListName() {
        return cctvCameraListName;
    }

    /**
     * Sets the value of the cctvCameraListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvCameraListName(MultilingualString value) {
        this.cctvCameraListName = value;
    }

    /**
     * Gets the value of the cctvCameraListVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCctvCameraListVersionTime() {
        return cctvCameraListVersionTime;
    }

    /**
     * Sets the value of the cctvCameraListVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCctvCameraListVersionTime(XMLGregorianCalendar value) {
        this.cctvCameraListVersionTime = value;
    }

    /**
     * Gets the value of the areaToWhichCameraListRelates property.
     * 
     * @return
     *     possible object is
     *     {@link CctvGeographicArea }
     *     
     */
    public CctvGeographicArea getAreaToWhichCameraListRelates() {
        return areaToWhichCameraListRelates;
    }

    /**
     * Sets the value of the areaToWhichCameraListRelates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvGeographicArea }
     *     
     */
    public void setAreaToWhichCameraListRelates(CctvGeographicArea value) {
        this.areaToWhichCameraListRelates = value;
    }

    /**
     * Gets the value of the cctvCameraMetadataRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCameraMetadataRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCameraMetadataRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvCameraMetadataRecord }
     * 
     * 
     */
    public List<CctvCameraMetadataRecord> getCctvCameraMetadataRecord() {
        if (cctvCameraMetadataRecord == null) {
            cctvCameraMetadataRecord = new ArrayList<CctvCameraMetadataRecord>();
        }
        return this.cctvCameraMetadataRecord;
    }

    /**
     * Gets the value of the _CctvCameraListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvCameraListExtension() {
        return _CctvCameraListExtension;
    }

    /**
     * Sets the value of the _CctvCameraListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvCameraListExtension(_ExtensionType value) {
        this._CctvCameraListExtension = value;
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
