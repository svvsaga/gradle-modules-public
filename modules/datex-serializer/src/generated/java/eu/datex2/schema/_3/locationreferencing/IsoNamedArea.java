
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsoNamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsoNamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subdivisionType" type="{http://datex2.eu/schema/3/locationReferencing}_SubdivisionTypeEnum"/&gt;
 *         &lt;element name="subdivisionCode" type="{http://datex2.eu/schema/3/locationReferencing}SubdivisionCode"/&gt;
 *         &lt;element name="_isoNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsoNamedArea", propOrder = {
    "subdivisionType",
    "subdivisionCode",
    "_IsoNamedAreaExtension"
})
public class IsoNamedArea
    extends NamedArea
{

    @XmlElement(required = true)
    protected _SubdivisionTypeEnum subdivisionType;
    @XmlElement(required = true)
    protected String subdivisionCode;
    @XmlElement(name = "_isoNamedAreaExtension")
    protected _ExtensionType _IsoNamedAreaExtension;

    /**
     * Gets the value of the subdivisionType property.
     * 
     * @return
     *     possible object is
     *     {@link _SubdivisionTypeEnum }
     *     
     */
    public _SubdivisionTypeEnum getSubdivisionType() {
        return subdivisionType;
    }

    /**
     * Sets the value of the subdivisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SubdivisionTypeEnum }
     *     
     */
    public void setSubdivisionType(_SubdivisionTypeEnum value) {
        this.subdivisionType = value;
    }

    /**
     * Gets the value of the subdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * Sets the value of the subdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivisionCode(String value) {
        this.subdivisionCode = value;
    }

    /**
     * Gets the value of the _IsoNamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_IsoNamedAreaExtension() {
        return _IsoNamedAreaExtension;
    }

    /**
     * Sets the value of the _IsoNamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_IsoNamedAreaExtension(_ExtensionType value) {
        this._IsoNamedAreaExtension = value;
    }

}
