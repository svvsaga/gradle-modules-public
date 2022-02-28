
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Management complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Management"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lifeCycleManagement" type="{http://datex2.eu/schema/2/2_0}LifeCycleManagement" minOccurs="0"/&gt;
 *         &lt;element name="filterExitManagement" type="{http://datex2.eu/schema/2/2_0}FilterExitManagement" minOccurs="0"/&gt;
 *         &lt;element name="managementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", propOrder = {
    "lifeCycleManagement",
    "filterExitManagement",
    "managementExtension"
})
public class Management {

    protected LifeCycleManagement lifeCycleManagement;
    protected FilterExitManagement filterExitManagement;
    protected _ExtensionType managementExtension;

    /**
     * Gets the value of the lifeCycleManagement property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleManagement }
     *     
     */
    public LifeCycleManagement getLifeCycleManagement() {
        return lifeCycleManagement;
    }

    /**
     * Sets the value of the lifeCycleManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleManagement }
     *     
     */
    public void setLifeCycleManagement(LifeCycleManagement value) {
        this.lifeCycleManagement = value;
    }

    /**
     * Gets the value of the filterExitManagement property.
     * 
     * @return
     *     possible object is
     *     {@link FilterExitManagement }
     *     
     */
    public FilterExitManagement getFilterExitManagement() {
        return filterExitManagement;
    }

    /**
     * Sets the value of the filterExitManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExitManagement }
     *     
     */
    public void setFilterExitManagement(FilterExitManagement value) {
        this.filterExitManagement = value;
    }

    /**
     * Gets the value of the managementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getManagementExtension() {
        return managementExtension;
    }

    /**
     * Sets the value of the managementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setManagementExtension(_ExtensionType value) {
        this.managementExtension = value;
    }

}
