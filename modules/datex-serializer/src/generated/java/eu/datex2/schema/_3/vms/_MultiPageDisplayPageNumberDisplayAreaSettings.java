
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _MultiPageDisplayPageNumberDisplayAreaSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_MultiPageDisplayPageNumberDisplayAreaSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayAreaSettings" type="{http://datex2.eu/schema/3/vms}DisplayAreaSettings"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_MultiPageDisplayPageNumberDisplayAreaSettings", propOrder = {
    "displayAreaSettings"
})
public class _MultiPageDisplayPageNumberDisplayAreaSettings {

    @XmlElement(required = true)
    protected DisplayAreaSettings displayAreaSettings;
    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;

    /**
     * Gets the value of the displayAreaSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAreaSettings }
     *     
     */
    public DisplayAreaSettings getDisplayAreaSettings() {
        return displayAreaSettings;
    }

    /**
     * Sets the value of the displayAreaSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAreaSettings }
     *     
     */
    public void setDisplayAreaSettings(DisplayAreaSettings value) {
        this.displayAreaSettings = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
