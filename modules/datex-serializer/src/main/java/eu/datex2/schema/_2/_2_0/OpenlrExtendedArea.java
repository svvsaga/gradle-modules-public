
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrAreaLocationReference" type="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedArea", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrAreaLocationReference"
})
public class OpenlrExtendedArea {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrAreaLocationReference openlrAreaLocationReference;

    /**
     * Gets the value of the openlrAreaLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrAreaLocationReference }
     *     
     */
    public OpenlrAreaLocationReference getOpenlrAreaLocationReference() {
        return openlrAreaLocationReference;
    }

    /**
     * Sets the value of the openlrAreaLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrAreaLocationReference }
     *     
     */
    public void setOpenlrAreaLocationReference(OpenlrAreaLocationReference value) {
        this.openlrAreaLocationReference = value;
    }

}
