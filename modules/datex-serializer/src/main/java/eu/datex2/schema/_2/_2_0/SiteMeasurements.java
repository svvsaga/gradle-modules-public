
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/2/2_0}_MeasurementSiteRecordVersionedReference"/&gt;
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/2/2_0}DateTime"/&gt;
 *         &lt;element name="measuredValue" type="{http://datex2.eu/schema/2/2_0}_SiteMeasurementsIndexMeasuredValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="siteMeasurementsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteMeasurements", propOrder = {
    "measurementSiteReference",
    "measurementTimeDefault",
    "measuredValue",
    "siteMeasurementsExtension"
})
public class SiteMeasurements {

    @XmlElement(required = true)
    protected _MeasurementSiteRecordVersionedReference measurementSiteReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementTimeDefault;
    protected List<_SiteMeasurementsIndexMeasuredValue> measuredValue;
    protected _ExtensionType siteMeasurementsExtension;

    /**
     * Gets the value of the measurementSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link _MeasurementSiteRecordVersionedReference }
     *     
     */
    public _MeasurementSiteRecordVersionedReference getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Sets the value of the measurementSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _MeasurementSiteRecordVersionedReference }
     *     
     */
    public void setMeasurementSiteReference(_MeasurementSiteRecordVersionedReference value) {
        this.measurementSiteReference = value;
    }

    /**
     * Gets the value of the measurementTimeDefault property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Sets the value of the measurementTimeDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementTimeDefault(XMLGregorianCalendar value) {
        this.measurementTimeDefault = value;
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measuredValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _SiteMeasurementsIndexMeasuredValue }
     * 
     * 
     */
    public List<_SiteMeasurementsIndexMeasuredValue> getMeasuredValue() {
        if (measuredValue == null) {
            measuredValue = new ArrayList<_SiteMeasurementsIndexMeasuredValue>();
        }
        return this.measuredValue;
    }

    /**
     * Gets the value of the siteMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getSiteMeasurementsExtension() {
        return siteMeasurementsExtension;
    }

    /**
     * Sets the value of the siteMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setSiteMeasurementsExtension(_ExtensionType value) {
        this.siteMeasurementsExtension = value;
    }

}
