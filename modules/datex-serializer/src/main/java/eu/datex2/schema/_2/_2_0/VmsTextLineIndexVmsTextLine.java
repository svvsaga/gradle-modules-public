
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsTextLineIndexVmsTextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsTextLineIndexVmsTextLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}VmsTextLine"/&gt;
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
@XmlType(name = "_VmsTextLineIndexVmsTextLine", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vmsTextLine"
})
public class VmsTextLineIndexVmsTextLine {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected VmsTextLine vmsTextLine;
    @XmlAttribute(name = "lineIndex", required = true)
    protected int lineIndex;

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextLine }
     *     
     */
    public VmsTextLine getVmsTextLine() {
        return vmsTextLine;
    }

    /**
     * Sets the value of the vmsTextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextLine }
     *     
     */
    public void setVmsTextLine(VmsTextLine value) {
        this.vmsTextLine = value;
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
