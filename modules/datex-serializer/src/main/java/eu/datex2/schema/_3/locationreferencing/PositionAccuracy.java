
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Horizontal position accuracy parameters defined according to EN 16803-1
 * 
 * <p>Java class for PositionAccuracy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionAccuracy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracyPercentile50" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="accuracyPercentile75" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="accuracyPercentile95" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="_positionAccuracyExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionAccuracy", propOrder = {
    "accuracyPercentile50",
    "accuracyPercentile75",
    "accuracyPercentile95",
    "positionAccuracyExtension"
})
public class PositionAccuracy {

    protected Float accuracyPercentile50;
    protected Float accuracyPercentile75;
    protected Float accuracyPercentile95;
    @XmlElement(name = "_positionAccuracyExtension")
    protected ExtensionType positionAccuracyExtension;

    /**
     * Gets the value of the accuracyPercentile50 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracyPercentile50() {
        return accuracyPercentile50;
    }

    /**
     * Sets the value of the accuracyPercentile50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracyPercentile50(Float value) {
        this.accuracyPercentile50 = value;
    }

    /**
     * Gets the value of the accuracyPercentile75 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracyPercentile75() {
        return accuracyPercentile75;
    }

    /**
     * Sets the value of the accuracyPercentile75 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracyPercentile75(Float value) {
        this.accuracyPercentile75 = value;
    }

    /**
     * Gets the value of the accuracyPercentile95 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracyPercentile95() {
        return accuracyPercentile95;
    }

    /**
     * Sets the value of the accuracyPercentile95 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracyPercentile95(Float value) {
        this.accuracyPercentile95 = value;
    }

    /**
     * Gets the value of the positionAccuracyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPositionAccuracyExtension() {
        return positionAccuracyExtension;
    }

    /**
     * Sets the value of the positionAccuracyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPositionAccuracyExtension(ExtensionType value) {
        this.positionAccuracyExtension = value;
    }

}
