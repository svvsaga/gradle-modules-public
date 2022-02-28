
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for _FaultUrgencyEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_FaultUrgencyEnum"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://datex2.eu/schema/3/common&gt;FaultUrgencyEnum"&gt;
 *       &lt;attribute name="_extendedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_FaultUrgencyEnum", propOrder = {
    "value"
})
public class _FaultUrgencyEnum {

    @XmlValue
    protected FaultUrgencyEnum value;
    @XmlAttribute(name = "_extendedValue")
    protected String _ExtendedValue;

    /**
     * Classification of the urgency to rectify a fault.
     * 
     * @return
     *     possible object is
     *     {@link FaultUrgencyEnum }
     *     
     */
    public FaultUrgencyEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultUrgencyEnum }
     *     
     */
    public void setValue(FaultUrgencyEnum value) {
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