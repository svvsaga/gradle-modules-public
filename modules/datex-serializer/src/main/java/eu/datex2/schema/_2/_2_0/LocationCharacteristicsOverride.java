
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCharacteristicsOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationCharacteristicsOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementLanesOverride" type="{http://datex2.eu/schema/2/2_0}LaneEnum" minOccurs="0"/&gt;
 *         &lt;element name="reversedFlow" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverrideExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCharacteristicsOverride", propOrder = {
    "measurementLanesOverride",
    "reversedFlow",
    "locationCharacteristicsOverrideExtension"
})
public class LocationCharacteristicsOverride {

    @XmlSchemaType(name = "string")
    protected LaneEnum measurementLanesOverride;
    protected Boolean reversedFlow;
    protected _ExtensionType locationCharacteristicsOverrideExtension;

    /**
     * Gets the value of the measurementLanesOverride property.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getMeasurementLanesOverride() {
        return measurementLanesOverride;
    }

    /**
     * Sets the value of the measurementLanesOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setMeasurementLanesOverride(LaneEnum value) {
        this.measurementLanesOverride = value;
    }

    /**
     * Gets the value of the reversedFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversedFlow() {
        return reversedFlow;
    }

    /**
     * Sets the value of the reversedFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversedFlow(Boolean value) {
        this.reversedFlow = value;
    }

    /**
     * Gets the value of the locationCharacteristicsOverrideExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getLocationCharacteristicsOverrideExtension() {
        return locationCharacteristicsOverrideExtension;
    }

    /**
     * Sets the value of the locationCharacteristicsOverrideExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setLocationCharacteristicsOverrideExtension(_ExtensionType value) {
        this.locationCharacteristicsOverrideExtension = value;
    }

}
