
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
    "siteMeasurementsExtension"
})
public class SiteMeasurements {

    @XmlElement(required = true)
    protected MeasurementSiteVersionedReference measurementSiteReference;
    protected List<SiteMeasurementsIndexPhysicalQuantity> physicalQuantity;
    @XmlElement(required = true)
    protected MeasurementOrCalculationTime measurementTimeDefault;
    @XmlElement(name = "_siteMeasurementsExtension")
    protected ExtensionType siteMeasurementsExtension;

    /**
     * Gets the value of the measurementSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSiteVersionedReference }
     *     
     */
    public MeasurementSiteVersionedReference getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Sets the value of the measurementSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSiteVersionedReference }
     *     
     */
    public void setMeasurementSiteReference(MeasurementSiteVersionedReference value) {
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
     * {@link SiteMeasurementsIndexPhysicalQuantity }
     * 
     * 
     */
    public List<SiteMeasurementsIndexPhysicalQuantity> getPhysicalQuantity() {
        if (physicalQuantity == null) {
            physicalQuantity = new ArrayList<SiteMeasurementsIndexPhysicalQuantity>();
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
     * Gets the value of the siteMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSiteMeasurementsExtension() {
        return siteMeasurementsExtension;
    }

    /**
     * Sets the value of the siteMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSiteMeasurementsExtension(ExtensionType value) {
        this.siteMeasurementsExtension = value;
    }

}
