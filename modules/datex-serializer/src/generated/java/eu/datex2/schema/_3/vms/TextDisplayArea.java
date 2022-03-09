
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextDisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextDisplayArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="proportionalFont" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfCharacters" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfRows" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="textCodeListIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="maxFontHeight" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontHeight" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxFontWidth" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontWidth" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="maxFontSpacing" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="minFontSpacing" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="_textDisplayAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDisplayArea", propOrder = {
    "proportionalFont",
    "maxNumberOfCharacters",
    "maxNumberOfRows",
    "textCodeListIdentifier",
    "maxFontHeight",
    "minFontHeight",
    "maxFontWidth",
    "minFontWidth",
    "maxFontSpacing",
    "minFontSpacing",
    "_TextDisplayAreaExtension"
})
public class TextDisplayArea
    extends DisplayArea
{

    protected Boolean proportionalFont;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfCharacters;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfRows;
    protected String textCodeListIdentifier;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontWidth;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontWidth;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxFontSpacing;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minFontSpacing;
    @XmlElement(name = "_textDisplayAreaExtension")
    protected _ExtensionType _TextDisplayAreaExtension;

    /**
     * Gets the value of the proportionalFont property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProportionalFont() {
        return proportionalFont;
    }

    /**
     * Sets the value of the proportionalFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProportionalFont(Boolean value) {
        this.proportionalFont = value;
    }

    /**
     * Gets the value of the maxNumberOfCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCharacters() {
        return maxNumberOfCharacters;
    }

    /**
     * Sets the value of the maxNumberOfCharacters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfCharacters(BigInteger value) {
        this.maxNumberOfCharacters = value;
    }

    /**
     * Gets the value of the maxNumberOfRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfRows() {
        return maxNumberOfRows;
    }

    /**
     * Sets the value of the maxNumberOfRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfRows(BigInteger value) {
        this.maxNumberOfRows = value;
    }

    /**
     * Gets the value of the textCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCodeListIdentifier() {
        return textCodeListIdentifier;
    }

    /**
     * Sets the value of the textCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCodeListIdentifier(String value) {
        this.textCodeListIdentifier = value;
    }

    /**
     * Gets the value of the maxFontHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontHeight() {
        return maxFontHeight;
    }

    /**
     * Sets the value of the maxFontHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontHeight(BigInteger value) {
        this.maxFontHeight = value;
    }

    /**
     * Gets the value of the minFontHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontHeight() {
        return minFontHeight;
    }

    /**
     * Sets the value of the minFontHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontHeight(BigInteger value) {
        this.minFontHeight = value;
    }

    /**
     * Gets the value of the maxFontWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontWidth() {
        return maxFontWidth;
    }

    /**
     * Sets the value of the maxFontWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontWidth(BigInteger value) {
        this.maxFontWidth = value;
    }

    /**
     * Gets the value of the minFontWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontWidth() {
        return minFontWidth;
    }

    /**
     * Sets the value of the minFontWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontWidth(BigInteger value) {
        this.minFontWidth = value;
    }

    /**
     * Gets the value of the maxFontSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFontSpacing() {
        return maxFontSpacing;
    }

    /**
     * Sets the value of the maxFontSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFontSpacing(BigInteger value) {
        this.maxFontSpacing = value;
    }

    /**
     * Gets the value of the minFontSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinFontSpacing() {
        return minFontSpacing;
    }

    /**
     * Sets the value of the minFontSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinFontSpacing(BigInteger value) {
        this.minFontSpacing = value;
    }

    /**
     * Gets the value of the _TextDisplayAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TextDisplayAreaExtension() {
        return _TextDisplayAreaExtension;
    }

    /**
     * Sets the value of the _TextDisplayAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TextDisplayAreaExtension(_ExtensionType value) {
        this._TextDisplayAreaExtension = value;
    }

}
