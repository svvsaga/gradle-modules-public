
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancel" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleManagement", propOrder = {
    "cancel",
    "end",
    "lifeCycleManagementExtension"
})
public class LifeCycleManagement {

    protected Boolean cancel;
    protected Boolean end;
    protected _ExtensionType lifeCycleManagementExtension;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancel(Boolean value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnd(Boolean value) {
        this.end = value;
    }

    /**
     * Gets the value of the lifeCycleManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getLifeCycleManagementExtension() {
        return lifeCycleManagementExtension;
    }

    /**
     * Sets the value of the lifeCycleManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setLifeCycleManagementExtension(_ExtensionType value) {
        this.lifeCycleManagementExtension = value;
    }

}
