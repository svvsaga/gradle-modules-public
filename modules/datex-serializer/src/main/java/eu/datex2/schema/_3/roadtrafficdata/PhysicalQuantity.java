
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.InternationalIdentifier;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.Source;
import eu.datex2.schema._3.locationreferencing.LocationReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated physical quantity, with related properties explaining its
 *         context, meaning or status
 *       
 * 
 * <p>Java class for PhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/3/locationReferencing}LocationReference" minOccurs="0"/&gt;
 *         &lt;element name="physicalQuantityFault" type="{http://datex2.eu/schema/3/roadTrafficData}PhysicalQuantityFault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://datex2.eu/schema/3/common}Source" minOccurs="0"/&gt;
 *         &lt;element name="informationManagerOverride" type="{http://datex2.eu/schema/3/common}InternationalIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="_physicalQuantityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalQuantity", propOrder = {
    "forecast",
    "measurementEquipmentTypeUsed",
    "pertinentLocation",
    "physicalQuantityFault",
    "source",
    "informationManagerOverride",
    "physicalQuantityExtension"
})
@XmlSeeAlso({
    SinglePhysicalQuantity.class,
    TimeProfiledPhysicalQuantity.class
})
public abstract class PhysicalQuantity {

    protected Boolean forecast;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationReference pertinentLocation;
    protected List<PhysicalQuantityFault> physicalQuantityFault;
    protected Source source;
    protected InternationalIdentifier informationManagerOverride;
    @XmlElement(name = "_physicalQuantityExtension")
    protected ExtensionType physicalQuantityExtension;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

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
     * Gets the value of the pertinentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Sets the value of the pertinentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setPertinentLocation(LocationReference value) {
        this.pertinentLocation = value;
    }

    /**
     * Gets the value of the physicalQuantityFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the physicalQuantityFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalQuantityFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalQuantityFault }
     * 
     * 
     */
    public List<PhysicalQuantityFault> getPhysicalQuantityFault() {
        if (physicalQuantityFault == null) {
            physicalQuantityFault = new ArrayList<PhysicalQuantityFault>();
        }
        return this.physicalQuantityFault;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the informationManagerOverride property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getInformationManagerOverride() {
        return informationManagerOverride;
    }

    /**
     * Sets the value of the informationManagerOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setInformationManagerOverride(InternationalIdentifier value) {
        this.informationManagerOverride = value;
    }

    /**
     * Gets the value of the physicalQuantityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPhysicalQuantityExtension() {
        return physicalQuantityExtension;
    }

    /**
     * Sets the value of the physicalQuantityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPhysicalQuantityExtension(ExtensionType value) {
        this.physicalQuantityExtension = value;
    }

}
