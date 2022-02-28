
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A display of information or a regulatory instruction which is supplemental to the
 *         associated pictogram, comprising either an additional line of text or a pictogram or both.
 *       
 * 
 * <p>Java class for SupplementaryInformationDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryInformationDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayAreaSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_supplementaryInformationDisplayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryInformationDisplay", propOrder = {
    "_SupplementaryInformationDisplayExtension"
})
@XmlSeeAlso({
    SupplementaryPictogram.class,
    SupplementaryText.class
})
public abstract class SupplementaryInformationDisplay
    extends DisplayAreaSettings
{

    @XmlElement(name = "_supplementaryInformationDisplayExtension")
    protected _ExtensionType _SupplementaryInformationDisplayExtension;

    /**
     * Gets the value of the _SupplementaryInformationDisplayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SupplementaryInformationDisplayExtension() {
        return _SupplementaryInformationDisplayExtension;
    }

    /**
     * Sets the value of the _SupplementaryInformationDisplayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SupplementaryInformationDisplayExtension(_ExtensionType value) {
        this._SupplementaryInformationDisplayExtension = value;
    }

}
