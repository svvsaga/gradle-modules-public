
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
    "pressureExtension"
})
public class Pressure {

    @XmlElement(required = true)
    protected PressureValue pressureValue;
    @XmlElement(name = "_pressureExtension")
    protected ExtensionType pressureExtension;

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
     * Gets the value of the pressureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPressureExtension() {
        return pressureExtension;
    }

    /**
     * Sets the value of the pressureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPressureExtension(ExtensionType value) {
        this.pressureExtension = value;
    }

}
