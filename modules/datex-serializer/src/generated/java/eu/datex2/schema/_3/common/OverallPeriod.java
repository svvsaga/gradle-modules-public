
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallStartTime" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="overallEndTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_overallPeriodExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriod",
    "exceptionPeriod",
    "_OverallPeriodExtension"
})
public class OverallPeriod {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallStartTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overallEndTime;
    protected List<Period> validPeriod;
    protected List<Period> exceptionPeriod;
    @XmlElement(name = "_overallPeriodExtension")
    protected _ExtensionType _OverallPeriodExtension;

    /**
     * Gets the value of the overallStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Sets the value of the overallStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallStartTime(XMLGregorianCalendar value) {
        this.overallStartTime = value;
    }

    /**
     * Gets the value of the overallEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Sets the value of the overallEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverallEndTime(XMLGregorianCalendar value) {
        this.overallEndTime = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getValidPeriod() {
        if (validPeriod == null) {
            validPeriod = new ArrayList<Period>();
        }
        return this.validPeriod;
    }

    /**
     * Gets the value of the exceptionPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getExceptionPeriod() {
        if (exceptionPeriod == null) {
            exceptionPeriod = new ArrayList<Period>();
        }
        return this.exceptionPeriod;
    }

    /**
     * Gets the value of the _OverallPeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OverallPeriodExtension() {
        return _OverallPeriodExtension;
    }

    /**
     * Sets the value of the _OverallPeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OverallPeriodExtension(_ExtensionType value) {
        this._OverallPeriodExtension = value;
    }

}
