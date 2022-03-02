
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "SupplementaryInformationDisplay", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "supplementaryInformationDisplayExtension"
})
@XmlSeeAlso({
    SupplementaryPictogram.class,
    SupplementaryText.class
})
public abstract class SupplementaryInformationDisplay
    extends DisplayAreaSettings
{

    @XmlElement(name = "_supplementaryInformationDisplayExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType supplementaryInformationDisplayExtension;

    /**
     * Gets the value of the supplementaryInformationDisplayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryInformationDisplayExtension() {
        return supplementaryInformationDisplayExtension;
    }

    /**
     * Sets the value of the supplementaryInformationDisplayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryInformationDisplayExtension(ExtensionType value) {
        this.supplementaryInformationDisplayExtension = value;
    }

}
