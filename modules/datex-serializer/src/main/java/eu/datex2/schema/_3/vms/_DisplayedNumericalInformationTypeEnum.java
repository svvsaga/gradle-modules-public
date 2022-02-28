
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _DisplayedNumericalInformationTypeEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_DisplayedNumericalInformationTypeEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/vms&gt;DisplayedNumericalInformationTypeEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_DisplayedNumericalInformationTypeEnum", propOrder = {
    "value"
})
public class _DisplayedNumericalInformationTypeEnum {

    @XmlValue
    protected DisplayedNumericalInformationTypeEnum value;
    @XmlAttribute(name = "_extendedValue")
    protected String _ExtendedValue;

    /**
     * Type of numerical information displayed
     * 
     * @return
     *     possible object is
     *     {@link DisplayedNumericalInformationTypeEnum }
     *     
     */
    public DisplayedNumericalInformationTypeEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayedNumericalInformationTypeEnum }
     *     
     */
    public void setValue(DisplayedNumericalInformationTypeEnum value) {
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
