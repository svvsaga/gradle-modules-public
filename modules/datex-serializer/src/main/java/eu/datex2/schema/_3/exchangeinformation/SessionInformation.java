
package eu.datex2.schema._3.exchangeinformation;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionID" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="startSession" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="_sessionInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInformation", namespace = "http://datex2.eu/schema/3/exchangeInformation", propOrder = {
    "sessionID",
    "startSession",
    "sessionInformationExtension"
})
public class SessionInformation {

    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation", required = true)
    protected String sessionID;
    @XmlElement(namespace = "http://datex2.eu/schema/3/exchangeInformation")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startSession;
    @XmlElement(name = "_sessionInformationExtension", namespace = "http://datex2.eu/schema/3/exchangeInformation")
    protected ExtensionType sessionInformationExtension;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the startSession property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartSession() {
        return startSession;
    }

    /**
     * Sets the value of the startSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartSession(XMLGregorianCalendar value) {
        this.startSession = value;
    }

    /**
     * Gets the value of the sessionInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSessionInformationExtension() {
        return sessionInformationExtension;
    }

    /**
     * Sets the value of the sessionInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSessionInformationExtension(ExtensionType value) {
        this.sessionInformationExtension = value;
    }

}
