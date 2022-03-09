
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideAssistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideAssistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/3/situation}_RoadsideAssistanceTypeEnum"/&gt;
 *         &lt;element name="_roadsideAssistanceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideAssistance", propOrder = {
    "roadsideAssistanceType",
    "_RoadsideAssistanceExtension"
})
public class RoadsideAssistance
    extends OperatorAction
{

    @XmlElement(required = true)
    protected _RoadsideAssistanceTypeEnum roadsideAssistanceType;
    @XmlElement(name = "_roadsideAssistanceExtension")
    protected _ExtensionType _RoadsideAssistanceExtension;

    /**
     * Gets the value of the roadsideAssistanceType property.
     * 
     * @return
     *     possible object is
     *     {@link _RoadsideAssistanceTypeEnum }
     *     
     */
    public _RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Sets the value of the roadsideAssistanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(_RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    /**
     * Gets the value of the _RoadsideAssistanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadsideAssistanceExtension() {
        return _RoadsideAssistanceExtension;
    }

    /**
     * Sets the value of the _RoadsideAssistanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadsideAssistanceExtension(_ExtensionType value) {
        this._RoadsideAssistanceExtension = value;
    }

}
