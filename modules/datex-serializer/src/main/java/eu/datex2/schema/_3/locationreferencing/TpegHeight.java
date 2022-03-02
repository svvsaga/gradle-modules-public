
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Height information which provides additional discrimination for the applicable area.
 *       
 * 
 * <p>Java class for TpegHeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegHeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="height" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc04HeightTypeEnum"/&gt;
 *         &lt;element name="_tpegHeightExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegHeight", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "height",
    "heightType",
    "tpegHeightExtension"
})
public class TpegHeight {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected Float height;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected TpegLoc04HeightTypeEnum heightType;
    @XmlElement(name = "_tpegHeightExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType tpegHeightExtension;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the heightType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public TpegLoc04HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Sets the value of the heightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc04HeightTypeEnum }
     *     
     */
    public void setHeightType(TpegLoc04HeightTypeEnum value) {
        this.heightType = value;
    }

    /**
     * Gets the value of the tpegHeightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegHeightExtension() {
        return tpegHeightExtension;
    }

    /**
     * Sets the value of the tpegHeightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegHeightExtension(ExtensionType value) {
        this.tpegHeightExtension = value;
    }

}
