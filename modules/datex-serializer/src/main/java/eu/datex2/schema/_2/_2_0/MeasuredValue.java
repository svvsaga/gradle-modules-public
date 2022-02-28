
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasuredValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/2/2_0}LocationCharacteristicsOverride" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentFault" type="{http://datex2.eu/schema/2/2_0}MeasurementEquipmentFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="basicData" type="{http://datex2.eu/schema/2/2_0}BasicData" minOccurs="0"/&gt;
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "measurementEquipmentFault",
    "basicData",
    "measuredValueExtension"
})
public class MeasuredValue {

    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    protected List<MeasurementEquipmentFault> measurementEquipmentFault;
    protected BasicData basicData;
    protected _ExtensionType measuredValueExtension;

    /**
     * Gets the value of the measurementEquipmentTypeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Sets the value of the measurementEquipmentTypeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Gets the value of the locationCharacteristicsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Sets the value of the locationCharacteristicsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    /**
     * Gets the value of the measurementEquipmentFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementEquipmentFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementEquipmentFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementEquipmentFault }
     * 
     * 
     */
    public List<MeasurementEquipmentFault> getMeasurementEquipmentFault() {
        if (measurementEquipmentFault == null) {
            measurementEquipmentFault = new ArrayList<MeasurementEquipmentFault>();
        }
        return this.measurementEquipmentFault;
    }

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link BasicData }
     *     
     */
    public BasicData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicData }
     *     
     */
    public void setBasicData(BasicData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the measuredValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Sets the value of the measuredValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(_ExtensionType value) {
        this.measuredValueExtension = value;
    }

}
