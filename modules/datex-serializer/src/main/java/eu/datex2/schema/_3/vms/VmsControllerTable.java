
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A versioned VMS controller unit table comprising a number of data records, each record
 *         defining the characteristics of a specific deployed variable message sign controller unit.
 *       
 * 
 * <p>Java class for VmsControllerTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsControllerTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsControllerTableIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="informationManager" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="vmsController" type="{http://datex2.eu/schema/3/vms}VmsController" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_vmsControllerTableExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
@XmlType(name = "VmsControllerTable", propOrder = {
    "vmsControllerTableIdentification",
    "informationManager",
    "vmsController",
    "_VmsControllerTableExtension"
})
public class VmsControllerTable {

    protected String vmsControllerTableIdentification;
    protected InternationalIdentifier informationManager;
    @XmlElement(required = true)
    protected List<VmsController> vmsController;
    @XmlElement(name = "_vmsControllerTableExtension")
    protected _ExtensionType _VmsControllerTableExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the vmsControllerTableIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsControllerTableIdentification() {
        return vmsControllerTableIdentification;
    }

    /**
     * Sets the value of the vmsControllerTableIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsControllerTableIdentification(String value) {
        this.vmsControllerTableIdentification = value;
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
     * Gets the value of the vmsController property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vmsController property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsController().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsController }
     * 
     * 
     */
    public List<VmsController> getVmsController() {
        if (vmsController == null) {
            vmsController = new ArrayList<VmsController>();
        }
        return this.vmsController;
    }

    /**
     * Gets the value of the _VmsControllerTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsControllerTableExtension() {
        return _VmsControllerTableExtension;
    }

    /**
     * Sets the value of the _VmsControllerTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsControllerTableExtension(_ExtensionType value) {
        this._VmsControllerTableExtension = value;
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
