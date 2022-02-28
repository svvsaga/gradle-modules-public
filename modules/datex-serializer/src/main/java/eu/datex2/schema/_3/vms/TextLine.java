
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A single line of text displayed on a text display area or supplementary panel or
 *         corresponding to a displayed text. It may correspond to the entire text in the case that text
 *         segmentation in lines is not available.
 *       
 * 
 * <p>Java class for TextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textLine" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="lineColour" type="{http://datex2.eu/schema/3/vms}_ColourEnum" minOccurs="0"/&gt;
 *         &lt;element name="lineFlashing" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lineHtml" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="isExactTextOnSign" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="textInformationType" type="{http://datex2.eu/schema/3/vms}_InformationTypeEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_textLineExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lineLanguage" type="{http://datex2.eu/schema/3/common}Language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextLine", propOrder = {
    "textLine",
    "lineColour",
    "lineFlashing",
    "lineHtml",
    "isExactTextOnSign",
    "textInformationType",
    "_TextLineExtension"
})
public class TextLine {

    @XmlElement(required = true)
    protected String textLine;
    protected _ColourEnum lineColour;
    protected Boolean lineFlashing;
    protected String lineHtml;
    protected Boolean isExactTextOnSign;
    protected List<_InformationTypeEnum> textInformationType;
    @XmlElement(name = "_textLineExtension")
    protected _ExtensionType _TextLineExtension;
    @XmlAttribute(name = "lineLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineLanguage;

    /**
     * Gets the value of the textLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextLine() {
        return textLine;
    }

    /**
     * Sets the value of the textLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextLine(String value) {
        this.textLine = value;
    }

    /**
     * Gets the value of the lineColour property.
     * 
     * @return
     *     possible object is
     *     {@link _ColourEnum }
     *     
     */
    public _ColourEnum getLineColour() {
        return lineColour;
    }

    /**
     * Sets the value of the lineColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ColourEnum }
     *     
     */
    public void setLineColour(_ColourEnum value) {
        this.lineColour = value;
    }

    /**
     * Gets the value of the lineFlashing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLineFlashing() {
        return lineFlashing;
    }

    /**
     * Sets the value of the lineFlashing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLineFlashing(Boolean value) {
        this.lineFlashing = value;
    }

    /**
     * Gets the value of the lineHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHtml() {
        return lineHtml;
    }

    /**
     * Sets the value of the lineHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHtml(String value) {
        this.lineHtml = value;
    }

    /**
     * Gets the value of the isExactTextOnSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExactTextOnSign() {
        return isExactTextOnSign;
    }

    /**
     * Sets the value of the isExactTextOnSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExactTextOnSign(Boolean value) {
        this.isExactTextOnSign = value;
    }

    /**
     * Gets the value of the textInformationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textInformationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextInformationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _InformationTypeEnum }
     * 
     * 
     */
    public List<_InformationTypeEnum> getTextInformationType() {
        if (textInformationType == null) {
            textInformationType = new ArrayList<_InformationTypeEnum>();
        }
        return this.textInformationType;
    }

    /**
     * Gets the value of the _TextLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TextLineExtension() {
        return _TextLineExtension;
    }

    /**
     * Sets the value of the _TextLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TextLineExtension(_ExtensionType value) {
        this._TextLineExtension = value;
    }

    /**
     * Gets the value of the lineLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineLanguage() {
        return lineLanguage;
    }

    /**
     * Sets the value of the lineLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineLanguage(String value) {
        this.lineLanguage = value;
    }

}
