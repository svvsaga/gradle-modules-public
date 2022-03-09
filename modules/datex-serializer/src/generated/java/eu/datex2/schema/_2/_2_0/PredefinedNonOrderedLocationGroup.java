
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedNonOrderedLocationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedNonOrderedLocationGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PredefinedLocationContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedNonOrderedLocationGroupName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2/2_0}PredefinedLocation" maxOccurs="unbounded"/&gt;
 *         &lt;element name="predefinedNonOrderedLocationGroupExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "PredefinedNonOrderedLocationGroup", propOrder = {
    "predefinedNonOrderedLocationGroupName",
    "predefinedLocation",
    "predefinedNonOrderedLocationGroupExtension"
})
public class PredefinedNonOrderedLocationGroup
    extends PredefinedLocationContainer
{

    protected MultilingualString predefinedNonOrderedLocationGroupName;
    @XmlElement(required = true)
    protected List<PredefinedLocation> predefinedLocation;
    protected _ExtensionType predefinedNonOrderedLocationGroupExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedNonOrderedLocationGroupName() {
        return predefinedNonOrderedLocationGroupName;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupName(MultilingualString value) {
        this.predefinedNonOrderedLocationGroupName = value;
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
     * Gets the value of the predefinedNonOrderedLocationGroupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPredefinedNonOrderedLocationGroupExtension() {
        return predefinedNonOrderedLocationGroupExtension;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupExtension(_ExtensionType value) {
        this.predefinedNonOrderedLocationGroupExtension = value;
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
