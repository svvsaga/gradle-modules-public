
package eu.datex2.schema._3.roadtrafficdata;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measured or calculated value of an instant in time.
 * 
 * <p>Java class for DateTimeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="_dateTimeValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeValue", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "dateTime",
    "dateTimeValueExtension"
})
public class DateTimeValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "_dateTimeValueExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType dateTimeValueExtension;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the dateTimeValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDateTimeValueExtension() {
        return dateTimeValueExtension;
    }

    /**
     * Sets the value of the dateTimeValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDateTimeValueExtension(ExtensionType value) {
        this.dateTimeValueExtension = value;
    }

}
