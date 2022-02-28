
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterExitManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterExitManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterEnd" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="filterOutOfRange" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="filterExitManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExitManagement", propOrder = {
    "filterEnd",
    "filterOutOfRange",
    "filterExitManagementExtension"
})
public class FilterExitManagement {

    protected boolean filterEnd;
    protected boolean filterOutOfRange;
    protected _ExtensionType filterExitManagementExtension;

    /**
     * Gets the value of the filterEnd property.
     * 
     */
    public boolean isFilterEnd() {
        return filterEnd;
    }

    /**
     * Sets the value of the filterEnd property.
     * 
     */
    public void setFilterEnd(boolean value) {
        this.filterEnd = value;
    }

    /**
     * Gets the value of the filterOutOfRange property.
     * 
     */
    public boolean isFilterOutOfRange() {
        return filterOutOfRange;
    }

    /**
     * Sets the value of the filterOutOfRange property.
     * 
     */
    public void setFilterOutOfRange(boolean value) {
        this.filterOutOfRange = value;
    }

    /**
     * Gets the value of the filterExitManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getFilterExitManagementExtension() {
        return filterExitManagementExtension;
    }

    /**
     * Sets the value of the filterExitManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setFilterExitManagementExtension(_ExtensionType value) {
        this.filterExitManagementExtension = value;
    }

}
