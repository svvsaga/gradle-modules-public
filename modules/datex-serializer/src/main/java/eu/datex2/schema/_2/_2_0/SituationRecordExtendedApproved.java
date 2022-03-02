
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationRecordExtendedApproved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationRecordExtendedApproved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="safetyRelatedMessage" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRecordExtendedApproved", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "safetyRelatedMessage"
})
public class SituationRecordExtendedApproved {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean safetyRelatedMessage;

    /**
     * Gets the value of the safetyRelatedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafetyRelatedMessage() {
        return safetyRelatedMessage;
    }

    /**
     * Sets the value of the safetyRelatedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyRelatedMessage(Boolean value) {
        this.safetyRelatedMessage = value;
    }

}
