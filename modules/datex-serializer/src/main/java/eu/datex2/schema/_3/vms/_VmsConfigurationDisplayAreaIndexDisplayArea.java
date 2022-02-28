
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsConfigurationDisplayAreaIndexDisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsConfigurationDisplayAreaIndexDisplayArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayArea" type="{http://datex2.eu/schema/3/vms}DisplayArea"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="displayAreaIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsConfigurationDisplayAreaIndexDisplayArea", propOrder = {
    "displayArea"
})
public class _VmsConfigurationDisplayAreaIndexDisplayArea {

    @XmlElement(required = true)
    protected DisplayArea displayArea;
    @XmlAttribute(name = "displayAreaIndex", required = true)
    protected int displayAreaIndex;

    /**
     * Gets the value of the displayArea property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayArea }
     *     
     */
    public DisplayArea getDisplayArea() {
        return displayArea;
    }

    /**
     * Sets the value of the displayArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayArea }
     *     
     */
    public void setDisplayArea(DisplayArea value) {
        this.displayArea = value;
    }

    /**
     * Gets the value of the displayAreaIndex property.
     * 
     */
    public int getDisplayAreaIndex() {
        return displayAreaIndex;
    }

    /**
     * Sets the value of the displayAreaIndex property.
     * 
     */
    public void setDisplayAreaIndex(int value) {
        this.displayAreaIndex = value;
    }

}
