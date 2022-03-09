
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="trafficStatusDefault" type="{http://datex2.eu/schema/2/2_0}TrafficStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="referenceSettingsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "predefinedNonOrderedLocationGroupReference",
    "trafficStatusDefault",
    "referenceSettingsExtension"
})
public class ReferenceSettings {

    protected _PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    @XmlSchemaType(name = "string")
    protected TrafficStatusEnum trafficStatusDefault;
    protected _ExtensionType referenceSettingsExtension;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(_PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getReferenceSettingsExtension() {
        return referenceSettingsExtension;
    }

    /**
     * Sets the value of the referenceSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setReferenceSettingsExtension(_ExtensionType value) {
        this.referenceSettingsExtension = value;
    }

}
