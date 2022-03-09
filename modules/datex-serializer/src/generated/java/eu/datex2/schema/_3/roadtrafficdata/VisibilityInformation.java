
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.Visibility;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisibilityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisibilityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/3/common}Visibility"/&gt;
 *         &lt;element name="_visibilityInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisibilityInformation", propOrder = {
    "visibility",
    "_VisibilityInformationExtension"
})
public class VisibilityInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Visibility visibility;
    @XmlElement(name = "_visibilityInformationExtension")
    protected _ExtensionType _VisibilityInformationExtension;

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the _VisibilityInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VisibilityInformationExtension() {
        return _VisibilityInformationExtension;
    }

    /**
     * Sets the value of the _VisibilityInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VisibilityInformationExtension(_ExtensionType value) {
        this._VisibilityInformationExtension = value;
    }

}
