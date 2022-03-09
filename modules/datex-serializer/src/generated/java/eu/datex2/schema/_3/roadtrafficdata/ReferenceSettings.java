
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationGroupReference" type="{http://datex2.eu/schema/3/roadTrafficData}_PredefinedLocationGroupVersionedReference"/&gt;
 *         &lt;element name="trafficStatusDefault" type="{http://datex2.eu/schema/3/roadTrafficData}_TrafficStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="_referenceSettingsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSettings", propOrder = {
    "predefinedLocationGroupReference",
    "trafficStatusDefault",
    "_ReferenceSettingsExtension"
})
public class ReferenceSettings {

    @XmlElement(required = true)
    protected _PredefinedLocationGroupVersionedReference predefinedLocationGroupReference;
    protected _TrafficStatusEnum trafficStatusDefault;
    @XmlElement(name = "_referenceSettingsExtension")
    protected _ExtensionType _ReferenceSettingsExtension;

    /**
     * Gets the value of the predefinedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedLocationGroupVersionedReference getPredefinedLocationGroupReference() {
        return predefinedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedLocationGroupReference(_PredefinedLocationGroupVersionedReference value) {
        this.predefinedLocationGroupReference = value;
    }

    /**
     * Gets the value of the trafficStatusDefault property.
     * 
     * @return
     *     possible object is
     *     {@link _TrafficStatusEnum }
     *     
     */
    public _TrafficStatusEnum getTrafficStatusDefault() {
        return trafficStatusDefault;
    }

    /**
     * Sets the value of the trafficStatusDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusDefault(_TrafficStatusEnum value) {
        this.trafficStatusDefault = value;
    }

    /**
     * Gets the value of the _ReferenceSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ReferenceSettingsExtension() {
        return _ReferenceSettingsExtension;
    }

    /**
     * Sets the value of the _ReferenceSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ReferenceSettingsExtension(_ExtensionType value) {
        this._ReferenceSettingsExtension = value;
    }

}
