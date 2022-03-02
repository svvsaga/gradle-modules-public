
package eu.datex2.schema._3.informationmanagement;

import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "InformationManagement", namespace = "http://datex2.eu/schema/3/informationManagement", propOrder = {
    "informationManagedResourceList",
    "informationManagementExtension"
})
public class InformationManagement {

    @XmlElement(namespace = "http://datex2.eu/schema/3/informationManagement")
    protected InformationManagedResourceList informationManagedResourceList;
    @XmlElement(name = "_informationManagementExtension", namespace = "http://datex2.eu/schema/3/informationManagement")
    protected ExtensionType informationManagementExtension;

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
     * Gets the value of the informationManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInformationManagementExtension() {
        return informationManagementExtension;
    }

    /**
     * Sets the value of the informationManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInformationManagementExtension(ExtensionType value) {
        this.informationManagementExtension = value;
    }

}
