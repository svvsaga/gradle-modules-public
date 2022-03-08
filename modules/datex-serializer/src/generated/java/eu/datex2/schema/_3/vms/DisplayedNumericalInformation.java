
package eu.datex2.schema._3.vms;

import java.math.BigDecimal;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayedNumericalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayedNumericalInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numericalInformationType" type="{http://datex2.eu/schema/3/vms}_DisplayedNumericalInformationTypeEnum"/&gt;
 *         &lt;element name="numericValue" type="{http://datex2.eu/schema/3/common}Decimal"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://datex2.eu/schema/3/vms}_UnitOfMeasureEnum"/&gt;
 *         &lt;element name="_displayedNumericalInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayedNumericalInformation", propOrder = {
    "numericalInformationType",
    "numericValue",
    "unitOfMeasure",
    "displayedNumericalInformationExtension"
})
public class DisplayedNumericalInformation {

    @XmlElement(required = true)
    protected DisplayedNumericalInformationTypeEnum numericalInformationType;
    @XmlElement(required = true)
    protected BigDecimal numericValue;
    @XmlElement(required = true)
    protected UnitOfMeasureEnum unitOfMeasure;
    @XmlElement(name = "_displayedNumericalInformationExtension")
    protected ExtensionType displayedNumericalInformationExtension;

    /**
     * Gets the value of the numericalInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayedNumericalInformationTypeEnum }
     *     
     */
    public DisplayedNumericalInformationTypeEnum getNumericalInformationType() {
        return numericalInformationType;
    }

    /**
     * Sets the value of the numericalInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayedNumericalInformationTypeEnum }
     *     
     */
    public void setNumericalInformationType(DisplayedNumericalInformationTypeEnum value) {
        this.numericalInformationType = value;
    }

    /**
     * Gets the value of the numericValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumericValue() {
        return numericValue;
    }

    /**
     * Sets the value of the numericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumericValue(BigDecimal value) {
        this.numericValue = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureEnum }
     *     
     */
    public UnitOfMeasureEnum getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureEnum }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureEnum value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the displayedNumericalInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDisplayedNumericalInformationExtension() {
        return displayedNumericalInformationExtension;
    }

    /**
     * Sets the value of the displayedNumericalInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDisplayedNumericalInformationExtension(ExtensionType value) {
        this.displayedNumericalInformationExtension = value;
    }

}
