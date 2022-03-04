
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Visibility;
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
    "visibilityInformationExtension"
})
public class VisibilityInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Visibility visibility;
    @XmlElement(name = "_visibilityInformationExtension")
    protected ExtensionType visibilityInformationExtension;

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
     * Gets the value of the visibilityInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityInformationExtension() {
        return visibilityInformationExtension;
    }

    /**
     * Sets the value of the visibilityInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityInformationExtension(ExtensionType value) {
        this.visibilityInformationExtension = value;
    }

}
