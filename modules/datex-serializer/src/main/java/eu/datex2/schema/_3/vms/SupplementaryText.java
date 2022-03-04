
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "supplementaryTextExtension"
})
public class SupplementaryText
    extends SupplementaryInformationDisplay
{

    @XmlElement(required = true)
    protected TextLine textLine;
    @XmlElement(name = "_supplementaryTextExtension")
    protected ExtensionType supplementaryTextExtension;

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
     * Gets the value of the supplementaryTextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryTextExtension() {
        return supplementaryTextExtension;
    }

    /**
     * Sets the value of the supplementaryTextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryTextExtension(ExtensionType value) {
        this.supplementaryTextExtension = value;
    }

}
