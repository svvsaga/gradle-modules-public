
package eu.datex2.schema._3.informationmanagement;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "InformationManagedResourceList", namespace = "http://datex2.eu/schema/3/informationManagement", propOrder = {
    "elementReference",
    "informationManagedResourceListExtension"
})
public class InformationManagedResourceList {

    @XmlElement(namespace = "http://datex2.eu/schema/3/informationManagement", required = true)
    protected List<ElementReference> elementReference;
    @XmlElement(name = "_informationManagedResourceListExtension", namespace = "http://datex2.eu/schema/3/informationManagement")
    protected ExtensionType informationManagedResourceListExtension;

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
     * Gets the value of the informationManagedResourceListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInformationManagedResourceListExtension() {
        return informationManagedResourceListExtension;
    }

    /**
     * Sets the value of the informationManagedResourceListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInformationManagedResourceListExtension(ExtensionType value) {
        this.informationManagedResourceListExtension = value;
    }

}
