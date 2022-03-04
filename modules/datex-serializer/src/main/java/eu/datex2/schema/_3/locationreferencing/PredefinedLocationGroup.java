
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedLocationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}PredefinedLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationGroupName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="locationGroup" type="{http://datex2.eu/schema/3/locationReferencing}LocationGroup" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/3/locationReferencing}PredefinedLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_predefinedLocationGroupExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationGroup", propOrder = {
    "predefinedLocationGroupName",
    "locationGroup",
    "predefinedLocation",
    "predefinedLocationGroupExtension"
})
public class PredefinedLocationGroup
    extends PredefinedLocationReference
{

    protected MultilingualString predefinedLocationGroupName;
    protected LocationGroup locationGroup;
    protected List<PredefinedLocation> predefinedLocation;
    @XmlElement(name = "_predefinedLocationGroupExtension")
    protected ExtensionType predefinedLocationGroupExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the predefinedLocationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedLocationGroupName() {
        return predefinedLocationGroupName;
    }

    /**
     * Sets the value of the predefinedLocationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedLocationGroupName(MultilingualString value) {
        this.predefinedLocationGroupName = value;
    }

    /**
     * Gets the value of the locationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LocationGroup }
     *     
     */
    public LocationGroup getLocationGroup() {
        return locationGroup;
    }

    /**
     * Sets the value of the locationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationGroup }
     *     
     */
    public void setLocationGroup(LocationGroup value) {
        this.locationGroup = value;
    }

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocation }
     * 
     * 
     */
    public List<PredefinedLocation> getPredefinedLocation() {
        if (predefinedLocation == null) {
            predefinedLocation = new ArrayList<PredefinedLocation>();
        }
        return this.predefinedLocation;
    }

    /**
     * Gets the value of the predefinedLocationGroupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationGroupExtension() {
        return predefinedLocationGroupExtension;
    }

    /**
     * Sets the value of the predefinedLocationGroupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationGroupExtension(ExtensionType value) {
        this.predefinedLocationGroupExtension = value;
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
