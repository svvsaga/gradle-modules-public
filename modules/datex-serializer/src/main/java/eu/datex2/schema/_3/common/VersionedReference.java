
package eu.datex2.schema._3.common;

import eu.datex2.schema._3.locationreferencing.PredefinedItineraryVersionedReference;
import eu.datex2.schema._3.locationreferencing.PredefinedLocationVersionedReference;
import eu.datex2.schema._3.roadtrafficdata.MeasurementSiteTableVersionedReference;
import eu.datex2.schema._3.roadtrafficdata.MeasurementSiteVersionedReference;
import eu.datex2.schema._3.vms.VmsControllerTableVersionedReference;
import eu.datex2.schema._3.vms.VmsControllerVersionedReference;
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
@XmlType(name = "VersionedReference", namespace = "http://datex2.eu/schema/3/common")
@XmlSeeAlso({
    eu.datex2.schema._3.vms.SituationRecordVersionedReference.class,
    eu.datex2.schema._3.vms.SituationVersionedReference.class,
    VmsControllerTableVersionedReference.class,
    VmsControllerVersionedReference.class,
    PredefinedItineraryVersionedReference.class,
    eu.datex2.schema._3.locationreferencing.PredefinedLocationGroupVersionedReference.class,
    PredefinedLocationVersionedReference.class,
    eu.datex2.schema._3.situation.SituationRecordVersionedReference.class,
    eu.datex2.schema._3.situation.SituationVersionedReference.class,
    MeasurementSiteTableVersionedReference.class,
    MeasurementSiteVersionedReference.class,
    eu.datex2.schema._3.roadtrafficdata.PredefinedLocationGroupVersionedReference.class
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
