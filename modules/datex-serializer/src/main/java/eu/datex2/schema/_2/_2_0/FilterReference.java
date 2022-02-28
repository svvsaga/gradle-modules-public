
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deleteFilter" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="filterOperationApproved" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="keyFilterReference" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="filterReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReference", propOrder = {
    "deleteFilter",
    "filterOperationApproved",
    "keyFilterReference",
    "filterReferenceExtension"
})
public class FilterReference {

    protected Boolean deleteFilter;
    protected Boolean filterOperationApproved;
    @XmlElement(required = true)
    protected String keyFilterReference;
    protected _ExtensionType filterReferenceExtension;

    /**
     * Gets the value of the deleteFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteFilter() {
        return deleteFilter;
    }

    /**
     * Sets the value of the deleteFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteFilter(Boolean value) {
        this.deleteFilter = value;
    }

    /**
     * Gets the value of the filterOperationApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterOperationApproved() {
        return filterOperationApproved;
    }

    /**
     * Sets the value of the filterOperationApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterOperationApproved(Boolean value) {
        this.filterOperationApproved = value;
    }

    /**
     * Gets the value of the keyFilterReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFilterReference() {
        return keyFilterReference;
    }

    /**
     * Sets the value of the keyFilterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFilterReference(String value) {
        this.keyFilterReference = value;
    }

    /**
     * Gets the value of the filterReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getFilterReferenceExtension() {
        return filterReferenceExtension;
    }

    /**
     * Sets the value of the filterReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setFilterReferenceExtension(_ExtensionType value) {
        this.filterReferenceExtension = value;
    }

}
