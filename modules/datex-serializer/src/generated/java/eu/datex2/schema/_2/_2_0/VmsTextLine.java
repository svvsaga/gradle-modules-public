
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VmsTextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsTextLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="vmsTextLineLanguage" type="{http://datex2.eu/schema/2/2_0}Language" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextLineColour" type="{http://datex2.eu/schema/2/2_0}ColourEnum" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextLineFlashing" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextLineHtml" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextLineExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsTextLine", propOrder = {
    "vmsTextLine",
    "vmsTextLineLanguage",
    "vmsTextLineColour",
    "vmsTextLineFlashing",
    "vmsTextLineHtml",
    "vmsTextLineExtension"
})
public class VmsTextLine {

    @XmlElement(required = true)
    protected String vmsTextLine;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String vmsTextLineLanguage;
    @XmlSchemaType(name = "string")
    protected ColourEnum vmsTextLineColour;
    protected Boolean vmsTextLineFlashing;
    protected String vmsTextLineHtml;
    protected _ExtensionType vmsTextLineExtension;

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTextLine() {
        return vmsTextLine;
    }

    /**
     * Sets the value of the vmsTextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTextLine(String value) {
        this.vmsTextLine = value;
    }

    /**
     * Gets the value of the vmsTextLineLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTextLineLanguage() {
        return vmsTextLineLanguage;
    }

    /**
     * Sets the value of the vmsTextLineLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTextLineLanguage(String value) {
        this.vmsTextLineLanguage = value;
    }

    /**
     * Gets the value of the vmsTextLineColour property.
     * 
     * @return
     *     possible object is
     *     {@link ColourEnum }
     *     
     */
    public ColourEnum getVmsTextLineColour() {
        return vmsTextLineColour;
    }

    /**
     * Sets the value of the vmsTextLineColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourEnum }
     *     
     */
    public void setVmsTextLineColour(ColourEnum value) {
        this.vmsTextLineColour = value;
    }

    /**
     * Gets the value of the vmsTextLineFlashing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmsTextLineFlashing() {
        return vmsTextLineFlashing;
    }

    /**
     * Sets the value of the vmsTextLineFlashing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmsTextLineFlashing(Boolean value) {
        this.vmsTextLineFlashing = value;
    }

    /**
     * Gets the value of the vmsTextLineHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsTextLineHtml() {
        return vmsTextLineHtml;
    }

    /**
     * Sets the value of the vmsTextLineHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsTextLineHtml(String value) {
        this.vmsTextLineHtml = value;
    }

    /**
     * Gets the value of the vmsTextLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getVmsTextLineExtension() {
        return vmsTextLineExtension;
    }

    /**
     * Sets the value of the vmsTextLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setVmsTextLineExtension(_ExtensionType value) {
        this.vmsTextLineExtension = value;
    }

}
