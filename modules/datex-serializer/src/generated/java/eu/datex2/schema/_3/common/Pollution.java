
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pollution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pollution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/3/common}_PollutantTypeEnum"/&gt;
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/3/common}MicrogramsConcentrationValue" minOccurs="0"/&gt;
 *         &lt;element name="_pollutionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pollution", propOrder = {
    "pollutantType",
    "pollutantConcentration",
    "_PollutionExtension"
})
public class Pollution {

    @XmlElement(required = true)
    protected _PollutantTypeEnum pollutantType;
    protected MicrogramsConcentrationValue pollutantConcentration;
    @XmlElement(name = "_pollutionExtension")
    protected _ExtensionType _PollutionExtension;

    /**
     * Gets the value of the pollutantType property.
     * 
     * @return
     *     possible object is
     *     {@link _PollutantTypeEnum }
     *     
     */
    public _PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Sets the value of the pollutantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PollutantTypeEnum }
     *     
     */
    public void setPollutantType(_PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Gets the value of the pollutantConcentration property.
     * 
     * @return
     *     possible object is
     *     {@link MicrogramsConcentrationValue }
     *     
     */
    public MicrogramsConcentrationValue getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Sets the value of the pollutantConcentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrogramsConcentrationValue }
     *     
     */
    public void setPollutantConcentration(MicrogramsConcentrationValue value) {
        this.pollutantConcentration = value;
    }

    /**
     * Gets the value of the _PollutionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PollutionExtension() {
        return _PollutionExtension;
    }

    /**
     * Sets the value of the _PollutionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PollutionExtension(_ExtensionType value) {
        this._PollutionExtension = value;
    }

}
