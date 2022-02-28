
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.HeaderInformation;
import eu.datex2.schema._3.common.PayloadPublication;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A publication containing one or more measurement data sets, each set being measured at a
 *         single measurement site.
 *       
 * 
 * <p>Java class for MeasuredDataPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasuredDataPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableReference" type="{http://datex2.eu/schema/3/roadTrafficData}_MeasurementSiteTableVersionedReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/3/common}HeaderInformation"/&gt;
 *         &lt;element name="siteMeasurements" type="{http://datex2.eu/schema/3/roadTrafficData}SiteMeasurements" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_measuredDataPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredDataPublication", propOrder = {
    "measurementSiteTableReference",
    "headerInformation",
    "siteMeasurements",
    "_MeasuredDataPublicationExtension"
})
public class MeasuredDataPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected List<_MeasurementSiteTableVersionedReference> measurementSiteTableReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SiteMeasurements> siteMeasurements;
    @XmlElement(name = "_measuredDataPublicationExtension")
    protected _ExtensionType _MeasuredDataPublicationExtension;

    /**
     * Gets the value of the measurementSiteTableReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteTableReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteTableReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _MeasurementSiteTableVersionedReference }
     * 
     * 
     */
    public List<_MeasurementSiteTableVersionedReference> getMeasurementSiteTableReference() {
        if (measurementSiteTableReference == null) {
            measurementSiteTableReference = new ArrayList<_MeasurementSiteTableVersionedReference>();
        }
        return this.measurementSiteTableReference;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the siteMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the siteMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteMeasurements }
     * 
     * 
     */
    public List<SiteMeasurements> getSiteMeasurements() {
        if (siteMeasurements == null) {
            siteMeasurements = new ArrayList<SiteMeasurements>();
        }
        return this.siteMeasurements;
    }

    /**
     * Gets the value of the _MeasuredDataPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MeasuredDataPublicationExtension() {
        return _MeasuredDataPublicationExtension;
    }

    /**
     * Sets the value of the _MeasuredDataPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MeasuredDataPublicationExtension(_ExtensionType value) {
        this._MeasuredDataPublicationExtension = value;
    }

}
