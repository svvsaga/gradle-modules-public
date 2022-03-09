
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfDisplayAreas" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="displayArea" type="{http://datex2.eu/schema/3/vms}_VmsConfigurationDisplayAreaIndexDisplayArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_vmsConfigurationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsConfiguration", propOrder = {
    "numberOfDisplayAreas",
    "displayArea",
    "_VmsConfigurationExtension"
})
public class VmsConfiguration {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDisplayAreas;
    protected List<_VmsConfigurationDisplayAreaIndexDisplayArea> displayArea;
    @XmlElement(name = "_vmsConfigurationExtension")
    protected _ExtensionType _VmsConfigurationExtension;

    /**
     * Gets the value of the numberOfDisplayAreas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDisplayAreas() {
        return numberOfDisplayAreas;
    }

    /**
     * Sets the value of the numberOfDisplayAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDisplayAreas(BigInteger value) {
        this.numberOfDisplayAreas = value;
    }

    /**
     * Gets the value of the displayArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the displayArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _VmsConfigurationDisplayAreaIndexDisplayArea }
     * 
     * 
     */
    public List<_VmsConfigurationDisplayAreaIndexDisplayArea> getDisplayArea() {
        if (displayArea == null) {
            displayArea = new ArrayList<_VmsConfigurationDisplayAreaIndexDisplayArea>();
        }
        return this.displayArea;
    }

    /**
     * Gets the value of the _VmsConfigurationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VmsConfigurationExtension() {
        return _VmsConfigurationExtension;
    }

    /**
     * Sets the value of the _VmsConfigurationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VmsConfigurationExtension(_ExtensionType value) {
        this._VmsConfigurationExtension = value;
    }

}
