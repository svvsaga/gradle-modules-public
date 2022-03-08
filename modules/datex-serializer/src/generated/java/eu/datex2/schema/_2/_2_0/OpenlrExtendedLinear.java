
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrLineLocationReference" type="{http://datex2.eu/schema/2/2_0}OpenlrLineLocationReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedLinear", propOrder = {
    "openlrLineLocationReference"
})
public class OpenlrExtendedLinear {

    @XmlElement(required = true)
    protected OpenlrLineLocationReference openlrLineLocationReference;

    /**
     * Gets the value of the openlrLineLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public OpenlrLineLocationReference getOpenlrLineLocationReference() {
        return openlrLineLocationReference;
    }

    /**
     * Sets the value of the openlrLineLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public void setOpenlrLineLocationReference(OpenlrLineLocationReference value) {
        this.openlrLineLocationReference = value;
    }

}
