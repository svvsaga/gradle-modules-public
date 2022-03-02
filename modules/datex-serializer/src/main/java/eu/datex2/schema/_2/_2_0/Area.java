
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/2/2_0}AlertCArea" minOccurs="0"/&gt;
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/2/2_0}TpegAreaLocation" minOccurs="0"/&gt;
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/2/2_0}_AreaExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "alertCArea",
    "tpegAreaLocation",
    "areaExtension"
})
public class Area
    extends Location
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected AlertCArea alertCArea;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected TpegAreaLocation tpegAreaLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected AreaExtensionType areaExtension;

    /**
     * Gets the value of the alertCArea property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCArea }
     *     
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Sets the value of the alertCArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCArea }
     *     
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    /**
     * Gets the value of the tpegAreaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaLocation }
     *     
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Sets the value of the tpegAreaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaLocation }
     *     
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    /**
     * Gets the value of the areaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AreaExtensionType }
     *     
     */
    public AreaExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Sets the value of the areaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaExtensionType }
     *     
     */
    public void setAreaExtension(AreaExtensionType value) {
        this.areaExtension = value;
    }

}
