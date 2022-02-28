
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of atmospheric pressure.
 * 
 * <p>Java class for Pressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pressure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pressureValue" type="{http://datex2.eu/schema/3/common}PressureValue"/&gt;
 *         &lt;element name="_pressureExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pressure", propOrder = {
    "pressureValue",
    "_PressureExtension"
})
public class Pressure {

    @XmlElement(required = true)
    protected PressureValue pressureValue;
    @XmlElement(name = "_pressureExtension")
    protected _ExtensionType _PressureExtension;

    /**
     * Gets the value of the pressureValue property.
     * 
     * @return
     *     possible object is
     *     {@link PressureValue }
     *     
     */
    public PressureValue getPressureValue() {
        return pressureValue;
    }

    /**
     * Sets the value of the pressureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureValue }
     *     
     */
    public void setPressureValue(PressureValue value) {
        this.pressureValue = value;
    }

    /**
     * Gets the value of the _PressureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PressureExtension() {
        return _PressureExtension;
    }

    /**
     * Sets the value of the _PressureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PressureExtension(_ExtensionType value) {
        this._PressureExtension = value;
    }

}
