
package eu.datex2.schema._3.informationmanagement;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationManagedResourceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationManagedResourceList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementReference" type="{http://datex2.eu/schema/3/informationManagement}ElementReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_informationManagedResourceListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationManagedResourceList", propOrder = {
    "elementReference",
    "_InformationManagedResourceListExtension"
})
public class InformationManagedResourceList {

    @XmlElement(required = true)
    protected List<ElementReference> elementReference;
    @XmlElement(name = "_informationManagedResourceListExtension")
    protected _ExtensionType _InformationManagedResourceListExtension;

    /**
     * Gets the value of the elementReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the elementReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementReference }
     * 
     * 
     */
    public List<ElementReference> getElementReference() {
        if (elementReference == null) {
            elementReference = new ArrayList<ElementReference>();
        }
        return this.elementReference;
    }

    /**
     * Gets the value of the _InformationManagedResourceListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InformationManagedResourceListExtension() {
        return _InformationManagedResourceListExtension;
    }

    /**
     * Sets the value of the _InformationManagedResourceListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InformationManagedResourceListExtension(_ExtensionType value) {
        this._InformationManagedResourceListExtension = value;
    }

}
