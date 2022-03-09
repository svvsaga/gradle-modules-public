
package eu.datex2.schema._3.cctvextension;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common.UrlLink;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStillImageService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvStillImageService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvStillImageServiceLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&gt;
 *         &lt;element name="cctvStillImageServiceLevelName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageFormat" type="{http://datex2.eu/schema/3/cctvExtension}_CctvStillImageFormatEnum"/&gt;
 *         &lt;element name="cctvStillImageWidth" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageHeight" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="cctvStillImageZoomBlankingLevel" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="stillImageUrl" type="{http://datex2.eu/schema/3/common}UrlLink"/&gt;
 *         &lt;element name="orientationImageUrl" type="{http://datex2.eu/schema/3/common}UrlLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thumbnailImageUrl" type="{http://datex2.eu/schema/3/common}UrlLink" minOccurs="0"/&gt;
 *         &lt;element name="_cctvStillImageServiceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvStillImageService", propOrder = {
    "cctvStillImageServiceLevel",
    "cctvStillImageServiceLevelName",
    "cctvStillImageFormat",
    "cctvStillImageWidth",
    "cctvStillImageHeight",
    "cctvStillImageZoomBlankingLevel",
    "stillImageUrl",
    "orientationImageUrl",
    "thumbnailImageUrl",
    "_CctvStillImageServiceExtension"
})
public class CctvStillImageService {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageServiceLevel;
    protected MultilingualString cctvStillImageServiceLevelName;
    @XmlElement(required = true)
    protected _CctvStillImageFormatEnum cctvStillImageFormat;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageWidth;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageZoomBlankingLevel;
    @XmlElement(required = true)
    protected UrlLink stillImageUrl;
    protected List<UrlLink> orientationImageUrl;
    protected UrlLink thumbnailImageUrl;
    @XmlElement(name = "_cctvStillImageServiceExtension")
    protected _ExtensionType _CctvStillImageServiceExtension;

    /**
     * Gets the value of the cctvStillImageServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageServiceLevel() {
        return cctvStillImageServiceLevel;
    }

    /**
     * Sets the value of the cctvStillImageServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageServiceLevel(BigInteger value) {
        this.cctvStillImageServiceLevel = value;
    }

    /**
     * Gets the value of the cctvStillImageServiceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvStillImageServiceLevelName() {
        return cctvStillImageServiceLevelName;
    }

    /**
     * Sets the value of the cctvStillImageServiceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvStillImageServiceLevelName(MultilingualString value) {
        this.cctvStillImageServiceLevelName = value;
    }

    /**
     * Gets the value of the cctvStillImageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvStillImageFormatEnum }
     *     
     */
    public _CctvStillImageFormatEnum getCctvStillImageFormat() {
        return cctvStillImageFormat;
    }

    /**
     * Sets the value of the cctvStillImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvStillImageFormatEnum }
     *     
     */
    public void setCctvStillImageFormat(_CctvStillImageFormatEnum value) {
        this.cctvStillImageFormat = value;
    }

    /**
     * Gets the value of the cctvStillImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageWidth() {
        return cctvStillImageWidth;
    }

    /**
     * Sets the value of the cctvStillImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageWidth(BigInteger value) {
        this.cctvStillImageWidth = value;
    }

    /**
     * Gets the value of the cctvStillImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageHeight() {
        return cctvStillImageHeight;
    }

    /**
     * Sets the value of the cctvStillImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageHeight(BigInteger value) {
        this.cctvStillImageHeight = value;
    }

    /**
     * Gets the value of the cctvStillImageZoomBlankingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageZoomBlankingLevel() {
        return cctvStillImageZoomBlankingLevel;
    }

    /**
     * Sets the value of the cctvStillImageZoomBlankingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageZoomBlankingLevel(BigInteger value) {
        this.cctvStillImageZoomBlankingLevel = value;
    }

    /**
     * Gets the value of the stillImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getStillImageUrl() {
        return stillImageUrl;
    }

    /**
     * Sets the value of the stillImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setStillImageUrl(UrlLink value) {
        this.stillImageUrl = value;
    }

    /**
     * Gets the value of the orientationImageUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orientationImageUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientationImageUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getOrientationImageUrl() {
        if (orientationImageUrl == null) {
            orientationImageUrl = new ArrayList<UrlLink>();
        }
        return this.orientationImageUrl;
    }

    /**
     * Gets the value of the thumbnailImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    /**
     * Sets the value of the thumbnailImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setThumbnailImageUrl(UrlLink value) {
        this.thumbnailImageUrl = value;
    }

    /**
     * Gets the value of the _CctvStillImageServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CctvStillImageServiceExtension() {
        return _CctvStillImageServiceExtension;
    }

    /**
     * Sets the value of the _CctvStillImageServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CctvStillImageServiceExtension(_ExtensionType value) {
        this._CctvStillImageServiceExtension = value;
    }

}
