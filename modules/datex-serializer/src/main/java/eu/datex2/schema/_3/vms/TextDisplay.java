
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A page of text (comprising one or more ordered lines) that are displayed simultaneously on
 *         the VMS.
 *       
 * 
 * <p>Java class for TextDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayAreaSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="textImageUrl" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&gt;
 *         &lt;element name="textLine" type="{http://datex2.eu/schema/3/vms}_TextDisplayLineIndexTextLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_textDisplayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDisplay", propOrder = {
    "textCode",
    "textImageUrl",
    "textLine",
    "textDisplayExtension"
})
public class TextDisplay
    extends DisplayAreaSettings
{

    protected String textCode;
    @XmlSchemaType(name = "anyURI")
    protected String textImageUrl;
    protected List<TextDisplayLineIndexTextLine> textLine;
    @XmlElement(name = "_textDisplayExtension")
    protected ExtensionType textDisplayExtension;

    /**
     * Gets the value of the textCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCode() {
        return textCode;
    }

    /**
     * Sets the value of the textCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCode(String value) {
        this.textCode = value;
    }

    /**
     * Gets the value of the textImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextImageUrl() {
        return textImageUrl;
    }

    /**
     * Sets the value of the textImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextImageUrl(String value) {
        this.textImageUrl = value;
    }

    /**
     * Gets the value of the textLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextDisplayLineIndexTextLine }
     * 
     * 
     */
    public List<TextDisplayLineIndexTextLine> getTextLine() {
        if (textLine == null) {
            textLine = new ArrayList<TextDisplayLineIndexTextLine>();
        }
        return this.textLine;
    }

    /**
     * Gets the value of the textDisplayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTextDisplayExtension() {
        return textDisplayExtension;
    }

    /**
     * Sets the value of the textDisplayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTextDisplayExtension(ExtensionType value) {
        this.textDisplayExtension = value;
    }

}
