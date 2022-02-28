
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersectWithApplicableDays" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="specialDayType" type="{http://datex2.eu/schema/2/2_0}SpecialDayTypeEnum"/&gt;
 *         &lt;element name="specialDayName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="publicHoliday" type="{http://datex2.eu/schema/2/2_0}PublicHoliday" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialDayExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialDay", propOrder = {
    "intersectWithApplicableDays",
    "specialDayType",
    "specialDayName",
    "publicHoliday",
    "specialDayExtension"
})
public class SpecialDay {

    protected boolean intersectWithApplicableDays;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SpecialDayTypeEnum specialDayType;
    protected MultilingualString specialDayName;
    protected List<PublicHoliday> publicHoliday;
    protected _ExtensionType specialDayExtension;

    /**
     * Gets the value of the intersectWithApplicableDays property.
     * 
     */
    public boolean isIntersectWithApplicableDays() {
        return intersectWithApplicableDays;
    }

    /**
     * Sets the value of the intersectWithApplicableDays property.
     * 
     */
    public void setIntersectWithApplicableDays(boolean value) {
        this.intersectWithApplicableDays = value;
    }

    /**
     * Gets the value of the specialDayType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialDayTypeEnum }
     *     
     */
    public SpecialDayTypeEnum getSpecialDayType() {
        return specialDayType;
    }

    /**
     * Sets the value of the specialDayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialDayTypeEnum }
     *     
     */
    public void setSpecialDayType(SpecialDayTypeEnum value) {
        this.specialDayType = value;
    }

    /**
     * Gets the value of the specialDayName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSpecialDayName() {
        return specialDayName;
    }

    /**
     * Sets the value of the specialDayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSpecialDayName(MultilingualString value) {
        this.specialDayName = value;
    }

    /**
     * Gets the value of the publicHoliday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publicHoliday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicHoliday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicHoliday }
     * 
     * 
     */
    public List<PublicHoliday> getPublicHoliday() {
        if (publicHoliday == null) {
            publicHoliday = new ArrayList<PublicHoliday>();
        }
        return this.publicHoliday;
    }

    /**
     * Gets the value of the specialDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getSpecialDayExtension() {
        return specialDayExtension;
    }

    /**
     * Sets the value of the specialDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setSpecialDayExtension(_ExtensionType value) {
        this.specialDayExtension = value;
    }

}
