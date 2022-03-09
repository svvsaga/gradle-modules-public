
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElementByLineString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByLineString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LinearElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gmlLineString" type="{http://datex2.eu/schema/3/locationReferencing}GmlLineString"/&gt;
 *         &lt;element name="_linearElementByLineStringExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByLineString", propOrder = {
    "gmlLineString",
    "_LinearElementByLineStringExtension"
})
public class LinearElementByLineString
    extends LinearElement
{

    @XmlElement(required = true)
    protected GmlLineString gmlLineString;
    @XmlElement(name = "_linearElementByLineStringExtension")
    protected _ExtensionType _LinearElementByLineStringExtension;

    /**
     * Gets the value of the gmlLineString property.
     * 
     * @return
     *     possible object is
     *     {@link GmlLineString }
     *     
     */
    public GmlLineString getGmlLineString() {
        return gmlLineString;
    }

    /**
     * Sets the value of the gmlLineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlLineString }
     *     
     */
    public void setGmlLineString(GmlLineString value) {
        this.gmlLineString = value;
    }

    /**
     * Gets the value of the _LinearElementByLineStringExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LinearElementByLineStringExtension() {
        return _LinearElementByLineStringExtension;
    }

    /**
     * Sets the value of the _LinearElementByLineStringExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LinearElementByLineStringExtension(_ExtensionType value) {
        this._LinearElementByLineStringExtension = value;
    }

}
