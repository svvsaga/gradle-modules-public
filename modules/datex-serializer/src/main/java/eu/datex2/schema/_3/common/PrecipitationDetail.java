
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="precipitationType" type="{http://datex2.eu/schema/3/common}_PrecipitationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="precipitationIntensityGrade" type="{http://datex2.eu/schema/3/common}_PrecipitationIntensityEnum" minOccurs="0"/&gt;
 *         &lt;element name="precipitationIntensity" type="{http://datex2.eu/schema/3/common}PrecipitationIntensityValue" minOccurs="0"/&gt;
 *         &lt;element name="depositionDepth" type="{http://datex2.eu/schema/3/common}FloatingPointMetreDistanceValue" minOccurs="0"/&gt;
 *         &lt;element name="_precipitationDetailExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationDetail", propOrder = {
    "precipitationType",
    "precipitationIntensityGrade",
    "precipitationIntensity",
    "depositionDepth",
    "precipitationDetailExtension"
})
public class PrecipitationDetail {

    protected PrecipitationTypeEnum precipitationType;
    protected PrecipitationIntensityEnum precipitationIntensityGrade;
    protected PrecipitationIntensityValue precipitationIntensity;
    protected FloatingPointMetreDistanceValue depositionDepth;
    @XmlElement(name = "_precipitationDetailExtension")
    protected ExtensionType precipitationDetailExtension;

    /**
     * Gets the value of the precipitationType property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Sets the value of the precipitationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    /**
     * Gets the value of the precipitationIntensityGrade property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationIntensityEnum }
     *     
     */
    public PrecipitationIntensityEnum getPrecipitationIntensityGrade() {
        return precipitationIntensityGrade;
    }

    /**
     * Sets the value of the precipitationIntensityGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationIntensityEnum }
     *     
     */
    public void setPrecipitationIntensityGrade(PrecipitationIntensityEnum value) {
        this.precipitationIntensityGrade = value;
    }

    /**
     * Gets the value of the precipitationIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationIntensityValue }
     *     
     */
    public PrecipitationIntensityValue getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    /**
     * Sets the value of the precipitationIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationIntensityValue }
     *     
     */
    public void setPrecipitationIntensity(PrecipitationIntensityValue value) {
        this.precipitationIntensity = value;
    }

    /**
     * Gets the value of the depositionDepth property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getDepositionDepth() {
        return depositionDepth;
    }

    /**
     * Sets the value of the depositionDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setDepositionDepth(FloatingPointMetreDistanceValue value) {
        this.depositionDepth = value;
    }

    /**
     * Gets the value of the precipitationDetailExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationDetailExtension() {
        return precipitationDetailExtension;
    }

    /**
     * Sets the value of the precipitationDetailExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationDetailExtension(ExtensionType value) {
        this.precipitationDetailExtension = value;
    }

}
