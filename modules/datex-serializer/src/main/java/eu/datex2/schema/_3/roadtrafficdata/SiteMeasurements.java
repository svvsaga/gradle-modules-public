
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measurement data set derived from a specific measurement site.
 * 
 * <p>Java class for SiteMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteMeasurements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/3/roadTrafficData}_MeasurementSiteVersionedReference"/&gt;
 *         &lt;element name="physicalQuantity" type="{http://datex2.eu/schema/3/roadTrafficData}_SiteMeasurementsIndexPhysicalQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/3/roadTrafficData}MeasurementOrCalculationTime"/&gt;
 *         &lt;element name="_siteMeasurementsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "physicalQuantity",
    "measurementTimeDefault",
    "_SiteMeasurementsExtension"
})
public class SiteMeasurements {

    @XmlElement(required = true)
    protected _MeasurementSiteVersionedReference measurementSiteReference;
    protected List<_SiteMeasurementsIndexPhysicalQuantity> physicalQuantity;
    @XmlElement(required = true)
    protected MeasurementOrCalculationTime measurementTimeDefault;
    @XmlElement(name = "_siteMeasurementsExtension")
    protected _ExtensionType _SiteMeasurementsExtension;

    /**
     * Gets the value of the measurementSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link _MeasurementSiteVersionedReference }
     *     
     */
    public _MeasurementSiteVersionedReference getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Sets the value of the measurementSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _MeasurementSiteVersionedReference }
     *     
     */
    public void setMeasurementSiteReference(_MeasurementSiteVersionedReference value) {
        this.measurementSiteReference = value;
    }

    /**
     * Gets the value of the physicalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the physicalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _SiteMeasurementsIndexPhysicalQuantity }
     * 
     * 
     */
    public List<_SiteMeasurementsIndexPhysicalQuantity> getPhysicalQuantity() {
        if (physicalQuantity == null) {
            physicalQuantity = new ArrayList<_SiteMeasurementsIndexPhysicalQuantity>();
        }
        return this.physicalQuantity;
    }

    /**
     * Gets the value of the measurementTimeDefault property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementOrCalculationTime }
     *     
     */
    public MeasurementOrCalculationTime getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Sets the value of the measurementTimeDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementOrCalculationTime }
     *     
     */
    public void setMeasurementTimeDefault(MeasurementOrCalculationTime value) {
        this.measurementTimeDefault = value;
    }

    /**
     * Gets the value of the _SiteMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SiteMeasurementsExtension() {
        return _SiteMeasurementsExtension;
    }

    /**
     * Sets the value of the _SiteMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SiteMeasurementsExtension(_ExtensionType value) {
        this._SiteMeasurementsExtension = value;
    }

}
