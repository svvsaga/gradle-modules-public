
package eu.datex2.schema._3.informationmanagement;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationManagedResourceList" type="{http://datex2.eu/schema/3/informationManagement}InformationManagedResourceList" minOccurs="0"/&gt;
 *         &lt;element name="_informationManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationManagement", propOrder = {
    "informationManagedResourceList",
    "_InformationManagementExtension"
})
public class InformationManagement {

    protected InformationManagedResourceList informationManagedResourceList;
    @XmlElement(name = "_informationManagementExtension")
    protected _ExtensionType _InformationManagementExtension;

    /**
     * Gets the value of the informationManagedResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link InformationManagedResourceList }
     *     
     */
    public InformationManagedResourceList getInformationManagedResourceList() {
        return informationManagedResourceList;
    }

    /**
     * Sets the value of the informationManagedResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationManagedResourceList }
     *     
     */
    public void setInformationManagedResourceList(InformationManagedResourceList value) {
        this.informationManagedResourceList = value;
    }

    /**
     * Gets the value of the _InformationManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InformationManagementExtension() {
        return _InformationManagementExtension;
    }

    /**
     * Sets the value of the _InformationManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InformationManagementExtension(_ExtensionType value) {
        this._InformationManagementExtension = value;
    }

}
