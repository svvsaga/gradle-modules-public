
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _EmissionClassificationEuroEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_EmissionClassificationEuroEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/common&gt;EmissionClassificationEuroEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_EmissionClassificationEuroEnum", propOrder = {
    "value"
})
public class _EmissionClassificationEuroEnum {

    @XmlValue
    protected EmissionClassificationEuroEnum value;
    @XmlAttribute(name = "_extendedValue")
    protected String _ExtendedValue;

    /**
     * Classification of emission according to the Euro emission classification (based on
     *         serveral amendments on 1970 Directive 70/220/EEC). Note htat vehicleType as well as fuelType are
     *         mandatory to provide to make this classification explicit.
     *       
     * 
     * @return
     *     possible object is
     *     {@link EmissionClassificationEuroEnum }
     *     
     */
    public EmissionClassificationEuroEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionClassificationEuroEnum }
     *     
     */
    public void setValue(EmissionClassificationEuroEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the _ExtendedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get_ExtendedValue() {
        return _ExtendedValue;
    }

    /**
     * Sets the value of the _ExtendedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set_ExtendedValue(String value) {
        this._ExtendedValue = value;
    }

}
