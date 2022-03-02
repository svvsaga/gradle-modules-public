
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Emission characteristics of vehicles.
 * 
 * <p>Java class for Emissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emissionClassificationEuro" type="{http://datex2.eu/schema/3/common}_EmissionClassificationEuroEnum" minOccurs="0"/&gt;
 *         &lt;element name="emissionClassificationOther" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="emissionLevel" type="{http://datex2.eu/schema/3/common}_LowEmissionLevelEnum" minOccurs="0"/&gt;
 *         &lt;element name="_emissionsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emissions", propOrder = {
    "emissionClassificationEuro",
    "emissionClassificationOther",
    "emissionLevel",
    "emissionsExtension"
})
public class Emissions {

    protected EmissionClassificationEuroEnum emissionClassificationEuro;
    protected List<String> emissionClassificationOther;
    protected LowEmissionLevelEnum emissionLevel;
    @XmlElement(name = "_emissionsExtension")
    protected ExtensionType emissionsExtension;

    /**
     * Gets the value of the emissionClassificationEuro property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionClassificationEuroEnum }
     *     
     */
    public EmissionClassificationEuroEnum getEmissionClassificationEuro() {
        return emissionClassificationEuro;
    }

    /**
     * Sets the value of the emissionClassificationEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionClassificationEuroEnum }
     *     
     */
    public void setEmissionClassificationEuro(EmissionClassificationEuroEnum value) {
        this.emissionClassificationEuro = value;
    }

    /**
     * Gets the value of the emissionClassificationOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the emissionClassificationOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmissionClassificationOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmissionClassificationOther() {
        if (emissionClassificationOther == null) {
            emissionClassificationOther = new ArrayList<String>();
        }
        return this.emissionClassificationOther;
    }

    /**
     * Gets the value of the emissionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LowEmissionLevelEnum }
     *     
     */
    public LowEmissionLevelEnum getEmissionLevel() {
        return emissionLevel;
    }

    /**
     * Sets the value of the emissionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowEmissionLevelEnum }
     *     
     */
    public void setEmissionLevel(LowEmissionLevelEnum value) {
        this.emissionLevel = value;
    }

    /**
     * Gets the value of the emissionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEmissionsExtension() {
        return emissionsExtension;
    }

    /**
     * Sets the value of the emissionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEmissionsExtension(ExtensionType value) {
        this.emissionsExtension = value;
    }

}
