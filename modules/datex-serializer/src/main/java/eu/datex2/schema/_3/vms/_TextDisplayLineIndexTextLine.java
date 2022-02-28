
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _TextDisplayLineIndexTextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TextDisplayLineIndexTextLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textLine" type="{http://datex2.eu/schema/3/vms}TextLine"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lineIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_TextDisplayLineIndexTextLine", propOrder = {
    "textLine"
})
public class _TextDisplayLineIndexTextLine {

    @XmlElement(required = true)
    protected TextLine textLine;
    @XmlAttribute(name = "lineIndex", required = true)
    protected int lineIndex;

    /**
     * Gets the value of the textLine property.
     * 
     * @return
     *     possible object is
     *     {@link TextLine }
     *     
     */
    public TextLine getTextLine() {
        return textLine;
    }

    /**
     * Sets the value of the textLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLine }
     *     
     */
    public void setTextLine(TextLine value) {
        this.textLine = value;
    }

    /**
     * Gets the value of the lineIndex property.
     * 
     */
    public int getLineIndex() {
        return lineIndex;
    }

    /**
     * Sets the value of the lineIndex property.
     * 
     */
    public void setLineIndex(int value) {
        this.lineIndex = value;
    }

}
