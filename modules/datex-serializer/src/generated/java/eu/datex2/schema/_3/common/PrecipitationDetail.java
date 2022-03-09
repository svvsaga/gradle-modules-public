
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
    "_PrecipitationDetailExtension"
})
public class PrecipitationDetail {

    protected _PrecipitationTypeEnum precipitationType;
    protected _PrecipitationIntensityEnum precipitationIntensityGrade;
    protected PrecipitationIntensityValue precipitationIntensity;
    protected FloatingPointMetreDistanceValue depositionDepth;
    @XmlElement(name = "_precipitationDetailExtension")
    protected _ExtensionType _PrecipitationDetailExtension;

    /**
     * Gets the value of the precipitationType property.
     * 
     * @return
     *     possible object is
     *     {@link _PrecipitationTypeEnum }
     *     
     */
    public _PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Sets the value of the precipitationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(_PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    /**
     * Gets the value of the precipitationIntensityGrade property.
     * 
     * @return
     *     possible object is
     *     {@link _PrecipitationIntensityEnum }
     *     
     */
    public _PrecipitationIntensityEnum getPrecipitationIntensityGrade() {
        return precipitationIntensityGrade;
    }

    /**
     * Sets the value of the precipitationIntensityGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PrecipitationIntensityEnum }
     *     
     */
    public void setPrecipitationIntensityGrade(_PrecipitationIntensityEnum value) {
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
     * Gets the value of the _PrecipitationDetailExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PrecipitationDetailExtension() {
        return _PrecipitationDetailExtension;
    }

    /**
     * Sets the value of the _PrecipitationDetailExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PrecipitationDetailExtension(_ExtensionType value) {
        this._PrecipitationDetailExtension = value;
    }

}
