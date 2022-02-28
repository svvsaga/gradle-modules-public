
package eu.datex2.schema._3.roadtrafficdata;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.DataValue;
import eu.datex2.schema._3.common._ExtensionType;
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
@XmlType(name = "DateTimeValue", propOrder = {
    "dateTime",
    "_DateTimeValueExtension"
})
public class DateTimeValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "_dateTimeValueExtension")
    protected _ExtensionType _DateTimeValueExtension;

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
     * Gets the value of the _DateTimeValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DateTimeValueExtension() {
        return _DateTimeValueExtension;
    }

    /**
     * Sets the value of the _DateTimeValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DateTimeValueExtension(_ExtensionType value) {
        this._DateTimeValueExtension = value;
    }

}
