
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementaryPanelArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPanelArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPictogramCodeListIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="relatedPictogramArea" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="_supplementaryPanelAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPanelArea", propOrder = {
    "supplementaryPictogramCodeListIdentifier",
    "relatedPictogramArea",
    "supplementaryPanelAreaExtension"
})
public class SupplementaryPanelArea
    extends DisplayArea
{

    protected String supplementaryPictogramCodeListIdentifier;
    protected BigInteger relatedPictogramArea;
    @XmlElement(name = "_supplementaryPanelAreaExtension")
    protected ExtensionType supplementaryPanelAreaExtension;

    /**
     * Gets the value of the supplementaryPictogramCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryPictogramCodeListIdentifier() {
        return supplementaryPictogramCodeListIdentifier;
    }

    /**
     * Sets the value of the supplementaryPictogramCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryPictogramCodeListIdentifier(String value) {
        this.supplementaryPictogramCodeListIdentifier = value;
    }

    /**
     * Gets the value of the relatedPictogramArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedPictogramArea() {
        return relatedPictogramArea;
    }

    /**
     * Sets the value of the relatedPictogramArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedPictogramArea(BigInteger value) {
        this.relatedPictogramArea = value;
    }

    /**
     * Gets the value of the supplementaryPanelAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPanelAreaExtension() {
        return supplementaryPanelAreaExtension;
    }

    /**
     * Sets the value of the supplementaryPanelAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPanelAreaExtension(ExtensionType value) {
        this.supplementaryPanelAreaExtension = value;
    }

}
