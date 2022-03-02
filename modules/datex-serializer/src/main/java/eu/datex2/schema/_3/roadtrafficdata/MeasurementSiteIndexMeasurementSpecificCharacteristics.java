
package eu.datex2.schema._3.roadtrafficdata;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _MeasurementSiteIndexMeasurementSpecificCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_MeasurementSiteIndexMeasurementSpecificCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSpecificCharacteristics" type="{http://datex2.eu/schema/3/roadTrafficData}MeasurementSpecificCharacteristics"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_MeasurementSiteIndexMeasurementSpecificCharacteristics", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "measurementSpecificCharacteristics"
})
public class MeasurementSiteIndexMeasurementSpecificCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    protected MeasurementSpecificCharacteristics measurementSpecificCharacteristics;
    @XmlAttribute(name = "index", required = true)
    protected int index;

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSpecificCharacteristics }
     *     
     */
    public MeasurementSpecificCharacteristics getMeasurementSpecificCharacteristics() {
        return measurementSpecificCharacteristics;
    }

    /**
     * Sets the value of the measurementSpecificCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSpecificCharacteristics }
     *     
     */
    public void setMeasurementSpecificCharacteristics(MeasurementSpecificCharacteristics value) {
        this.measurementSpecificCharacteristics = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
