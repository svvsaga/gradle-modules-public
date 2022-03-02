
package eu.datex2.schema._3.vms;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A display of a pictogram on one area on a VMS, potentially with associated supplemental
 *         information or instructions.
 *       
 * 
 * <p>Java class for PictogramDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictogramDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayAreaSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isPrimaryPictogram" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="pictogramDisplayUrl" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&gt;
 *         &lt;element name="pictogram" type="{http://datex2.eu/schema/3/vms}Pictogram"/&gt;
 *         &lt;element name="supplementaryInformationDisplay" type="{http://datex2.eu/schema/3/vms}SupplementaryInformationDisplay" minOccurs="0"/&gt;
 *         &lt;element name="image" type="{http://datex2.eu/schema/3/vms}Image" minOccurs="0"/&gt;
 *         &lt;element name="_pictogramDisplayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictogramDisplay", propOrder = {
    "isPrimaryPictogram",
    "pictogramDisplayUrl",
    "pictogram",
    "supplementaryInformationDisplay",
    "image",
    "pictogramDisplayExtension"
})
public class PictogramDisplay
    extends DisplayAreaSettings
{

    protected Boolean isPrimaryPictogram;
    @XmlSchemaType(name = "anyURI")
    protected String pictogramDisplayUrl;
    @XmlElement(required = true)
    protected Pictogram pictogram;
    protected SupplementaryInformationDisplay supplementaryInformationDisplay;
    protected Image image;
    @XmlElement(name = "_pictogramDisplayExtension")
    protected ExtensionType pictogramDisplayExtension;

    /**
     * Gets the value of the isPrimaryPictogram property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryPictogram() {
        return isPrimaryPictogram;
    }

    /**
     * Sets the value of the isPrimaryPictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryPictogram(Boolean value) {
        this.isPrimaryPictogram = value;
    }

    /**
     * Gets the value of the pictogramDisplayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictogramDisplayUrl() {
        return pictogramDisplayUrl;
    }

    /**
     * Sets the value of the pictogramDisplayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictogramDisplayUrl(String value) {
        this.pictogramDisplayUrl = value;
    }

    /**
     * Gets the value of the pictogram property.
     * 
     * @return
     *     possible object is
     *     {@link Pictogram }
     *     
     */
    public Pictogram getPictogram() {
        return pictogram;
    }

    /**
     * Sets the value of the pictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pictogram }
     *     
     */
    public void setPictogram(Pictogram value) {
        this.pictogram = value;
    }

    /**
     * Gets the value of the supplementaryInformationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryInformationDisplay }
     *     
     */
    public SupplementaryInformationDisplay getSupplementaryInformationDisplay() {
        return supplementaryInformationDisplay;
    }

    /**
     * Sets the value of the supplementaryInformationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryInformationDisplay }
     *     
     */
    public void setSupplementaryInformationDisplay(SupplementaryInformationDisplay value) {
        this.supplementaryInformationDisplay = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the pictogramDisplayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPictogramDisplayExtension() {
        return pictogramDisplayExtension;
    }

    /**
     * Sets the value of the pictogramDisplayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPictogramDisplayExtension(ExtensionType value) {
        this.pictogramDisplayExtension = value;
    }

}
