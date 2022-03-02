
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of default values for locations on the road network. Where a default status
 *         value is supplied, it shall apply for all specified locations, unless the publication includes an
 *         additional status value for a specified location.
 *       
 * 
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
    "referenceSettingsExtension"
})
public class ReferenceSettings {

    @XmlElement(required = true)
    protected PredefinedLocationGroupVersionedReference predefinedLocationGroupReference;
    protected TrafficStatusEnum trafficStatusDefault;
    @XmlElement(name = "_referenceSettingsExtension")
    protected ExtensionType referenceSettingsExtension;

    /**
     * Gets the value of the predefinedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLocationGroupVersionedReference }
     *     
     */
    public PredefinedLocationGroupVersionedReference getPredefinedLocationGroupReference() {
        return predefinedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedLocationGroupReference(PredefinedLocationGroupVersionedReference value) {
        this.predefinedLocationGroupReference = value;
    }

    /**
     * Gets the value of the trafficStatusDefault property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusDefault() {
        return trafficStatusDefault;
    }

    /**
     * Sets the value of the trafficStatusDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusDefault(TrafficStatusEnum value) {
        this.trafficStatusDefault = value;
    }

    /**
     * Gets the value of the referenceSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferenceSettingsExtension() {
        return referenceSettingsExtension;
    }

    /**
     * Sets the value of the referenceSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferenceSettingsExtension(ExtensionType value) {
        this.referenceSettingsExtension = value;
    }

}
