
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A composite pictogram representing a diagrammatic schema in association with an embedded
 *         regular sign.
 *       
 * 
 * <p>Java class for CompositePictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositePictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}Pictogram"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramDescription" type="{http://datex2.eu/schema/3/vms}_CompositePictogramEnum"/&gt;
 *         &lt;element name="regularPictogram" type="{http://datex2.eu/schema/3/vms}RegularPictogram"/&gt;
 *         &lt;element name="_compositePictogramExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositePictogram", propOrder = {
    "pictogramDescription",
    "regularPictogram",
    "compositePictogramExtension"
})
public class CompositePictogram
    extends Pictogram
{

    @XmlElement(required = true)
    protected CompositePictogramEnum pictogramDescription;
    @XmlElement(required = true)
    protected RegularPictogram regularPictogram;
    @XmlElement(name = "_compositePictogramExtension")
    protected ExtensionType compositePictogramExtension;

    /**
     * Gets the value of the pictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CompositePictogramEnum }
     *     
     */
    public CompositePictogramEnum getPictogramDescription() {
        return pictogramDescription;
    }

    /**
     * Sets the value of the pictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositePictogramEnum }
     *     
     */
    public void setPictogramDescription(CompositePictogramEnum value) {
        this.pictogramDescription = value;
    }

    /**
     * Gets the value of the regularPictogram property.
     * 
     * @return
     *     possible object is
     *     {@link RegularPictogram }
     *     
     */
    public RegularPictogram getRegularPictogram() {
        return regularPictogram;
    }

    /**
     * Sets the value of the regularPictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularPictogram }
     *     
     */
    public void setRegularPictogram(RegularPictogram value) {
        this.regularPictogram = value;
    }

    /**
     * Gets the value of the compositePictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCompositePictogramExtension() {
        return compositePictogramExtension;
    }

    /**
     * Sets the value of the compositePictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCompositePictogramExtension(ExtensionType value) {
        this.compositePictogramExtension = value;
    }

}
