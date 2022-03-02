
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specification of a specific public holiday in case specialDayType is set to
 *         'publicHoliday'.
 *       
 * 
 * <p>Java class for PublicHoliday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicHoliday"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}SpecialDay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicHolidayName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="_publicHolidayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicHoliday", propOrder = {
    "publicHolidayName",
    "publicHolidayExtension"
})
public class PublicHoliday
    extends SpecialDay
{

    @XmlElement(required = true)
    protected MultilingualString publicHolidayName;
    @XmlElement(name = "_publicHolidayExtension")
    protected ExtensionType publicHolidayExtension;

    /**
     * Gets the value of the publicHolidayName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPublicHolidayName() {
        return publicHolidayName;
    }

    /**
     * Sets the value of the publicHolidayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPublicHolidayName(MultilingualString value) {
        this.publicHolidayName = value;
    }

    /**
     * Gets the value of the publicHolidayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicHolidayExtension() {
        return publicHolidayExtension;
    }

    /**
     * Sets the value of the publicHolidayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicHolidayExtension(ExtensionType value) {
        this.publicHolidayExtension = value;
    }

}
