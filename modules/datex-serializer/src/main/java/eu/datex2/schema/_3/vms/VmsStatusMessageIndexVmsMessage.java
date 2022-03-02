
package eu.datex2.schema._3.vms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsStatusMessageIndexVmsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsStatusMessageIndexVmsMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsMessage" type="{http://datex2.eu/schema/3/vms}VmsMessage"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="messageIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsStatusMessageIndexVmsMessage", namespace = "http://datex2.eu/schema/3/vms", propOrder = {
    "vmsMessage"
})
public class VmsStatusMessageIndexVmsMessage {

    @XmlElement(namespace = "http://datex2.eu/schema/3/vms", required = true)
    protected VmsMessage vmsMessage;
    @XmlAttribute(name = "messageIndex", required = true)
    protected int messageIndex;

    /**
     * Gets the value of the vmsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link VmsMessage }
     *     
     */
    public VmsMessage getVmsMessage() {
        return vmsMessage;
    }

    /**
     * Sets the value of the vmsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsMessage }
     *     
     */
    public void setVmsMessage(VmsMessage value) {
        this.vmsMessage = value;
    }

    /**
     * Gets the value of the messageIndex property.
     * 
     */
    public int getMessageIndex() {
        return messageIndex;
    }

    /**
     * Sets the value of the messageIndex property.
     * 
     */
    public void setMessageIndex(int value) {
        this.messageIndex = value;
    }

}
