
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.PrecipitationDetail;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noPrecipitation" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/3/common}PrecipitationDetail" minOccurs="0"/&gt;
 *         &lt;element name="_precipitationInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationInformation", propOrder = {
    "noPrecipitation",
    "precipitationDetail",
    "_PrecipitationInformationExtension"
})
public class PrecipitationInformation
    extends WeatherData
{

    protected Boolean noPrecipitation;
    protected PrecipitationDetail precipitationDetail;
    @XmlElement(name = "_precipitationInformationExtension")
    protected _ExtensionType _PrecipitationInformationExtension;

    /**
     * Gets the value of the noPrecipitation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPrecipitation() {
        return noPrecipitation;
    }

    /**
     * Sets the value of the noPrecipitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPrecipitation(Boolean value) {
        this.noPrecipitation = value;
    }

    /**
     * Gets the value of the precipitationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Sets the value of the precipitationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Gets the value of the _PrecipitationInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PrecipitationInformationExtension() {
        return _PrecipitationInformationExtension;
    }

    /**
     * Sets the value of the _PrecipitationInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PrecipitationInformationExtension(_ExtensionType value) {
        this._PrecipitationInformationExtension = value;
    }

}
