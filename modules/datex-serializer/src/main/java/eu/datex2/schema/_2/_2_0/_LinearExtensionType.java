
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for _LinearExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_LinearExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrExtendedLinear" type="{http://datex2.eu/schema/2/2_0}OpenlrExtendedLinear" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_LinearExtensionType", propOrder = {
    "openlrExtendedLinear",
    "any"
})
public class _LinearExtensionType {

    protected OpenlrExtendedLinear openlrExtendedLinear;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the openlrExtendedLinear property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrExtendedLinear }
     *     
     */
    public OpenlrExtendedLinear getOpenlrExtendedLinear() {
        return openlrExtendedLinear;
    }

    /**
     * Sets the value of the openlrExtendedLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrExtendedLinear }
     *     
     */
    public void setOpenlrExtendedLinear(OpenlrExtendedLinear value) {
        this.openlrExtendedLinear = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
