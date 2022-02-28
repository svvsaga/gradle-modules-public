
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noPrecipitation" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/2/2_0}PrecipitationDetail" minOccurs="0"/&gt;
 *         &lt;element name="precipitationInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "precipitationInformationExtension"
})
public class PrecipitationInformation
    extends WeatherData
{

    protected Boolean noPrecipitation;
    protected PrecipitationDetail precipitationDetail;
    protected _ExtensionType precipitationInformationExtension;

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
     * Gets the value of the precipitationInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPrecipitationInformationExtension() {
        return precipitationInformationExtension;
    }

    /**
     * Sets the value of the precipitationInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPrecipitationInformationExtension(_ExtensionType value) {
        this.precipitationInformationExtension = value;
    }

}
