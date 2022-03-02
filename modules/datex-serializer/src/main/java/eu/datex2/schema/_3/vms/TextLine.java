
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
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
@XmlType(name = "TextLine", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "textLine",
    "lineColour",
    "lineFlashing",
    "lineHtml",
    "isExactTextOnSign",
    "textInformationType",
    "textLineExtension"
})
public class TextLine {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected String textLine;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected ColourEnum lineColour;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean lineFlashing;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected String lineHtml;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected Boolean isExactTextOnSign;
    @XmlElement(namespace = "http://datex2.eu/schema/3/vms")
    protected List<InformationTypeEnum> textInformationType;
    @XmlElement(name = "_textLineExtension", namespace = "http://datex2.eu/schema/3/vms")
    protected ExtensionType textLineExtension;
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
     *     {@link ColourEnum }
     *     
     */
    public ColourEnum getLineColour() {
        return lineColour;
    }

    /**
     * Sets the value of the lineColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourEnum }
     *     
     */
    public void setLineColour(ColourEnum value) {
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
     * {@link InformationTypeEnum }
     * 
     * 
     */
    public List<InformationTypeEnum> getTextInformationType() {
        if (textInformationType == null) {
            textInformationType = new ArrayList<InformationTypeEnum>();
        }
        return this.textInformationType;
    }

    /**
     * Gets the value of the textLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTextLineExtension() {
        return textLineExtension;
    }

    /**
     * Sets the value of the textLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTextLineExtension(ExtensionType value) {
        this.textLineExtension = value;
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
