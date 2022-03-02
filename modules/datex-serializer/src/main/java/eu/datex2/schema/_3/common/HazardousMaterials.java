
package eu.datex2.schema._3.common;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Details of hazardous materials.
 * 
 * <p>Java class for HazardousMaterials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/3/common}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/3/common}_DangerousGoodsRegulationsEnum" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="tremCardNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="undgNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/3/common}CubicMetres" minOccurs="0"/&gt;
 *         &lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="_hazardousMaterialsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", namespace = "http://datex2.eu/schema/3/common", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "hazardousMaterialsExtension"
})
public class HazardousMaterials {

    @XmlElement(namespace = "http://datex2.eu/schema/3/common", required = true)
    protected MultilingualString chemicalName;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected Float dangerousGoodsFlashPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected String hazardCodeIdentification;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hazardCodeVersionNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected String hazardSubstanceItemPageNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected String tremCardNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected String undgNumber;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected Float volumeOfDangerousGoods;
    @XmlElement(namespace = "http://datex2.eu/schema/3/common")
    protected Float weightOfDangerousGoods;
    @XmlElement(name = "_hazardousMaterialsExtension", namespace = "http://datex2.eu/schema/3/common")
    protected ExtensionType hazardousMaterialsExtension;

    /**
     * Gets the value of the chemicalName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Sets the value of the chemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    /**
     * Gets the value of the dangerousGoodsFlashPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Sets the value of the dangerousGoodsFlashPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    /**
     * Gets the value of the dangerousGoodsRegulations property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Sets the value of the dangerousGoodsRegulations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsRegulationsEnum }
     *     
     */
    public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    /**
     * Gets the value of the hazardCodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Sets the value of the hazardCodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    /**
     * Gets the value of the hazardCodeVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Sets the value of the hazardCodeVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHazardCodeVersionNumber(BigInteger value) {
        this.hazardCodeVersionNumber = value;
    }

    /**
     * Gets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Sets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    /**
     * Gets the value of the tremCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Sets the value of the tremCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    /**
     * Gets the value of the undgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Sets the value of the undgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Gets the value of the volumeOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Sets the value of the volumeOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    /**
     * Gets the value of the weightOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Sets the value of the weightOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    /**
     * Gets the value of the hazardousMaterialsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHazardousMaterialsExtension() {
        return hazardousMaterialsExtension;
    }

    /**
     * Sets the value of the hazardousMaterialsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHazardousMaterialsExtension(ExtensionType value) {
        this.hazardousMaterialsExtension = value;
    }

}
