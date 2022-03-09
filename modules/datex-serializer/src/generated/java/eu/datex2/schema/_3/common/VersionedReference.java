
package eu.datex2.schema._3.common;

import eu.datex2.schema._3.cctvextension._CctvCameraListVersionedReference;
import eu.datex2.schema._3.cctvextension._CctvCameraMetadataRecordVersionedReference;
import eu.datex2.schema._3.locationreferencing._PredefinedItineraryVersionedReference;
import eu.datex2.schema._3.locationreferencing._PredefinedLocationVersionedReference;
import eu.datex2.schema._3.roadtrafficdata._MeasurementSiteTableVersionedReference;
import eu.datex2.schema._3.roadtrafficdata._MeasurementSiteVersionedReference;
import eu.datex2.schema._3.vms._VmsControllerTableVersionedReference;
import eu.datex2.schema._3.vms._VmsControllerVersionedReference;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionedReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionedReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedReference")
@XmlSeeAlso({
    _CctvCameraListVersionedReference.class,
    _CctvCameraMetadataRecordVersionedReference.class,
    _PredefinedItineraryVersionedReference.class,
    eu.datex2.schema._3.locationreferencing._PredefinedLocationGroupVersionedReference.class,
    _PredefinedLocationVersionedReference.class,
    eu.datex2.schema._3.vms._SituationRecordVersionedReference.class,
    eu.datex2.schema._3.vms._SituationVersionedReference.class,
    _VmsControllerTableVersionedReference.class,
    _VmsControllerVersionedReference.class,
    eu.datex2.schema._3.situation._SituationRecordVersionedReference.class,
    eu.datex2.schema._3.situation._SituationVersionedReference.class,
    _MeasurementSiteTableVersionedReference.class,
    _MeasurementSiteVersionedReference.class,
    eu.datex2.schema._3.roadtrafficdata._PredefinedLocationGroupVersionedReference.class
})
public class VersionedReference {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
