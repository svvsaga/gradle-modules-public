
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NutsNamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutsNamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutsCodeType" type="{http://datex2.eu/schema/3/locationReferencing}_NutsCodeTypeEnum"/&gt;
 *         &lt;element name="nutsCode" type="{http://datex2.eu/schema/3/locationReferencing}NutsCode"/&gt;
 *         &lt;element name="_nutsNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutsNamedArea", propOrder = {
    "nutsCodeType",
    "nutsCode",
    "_NutsNamedAreaExtension"
})
public class NutsNamedArea
    extends NamedArea
{

    @XmlElement(required = true)
    protected _NutsCodeTypeEnum nutsCodeType;
    @XmlElement(required = true)
    protected String nutsCode;
    @XmlElement(name = "_nutsNamedAreaExtension")
    protected _ExtensionType _NutsNamedAreaExtension;

    /**
     * Gets the value of the nutsCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link _NutsCodeTypeEnum }
     *     
     */
    public _NutsCodeTypeEnum getNutsCodeType() {
        return nutsCodeType;
    }

    /**
     * Sets the value of the nutsCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NutsCodeTypeEnum }
     *     
     */
    public void setNutsCodeType(_NutsCodeTypeEnum value) {
        this.nutsCodeType = value;
    }

    /**
     * Gets the value of the nutsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutsCode() {
        return nutsCode;
    }

    /**
     * Sets the value of the nutsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutsCode(String value) {
        this.nutsCode = value;
    }

    /**
     * Gets the value of the _NutsNamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NutsNamedAreaExtension() {
        return _NutsNamedAreaExtension;
    }

    /**
     * Sets the value of the _NutsNamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NutsNamedAreaExtension(_ExtensionType value) {
        this._NutsNamedAreaExtension = value;
    }

}
