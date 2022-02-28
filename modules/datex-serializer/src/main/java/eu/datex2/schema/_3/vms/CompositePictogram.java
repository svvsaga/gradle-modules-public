
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common._ExtensionType;
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
    "_CompositePictogramExtension"
})
public class CompositePictogram
    extends Pictogram
{

    @XmlElement(required = true)
    protected _CompositePictogramEnum pictogramDescription;
    @XmlElement(required = true)
    protected RegularPictogram regularPictogram;
    @XmlElement(name = "_compositePictogramExtension")
    protected _ExtensionType _CompositePictogramExtension;

    /**
     * Gets the value of the pictogramDescription property.
     * 
     * @return
     *     possible object is
     *     {@link _CompositePictogramEnum }
     *     
     */
    public _CompositePictogramEnum getPictogramDescription() {
        return pictogramDescription;
    }

    /**
     * Sets the value of the pictogramDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CompositePictogramEnum }
     *     
     */
    public void setPictogramDescription(_CompositePictogramEnum value) {
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
     * Gets the value of the _CompositePictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CompositePictogramExtension() {
        return _CompositePictogramExtension;
    }

    /**
     * Sets the value of the _CompositePictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CompositePictogramExtension(_ExtensionType value) {
        this._CompositePictogramExtension = value;
    }

}
