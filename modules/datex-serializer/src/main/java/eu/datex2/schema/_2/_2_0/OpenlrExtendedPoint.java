
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPointLocationReference" type="{http://datex2.eu/schema/2/2_0}OpenlrPointLocationReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedPoint", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "openlrPointLocationReference"
})
public class OpenlrExtendedPoint {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected OpenlrPointLocationReference openlrPointLocationReference;

    /**
     * Gets the value of the openlrPointLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public OpenlrPointLocationReference getOpenlrPointLocationReference() {
        return openlrPointLocationReference;
    }

    /**
     * Sets the value of the openlrPointLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public void setOpenlrPointLocationReference(OpenlrPointLocationReference value) {
        this.openlrPointLocationReference = value;
    }

}
