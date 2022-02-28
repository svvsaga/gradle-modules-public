
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Text used in a supplementary display associated with a pictogram
 * 
 * <p>Java class for SupplementaryText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}SupplementaryInformationDisplay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textLine" type="{http://datex2.eu/schema/3/vms}TextLine"/&gt;
 *         &lt;element name="_supplementaryTextExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryText", propOrder = {
    "textLine",
    "_SupplementaryTextExtension"
})
public class SupplementaryText
    extends SupplementaryInformationDisplay
{

    @XmlElement(required = true)
    protected TextLine textLine;
    @XmlElement(name = "_supplementaryTextExtension")
    protected _ExtensionType _SupplementaryTextExtension;

    /**
     * Gets the value of the textLine property.
     * 
     * @return
     *     possible object is
     *     {@link TextLine }
     *     
     */
    public TextLine getTextLine() {
        return textLine;
    }

    /**
     * Sets the value of the textLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLine }
     *     
     */
    public void setTextLine(TextLine value) {
        this.textLine = value;
    }

    /**
     * Gets the value of the _SupplementaryTextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SupplementaryTextExtension() {
        return _SupplementaryTextExtension;
    }

    /**
     * Sets the value of the _SupplementaryTextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SupplementaryTextExtension(_ExtensionType value) {
        this._SupplementaryTextExtension = value;
    }

}
