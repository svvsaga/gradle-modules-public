
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.InternationalIdentifier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A Measurement Site Table comprising a number of sets of data, each describing the location
 *         from where a stream of measured data may be derived. Each location is known as a "measurement site"
 *         which can be a point, a linear road section or an area.
 *       
 * 
 * <p>Java class for MeasurementSiteTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSite" type="{http://datex2.eu/schema/3/roadTrafficData}MeasurementSite" maxOccurs="unbounded"/&gt;
 *         &lt;element name="informationManager" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_measurementSiteTableExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementSiteTable", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "measurementSiteTableIdentification",
    "measurementSite",
    "informationManager",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected String measurementSiteTableIdentification;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected List<MeasurementSite> measurementSite;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected InternationalIdentifier informationManager;
    @XmlElement(name = "_measurementSiteTableExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the measurementSiteTableIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableIdentification() {
        return measurementSiteTableIdentification;
    }

    /**
     * Sets the value of the measurementSiteTableIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableIdentification(String value) {
        this.measurementSiteTableIdentification = value;
    }

    /**
     * Gets the value of the measurementSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSite }
     * 
     * 
     */
    public List<MeasurementSite> getMeasurementSite() {
        if (measurementSite == null) {
            measurementSite = new ArrayList<MeasurementSite>();
        }
        return this.measurementSite;
    }

    /**
     * Gets the value of the informationManager property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManager() {
        return informationManager;
    }

    /**
     * Sets the value of the informationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManager(InternationalIdentifier value) {
        this.informationManager = value;
    }

    /**
     * Gets the value of the measurementSiteTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Sets the value of the measurementSiteTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
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
