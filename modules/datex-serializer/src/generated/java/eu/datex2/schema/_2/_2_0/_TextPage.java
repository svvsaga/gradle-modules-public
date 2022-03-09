
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _TextPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TextPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsText" type="{http://datex2.eu/schema/2/2_0}VmsText"/&gt;
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
@XmlType(name = "_TextPage", propOrder = {
    "vmsText"
})
public class _TextPage {

    @XmlElement(required = true)
    protected VmsText vmsText;
    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;

    /**
     * Gets the value of the vmsText property.
     * 
     * @return
     *     possible object is
     *     {@link VmsText }
     *     
     */
    public VmsText getVmsText() {
        return vmsText;
    }

    /**
     * Sets the value of the vmsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsText }
     *     
     */
    public void setVmsText(VmsText value) {
        this.vmsText = value;
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
